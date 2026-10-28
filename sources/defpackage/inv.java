package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class inv extends cc implements aupi {
    private ContextWrapper a;
    private volatile auom c;
    private boolean b = false;
    private final Object d = new Object();
    private boolean e = false;

    private final void b() {
        if (this.a == null) {
            this.a = new aupa(super.getContext(), this);
            this.b = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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

    protected final void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object objGeneratedComponent = generatedComponent();
        ioc iocVar = (ioc) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        iocVar.b = (ExecutorService) ghtVar.u.io();
        ghj ghjVar = gjzVar.c;
        iocVar.c = (gfp) ghjVar.fc.io();
        ghx ghxVar = ghtVar.a;
        iocVar.I = (xow) ghxVar.jg.io();
        iocVar.J = (aapw) ghtVar.xT.io();
        iocVar.d = (xgn) ghtVar.kk.io();
        iocVar.e = (inu) gjzVar.aP.k.io();
        iocVar.f = (jer) ghjVar.bg.io();
        iocVar.g = (jaz) ghjVar.ec.io();
        iocVar.h = (mbc) ghtVar.l.io();
        iocVar.i = (vxe) ghjVar.k.io();
        iocVar.j = (avmb) ghtVar.dA.io();
        iocVar.O = gjzVar.G();
        iocVar.k = (xit) ghtVar.fa.io();
        iocVar.l = (abvk) ghtVar.kB.io();
        iocVar.m = (iwe) ghjVar.nP.io();
        iocVar.N = (axfd) ghtVar.cE.io();
        iocVar.n = (tbt) ghtVar.I.io();
        iocVar.o = (avlh) ghtVar.jG.io();
        iocVar.C = (tfq) ghtVar.cd.io();
        iocVar.p = (jlh) ghtVar.xP.io();
        iocVar.q = (jax) ghjVar.mT.io();
        iocVar.L = gjzVar.A();
        iocVar.K = (aeod) ghjVar.mV.io();
        iocVar.F = ghxVar.ct();
        iocVar.r = (inr) ghxVar.lE.io();
        iocVar.G = (vxz) ghtVar.dP.io();
        iocVar.M = (abxv) ghjVar.aU.io();
        iocVar.s = (aefv) ghjVar.aS.io();
        iocVar.D = (hkl) ghjVar.il.io();
        iocVar.E = (hke) ghjVar.f.io();
        iocVar.H = (vxz) ghtVar.ga.io();
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
        b();
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
        b();
        componentManager().e();
        c();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        b();
        componentManager().e();
        c();
    }
}
