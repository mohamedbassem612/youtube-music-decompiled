package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axse extends axsj {
    public final axsl a;
    public final long b;
    public final ByteBuffer c;
    private final UploadDataProvider g = new axsd(this);
    private long h;

    public axse(long j, axsl axslVar) {
        if (j < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.b = j;
        this.c = ByteBuffer.allocate((int) Math.min(j, 16384L));
        this.a = axslVar;
        this.h = 0L;
    }

    private final void f(int i) throws ProtocolException {
        long j = this.h + ((long) i);
        long j2 = this.b;
        if (j <= j2) {
            return;
        }
        throw new ProtocolException("expected " + (j2 - this.h) + " bytes but received " + i);
    }

    private final void g() throws IOException {
        if (this.c.hasRemaining()) {
            return;
        }
        h();
    }

    private final void h() throws IOException {
        new axjt("CronetFixedModeOutputStream#uploadBufferInternal", 0);
        e();
        this.a.a(0);
        d();
    }

    private final void i() throws IOException {
        if (this.h == this.b) {
            h();
        }
    }

    @Override // defpackage.axsj
    public final UploadDataProvider a() {
        return this.g;
    }

    @Override // defpackage.axsj
    public final void b() throws ProtocolException {
        if (this.h < this.b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // defpackage.axsj
    public final boolean c() {
        return true;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        f(i2);
        int i3 = i2;
        while (i3 > 0) {
            g();
            ByteBuffer byteBuffer = this.c;
            int iMin = Math.min(i3, byteBuffer.remaining());
            byteBuffer.put(bArr, (i + i2) - i3, iMin);
            i3 -= iMin;
        }
        this.h += (long) i2;
        i();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        e();
        f(1);
        g();
        this.c.put((byte) i);
        this.h++;
        i();
    }
}
