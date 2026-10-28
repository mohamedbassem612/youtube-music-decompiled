package defpackage;

import app.rive.semantics.SemanticState;
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class axns implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private axns(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        return inputStream instanceof FileInputStream ? DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStream).getChannel()) : new axns(inputStream);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        int i;
        boolean zHasArray = byteBuffer.hasArray();
        InputStream inputStream = this.a;
        if (zHasArray) {
            i = inputStream.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (i > 0) {
            }
        } else {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(inputStream.available(), SemanticState.Obscured), byteBuffer.remaining()))];
            i = inputStream.read(bArr);
            if (i > 0) {
                byteBuffer.put(bArr, 0, i);
            }
        }
        return i;
    }
}
