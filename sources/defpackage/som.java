package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class som {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final soz d;
    public final soo e;
    public final sow f;
    private final int g;
    private final int h;
    private final int i;
    private final sox j;
    private final soq k;
    private final sop l;
    private final sos m;
    private final aigj n;
    private final amdd o;
    private final String p;
    private final soj q;
    private final sov r;
    private final sot s;

    public som(boolean z, boolean z2, boolean z3, int i, int i2, int i3, soz sozVar, sox soxVar, soo sooVar, sow sowVar, soq soqVar, sop sopVar, sos sosVar, aigj aigjVar, amdd amddVar, String str, soj sojVar, sov sovVar, sot sotVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.d = sozVar;
        this.j = soxVar;
        this.e = sooVar;
        this.f = sowVar;
        this.k = soqVar;
        this.l = sopVar;
        this.m = sosVar;
        this.n = aigjVar;
        this.o = amddVar;
        this.p = str;
        this.q = sojVar;
        this.r = sovVar;
        this.s = sotVar;
    }

    public static sol a() {
        sol solVar = new sol();
        solVar.h(false);
        solVar.p(false);
        solVar.i(false);
        solVar.k(-1);
        solVar.j(-1);
        solVar.l(-1);
        solVar.a = soz.b().a();
        aaef aaefVar = new aaef();
        aaefVar.c(false);
        solVar.b = aaefVar.b();
        solVar.c = soo.b().a();
        solVar.d = sow.a().f();
        solVar.e = new soq(sok.a);
        solVar.f = sop.b().f();
        solVar.g = sos.b().a();
        solVar.q(aigj.d);
        solVar.n(amdd.a);
        solVar.o("");
        heg hegVar = new heg((char[]) null);
        hegVar.r(aolc.a);
        solVar.h = hegVar.q();
        solVar.i = sov.b().a();
        aaef aaefVar2 = new aaef();
        aaefVar2.e(false);
        solVar.j = aaefVar2.d();
        return solVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof som) {
            som somVar = (som) obj;
            if (this.a == somVar.a && this.b == somVar.b && this.c == somVar.c && this.g == somVar.g && this.h == somVar.h && this.i == somVar.i && this.d.equals(somVar.d) && this.j.equals(somVar.j) && this.e.equals(somVar.e) && this.f.equals(somVar.f) && this.k.equals(somVar.k) && this.l.equals(somVar.l) && this.m.equals(somVar.m) && this.n.equals(somVar.n) && this.o.equals(somVar.o) && this.p.equals(somVar.p) && this.q.equals(somVar.q) && this.r.equals(somVar.r) && this.s.equals(somVar.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((((((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    public final String toString() {
        sot sotVar = this.s;
        sov sovVar = this.r;
        soj sojVar = this.q;
        amdd amddVar = this.o;
        aigj aigjVar = this.n;
        sos sosVar = this.m;
        sop sopVar = this.l;
        soq soqVar = this.k;
        sow sowVar = this.f;
        soo sooVar = this.e;
        sox soxVar = this.j;
        return "AdOverlayState{adOverlayShown=" + this.a + ", overflowMenuShown=" + this.b + ", adWebviewShown=" + this.c + ", currentPositionMillis=" + this.g + ", bufferedPositionMillis=" + this.h + ", durationMillis=" + this.i + ", skipButtonState=" + String.valueOf(this.d) + ", mdxAdOverlayState=" + String.valueOf(soxVar) + ", adProgressTextState=" + String.valueOf(sooVar) + ", learnMoreOverlayState=" + String.valueOf(sowVar) + ", adTitleOverlayState=" + String.valueOf(soqVar) + ", adReEngagementState=" + String.valueOf(sopVar) + ", brandInteractionState=" + String.valueOf(sosVar) + ", overlayTrackingParams=" + String.valueOf(aigjVar) + ", interactionLoggingClientData=" + String.valueOf(amddVar) + ", overflowButtonTargetId=" + this.p + ", adDisclosureBannerState=" + String.valueOf(sojVar) + ", infoChipState=" + String.valueOf(sovVar) + ", clickableInstreamTapState=" + String.valueOf(sotVar) + '}';
    }

    public som() {
        throw null;
    }
}
