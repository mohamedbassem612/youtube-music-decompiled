package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class hor extends gms implements aupi {
    private ContextWrapper ae;
    private volatile auom ag;
    private boolean af = false;
    private final Object ah = new Object();
    private boolean ai = false;

    private final void I() {
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

    protected final void H() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        Object objGeneratedComponent = generatedComponent();
        hot hotVar = (hot) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        hotVar.a = (Handler) ghtVar.cY.io();
        hotVar.b = (avmb) ghtVar.dA.io();
        hotVar.c = (ttm) ghtVar.cJ.io();
        hotVar.d = (tbt) ghtVar.I.io();
        hotVar.e = (gpw) ghtVar.pV.io();
        ghj ghjVar = gjzVar.c;
        hotVar.f = (jer) ghjVar.bg.io();
        hotVar.g = (xgn) ghtVar.kk.io();
        ghx ghxVar = ghtVar.a;
        hotVar.h = (wom) ghxVar.ho.io();
        hotVar.W = gjzVar.w();
        hotVar.i = (iwe) ghjVar.nP.io();
        hotVar.j = (jki) ghjVar.g.io();
        hotVar.k = (vxe) ghjVar.k.io();
        hotVar.T = (jij) ghjVar.bc.io();
        hotVar.N = (rql) ghtVar.AE.io();
        hotVar.l = (jaz) ghjVar.ec.io();
        hotVar.ac = gjzVar.D();
        hotVar.m = (jax) ghjVar.mT.io();
        hotVar.Y = (aeod) ghjVar.mV.io();
        hotVar.aa = gjzVar.A();
        hotVar.n = (avlh) ghjVar.oN.io();
        hotVar.O = (hkl) ghjVar.il.io();
        hotVar.ab = (hfn) ghjVar.i.io();
        hotVar.Z = (hfn) ghjVar.ar.io();
        hotVar.Q = (vxz) ghtVar.cu.io();
        hotVar.U = (jnj) ghtVar.mp.io();
        hotVar.R = (vxz) ghtVar.ga.io();
        hotVar.o = aupm.b(ghjVar.hW);
        hotVar.S = (vxz) ghtVar.dP.io();
        hotVar.p = (awku) ghtVar.gb.io();
        hotVar.ad = (hhb) ghjVar.mW.io();
        hotVar.q = (adxj) ghtVar.Ad.io();
        hotVar.r = ghjVar.mK;
        hotVar.P = (acwq) ghjVar.o.io();
        hotVar.s = ghxVar.eU;
        hotVar.af = (Executor) ghtVar.B.io();
        hotVar.ag = (Executor) ghtVar.z.io();
        hotVar.ah = (xit) ghtVar.fa.io();
        hotVar.ai = aupm.b(ghtVar.nq);
        hotVar.aj = aupm.b(ghjVar.lV);
        hotVar.ak = aupm.b(ghtVar.et);
        hotVar.al = (hvh) ghtVar.FA.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
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
    public final void onAttach(Activity activity) {
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
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        I();
        componentManager().e();
        H();
    }
}
