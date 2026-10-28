package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class iva extends gms implements aupi {
    private ContextWrapper ae;
    private volatile auom ag;
    private boolean af = false;
    private final Object ah = new Object();
    private boolean ai = false;

    private void I() {
        if (this.ae == null) {
            this.ae = new aupa(super.getContext(), this);
            this.af = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new auom(this);
                }
            }
        }
        return this.ag;
    }

    protected void H() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        Object objGeneratedComponent = generatedComponent();
        ivc ivcVar = (ivc) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        ivcVar.a = (Handler) ghtVar.cY.io();
        ivcVar.b = (avmb) ghtVar.dA.io();
        ivcVar.c = (ttm) ghtVar.cJ.io();
        ivcVar.d = (tbt) ghtVar.I.io();
        ivcVar.e = (gpw) ghtVar.pV.io();
        ghj ghjVar = gjzVar.c;
        ivcVar.f = (jer) ghjVar.bg.io();
        ivcVar.g = (xgn) ghtVar.kk.io();
        ghx ghxVar = ghtVar.a;
        ivcVar.h = (wom) ghxVar.ho.io();
        ivcVar.W = gjzVar.w();
        ivcVar.i = (iwe) ghjVar.nP.io();
        ivcVar.j = (jki) ghjVar.g.io();
        ivcVar.k = (vxe) ghjVar.k.io();
        ivcVar.T = (jij) ghjVar.bc.io();
        ivcVar.N = (rql) ghtVar.AE.io();
        ivcVar.l = (jaz) ghjVar.ec.io();
        ivcVar.ac = gjzVar.D();
        ivcVar.m = (jax) ghjVar.mT.io();
        ivcVar.Y = (aeod) ghjVar.mV.io();
        ivcVar.aa = gjzVar.A();
        ivcVar.n = (avlh) ghjVar.oN.io();
        ivcVar.O = (hkl) ghjVar.il.io();
        ivcVar.ab = (hfn) ghjVar.i.io();
        ivcVar.Z = (hfn) ghjVar.ar.io();
        ivcVar.Q = (vxz) ghtVar.cu.io();
        ivcVar.U = (jnj) ghtVar.mp.io();
        ivcVar.R = (vxz) ghtVar.ga.io();
        ivcVar.o = aupm.b(ghjVar.hW);
        ivcVar.S = (vxz) ghtVar.dP.io();
        ivcVar.p = (awku) ghtVar.gb.io();
        ivcVar.ad = (hhb) ghjVar.mW.io();
        ivcVar.q = (adxj) ghtVar.Ad.io();
        ivcVar.r = ghjVar.mK;
        ivcVar.P = (acwq) ghjVar.o.io();
        ivcVar.s = ghxVar.eU;
        ivcVar.af = (itr) ghxVar.lL.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public Context getContext() {
        if (super.getContext() == null && !this.af) {
            return null;
        }
        I();
        return this.ae;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        I();
        componentManager().e();
        H();
    }

    @Override // defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        I();
        componentManager().e();
        H();
    }
}
