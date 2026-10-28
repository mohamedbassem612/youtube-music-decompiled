package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class gom extends gnf implements aupi {
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
        gpy gpyVar = (gpy) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        gpyVar.b = (gmy) ghjVar.lZ.io();
        gpyVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        gpyVar.S = (vwt) ghxVar.kb.io();
        gpyVar.T = gjzVar.B();
        gpyVar.d = (jki) ghjVar.g.io();
        gpyVar.e = (xgn) ghtVar.kk.io();
        gpyVar.f = (Handler) ghtVar.cY.io();
        gpyVar.O = gjzVar.w();
        gpyVar.g = (avlh) ghtVar.jG.io();
        gpyVar.L = (jnj) ghtVar.mp.io();
        gpyVar.G = (hkl) ghjVar.il.io();
        gpyVar.h = (iwe) ghjVar.nP.io();
        gpyVar.i = gjzVar.b();
        gpyVar.j = (jer) ghjVar.bg.io();
        gpyVar.k = (xit) ghtVar.fa.io();
        gpyVar.l = aupm.b(ghjVar.hW);
        gpyVar.H = (vxz) ghtVar.cu.io();
        gpyVar.I = (vxz) ghtVar.ga.io();
        gpyVar.J = (vxz) ghtVar.fK.io();
        gpyVar.K = (vxz) ghtVar.et.io();
        gpyVar.m = (avmb) ghtVar.dA.io();
        gpyVar.n = (hkq) ghjVar.lV.io();
        gpyVar.o = (acxn) ghxVar.ip.io();
        gpyVar.p = aupm.b(ghjVar.mS);
        gpyVar.q = (awku) ghtVar.gb.io();
        gpyVar.r = (adxj) ghtVar.Ad.io();
        gpyVar.R = gjzVar.A();
        gpyVar.Q = (aeod) ghjVar.mV.io();
        ghjVar.n();
        gpyVar.U = gjzVar.a();
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
