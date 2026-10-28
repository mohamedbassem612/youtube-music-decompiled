package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class sti extends stf implements aupi {
    private ContextWrapper k;
    private volatile auom m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void i() {
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
        i();
        return this.k;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
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

    protected final void k() {
        if (this.o) {
            return;
        }
        this.o = true;
        Object objGeneratedComponent = generatedComponent();
        ste steVar = (ste) this;
        ghj ghjVar = ((gjz) objGeneratedComponent).c;
        steVar.k = aupm.b(ghjVar.bn);
        steVar.u = (afip) ghjVar.bp.io();
        steVar.l = new aefv(ghjVar.bV(), (vxe) ghjVar.k.io(), (xgm) ghjVar.j.io());
        steVar.r = (vxz) ghjVar.jm.io();
        steVar.s = (vxz) ghjVar.eq.io();
        steVar.v = (abfv) ghjVar.m.io();
        steVar.t = new acfd();
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
        i();
        componentManager().e();
        k();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        i();
        componentManager().e();
        k();
    }
}
