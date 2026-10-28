package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class gog extends gnf implements aupi {
    private ContextWrapper U;
    private volatile auom W;
    private boolean V = false;
    private final Object X = new Object();
    private boolean Y = false;

    private final void a() {
        if (this.U == null) {
            this.U = new aupa(super.getContext(), this);
            this.V = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
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

    protected final void U() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        Object objGeneratedComponent = generatedComponent();
        gnv gnvVar = (gnv) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        gnvVar.b = (gmy) ghjVar.lZ.io();
        gnvVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        gnvVar.S = (vwt) ghxVar.kb.io();
        gnvVar.T = gjzVar.B();
        gnvVar.d = (jki) ghjVar.g.io();
        gnvVar.e = (xgn) ghtVar.kk.io();
        gnvVar.f = (Handler) ghtVar.cY.io();
        gnvVar.O = gjzVar.w();
        gnvVar.g = (avlh) ghtVar.jG.io();
        gnvVar.L = (jnj) ghtVar.mp.io();
        gnvVar.G = (hkl) ghjVar.il.io();
        gnvVar.h = (iwe) ghjVar.nP.io();
        gnvVar.i = gjzVar.b();
        gnvVar.j = (jer) ghjVar.bg.io();
        gnvVar.k = (xit) ghtVar.fa.io();
        gnvVar.l = aupm.b(ghjVar.hW);
        gnvVar.H = (vxz) ghtVar.cu.io();
        gnvVar.I = (vxz) ghtVar.ga.io();
        gnvVar.J = (vxz) ghtVar.fK.io();
        gnvVar.K = (vxz) ghtVar.et.io();
        gnvVar.m = (avmb) ghtVar.dA.io();
        gnvVar.n = (hkq) ghjVar.lV.io();
        gnvVar.o = (acxn) ghxVar.ip.io();
        gnvVar.p = aupm.b(ghjVar.mS);
        gnvVar.q = (awku) ghtVar.gb.io();
        gnvVar.r = (adxj) ghtVar.Ad.io();
        gnvVar.R = gjzVar.A();
        gnvVar.Q = (aeod) ghjVar.mV.io();
        gnvVar.U = (wom) ghxVar.ho.io();
        gnvVar.V = (izf) ghtVar.cD.io();
        gnvVar.W = (tbt) ghtVar.I.io();
        gnvVar.X = (jaz) ghjVar.ec.io();
        gnvVar.Y = (ttm) ghtVar.cJ.io();
        gnvVar.ae = (ci) ghjVar.h.io();
        gnvVar.Z = ghjVar.n();
        gnvVar.af = (hhb) ghjVar.mW.io();
        gnvVar.aa = (jax) ghjVar.mT.io();
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
        a();
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
        a();
        componentManager().e();
        U();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        a();
        componentManager().e();
        U();
    }
}
