package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axox extends UploadDataProvider {
    private final UploadDataProvider a;

    public axox(UploadDataProvider uploadDataProvider) {
        this.a = uploadDataProvider;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.getLength();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.a.read(uploadDataSink, byteBuffer);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.rewind(uploadDataSink);
    }
}
