package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class uod extends afou implements aupi {
    private ContextWrapper a;
    private volatile afpu e;
    private boolean d = false;
    private final Object f = new Object();
    private boolean g = false;

    private final void a() {
        if (this.a == null) {
            this.a = new afpz(super.getContext(), this);
            this.d = atqp.d(super.getContext());
        }
    }

    protected afpu b() {
        throw null;
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final afpu componentManager() {
        if (this.e == null) {
            synchronized (this.f) {
                if (this.e == null) {
                    this.e = b();
                }
            }
        }
        return this.e;
    }

    protected final void e() {
        if (this.g) {
            return;
        }
        this.g = true;
        generatedComponent();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public Context getContext() {
        if (super.getContext() == null && !this.d) {
            return null;
        }
        a();
        return this.a;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return aewp.p(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        componentManager().c();
        e();
    }

    @Override // defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new afpz(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.afou, defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
        componentManager().c();
        e();
    }
}
