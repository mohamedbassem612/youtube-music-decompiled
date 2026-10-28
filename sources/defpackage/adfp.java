package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class adfp extends acwk implements aupi {
    private ContextWrapper k;
    private volatile afpu m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void q() {
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
    public Context getContext() {
        if (super.getContext() == null && !this.l) {
            return null;
        }
        q();
        return this.k;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return aewp.p(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.k;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q();
        componentManager().c();
        t();
    }

    @Override // defpackage.bp, defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new afpz(layoutInflaterOnGetLayoutInflater, this));
    }

    protected afpu r() {
        throw null;
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final afpu componentManager() {
        if (this.m == null) {
            synchronized (this.n) {
                if (this.m == null) {
                    this.m = r();
                }
            }
        }
        return this.m;
    }

    protected final void t() {
        if (this.o) {
            return;
        }
        this.o = true;
        generatedComponent();
    }

    @Override // defpackage.bp, defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        q();
        componentManager().c();
        t();
    }
}
