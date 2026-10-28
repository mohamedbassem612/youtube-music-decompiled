package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class goo extends gnf implements aupi {
    private ContextWrapper U;
    private volatile auom W;
    private boolean V = false;
    private final Object X = new Object();
    private boolean Y = false;

    private final void U() {
        if (this.U == null) {
            this.U = new aupa(super.getContext(), this);
            this.V = atqp.d(super.getContext());
        }
    }

    protected final void T() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        Object objGeneratedComponent = generatedComponent();
        grf grfVar = (grf) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        grfVar.b = (gmy) ghjVar.lZ.io();
        grfVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        grfVar.S = (vwt) ghxVar.kb.io();
        grfVar.T = gjzVar.B();
        grfVar.d = (jki) ghjVar.g.io();
        grfVar.e = (xgn) ghtVar.kk.io();
        grfVar.f = (Handler) ghtVar.cY.io();
        grfVar.O = gjzVar.w();
        grfVar.g = (avlh) ghtVar.jG.io();
        grfVar.L = (jnj) ghtVar.mp.io();
        grfVar.G = (hkl) ghjVar.il.io();
        grfVar.h = (iwe) ghjVar.nP.io();
        grfVar.i = gjzVar.b();
        grfVar.j = (jer) ghjVar.bg.io();
        grfVar.k = (xit) ghtVar.fa.io();
        grfVar.l = aupm.b(ghjVar.hW);
        grfVar.H = (vxz) ghtVar.cu.io();
        grfVar.I = (vxz) ghtVar.ga.io();
        grfVar.J = (vxz) ghtVar.fK.io();
        grfVar.K = (vxz) ghtVar.et.io();
        grfVar.m = (avmb) ghtVar.dA.io();
        grfVar.n = (hkq) ghjVar.lV.io();
        grfVar.o = (acxn) ghxVar.ip.io();
        grfVar.p = aupm.b(ghjVar.mS);
        grfVar.q = (awku) ghtVar.gb.io();
        grfVar.r = (adxj) ghtVar.Ad.io();
        grfVar.R = gjzVar.A();
        grfVar.Q = (aeod) ghjVar.mV.io();
        grfVar.U = (gqh) ghjVar.iT.io();
        grfVar.V = (izf) ghtVar.cD.io();
        grfVar.W = (tbt) ghtVar.I.io();
        grfVar.X = (ivu) ghjVar.jV.io();
        grfVar.Y = (jaz) ghjVar.ec.io();
        grfVar.Z = (ttm) ghtVar.cJ.io();
        grfVar.aa = (adhv) ghtVar.rB.io();
        grfVar.aK = (hfn) ghjVar.i.io();
        grfVar.ab = (iwd) gjzVar.s.io();
        grfVar.ac = (ahbw) ghtVar.cx.io();
        grfVar.ad = gjzVar.a();
        grfVar.ae = ghjVar.n();
        grfVar.af = (hkq) ghjVar.lV.io();
        grfVar.aL = (hhb) ghjVar.mW.io();
        grfVar.ag = (aefv) ghjVar.aS.io();
        grfVar.ah = (Executor) ghtVar.B.io();
        grfVar.ai = aupm.b(ghtVar.nj);
        grfVar.aF = (vxz) ghtVar.dP.io();
        grfVar.aj = ghxVar.eU;
        grfVar.ak = (jax) ghjVar.mT.io();
        grfVar.al = (adgj) gjzVar.t.io();
        grfVar.am = aupm.b(ghtVar.nq);
        grfVar.aG = (vxz) ghtVar.dS.io();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.W == null) {
            synchronized (this.X) {
                if (this.W == null) {
                    this.W = new auom(this);
                }
            }
        }
        return this.W;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.V) {
            return null;
        }
        U();
        return this.U;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.U;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        U();
        componentManager().e();
        T();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        U();
        componentManager().e();
        T();
    }
}
