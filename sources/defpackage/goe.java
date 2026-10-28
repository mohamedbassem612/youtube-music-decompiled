package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class goe extends gnf implements aupi {
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
        gnj gnjVar = (gnj) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        gnjVar.b = (gmy) ghjVar.lZ.io();
        gnjVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        gnjVar.S = (vwt) ghxVar.kb.io();
        gnjVar.T = gjzVar.B();
        gnjVar.d = (jki) ghjVar.g.io();
        gnjVar.e = (xgn) ghtVar.kk.io();
        gnjVar.f = (Handler) ghtVar.cY.io();
        gnjVar.O = gjzVar.w();
        gnjVar.g = (avlh) ghtVar.jG.io();
        gnjVar.L = (jnj) ghtVar.mp.io();
        gnjVar.G = (hkl) ghjVar.il.io();
        gnjVar.h = (iwe) ghjVar.nP.io();
        gnjVar.i = gjzVar.b();
        gnjVar.j = (jer) ghjVar.bg.io();
        gnjVar.k = (xit) ghtVar.fa.io();
        gnjVar.l = aupm.b(ghjVar.hW);
        gnjVar.H = (vxz) ghtVar.cu.io();
        gnjVar.I = (vxz) ghtVar.ga.io();
        gnjVar.J = (vxz) ghtVar.fK.io();
        gnjVar.K = (vxz) ghtVar.et.io();
        gnjVar.m = (avmb) ghtVar.dA.io();
        gnjVar.n = (hkq) ghjVar.lV.io();
        gnjVar.o = (acxn) ghxVar.ip.io();
        gnjVar.p = aupm.b(ghjVar.mS);
        gnjVar.q = (awku) ghtVar.gb.io();
        gnjVar.r = (adxj) ghtVar.Ad.io();
        gnjVar.R = gjzVar.A();
        gnjVar.Q = (aeod) ghjVar.mV.io();
        gnjVar.U = (wom) ghxVar.ho.io();
        gnjVar.V = (izf) ghtVar.cD.io();
        gnjVar.W = (tbt) ghtVar.I.io();
        gnjVar.Z = (ahek) ghjVar.aO.io();
        gnjVar.X = (jaz) ghjVar.ec.io();
        gnjVar.aa = (hhb) ghjVar.mW.io();
        gnjVar.Y = (jax) ghjVar.mT.io();
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
