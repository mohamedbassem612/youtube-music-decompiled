package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class xtu extends dgf implements aupi {
    private ContextWrapper m;
    private volatile auom o;
    private boolean n = false;
    private final Object p = new Object();
    private boolean q = false;

    private final void l() {
        if (this.m == null) {
            this.m = new aupa(super.getContext(), this);
            this.n = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.n) {
            return null;
        }
        l();
        return this.m;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.o == null) {
            synchronized (this.p) {
                if (this.o == null) {
                    this.o = new auom(this);
                }
            }
        }
        return this.o;
    }

    protected final void k() {
        if (this.q) {
            return;
        }
        this.q = true;
        ((xuh) this).m = (qcb) ((gjz) generatedComponent()).aL.io();
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.m;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l();
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
        l();
        componentManager().e();
        k();
    }
}
