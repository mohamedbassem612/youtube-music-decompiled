package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class soh {
    private agev a;
    private agev b;
    private aigj c;
    private agke d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private byte k;
    private int l;

    public soh() {
        agdf agdfVar = agdf.a;
        this.a = agdfVar;
        this.b = agdfVar;
    }

    public final soi a() {
        if (this.k == 127 && this.c != null && this.d != null && this.l != 0) {
            return new soi(this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" trackingParams");
        }
        if (this.d == null) {
            sb.append(" visualStateChangeTriggers");
        }
        if (this.l == 0) {
            sb.append(" visualState");
        }
        if ((this.k & 1) == 0) {
            sb.append(" currentPositionMillis");
        }
        if ((this.k & 2) == 0) {
            sb.append(" animate");
        }
        if ((this.k & 4) == 0) {
            sb.append(" fullscreen");
        }
        if ((this.k & 8) == 0) {
            sb.append(" shownLogged");
        }
        if ((this.k & 16) == 0) {
            sb.append(" visualChanged");
        }
        if ((this.k & 32) == 0) {
            sb.append(" visaPortraitCtaVisible");
        }
        if ((this.k & 64) == 0) {
            sb.append(" dismissed");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.k = (byte) (this.k | 2);
    }

    public final void c(long j) {
        this.e = j;
        this.k = (byte) (this.k | 1);
    }

    public final void d(boolean z) {
        this.g = z;
        this.k = (byte) (this.k | 4);
    }

    public final void e(agev agevVar) {
        if (agevVar == null) {
            throw new NullPointerException("Null onClickedRenderer");
        }
        this.b = agevVar;
    }

    public final void f(agev agevVar) {
        if (agevVar == null) {
            throw new NullPointerException("Null renderer");
        }
        this.a = agevVar;
    }

    public final void g(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 8);
    }

    public final void h(aigj aigjVar) {
        if (aigjVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.c = aigjVar;
    }

    public final void i(boolean z) {
        this.j = z;
        this.k = (byte) (this.k | 32);
    }

    public final void j(boolean z) {
        this.i = z;
        this.k = (byte) (this.k | 16);
    }

    public final void k(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null visualStateChangeTriggers");
        }
        this.d = agkeVar;
    }

    public final void l(int i) {
        if (i == 0) {
            throw new NullPointerException("Null visualState");
        }
        this.l = i;
    }

    public final void m() {
        this.k = (byte) (this.k | 64);
    }
}
