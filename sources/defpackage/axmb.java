package defpackage;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axmb extends UploadDataProvider {
    private final org.chromium.net.UploadDataProvider a;

    public axmb(org.chromium.net.UploadDataProvider uploadDataProvider) {
        this.a = uploadDataProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final long getLength() {
        return this.a.getLength();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.a.read(new axmc(uploadDataSink), byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.rewind(new axmc(uploadDataSink));
    }
}
