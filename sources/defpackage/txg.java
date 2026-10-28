package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txg {
    private long a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private byte h;

    public final txh a() {
        if (this.h == 127) {
            txh txhVar = new txh(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            if (txhVar.g == 0) {
                throw new IllegalStateException();
            }
            if (txhVar.a < 0) {
                throw new IllegalStateException();
            }
            if (txhVar.b <= 0) {
                throw new IllegalStateException();
            }
            if (txhVar.c < 7) {
                throw new IllegalStateException();
            }
            if (txhVar.f < 128) {
                throw new IllegalStateException();
            }
            if (txhVar.d >= 24) {
                return txhVar;
            }
            throw new IllegalStateException();
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" epochMillis");
        }
        if ((this.h & 2) == 0) {
            sb.append(" itemStateBits");
        }
        if ((this.h & 4) == 0) {
            sb.append(" itemSizeBits");
        }
        if ((this.h & 8) == 0) {
            sb.append(" itemTimeStampBits");
        }
        if ((this.h & 16) == 0) {
            sb.append(" itemCheckSumBits");
        }
        if ((this.h & 32) == 0) {
            sb.append(" firstItemOffset");
        }
        if ((this.h & 64) == 0) {
            sb.append(" userVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.a = j;
        this.h = (byte) (this.h | 1);
    }

    public final void c(int i) {
        this.f = i;
        this.h = (byte) (this.h | 32);
    }

    public final void d(int i) {
        this.e = i;
        this.h = (byte) (this.h | 16);
    }

    public final void e() {
        this.c = 14;
        this.h = (byte) (this.h | 4);
    }

    public final void f() {
        this.b = 2;
        this.h = (byte) (this.h | 2);
    }

    public final void g() {
        this.d = 32;
        this.h = (byte) (this.h | 8);
    }

    public final void h() {
        this.g = 1;
        this.h = (byte) (this.h | 64);
    }
}
