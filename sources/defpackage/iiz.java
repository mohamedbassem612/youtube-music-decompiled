package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class iiz extends gox {
    private ContextWrapper ar;
    private boolean as = false;
    private boolean at = false;

    private final void K() {
        if (this.ar == null) {
            this.ar = new aupa(super.getContext(), this);
            this.as = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.gok
    public final void H() {
        if (this.at) {
            return;
        }
        this.at = true;
        Object objGeneratedComponent = generatedComponent();
        ijl ijlVar = (ijl) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        ijlVar.a = (Handler) ghtVar.cY.io();
        ijlVar.b = (avmb) ghtVar.dA.io();
        ijlVar.c = (ttm) ghtVar.cJ.io();
        ijlVar.d = (tbt) ghtVar.I.io();
        ijlVar.e = (gpw) ghtVar.pV.io();
        ghj ghjVar = gjzVar.c;
        ijlVar.f = (jer) ghjVar.bg.io();
        ijlVar.g = (xgn) ghtVar.kk.io();
        ghx ghxVar = ghtVar.a;
        ijlVar.h = (wom) ghxVar.ho.io();
        ijlVar.W = gjzVar.w();
        ijlVar.i = (iwe) ghjVar.nP.io();
        ijlVar.j = (jki) ghjVar.g.io();
        ijlVar.k = (vxe) ghjVar.k.io();
        ijlVar.T = (jij) ghjVar.bc.io();
        ijlVar.N = (rql) ghtVar.AE.io();
        ijlVar.l = (jaz) ghjVar.ec.io();
        ijlVar.ac = gjzVar.D();
        ijlVar.m = (jax) ghjVar.mT.io();
        ijlVar.Y = (aeod) ghjVar.mV.io();
        ijlVar.aa = gjzVar.A();
        ijlVar.n = (avlh) ghjVar.oN.io();
        ijlVar.O = (hkl) ghjVar.il.io();
        ijlVar.ab = (hfn) ghjVar.i.io();
        ijlVar.Z = (hfn) ghjVar.ar.io();
        ijlVar.Q = (vxz) ghtVar.cu.io();
        ijlVar.U = (jnj) ghtVar.mp.io();
        ijlVar.R = (vxz) ghtVar.ga.io();
        ijlVar.o = aupm.b(ghjVar.hW);
        ijlVar.S = (vxz) ghtVar.dP.io();
        ijlVar.p = (awku) ghtVar.gb.io();
        ijlVar.ad = (hhb) ghjVar.mW.io();
        ijlVar.q = (adxj) ghtVar.Ad.io();
        ijlVar.r = ghjVar.mK;
        ijlVar.P = (acwq) ghjVar.o.io();
        ijlVar.s = ghxVar.eU;
        ((gox) ijlVar).ae = (Executor) ghtVar.B.io();
        ((gox) ijlVar).af = (ScheduledExecutorService) ghtVar.t.io();
        ijlVar.ap = (jnm) ghjVar.iS.io();
        ijlVar.ao = ghjVar.bM();
        ((gox) ijlVar).ag = (jnj) ghjVar.bA.io();
        ((gox) ijlVar).ah = (hpb) ghtVar.mC.io();
        ((gox) ijlVar).ai = (hpy) ghtVar.md.io();
        ((gox) ijlVar).aj = (xeu) ghtVar.aZ.io();
        ((gox) ijlVar).ak = (aaou) gjzVar.o.io();
        ((gox) ijlVar).al = (hkq) ghjVar.lV.io();
        ijlVar.an = (vxz) ghtVar.et.io();
        ijlVar.as = (wsl) ghtVar.mt.io();
        ijlVar.at = (hpb) ghtVar.mC.io();
        ijlVar.aF = (jin) ghjVar.v.io();
        ijlVar.aI = (grj) ghjVar.cB.io();
        ijlVar.au = (huf) ghtVar.sx.io();
        ijlVar.av = (hpy) ghtVar.md.io();
        ijlVar.aw = (Executor) ghtVar.z.io();
        ijlVar.ax = (Executor) ghtVar.u.io();
        ijlVar.ay = (Executor) ghtVar.B.io();
        ijlVar.aG = (hcb) ghtVar.mN.io();
        ijlVar.aH = (vxz) ghtVar.jP.io();
        ijlVar.aJ = (xow) ghxVar.jg.io();
        ijlVar.az = (awku) ghxVar.jy.io();
    }

    @Override // defpackage.gok, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.as) {
            return null;
        }
        K();
        return this.ar;
    }

    @Override // defpackage.gok, defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.ar;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        K();
        H();
    }

    @Override // defpackage.gok, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.gok, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        K();
        H();
    }
}
