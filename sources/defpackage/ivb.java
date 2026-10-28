package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class ivb extends ivc {
    private ContextWrapper ag;
    private boolean ah = false;
    private boolean ai = false;

    private final void J() {
        if (this.ag == null) {
            this.ag = new aupa(super.getContext(), this);
            this.ah = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.iva
    protected final void H() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        Object objGeneratedComponent = generatedComponent();
        ivj ivjVar = (ivj) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        ivjVar.a = (Handler) ghtVar.cY.io();
        ivjVar.b = (avmb) ghtVar.dA.io();
        ivjVar.c = (ttm) ghtVar.cJ.io();
        ivjVar.d = (tbt) ghtVar.I.io();
        ivjVar.e = (gpw) ghtVar.pV.io();
        ghj ghjVar = gjzVar.c;
        ivjVar.f = (jer) ghjVar.bg.io();
        ivjVar.g = (xgn) ghtVar.kk.io();
        ghx ghxVar = ghtVar.a;
        ivjVar.h = (wom) ghxVar.ho.io();
        ivjVar.W = gjzVar.w();
        ivjVar.i = (iwe) ghjVar.nP.io();
        ivjVar.j = (jki) ghjVar.g.io();
        ivjVar.k = (vxe) ghjVar.k.io();
        ivjVar.T = (jij) ghjVar.bc.io();
        ivjVar.N = (rql) ghtVar.AE.io();
        ivjVar.l = (jaz) ghjVar.ec.io();
        ivjVar.ac = gjzVar.D();
        ivjVar.m = (jax) ghjVar.mT.io();
        ivjVar.Y = (aeod) ghjVar.mV.io();
        ivjVar.aa = gjzVar.A();
        ivjVar.n = (avlh) ghjVar.oN.io();
        ivjVar.O = (hkl) ghjVar.il.io();
        ivjVar.ab = (hfn) ghjVar.i.io();
        ivjVar.Z = (hfn) ghjVar.ar.io();
        ivjVar.Q = (vxz) ghtVar.cu.io();
        ivjVar.U = (jnj) ghtVar.mp.io();
        ivjVar.R = (vxz) ghtVar.ga.io();
        ivjVar.o = aupm.b(ghjVar.hW);
        ivjVar.S = (vxz) ghtVar.dP.io();
        ivjVar.p = (awku) ghtVar.gb.io();
        ivjVar.ad = (hhb) ghjVar.mW.io();
        ivjVar.q = (adxj) ghtVar.Ad.io();
        ivjVar.r = ghjVar.mK;
        ivjVar.P = (acwq) ghjVar.o.io();
        ivjVar.s = ghxVar.eU;
        ((ivc) ivjVar).af = (itr) ghxVar.lL.io();
        ivjVar.ag = (itu) ghxVar.jW.io();
        ivjVar.ak = (jin) ghjVar.v.io();
    }

    @Override // defpackage.iva, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.ah) {
            return null;
        }
        J();
        return this.ag;
    }

    @Override // defpackage.iva, defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        J();
        H();
    }

    @Override // defpackage.iva, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.iva, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        J();
        H();
    }
}
