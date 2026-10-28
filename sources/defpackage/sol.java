package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sol {
    public soz a;
    public sox b;
    public soo c;
    public sow d;
    public soq e;
    public sop f;
    public sos g;
    public soj h;
    public sov i;
    public sot j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private aigj q;
    private amdd r;
    private String s;
    private byte t;

    public final som a() {
        soz sozVar;
        sox soxVar;
        soo sooVar;
        sow sowVar;
        soq soqVar;
        sop sopVar;
        sos sosVar;
        aigj aigjVar;
        amdd amddVar;
        String str;
        soj sojVar;
        sov sovVar;
        sot sotVar;
        if (this.t == 63 && (sozVar = this.a) != null && (soxVar = this.b) != null && (sooVar = this.c) != null && (sowVar = this.d) != null && (soqVar = this.e) != null && (sopVar = this.f) != null && (sosVar = this.g) != null && (aigjVar = this.q) != null && (amddVar = this.r) != null && (str = this.s) != null && (sojVar = this.h) != null && (sovVar = this.i) != null && (sotVar = this.j) != null) {
            return new som(this.k, this.l, this.m, this.n, this.o, this.p, sozVar, soxVar, sooVar, sowVar, soqVar, sopVar, sosVar, aigjVar, amddVar, str, sojVar, sovVar, sotVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.t & 1) == 0) {
            sb.append(" adOverlayShown");
        }
        if ((this.t & 2) == 0) {
            sb.append(" overflowMenuShown");
        }
        if ((this.t & 4) == 0) {
            sb.append(" adWebviewShown");
        }
        if ((this.t & 8) == 0) {
            sb.append(" currentPositionMillis");
        }
        if ((this.t & 16) == 0) {
            sb.append(" bufferedPositionMillis");
        }
        if ((this.t & 32) == 0) {
            sb.append(" durationMillis");
        }
        if (this.a == null) {
            sb.append(" skipButtonState");
        }
        if (this.b == null) {
            sb.append(" mdxAdOverlayState");
        }
        if (this.c == null) {
            sb.append(" adProgressTextState");
        }
        if (this.d == null) {
            sb.append(" learnMoreOverlayState");
        }
        if (this.e == null) {
            sb.append(" adTitleOverlayState");
        }
        if (this.f == null) {
            sb.append(" adReEngagementState");
        }
        if (this.g == null) {
            sb.append(" brandInteractionState");
        }
        if (this.q == null) {
            sb.append(" overlayTrackingParams");
        }
        if (this.r == null) {
            sb.append(" interactionLoggingClientData");
        }
        if (this.s == null) {
            sb.append(" overflowButtonTargetId");
        }
        if (this.h == null) {
            sb.append(" adDisclosureBannerState");
        }
        if (this.i == null) {
            sb.append(" infoChipState");
        }
        if (this.j == null) {
            sb.append(" clickableInstreamTapState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final soo b() {
        soo sooVar = this.c;
        if (sooVar != null) {
            return sooVar;
        }
        throw new IllegalStateException("Property \"adProgressTextState\" has not been set");
    }

    public final sop c() {
        sop sopVar = this.f;
        if (sopVar != null) {
            return sopVar;
        }
        throw new IllegalStateException("Property \"adReEngagementState\" has not been set");
    }

    public final sos d() {
        sos sosVar = this.g;
        if (sosVar != null) {
            return sosVar;
        }
        throw new IllegalStateException("Property \"brandInteractionState\" has not been set");
    }

    public final sov e() {
        sov sovVar = this.i;
        if (sovVar != null) {
            return sovVar;
        }
        throw new IllegalStateException("Property \"infoChipState\" has not been set");
    }

    public final soz f() {
        soz sozVar = this.a;
        if (sozVar != null) {
            return sozVar;
        }
        throw new IllegalStateException("Property \"skipButtonState\" has not been set");
    }

    public final amdd g() {
        amdd amddVar = this.r;
        if (amddVar != null) {
            return amddVar;
        }
        throw new IllegalStateException("Property \"interactionLoggingClientData\" has not been set");
    }

    public final void h(boolean z) {
        this.k = z;
        this.t = (byte) (this.t | 1);
    }

    public final void i(boolean z) {
        this.m = z;
        this.t = (byte) (this.t | 4);
    }

    public final void j(int i) {
        this.o = i;
        this.t = (byte) (this.t | 16);
    }

    public final void k(int i) {
        this.n = i;
        this.t = (byte) (this.t | 8);
    }

    public final void l(int i) {
        this.p = i;
        this.t = (byte) (this.t | 32);
    }

    public final void m() {
        h(false);
        p(false);
        i(false);
        k(-1);
        j(-1);
        l(-1);
        this.a = soz.b().a();
        this.c = soo.b().a();
        this.d = sow.a().f();
        this.e = new soq(sok.a);
        this.f = sop.b().f();
        this.g = sos.b().a();
        q(aigj.d);
        n(amdd.a);
        this.i = sov.b().a();
        this.j = sot.a().d();
        o("");
    }

    public final void n(amdd amddVar) {
        if (amddVar == null) {
            throw new NullPointerException("Null interactionLoggingClientData");
        }
        this.r = amddVar;
    }

    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null overflowButtonTargetId");
        }
        this.s = str;
    }

    public final void p(boolean z) {
        this.l = z;
        this.t = (byte) (this.t | 2);
    }

    public final void q(aigj aigjVar) {
        if (aigjVar == null) {
            throw new NullPointerException("Null overlayTrackingParams");
        }
        this.q = aigjVar;
    }
}
