package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class axsj extends OutputStream {
    public IOException d;
    public boolean e;
    public boolean f;

    public abstract UploadDataProvider a();

    public abstract void b();

    public abstract boolean c();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e = true;
    }

    protected final void d() throws IOException {
        IOException iOException = this.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    protected final void e() throws IOException {
        if (this.f) {
            d();
            throw new IOException("Writing after request completed.");
        }
        if (this.e) {
            throw new IOException("Stream has been closed.");
        }
    }
}
