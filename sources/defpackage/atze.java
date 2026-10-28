package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atze implements atzb {
    private final int a;
    private final int b;
    private final InputStream c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    public atze(InputStream inputStream, long j, int i) {
        if (inputStream.markSupported()) {
            this.c = inputStream;
        } else {
            this.c = new BufferedInputStream(inputStream);
        }
        this.g = j;
        this.a = i;
        int i2 = i + 1;
        this.b = i2;
        this.c.mark(i2);
    }

    @Override // defpackage.atzb
    public final synchronized int a(byte[] bArr, int i, int i2) {
        ahno.G(65536 - i >= i2, "Cannot read into a buffer smaller than given length");
        if (i2 == 0) {
            return 0;
        }
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        int i3 = this.c.read(bArr, i, (int) Math.min(i2, ((long) this.a) - (this.e - this.d)));
        if (i3 == -1) {
            long j = this.g;
            long j2 = this.e;
            if (j == -1) {
                this.g = j2;
            } else if (j2 < j) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
            return 0;
        }
        long j3 = this.e + ((long) i3);
        this.e = j3;
        long j4 = this.g;
        if (j4 == -1 || j3 <= j4) {
            return i3;
        }
        throw new IOException("The stream continues beyond expected size");
    }

    @Override // defpackage.atzb
    public final synchronized long b() {
        return this.d;
    }

    @Override // defpackage.atzb
    public final synchronized long c() {
        return this.a;
    }

    @Override // defpackage.atzb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
    }

    @Override // defpackage.atzb
    public final synchronized long d() {
        return this.e;
    }

    @Override // defpackage.atzb
    public final synchronized long e() {
        return this.g;
    }

    @Override // defpackage.atzb
    public final synchronized long f(long j) {
        long j2;
        long jMin = Math.min(j, ((long) this.a) - (this.e - this.d));
        j2 = 0;
        if (jMin != 0) {
            if (this.f) {
                this.c.reset();
                this.f = false;
            }
            InputStream inputStream = this.c;
            long jSkip = inputStream.skip(jMin);
            if (jSkip != 0) {
                j2 = jSkip;
            } else if (i()) {
                do {
                    jSkip = inputStream.skip(jMin);
                } while (jSkip == 0);
                j2 = jSkip;
            }
            this.e += j2;
        }
        return j2;
    }

    @Override // defpackage.atzb
    public final synchronized void g() {
        if (this.d != this.e) {
            this.c.mark(this.b);
        }
        this.d = this.e;
    }

    @Override // defpackage.atzb
    public final synchronized void h() {
        this.e = this.d;
        this.f = true;
    }

    @Override // defpackage.atzb
    public final synchronized boolean i() {
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        InputStream inputStream = this.c;
        if (inputStream.available() <= 0) {
            if (inputStream.read() != -1) {
                inputStream.reset();
                long j = this.e;
                long jSkip = this.d;
                while (true) {
                    j -= jSkip;
                    if (j <= 0) {
                        break;
                    }
                    jSkip = inputStream.skip(j);
                }
            } else {
                this.g = this.e;
                return false;
            }
        }
        return true;
    }
}
