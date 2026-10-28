package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aecb {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private short m;

    public final aecc a() {
        if (this.m == 4095) {
            return new aecc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" containerMarginTopPx");
        }
        if ((this.m & 2) == 0) {
            sb.append(" containerMarginBottomPx");
        }
        if ((this.m & 4) == 0) {
            sb.append(" containerMarginStartPx");
        }
        if ((this.m & 8) == 0) {
            sb.append(" containerMarginEndPx");
        }
        if ((this.m & 16) == 0) {
            sb.append(" rowGapPx");
        }
        if ((this.m & 32) == 0) {
            sb.append(" columnGapPx");
        }
        if ((this.m & 64) == 0) {
            sb.append(" containerMarginTopDp");
        }
        if ((this.m & 128) == 0) {
            sb.append(" containerMarginBottomDp");
        }
        if ((this.m & 256) == 0) {
            sb.append(" containerMarginStartDp");
        }
        if ((this.m & 512) == 0) {
            sb.append(" containerMarginEndDp");
        }
        if ((this.m & 1024) == 0) {
            sb.append(" rowGapDp");
        }
        if ((this.m & 2048) == 0) {
            sb.append(" columnGapDp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.l = f;
        this.m = (short) (this.m | 2048);
    }

    public final void c(int i) {
        this.f = i;
        this.m = (short) (this.m | 32);
    }

    public final void d(float f) {
        this.h = f;
        this.m = (short) (this.m | 128);
    }

    public final void e(int i) {
        this.b = i;
        this.m = (short) (this.m | 2);
    }

    public final void f(float f) {
        this.j = f;
        this.m = (short) (this.m | 512);
    }

    public final void g(int i) {
        this.d = i;
        this.m = (short) (this.m | 8);
    }

    public final void h(float f) {
        this.i = f;
        this.m = (short) (this.m | 256);
    }

    public final void i(int i) {
        this.c = i;
        this.m = (short) (this.m | 4);
    }

    public final void j(float f) {
        this.g = f;
        this.m = (short) (this.m | 64);
    }

    public final void k(int i) {
        this.a = i;
        this.m = (short) (this.m | 1);
    }

    public final void l(float f) {
        this.k = f;
        this.m = (short) (this.m | 1024);
    }

    public final void m(int i) {
        this.e = i;
        this.m = (short) (this.m | 16);
    }
}
