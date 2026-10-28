package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class aczm extends adyw implements aupi {
    private ContextWrapper k;
    private volatile auom m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void m() {
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
        m();
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
        Object objGeneratedComponent = generatedComponent();
        aczv aczvVar = (aczv) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        aupr auprVar = ghtVar.cB;
        aczvVar.S = (vxz) auprVar.io();
        ghj ghjVar = gjzVar.c;
        aczvVar.w = (acxx) ghjVar.eo.io();
        aczvVar.l = ghtVar.ew;
        aczvVar.x = (vxz) gjzVar.aO.io();
        aczvVar.y = (vxz) ghjVar.bm.io();
        aczvVar.z = (vxz) ghtVar.cA.io();
        aczvVar.F = (afip) ghjVar.bp.io();
        aczvVar.A = (vxz) ghtVar.dP.io();
        aczvVar.n = aupm.b(ghjVar.bn);
        aczvVar.o = (nuc) ghjVar.N.io();
        aczvVar.p = ghjVar.ak;
        aczvVar.q = ghjVar.bq;
        aczvVar.r = (Context) ghjVar.pp.io();
        aczvVar.B = (vxz) auprVar.io();
        aczvVar.s = (adxl) ghjVar.W.io();
        aczvVar.t = (aeda) ghjVar.n.io();
        aczvVar.E = (afip) ghjVar.kW.io();
        aczvVar.u = (tqj) ghtVar.q.io();
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
        m();
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
        m();
        componentManager().e();
        j();
    }
}
