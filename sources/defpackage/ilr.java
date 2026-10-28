package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ilr extends acoi {
    private ContextWrapper a;
    private boolean b = false;
    private boolean c = false;

    private final void b() {
        if (this.a == null) {
            this.a = new aupa(super.getContext(), this);
            this.b = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.acmm
    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        imb imbVar = (imb) this;
        gjz gjzVar = (gjz) generatedComponent();
        imbVar.k = (acnk) gjzVar.R.io();
        imbVar.l = aupm.b(gjzVar.aa);
        ghj ghjVar = gjzVar.c;
        Context context = (Context) ghjVar.b.io();
        aupr auprVar = ghjVar.bC;
        abvk abvkVar = (abvk) auprVar.io();
        xgm xgmVar = (xgm) ghjVar.j.io();
        ght ghtVar = gjzVar.b;
        imbVar.m = new actj(context, abvkVar, xgmVar, (wbz) ghtVar.es.io(), (zwh) gjzVar.x.io(), (avmb) ghtVar.dA.io(), (avmb) ghtVar.dC.io(), new acsj((abvk) auprVar.io(), (abvn) ghtVar.mW.io(), (avmb) ghtVar.dA.io()), (hno) ghtVar.jZ.io());
        imbVar.n = (acni) gjzVar.ab.io();
        imbVar.o = (acmw) gjzVar.ac.io();
        imbVar.p = (acvd) gjzVar.y.io();
        imbVar.q = (acng) gjzVar.ae.io();
        aupr auprVar2 = gjzVar.af;
        new Paint(3);
        imbVar.ci = gjzVar.v();
        imbVar.bS = (acoq) gjzVar.ad.io();
        imbVar.r = (abfv) ghjVar.f27pl.io();
        imbVar.s = aupm.b(gjzVar.ag);
        imbVar.t = (acqz) gjzVar.B.io();
        imbVar.cf = (acsj) ghtVar.Gq.io();
        imbVar.bT = (acmx) gjzVar.F.io();
        imbVar.u = (actv) ghtVar.Bd.io();
        ghx ghxVar = ghtVar.a;
        imbVar.v = (actr) ghxVar.lx.io();
        imbVar.w = (acts) ghtVar.Bc.io();
        imbVar.x = ghtVar.dO;
        aupr auprVar3 = ghtVar.q;
        aupr auprVar4 = ghtVar.jP;
        aupr auprVar5 = ghtVar.Gv;
        imbVar.cm = new adyc(ghxVar.lt, auprVar3, auprVar4, auprVar5, ghtVar.jZ, aups.b(ghtVar.jY), (byte[]) null);
        imbVar.y = (actm) ghxVar.ko.io();
        imbVar.cs = new axlj((qrx) ghxVar.ly.io(), (qrx) ghxVar.lq.io(), (Executor) ghtVar.u.io(), (byte[]) null);
        imbVar.z = (actw) ghjVar.ph.io();
        imbVar.A = (acrc) gjzVar.z.io();
        imbVar.B = (acve) gjzVar.w.io();
        imbVar.C = (acpc) gjzVar.A.io();
        imbVar.D = new acpe((xgm) ghjVar.j.io(), (acpc) gjzVar.A.io(), (hno) ghtVar.jZ.io(), (Executor) ghtVar.B.io(), (ahey) ghtVar.du.io(), (acqz) gjzVar.B.io());
        aupr auprVar6 = gjzVar.x;
        imbVar.E = (aclm) ghjVar.pj.io();
        imbVar.co = ghjVar.cc();
        imbVar.cn = (auor) ghtVar.En.io();
        imbVar.F = (abvk) auprVar.io();
        imbVar.bU = (aboi) ghtVar.Cr.io();
        ((abvn) ghjVar.a.mW.io()).n().getClass();
        imbVar.G = (actt) gjzVar.C.io();
        imbVar.H = (abvn) ghtVar.mW.io();
        imbVar.I = (mbc) ghtVar.l.io();
        imbVar.J = (tbt) ghtVar.I.io();
        imbVar.K = (adhv) ghtVar.rB.io();
        imbVar.cp = (aawr) ghtVar.Gs.io();
        imbVar.L = (vxe) ghjVar.k.io();
        imbVar.M = (zwb) ghtVar.bd.io();
        imbVar.N = aupm.b(ghtVar.cs);
        imbVar.O = (xgm) ghjVar.j.io();
        imbVar.P = (abea) ghtVar.kt.io();
        imbVar.Q = (Handler) ghtVar.cY.io();
        aupr auprVar7 = ghjVar.cf;
        aupr auprVar8 = ghjVar.bf;
        gjzVar.y();
        imbVar.cg = new acsj(auprVar7, (acyx) auprVar8.io(), (xgm) ghjVar.j.io(), (Context) ghjVar.b.io(), gjzVar.y());
        imbVar.R = gjzVar.L;
        imbVar.S = (tre) ghtVar.Q.io();
        imbVar.X = (acor) gjzVar.ai.io();
        imbVar.Y = aupm.b(gjzVar.aj);
        imbVar.Z = aupm.b(gjzVar.ak);
        imbVar.aa = (acou) gjzVar.al.io();
        imbVar.ab = (abhe) gjzVar.am.io();
        imbVar.ac = (abhh) ghjVar.pq.io();
        imbVar.bY = (aetc) gjzVar.u.io();
        imbVar.ad = ghjVar.ac();
        imbVar.ae = (vyo) ghtVar.av.io();
        imbVar.ca = ghtVar.eV();
        imbVar.cb = (vxz) ghtVar.jP.io();
        imbVar.cc = (vxz) ghtVar.jO.io();
        vxu vxuVar = (vxu) ghtVar.at.io();
        vyo vyoVar = (vyo) ghtVar.av.io();
        ght.fp();
        new vxz(vxuVar, vyoVar, "ShortsClientGlobalConfig");
        imbVar.cd = (vxz) ghtVar.cS.io();
        imbVar.af = (xhu) ghxVar.lz.io();
        imbVar.ct = (ahud) ghjVar.bY.io();
        imbVar.ag = agkz.r((bof) ghtVar.Bc.io(), (bof) gjzVar.an.io(), (bof) gjzVar.ao.io());
        imbVar.cr = gjzVar.A();
        imbVar.cu = (abxv) ghjVar.aU.io();
        imbVar.ah = aupm.b(ghjVar.hW);
        imbVar.ai = (aefv) gjzVar.ap.io();
        imbVar.aj = ghxVar.aq();
        imbVar.ak = new acme((wbz) ghtVar.es.io(), (zwb) ghtVar.bd.io(), gjzVar.A(), (vxz) ghtVar.jM.io(), (acxn) ghxVar.ip.io());
        imbVar.al = (acmg) gjzVar.aq.io();
        imbVar.am = (avmb) ghtVar.dA.io();
        imbVar.an = (aeqw) ghjVar.jI.io();
        imbVar.cl = (adif) ghjVar.pg.io();
        imbVar.ch = (aeid) ghxVar.kq.io();
        imbVar.ao = (acdc) ghjVar.pu.io();
        imbVar.ap = aupm.b(ghjVar.pv);
        aupr auprVar9 = gjzVar.ar;
        imbVar.aq = (wyl) ghjVar.kd.io();
        imbVar.ck = (hno) ghtVar.jZ.io();
        imbVar.ar = (ahey) ghtVar.du.io();
        imbVar.as = (acul) auprVar5.io();
        imbVar.at = ghjVar.ad();
        imbVar.au = ghjVar.r();
        imbVar.bZ = (aeqt) ghxVar.hs.io();
        imbVar.av = (acva) ghxVar.lA.io();
        imbVar.aw = (acno) ghxVar.lB.io();
        imbVar.ax = (xeu) ghtVar.aZ.io();
        imbVar.ay = new acmy((wbz) ghtVar.es.io(), new adif(ghjVar.r()), (hno) ghtVar.jZ.io(), (avmb) ghtVar.dA.io());
        imbVar.az = (aeqq) ghxVar.lv.io();
        imbVar.aA = (tqj) ghtVar.q.io();
        imbVar.aB = ghtVar.Gn;
        imbVar.aC = (wbz) ghtVar.es.io();
        imbVar.cq = new rnj((char[]) null);
        imbVar.ce = (vxz) ghtVar.cR.io();
        imbVar.aD = aupm.b(ghtVar.kx);
        imbVar.aE = aupm.b(ghtVar.dd);
        imbVar.aF = aupm.b(ghtVar.jY);
        imbVar.aG = (acmt) gjzVar.ao.io();
        imbVar.bV = (aetm) gjzVar.at.io();
        imbVar.bW = (aetk) gjzVar.au.io();
        imbVar.aH = (acpm) ghjVar.pk.io();
        imbVar.cj = (adz) gjzVar.D.io();
        imbVar.cv = (qcb) gjzVar.av.io();
        imbVar.aI = aupm.b(gjzVar.aw);
        imbVar.aK = new acom(aupm.b(gjzVar.B));
        imbVar.bX = ghxVar.L();
        imbVar.a = ghjVar.aw;
        imbVar.b = (iwe) ghjVar.nP.io();
        imbVar.c = (jki) ghjVar.g.io();
        imbVar.f = (ahfi) ghjVar.jK.io();
        imbVar.d = (ilx) ghtVar.jI.io();
        imbVar.e = (ilw) ghjVar.oM.io();
    }

    @Override // defpackage.acmm, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.b) {
            return null;
        }
        b();
        return this.a;
    }

    @Override // defpackage.acoi, defpackage.acmm, defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b();
        a();
    }

    @Override // defpackage.acmm, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.acoi, defpackage.acmm, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        b();
        a();
    }
}
