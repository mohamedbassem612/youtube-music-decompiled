package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class gof extends gnf implements aupi {
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
        gnr gnrVar = (gnr) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        gnrVar.b = (gmy) ghjVar.lZ.io();
        gnrVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        gnrVar.S = (vwt) ghxVar.kb.io();
        gnrVar.T = gjzVar.B();
        gnrVar.d = (jki) ghjVar.g.io();
        gnrVar.e = (xgn) ghtVar.kk.io();
        gnrVar.f = (Handler) ghtVar.cY.io();
        gnrVar.O = gjzVar.w();
        gnrVar.g = (avlh) ghtVar.jG.io();
        gnrVar.L = (jnj) ghtVar.mp.io();
        gnrVar.G = (hkl) ghjVar.il.io();
        gnrVar.h = (iwe) ghjVar.nP.io();
        gnrVar.i = gjzVar.b();
        gnrVar.j = (jer) ghjVar.bg.io();
        gnrVar.k = (xit) ghtVar.fa.io();
        gnrVar.l = aupm.b(ghjVar.hW);
        gnrVar.H = (vxz) ghtVar.cu.io();
        gnrVar.I = (vxz) ghtVar.ga.io();
        gnrVar.J = (vxz) ghtVar.fK.io();
        gnrVar.K = (vxz) ghtVar.et.io();
        gnrVar.m = (avmb) ghtVar.dA.io();
        gnrVar.n = (hkq) ghjVar.lV.io();
        gnrVar.o = (acxn) ghxVar.ip.io();
        gnrVar.p = aupm.b(ghjVar.mS);
        gnrVar.q = (awku) ghtVar.gb.io();
        gnrVar.r = (adxj) ghtVar.Ad.io();
        gnrVar.R = gjzVar.A();
        gnrVar.Q = (aeod) ghjVar.mV.io();
        gnrVar.U = (wom) ghxVar.ho.io();
        gnrVar.V = (izf) ghtVar.cD.io();
        gnrVar.W = (tbt) ghtVar.I.io();
        gnrVar.X = (jaz) ghjVar.ec.io();
        gnrVar.Z = (hhb) ghjVar.mW.io();
        gnrVar.Y = (jax) ghjVar.mT.io();
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
