package defpackage;

import android.content.Context;
import com.google.android.libraries.blocks.Container;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkg implements ger, gld, gmb, gpu, gva, gzc, hbb, hce, hcv, hdo, hen, hgj, hgp, hkj, hnp, hns, hnx, hqv, hrw, hsm, hsy, htm, htq, hup, hvg, ifb, iln, ipj, ipq, iqo, iqu, ird, iqz, roz, vvf, vyu, wlm, wok, wot, wqb, wrt, wrz, wsz, wtc, wty, wub, wuj, wuv, wus, wvj, yet, abws, abzs, acoe, aegd, aeix, afoe, afrj, afrk, aupg {
    final aupr A;
    final aupr B;
    final aupr C;
    final aupr D;
    final aupr E;
    final aupr F;
    final aupr G;
    final aupr H;
    final aupr I;
    final aupr J;
    final aupr K;
    final aupr L;
    final aupr M;
    final aupr N;
    final aupr O;
    final aupr P;
    final aupr Q;
    final aupr R;
    final aupr S;
    final aupr T;
    final aupr U;
    final aupr V;
    final aupr W;
    final aupr X;
    final aupr Y;
    final aupr Z;
    public final affd a;
    final aupr aa;
    final aupr ab;
    final aupr ac;
    final aupr ad;
    final aupr ae;
    final aupr af;
    final aupr ag;
    public final aupr ah;
    final aupr ai;
    final aupr aj;
    final aupr ak;
    final aupr al;
    final aupr am;
    public final aupr an;
    public final aupr ao;
    final aupr ap;
    private final gkg aq = this;
    public final ght b;
    public final aupr c;
    final aupr d;
    final aupr e;
    final aupr f;
    final aupr g;
    final aupr h;
    final aupr i;
    final aupr j;
    final aupr k;
    final aupr l;
    public final aupr m;
    final aupr n;
    final aupr o;
    final aupr p;
    final aupr q;
    final aupr r;
    final aupr s;
    final aupr t;
    final aupr u;
    final aupr v;
    final aupr w;
    final aupr x;
    final aupr y;
    final aupr z;

    public gkg(ght ghtVar, affd affdVar) {
        this.b = ghtVar;
        this.a = affdVar;
        this.c = aupm.c(new gix(ghtVar, this, 1));
        this.d = aupu.b(new gix(ghtVar, this, 3));
        this.e = new gix(ghtVar, this, 2);
        this.f = aupm.c(new gix(ghtVar, this, 0));
        this.g = aupm.c(new gix(ghtVar, this, 4));
        this.h = aupm.c(new gix(ghtVar, this, 7));
        this.i = aupm.c(new gix(ghtVar, this, 6));
        this.j = new gix(ghtVar, this, 5);
        aupl auplVar = new aupl();
        this.k = auplVar;
        this.l = aupm.c(new gix(ghtVar, this, 9));
        this.m = aupm.c(new gix(ghtVar, this, 11));
        this.n = aupu.b(new gix(ghtVar, this, 10));
        aupl.b(auplVar, aupm.c(new gix(ghtVar, this, 8)));
        this.o = aupm.c(new gix(ghtVar, this, 13));
        this.p = aupm.c(new gix(ghtVar, this, 12));
        this.q = aupm.c(new gix(ghtVar, this, 15));
        this.r = aupm.c(new gix(ghtVar, this, 14));
        this.s = aupm.c(new gix(ghtVar, this, 16));
        this.t = aupm.c(new gix(ghtVar, this, 17));
        this.u = aupu.b(new gix(ghtVar, this, 18));
        this.v = aupm.c(new gix(ghtVar, this, 21));
        this.w = aupm.c(new gix(ghtVar, this, 20));
        this.x = new gix(ghtVar, this, 19);
        this.y = aupm.c(new gix(ghtVar, this, 23));
        this.z = aupm.c(new gix(ghtVar, this, 22));
        this.A = aupm.c(new gix(ghtVar, this, 26));
        this.B = aupm.c(new gix(ghtVar, this, 25));
        this.C = aupm.c(new gix(ghtVar, this, 24));
        this.D = aupu.b(new gix(ghtVar, this, 27));
        this.E = aupm.c(new gix(ghtVar, this, 28));
        this.F = aupm.c(new gix(ghtVar, this, 29));
        this.G = aupm.c(new gix(ghtVar, this, 31));
        this.H = aupm.c(new gix(ghtVar, this, 32));
        this.I = aupm.c(new gix(ghtVar, this, 30));
        this.J = aupm.c(new gix(ghtVar, this, 33));
        this.K = aupu.b(new gix(ghtVar, this, 34));
        this.L = aupu.b(new gix(ghtVar, this, 35));
        this.M = aupu.b(new gix(ghtVar, this, 36));
        this.N = aupu.b(new gix(ghtVar, this, 37));
        this.O = aupm.c(new gix(ghtVar, this, 39));
        this.P = aupu.b(new gix(ghtVar, this, 38));
        this.Q = aupu.b(new gix(ghtVar, this, 40));
        this.R = aupu.b(new gix(ghtVar, this, 41));
        this.S = aupu.b(new gix(ghtVar, this, 43));
        this.T = new gix(ghtVar, this, 45);
        this.U = aupu.b(new gix(ghtVar, this, 46));
        this.V = aupm.c(new gix(ghtVar, this, 49));
        this.W = aupm.c(new gix(ghtVar, this, 48));
        this.X = aupm.c(new gix(ghtVar, this, 51));
        this.Y = aupm.c(new gix(ghtVar, this, 50));
        this.Z = new gix(ghtVar, this, 53);
        this.aa = aupm.c(new gix(ghtVar, this, 54));
        this.ab = aupm.c(new gix(ghtVar, this, 56));
        this.ac = aupu.b(new gix(ghtVar, this, 57));
        this.ad = new gix(ghtVar, this, 55);
        this.ae = aupm.c(new gix(ghtVar, this, 52));
        this.af = aupm.c(new gix(ghtVar, this, 58));
        this.ag = aupm.c(new gix(ghtVar, this, 60));
        this.ah = aupm.c(new gix(ghtVar, this, 59));
        this.ai = aupm.c(new gix(ghtVar, this, 61));
        this.aj = aupm.c(new gix(ghtVar, this, 62));
        this.ak = aupu.b(new gix(ghtVar, this, 65));
        this.al = aupu.b(new gix(ghtVar, this, 64));
        this.am = new gix(ghtVar, this, 63);
        this.an = aupm.c(new gix(ghtVar, this, 66));
        this.ao = aupm.c(new gix(ghtVar, this, 67));
        this.ap = aupm.c(new gix(ghtVar, this, 68));
    }

    @Override // defpackage.wvj
    public final aapz A() {
        return (aapz) this.U.io();
    }

    @Override // defpackage.wub
    public final aapz B() {
        return (aapz) this.Q.io();
    }

    @Override // defpackage.wuj
    public final aaqf C() {
        return (aaqf) this.S.io();
    }

    @Override // defpackage.wtc
    public final aaqf D() {
        return (aaqf) this.N.io();
    }

    @Override // defpackage.iln
    public final aaqf E() {
        return (aaqf) this.D.io();
    }

    @Override // defpackage.hen
    public final aaqf F() {
        return (aaqf) this.u.io();
    }

    public final abhh G() {
        awut awutVar = (awut) this.b.bm.io();
        afiz afizVarP = p();
        new afvi((afvq) this.d.io());
        return new abhh(awutVar, afizVarP);
    }

    @Override // defpackage.wub
    public final aend H() {
        return (aend) this.R.io();
    }

    @Override // defpackage.wrz
    public final aend I() {
        return (aend) this.L.io();
    }

    public final aciz J() {
        ght ghtVar = this.b;
        return new aciz(ghtVar.t, new ahub(p(), (byte[]) null), (byte[]) null);
    }

    @Override // defpackage.wmx
    public final wjr K() {
        return (wjr) this.J.io();
    }

    @Override // defpackage.hdo
    public final kyr L() {
        return new kyr((qrx) this.t.io(), (Executor) this.b.z.io(), (short[]) null);
    }

    @Override // defpackage.hbb
    public final kyr M() {
        return new kyr((qrx) this.s.io(), (Executor) this.b.z.io());
    }

    @Override // defpackage.iqo, defpackage.ird
    public final xsc N() {
        aunn aunnVarB = aupm.b(this.z);
        ght ghtVar = this.b;
        return new xsc((Object) aunnVarB, ghtVar.z.io(), ghtVar.cr.io(), (int[]) null);
    }

    @Override // defpackage.ger
    public final zwh a() {
        return (zwh) this.c.io();
    }

    @Override // defpackage.ger, defpackage.wok, defpackage.wrt, defpackage.wuv, defpackage.wvd, defpackage.abzs
    public final aaok b() {
        vwd vwdVar = (vwd) this.f.io();
        ght ghtVar = this.b;
        return new aaok(vwdVar, (tfq) ghtVar.cd.io(), (Executor) ghtVar.T.io());
    }

    @Override // defpackage.ger
    public final xsc c() {
        return (xsc) this.g.io();
    }

    @Override // defpackage.gzc
    public final gzb d() {
        return new gzb((tpq) this.r.io(), (Executor) this.b.z.io());
    }

    @Override // defpackage.hgj, defpackage.hgp, defpackage.ipq
    public final iqg e() {
        return (iqg) this.x.io();
    }

    @Override // defpackage.gld, defpackage.hcv, defpackage.hnp, defpackage.hns, defpackage.hnx, defpackage.hqv, defpackage.hrw, defpackage.hsm, defpackage.hsy, defpackage.htm, defpackage.htq, defpackage.hup, defpackage.hvg, defpackage.ipj, defpackage.iqz
    public final iqk f() {
        return (iqk) this.j.io();
    }

    @Override // defpackage.gpu, defpackage.gva, defpackage.hkj
    public final iql g() {
        return new iql(aupm.b(this.p), (Executor) this.b.z.io());
    }

    @Override // defpackage.iqu
    public final iqn h() {
        return (iqn) this.C.io();
    }

    @Override // defpackage.ifb
    public final iqn i() {
        return (iqn) this.C.io();
    }

    @Override // defpackage.gmb
    public final Container j() {
        return (Container) this.k.io();
    }

    @Override // defpackage.roz
    public final rou k() {
        bec becVar = (bec) this.E.io();
        ght ghtVar = this.b;
        return new rou(azu.g(becVar, (Executor) ghtVar.t.io()), (Executor) ghtVar.u.io(), (mbc) ghtVar.l.io(), (aerv) ghtVar.bN.io());
    }

    @Override // defpackage.wsz
    public final wsy l() {
        return (wsy) this.M.io();
    }

    @Override // defpackage.aegi
    public final aegh m() {
        return (aegh) this.ae.io();
    }

    @Override // defpackage.aeix
    public final aeiy n() {
        bec becVar = (bec) this.af.io();
        ght ghtVar = this.b;
        lqa lqaVar = new lqa(azu.g(becVar, (Executor) ghtVar.u.io()), (byte[]) null);
        Executor executor = (Executor) ghtVar.u.io();
        Executor executor2 = (Executor) ghtVar.B.io();
        ghx ghxVar = ghtVar.a;
        return new aeiy(lqaVar, executor, new axlj(executor2, ghxVar.ak(), aupm.b(ghxVar.hh)), (Executor) ghtVar.B.io(), (Context) ghtVar.v.io(), (vxz) this.Z.io(), ghxVar.ak(), (ahgb) this.ad.io());
    }

    public final affd o() {
        affd affdVar = this.a;
        ahno.P(affdVar != null, "Null propagated AccountId! Check that you have included one of the following modules:\n\t//java/com/google/apps/tiktok/account:module\n\t//java/com/google/apps/tiktok/account/testing:module");
        affdVar.getClass();
        return affdVar;
    }

    @Override // defpackage.roz, defpackage.yet
    public final afiz p() {
        ght ghtVar = this.b;
        return new afiz((auor) ghtVar.X.io(), o(), (ahex) ghtVar.t.io());
    }

    @Override // defpackage.vyu
    public final Optional q() {
        return Optional.of((aesp) this.I.io());
    }

    @Override // defpackage.hce
    public final Optional r() {
        return Optional.of(new hcc((wcn) this.m.io(), (awou) this.b.bl.io()));
    }

    @Override // defpackage.afrv
    public final Map s() {
        return agpn.b;
    }

    @Override // defpackage.acoe
    public final rlc t() {
        return (rlc) this.Y.io();
    }

    @Override // defpackage.wty
    public final wtr u() {
        return (wtr) this.P.io();
    }

    @Override // defpackage.afoe
    public final ggu v() {
        return new ggu(this.b, this.aq);
    }

    @Override // defpackage.afrw
    public final afsq w() {
        ahpu ahpuVarFU = this.b.fU();
        agpr agprVar = agpr.a;
        aupn aupnVar = aupt.a;
        ahno.G(agprVar.isEmpty(), "Can't provide Sync SyncSystemMonitor to any account level. Only application scoped SyncSystemMonitors may be provided");
        return new afsq(ahpuVarFU, new aenp(agprVar, 3), aupnVar, new vrr(6));
    }

    @Override // defpackage.wqb
    public final wud x() {
        return (wud) this.K.io();
    }

    @Override // defpackage.abws
    public final ayq y() {
        return (ayq) this.W.io();
    }

    @Override // defpackage.vvf
    public final ayq z() {
        return azu.g((bec) this.F.io(), (Executor) this.b.t.io());
    }
}
