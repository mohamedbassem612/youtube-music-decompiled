package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsc extends axsj {
    public final axsl a;
    public final ByteBuffer b;
    public boolean c;
    private final UploadDataProvider g = new axsb(this);

    public axsc(int i, axsl axslVar) {
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.b = ByteBuffer.allocate(i);
        this.a = axslVar;
    }

    private final void f() throws IOException {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.hasRemaining()) {
            return;
        }
        new axjt("CronetChunkedOutputStream#uploadBufferInternal", 0);
        e();
        this.a.a(0);
        d();
    }

    @Override // defpackage.axsj
    public final UploadDataProvider a() {
        return this.g;
    }

    @Override // defpackage.axsj
    public final boolean c() {
        return true;
    }

    @Override // defpackage.axsj, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.c) {
            return;
        }
        this.c = true;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            ByteBuffer byteBuffer = this.b;
            int iMin = Math.min(i3, byteBuffer.remaining());
            byteBuffer.put(bArr, (i + i2) - i3, iMin);
            i3 -= iMin;
            f();
        }
    }

    @Override // defpackage.axsj
    public final void b() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        f();
        this.b.put((byte) i);
    }
}
