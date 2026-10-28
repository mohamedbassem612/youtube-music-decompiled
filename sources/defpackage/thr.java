package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class thr extends UploadDataProvider {
    private final tgd a;
    private InputStream b;
    private int c;

    public thr(tgd tgdVar) {
        this.a = tgdVar;
    }

    private final void a() {
        try {
            InputStream inputStream = this.b;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        this.b = null;
    }

    private final void b() {
        a();
        this.b = this.a.a();
        this.c = 0;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.b;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream, tpf] */
    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int iA;
        if (this.b == null) {
            b();
        }
        int iRemaining = byteBuffer.remaining();
        tgd tgdVar = this.a;
        long j = tgdVar.b;
        if (j != -1) {
            iRemaining = (int) Math.min(iRemaining, j - ((long) this.c));
        }
        ?? r2 = this.b;
        boolean z = false;
        if (r2 instanceof tpf) {
            iA = r2.a(byteBuffer, iRemaining);
        } else if (byteBuffer.hasArray()) {
            int i = r2.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iRemaining);
            if (i > 0) {
                byteBuffer.position(byteBuffer.position() + i);
            }
            iA = i;
        } else {
            byte[] bArr = new byte[Math.min(SemanticState.Modal, iRemaining)];
            int i2 = r2.read(bArr);
            if (i2 > 0) {
                byteBuffer.put(bArr, 0, i2);
            }
            iA = i2;
        }
        if (iA != -1) {
            this.c += iA;
        }
        if (tgdVar.f() && iA == -1) {
            z = true;
        }
        uploadDataSink.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        b();
        uploadDataSink.onRewindSucceeded();
    }
}
