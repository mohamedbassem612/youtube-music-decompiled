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
abstract class gok extends gms implements aupi {
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

    public void H() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        Object objGeneratedComponent = generatedComponent();
        gox goxVar = (gox) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        goxVar.a = (Handler) ghtVar.cY.io();
        goxVar.b = (avmb) ghtVar.dA.io();
        goxVar.c = (ttm) ghtVar.cJ.io();
        goxVar.d = (tbt) ghtVar.I.io();
        goxVar.e = (gpw) ghtVar.pV.io();
        ghj ghjVar = gjzVar.c;
        goxVar.f = (jer) ghjVar.bg.io();
        goxVar.g = (xgn) ghtVar.kk.io();
        ghx ghxVar = ghtVar.a;
        goxVar.h = (wom) ghxVar.ho.io();
        goxVar.W = gjzVar.w();
        goxVar.i = (iwe) ghjVar.nP.io();
        goxVar.j = (jki) ghjVar.g.io();
        goxVar.k = (vxe) ghjVar.k.io();
        goxVar.T = (jij) ghjVar.bc.io();
        goxVar.N = (rql) ghtVar.AE.io();
        goxVar.l = (jaz) ghjVar.ec.io();
        goxVar.ac = gjzVar.D();
        goxVar.m = (jax) ghjVar.mT.io();
        goxVar.Y = (aeod) ghjVar.mV.io();
        goxVar.aa = gjzVar.A();
        goxVar.n = (avlh) ghjVar.oN.io();
        goxVar.O = (hkl) ghjVar.il.io();
        goxVar.ab = (hfn) ghjVar.i.io();
        goxVar.Z = (hfn) ghjVar.ar.io();
        goxVar.Q = (vxz) ghtVar.cu.io();
        goxVar.U = (jnj) ghtVar.mp.io();
        goxVar.R = (vxz) ghtVar.ga.io();
        goxVar.o = aupm.b(ghjVar.hW);
        goxVar.S = (vxz) ghtVar.dP.io();
        goxVar.p = (awku) ghtVar.gb.io();
        goxVar.ad = (hhb) ghjVar.mW.io();
        goxVar.q = (adxj) ghtVar.Ad.io();
        goxVar.r = ghjVar.mK;
        goxVar.P = (acwq) ghjVar.o.io();
        goxVar.s = ghxVar.eU;
        goxVar.ae = (Executor) ghtVar.B.io();
        goxVar.af = (ScheduledExecutorService) ghtVar.t.io();
        goxVar.ap = (jnm) ghjVar.iS.io();
        goxVar.ao = ghjVar.bM();
        goxVar.ag = (jnj) ghjVar.bA.io();
        goxVar.ah = (hpb) ghtVar.mC.io();
        goxVar.ai = (hpy) ghtVar.md.io();
        goxVar.aj = (xeu) ghtVar.aZ.io();
        goxVar.ak = (aaou) gjzVar.o.io();
        goxVar.al = (hkq) ghjVar.lV.io();
        goxVar.an = (vxz) ghtVar.et.io();
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
