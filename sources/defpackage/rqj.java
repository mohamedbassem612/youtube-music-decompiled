package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class rqj extends rkj implements aupi {
    private ContextWrapper l;
    private volatile auom n;
    private boolean m = false;
    private final Object o = new Object();
    private boolean p = false;

    private final void k() {
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
        k();
        return this.l;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
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

    protected final void l() {
        if (this.p) {
            return;
        }
        this.p = true;
        Object objGeneratedComponent = generatedComponent();
        rqr rqrVar = (rqr) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        rqrVar.l = (ttm) ghtVar.cJ.io();
        rqrVar.m = (wnw) ghtVar.zR.io();
        rqrVar.n = (tbt) ghtVar.I.io();
        rqrVar.o = (xgn) ghtVar.kk.io();
        rqrVar.p = (adhv) ghtVar.rB.io();
        rqrVar.q = (rre) ghtVar.bL.io();
        rqrVar.v = (rqa) ghtVar.zS.io();
        ghj ghjVar = gjzVar.c;
        rqrVar.x = ghjVar.cY();
        rqrVar.r = (zwb) ghtVar.bd.io();
        ghx ghxVar = ghtVar.a;
        rqrVar.s = ghxVar.K();
        rqrVar.t = (vxe) ghjVar.k.io();
        rqrVar.u = (xeu) ghtVar.aZ.io();
        rqrVar.w = (vxz) ghtVar.bM.io();
        rqrVar.y = (qcb) ghxVar.lV.io();
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
        k();
        componentManager().e();
        l();
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
        l();
    }
}
