package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class jlq extends aevy implements aupi {
    private ContextWrapper k;
    private volatile auom m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void k() {
        if (this.k == null) {
            this.k = new aupa(super.getContext(), this);
            this.l = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.l) {
            return null;
        }
        k();
        return this.k;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.m == null) {
            synchronized (this.n) {
                if (this.m == null) {
                    this.m = new auom(this);
                }
            }
        }
        return this.m;
    }

    protected final void j() {
        if (this.o) {
            return;
        }
        this.o = true;
        jmg jmgVar = (jmg) this;
        gjz gjzVar = (gjz) generatedComponent();
        ghj ghjVar = gjzVar.c;
        jmgVar.k = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        jmgVar.l = (xgn) ghtVar.kk.io();
        ghx ghxVar = ghtVar.a;
        aupr auprVar = ghxVar.lP;
        jmgVar.m = new aejq(ghtVar.aI, ghtVar.cm, ghtVar.gK, ghtVar.qe, ghtVar.at, ghtVar.av, ghtVar.bd, ghtVar.bw, ghtVar.u, ghtVar.cY, ghtVar.aO, ghtVar.aL, ghtVar.l, ghtVar.T);
        jmgVar.n = (tbt) ghtVar.I.io();
        jmgVar.aC = (jnj) ghtVar.mp.io();
        jmgVar.o = (vyo) ghtVar.av.io();
        jmgVar.p = (xit) ghtVar.fa.io();
        jmgVar.aI = (kyr) ghxVar.lQ.io();
        jmgVar.aA = (vxz) ghtVar.cu.io();
        jmgVar.aB = ghxVar.ct();
        jmgVar.q = (abvk) ghtVar.kB.io();
        jmgVar.ax = (hcb) ghtVar.mN.io();
        jmgVar.r = (jer) ghjVar.bg.io();
        jmgVar.s = (acxn) ghxVar.ip.io();
        jmgVar.aG = (aend) gjzVar.aB.io();
        jmgVar.t = (ahey) ghtVar.du.io();
        jmgVar.u = (ahey) ghtVar.u.io();
        jmgVar.aL = gjzVar.G();
        jmgVar.v = (jlh) ghtVar.xP.io();
        jmgVar.w = aupm.b(auprVar);
        jmgVar.aE = new axlj((awmd) ghxVar.lU, (awmd) ghxVar.iX, (awmd) ghtVar.u);
        jmgVar.x = aupm.b(ghxVar.iX);
        jmgVar.y = aupm.b(ghtVar.bd);
        jmgVar.z = aupm.b(ghtVar.cs);
        jmgVar.aD = ghjVar.bV();
        jmgVar.A = (xgm) ghjVar.j.io();
        jmgVar.ay = (acwq) ghjVar.o.io();
        jmgVar.B = (adxj) ghtVar.Ad.io();
        jmgVar.aH = (aciz) ghjVar.V.io();
        jmgVar.C = Optional.empty();
        jmgVar.D = aupm.b(gjzVar.aF);
        jmgVar.aF = gjzVar.A();
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.k;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k();
        componentManager().e();
        j();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        k();
        componentManager().e();
        j();
    }
}
