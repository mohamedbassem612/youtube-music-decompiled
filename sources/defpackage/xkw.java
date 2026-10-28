package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xkw implements tdk, bnu {
    public final zwb a;
    public final xla b;
    public final xmr c;
    public final rre d;
    private final tbt l;
    private final avmb m;
    private final vyo n;
    private avlr q;
    private awko s;
    private final boolean t;
    private final vxz u;
    private final vxz v;
    public final awli e = new awli(Boolean.FALSE);
    private final awli o = new awli();
    private final awli p = new awli();
    public final awli g = new awli();
    public final awli h = new awli();
    public final awli i = new awli();
    public final awli j = new awli();
    final avmm k = new avmm();
    private final awli r = new awli(Boolean.TRUE);

    public xkw(tbt tbtVar, avmb avmbVar, zwb zwbVar, vyo vyoVar, xla xlaVar, vxz vxzVar, rre rreVar, vxz vxzVar2, xmr xmrVar, tqj tqjVar) {
        this.l = tbtVar;
        this.m = avmbVar;
        this.a = zwbVar;
        this.n = vyoVar;
        this.b = xlaVar;
        this.u = vxzVar;
        this.d = rreVar;
        this.v = vxzVar2;
        this.c = xmrVar;
        int i = tqr.a;
        this.t = tqjVar.a(1073951412) != 0;
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsi.m(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.b;
    }

    public final xpe d(boolean z) {
        xpd xpdVarA = xpe.a();
        xpdVarA.a = algp.HANDOFF_FEATURE_TYPE_LR_ALWAYS_AUTOCONNECT;
        if (z || !this.v.l(38, 45376307L, false)) {
            return xpdVarA.a();
        }
        xpdVarA.b(true);
        return xpdVarA.a();
    }

    public final xpe e(boolean z) {
        xpd xpdVarA = xpe.a();
        xpdVarA.a = algp.HANDOFF_FEATURE_TYPE_LR_AUTOCONNECT;
        if (z) {
            return xpdVarA.a();
        }
        xla xlaVar = this.b;
        boolean z2 = xlaVar.ai() || this.v.l(6, 45359253L, false);
        if (!z2 && !xlaVar.ah() && !this.v.l(3, 45359197L, false)) {
            agrx agrxVar = agso.a;
            return xpdVarA.a();
        }
        boolean z3 = xlaVar.ah() || this.v.l(3, 45359197L, false);
        boolean z4 = !this.v.l(3, 45359197L, false);
        xpdVarA.b(true);
        xpdVarA.c(z3);
        xpdVarA.e(z4);
        xpdVarA.d(z2);
        return xpdVarA.a();
    }

    public final xpe f(boolean z) {
        xpd xpdVarA = xpe.a();
        xpdVarA.a = algp.HANDOFF_FEATURE_TYPE_LR_COMMENTS;
        if (z || !this.v.l(27, 45369928L, false)) {
            return xpdVarA.a();
        }
        xpdVarA.b(true);
        xpdVarA.c(true);
        return xpdVarA.a();
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsi.n(this);
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        agrx agrxVar = agso.a;
        this.r.kk(Boolean.TRUE);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        if (this.t) {
            return;
        }
        this.l.f(this);
        avmm avmmVar = this.k;
        avmmVar.b();
        int i = 3;
        avlr avlrVarJ = avlr.j(this.r.O(this.m).K(new vvb(this, i)), this.j, new mkw(this, i));
        this.q = avlrVarJ;
        avlr avlrVar = this.q;
        vyo vyoVar = this.n;
        int i2 = 15;
        avlr avlrVar2 = this.q;
        avlr avlrVarC = vyoVar.c(new xee(6));
        int i3 = 4;
        awko awkoVarAp = this.q.K(new vvb(this, i3)).ap();
        this.s = awkoVarAp;
        awke awkeVar = new awke();
        awkoVarAp.a(awkeVar);
        avmmVar.e(this.u.p(6, 45357214L).af(new vub(this, 16)), avlrVarJ.af(new vub(this, 17)), avlr.j(avlrVar, vyoVar.c(new xee(5)), new vvj(2)).af(new vub(this.o, i2)), avlr.j(avlrVar2, avlrVarC, new mkw(this, i3)).af(new vub(this.p, i2)), awkeVar.a);
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        if (this.t) {
            return;
        }
        this.l.l(this);
        this.k.b();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
