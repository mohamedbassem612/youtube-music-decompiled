package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class goh extends gnf implements aupi {
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
        goc gocVar = (goc) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        gocVar.b = (gmy) ghjVar.lZ.io();
        gocVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        gocVar.S = (vwt) ghxVar.kb.io();
        gocVar.T = gjzVar.B();
        gocVar.d = (jki) ghjVar.g.io();
        gocVar.e = (xgn) ghtVar.kk.io();
        gocVar.f = (Handler) ghtVar.cY.io();
        gocVar.O = gjzVar.w();
        gocVar.g = (avlh) ghtVar.jG.io();
        gocVar.L = (jnj) ghtVar.mp.io();
        gocVar.G = (hkl) ghjVar.il.io();
        gocVar.h = (iwe) ghjVar.nP.io();
        gocVar.i = gjzVar.b();
        gocVar.j = (jer) ghjVar.bg.io();
        gocVar.k = (xit) ghtVar.fa.io();
        gocVar.l = aupm.b(ghjVar.hW);
        gocVar.H = (vxz) ghtVar.cu.io();
        gocVar.I = (vxz) ghtVar.ga.io();
        gocVar.J = (vxz) ghtVar.fK.io();
        gocVar.K = (vxz) ghtVar.et.io();
        gocVar.m = (avmb) ghtVar.dA.io();
        gocVar.n = (hkq) ghjVar.lV.io();
        gocVar.o = (acxn) ghxVar.ip.io();
        gocVar.p = aupm.b(ghjVar.mS);
        gocVar.q = (awku) ghtVar.gb.io();
        gocVar.r = (adxj) ghtVar.Ad.io();
        gocVar.R = gjzVar.A();
        gocVar.Q = (aeod) ghjVar.mV.io();
        gocVar.U = (wom) ghxVar.ho.io();
        gocVar.V = (izf) ghtVar.cD.io();
        gocVar.W = (tbt) ghtVar.I.io();
        gocVar.X = (jaz) ghjVar.ec.io();
        gocVar.Y = (ttm) ghtVar.cJ.io();
        gocVar.ac = new kwq((avlh) ghjVar.oN.io(), (iwe) ghjVar.nP.io(), (avmb) ghtVar.dA.io(), (adxj) ghtVar.Ad.io());
        gocVar.Z = (jax) ghjVar.mT.io();
        gocVar.ad = gjzVar.D();
        gocVar.ae = (hhb) ghjVar.mW.io();
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
