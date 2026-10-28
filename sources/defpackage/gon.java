package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class gon extends gnf implements aupi {
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
        gqi gqiVar = (gqi) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        gqiVar.b = (gmy) ghjVar.lZ.io();
        gqiVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        gqiVar.S = (vwt) ghxVar.kb.io();
        gqiVar.T = gjzVar.B();
        gqiVar.d = (jki) ghjVar.g.io();
        gqiVar.e = (xgn) ghtVar.kk.io();
        gqiVar.f = (Handler) ghtVar.cY.io();
        gqiVar.O = gjzVar.w();
        gqiVar.g = (avlh) ghtVar.jG.io();
        gqiVar.L = (jnj) ghtVar.mp.io();
        gqiVar.G = (hkl) ghjVar.il.io();
        gqiVar.h = (iwe) ghjVar.nP.io();
        gqiVar.i = gjzVar.b();
        gqiVar.j = (jer) ghjVar.bg.io();
        gqiVar.k = (xit) ghtVar.fa.io();
        gqiVar.l = aupm.b(ghjVar.hW);
        gqiVar.H = (vxz) ghtVar.cu.io();
        gqiVar.I = (vxz) ghtVar.ga.io();
        gqiVar.J = (vxz) ghtVar.fK.io();
        gqiVar.K = (vxz) ghtVar.et.io();
        gqiVar.m = (avmb) ghtVar.dA.io();
        gqiVar.n = (hkq) ghjVar.lV.io();
        gqiVar.o = (acxn) ghxVar.ip.io();
        gqiVar.p = aupm.b(ghjVar.mS);
        gqiVar.q = (awku) ghtVar.gb.io();
        gqiVar.r = (adxj) ghtVar.Ad.io();
        gqiVar.R = gjzVar.A();
        gqiVar.Q = (aeod) ghjVar.mV.io();
        gqiVar.U = ghjVar.aw;
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
