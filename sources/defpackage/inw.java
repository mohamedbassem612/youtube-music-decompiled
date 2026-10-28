package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class inw extends cc implements aupi {
    private ContextWrapper a;
    private volatile auom c;
    private boolean b = false;
    private final Object d = new Object();
    private boolean e = false;

    private final void a() {
        if (this.a == null) {
            this.a = new aupa(super.getContext(), this);
            this.b = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new auom(this);
                }
            }
        }
        return this.c;
    }

    protected final void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object objGeneratedComponent = generatedComponent();
        iog iogVar = (iog) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        iogVar.b = (ttm) ghtVar.cJ.io();
        iogVar.c = (tbt) ghtVar.I.io();
        ghj ghjVar = gjzVar.c;
        iogVar.d = (jer) ghjVar.bg.io();
        iogVar.e = (xgn) ghtVar.kk.io();
        ghx ghxVar = ghtVar.a;
        iogVar.f = (wto) ghxVar.lF.io();
        iogVar.g = (mbc) ghtVar.l.io();
        iogVar.h = (gfp) ghjVar.fc.io();
        iogVar.i = (Handler) ghtVar.cY.io();
        iogVar.j = (jaz) ghjVar.ec.io();
        iogVar.k = (jax) ghjVar.mT.io();
        iogVar.Q = (aeod) ghjVar.mV.io();
        iogVar.R = gjzVar.A();
        iogVar.l = (izf) ghtVar.cD.io();
        iogVar.m = (xit) ghtVar.fa.io();
        iogVar.n = (abvk) ghtVar.kB.io();
        iogVar.o = (itj) ghxVar.lJ.io();
        iogVar.S = (kyr) ghxVar.lI.io();
        iogVar.O = (jnj) ghtVar.mp.io();
        iogVar.p = (iwe) ghjVar.nP.io();
        iogVar.T = (axfd) ghtVar.cE.io();
        iogVar.q = (hnl) ghxVar.lK.io();
        iogVar.U = gjzVar.G();
        iogVar.r = (inl) ghxVar.kF.io();
        iogVar.s = (avlh) ghtVar.jG.io();
        iogVar.H = (tfq) ghtVar.cd.io();
        iogVar.t = (jki) ghjVar.g.io();
        iogVar.u = (avmb) ghtVar.dA.io();
        iogVar.v = (ahey) ghtVar.du.io();
        iogVar.I = (jin) ghjVar.v.io();
        iogVar.w = (vxe) ghjVar.k.io();
        iogVar.K = (vxz) ghtVar.cu.io();
        iogVar.x = (jlh) ghtVar.xP.io();
        iogVar.y = (hpy) ghtVar.md.io();
        iogVar.L = ghxVar.ct();
        iogVar.M = (vxz) ghtVar.dP.io();
        iogVar.J = (hkl) ghjVar.il.io();
        iogVar.N = (vxz) ghtVar.ga.io();
        iogVar.z = ghjVar.aI();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        componentManager().e();
        d();
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
        d();
    }
}
