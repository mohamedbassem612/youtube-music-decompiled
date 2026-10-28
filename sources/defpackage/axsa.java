package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsa extends axsj {
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final axsg g;
    private final UploadDataProvider h;
    private boolean i;

    public axsa(axsg axsgVar, long j) {
        this.h = new axrz(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Content length < 0.");
        }
        this.g = axsgVar;
        int i = (int) j;
        this.a = i;
        this.b = ByteBuffer.allocate(i);
    }

    private final void f(int i) throws ProtocolException {
        int i2 = this.a;
        ByteBuffer byteBuffer = this.b;
        if (i2 != -1) {
            if (byteBuffer.position() + i > i2) {
                throw new ProtocolException(a.bP(i2, "exceeded content-length limit of ", " bytes"));
            }
        } else if (byteBuffer.limit() - this.b.position() <= i) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Math.max(this.b.capacity() << 1, this.b.capacity() + i));
            byteBufferAllocate.put(this.b);
            this.b = byteBufferAllocate;
        }
    }

    @Override // defpackage.axsj
    public final UploadDataProvider a() {
        return this.h;
    }

    @Override // defpackage.axsj
    public final boolean c() throws ProtocolException {
        if (!this.e) {
            this.i = true;
            return false;
        }
        this.c = true;
        if (this.b.position() < this.a) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        return true;
    }

    @Override // defpackage.axsj, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        super.close();
        if (this.i) {
            this.g.connect();
            this.i = false;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        e();
        f(1);
        this.b.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        e();
        f(i2);
        this.b.put(bArr, i, i2);
    }

    @Override // defpackage.axsj
    public final void b() {
    }

    public axsa(axsg axsgVar) {
        this.h = new axrz(this);
        this.g = axsgVar;
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }
}
