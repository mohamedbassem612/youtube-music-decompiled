package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class rls extends rkj implements aupi {
    private ContextWrapper l;
    private volatile auom n;
    private boolean m = false;
    private final Object o = new Object();
    private boolean p = false;

    private final void j() {
        if (this.l == null) {
            this.l = new aupa(super.getContext(), this);
            this.m = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.m) {
            return null;
        }
        j();
        return this.l;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.n == null) {
            synchronized (this.o) {
                if (this.n == null) {
                    this.n = new auom(this);
                }
            }
        }
        return this.n;
    }

    protected final void m() {
        if (this.p) {
            return;
        }
        this.p = true;
        Object objGeneratedComponent = generatedComponent();
        rlq rlqVar = (rlq) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        rlqVar.l = (ttm) ghtVar.cJ.io();
        rlqVar.m = (wnw) ghtVar.zR.io();
        ghx ghxVar = ghtVar.a;
        rlqVar.n = ghxVar.K();
        rlqVar.y = (rqa) ghtVar.zS.io();
        ghj ghjVar = gjzVar.c;
        rlqVar.o = ghjVar.k;
        rlqVar.C = ghjVar.cM();
        rlqVar.A = (afip) ghjVar.X.io();
        rlqVar.p = (tbt) ghtVar.I.io();
        rlqVar.q = (zwb) ghtVar.bd.io();
        rlqVar.r = (xgn) ghtVar.kk.io();
        rlqVar.s = (adhv) ghtVar.rB.io();
        rlqVar.t = (rre) ghtVar.bL.io();
        rlqVar.E = ghjVar.cY();
        rlqVar.F = (xsc) ghjVar.pH.io();
        rlqVar.u = (aduv) ghtVar.cD.io();
        rlqVar.v = (aeda) ghjVar.n.io();
        rlqVar.B = (abfv) ghjVar.m.io();
        rlqVar.D = (lqa) ghjVar.U.io();
        rlqVar.w = (afvq) ghtVar.mK.io();
        rlqVar.z = (vxz) ghtVar.bM.io();
        rlqVar.G = (qcb) ghxVar.lV.io();
        rlqVar.x = (xeu) ghtVar.aZ.io();
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.l;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j();
        componentManager().e();
        m();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        j();
        componentManager().e();
        m();
    }
}
