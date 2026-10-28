package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class aeka extends bp implements aupi {
    private ContextWrapper k;
    private volatile afpu m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void k() {
        if (this.k == null) {
            this.k = new afpz(super.getContext(), this);
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
        return aewp.p(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final afpu componentManager() {
        if (this.m == null) {
            synchronized (this.n) {
                if (this.m == null) {
                    this.m = new afpu(this, true);
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
        aeke aekeVar = (aeke) this;
        gjx gjxVar = (gjx) objGeneratedComponent;
        ght ghtVar = gjxVar.a;
        aekeVar.v = (lqa) ghtVar.a.iX.io();
        aekeVar.k = (vxe) gjxVar.cn.i.io();
        aekeVar.l = (zwh) gjxVar.cl.c.io();
        aekeVar.m = (xeu) ghtVar.aZ.io();
        aekeVar.u = (afip) gjxVar.bn.io();
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
        componentManager().c();
        j();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new afpz(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        k();
        componentManager().c();
        j();
    }
}
