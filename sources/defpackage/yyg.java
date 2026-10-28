package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yyg {
    public final yye a;
    public final zeo b;
    public final boolean c;
    public volatile yyf d;

    public yyg(yye yyeVar, zeo zeoVar) {
        this.a = yyeVar;
        this.b = zeoVar;
        zjr zjrVar = yyeVar.d;
        boolean zBm = zjrVar.bm();
        this.c = zBm;
        if (zBm) {
            this.d = new yyf(zjrVar);
            zjrVar.d.c(new xdx(10)).af(new zgd(this, 1));
        }
    }

    public final boolean A() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.F : this.a.d.cf();
    }

    public final boolean B() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.aa : this.a.d.cg();
    }

    public final boolean C() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.f : this.a.d.ch();
    }

    public final boolean D() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.e : this.a.d.ci();
    }

    public final boolean E() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.ab : this.a.d.cj();
    }

    public final boolean F() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.b : this.a.d.ck();
    }

    public final boolean G() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.h : this.a.d.cl();
    }

    public final boolean H() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.D : this.a.d.cm();
    }

    public final boolean I() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.E : this.a.d.cn();
    }

    public final boolean J() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.d : this.a.d.co();
    }

    public final boolean K() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.j : this.a.d.cq();
    }

    public final boolean L() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.g : this.a.d.cs();
    }

    public final boolean M() {
        yyf yyfVar = this.d;
        return (yyfVar != null ? yyfVar.t : this.a.d.cC()) && this.a.a().ak();
    }

    public final boolean N() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.u : this.a.d.aY();
    }

    public final boolean O() {
        return this.a.d.fl();
    }

    public final boolean P() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.s : this.a.d.cL();
    }

    public final boolean Q() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.p : this.a.d.dr();
    }

    public final boolean R() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.v : this.a.d.cb();
    }

    public final boolean S() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.P : this.a.d.dw();
    }

    public final boolean T() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.N : this.a.d.dB();
    }

    public final boolean U() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.K : this.a.d.es();
    }

    public final boolean V() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.L : this.a.d.et();
    }

    public final boolean W() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.X : this.a.d.eD();
    }

    public final float a() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.m : this.a.d.D();
    }

    public final float b() {
        zcf zcfVar = this.a.m;
        if (zcfVar == null) {
            return 30.0f;
        }
        float fA = zcfVar.c().a();
        if (fA > 0.0f) {
            return fA;
        }
        return 30.0f;
    }

    public final float c() {
        yyf yyfVar = this.d;
        if (yyfVar != null) {
            return yyfVar.l;
        }
        float fH = this.a.d.H();
        if (fH <= 0.0f) {
            return 999.0f;
        }
        return fH;
    }

    public final int d() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.S : this.a.d.g();
    }

    public final int e() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.T : this.a.d.k();
    }

    public final int f() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.W : this.a.d.l();
    }

    public final long g() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.J : this.a.d.y();
    }

    public final long h() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.w : this.a.d.M();
    }

    public final ListenableFuture i(boolean z) {
        ListenableFuture listenableFutureES = this.a.d.eS(z);
        taf.j(listenableFutureES, new xwk(9));
        return listenableFutureES;
    }

    public final Object j() {
        zcf zcfVar = this.a.m;
        if (zcfVar != null) {
            return zcfVar.Z;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ywn] */
    public final void l(String str) {
        ?? J = j();
        if (J instanceof ywn) {
            J.w("csg", str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ywn] */
    public final void m(Object obj) {
        ?? J = j();
        if (J instanceof ywn) {
            J.h((zhc) obj);
        }
    }

    public final void n(String str, String str2) {
        zcf zcfVar = this.a.m;
        if (zcfVar != null) {
            zcfVar.Z.w(str, str2);
        }
    }

    public final boolean o() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.Q : this.a.d.aW();
    }

    public final boolean p() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.Y : this.a.d.ay();
    }

    public final boolean q() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.H : this.a.d.cS();
    }

    public final boolean r() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.C : this.a.d.aU();
    }

    public final boolean s() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.O : this.a.d.aX();
    }

    public final boolean t() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.z : this.a.d.ba();
    }

    public final boolean u() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.A : this.a.d.bb();
    }

    public final boolean v() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.y : this.a.d.bc();
    }

    public final boolean w() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.U : this.a.d.bg();
    }

    public final boolean x() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.n : this.a.d.bi();
    }

    public final boolean y() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.G : this.a.d.bS();
    }

    public final boolean z() {
        yyf yyfVar = this.d;
        return yyfVar != null ? yyfVar.B : this.a.d.cd();
    }
}
