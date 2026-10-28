package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class uoc extends vgb implements aupi {
    private ContextWrapper b;
    private volatile afpu d;
    private boolean c = false;
    private final Object e = new Object();
    private boolean f = false;

    private final void a() {
        if (this.b == null) {
            this.b = new afpz(super.getContext(), this);
            this.c = atqp.d(super.getContext());
        }
    }

    protected afpu b() {
        throw null;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public Context getContext() {
        if (super.getContext() == null && !this.c) {
            return null;
        }
        a();
        return this.b;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return aewp.p(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final afpu componentManager() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = b();
                }
            }
        }
        return this.d;
    }

    protected final void i() {
        if (this.f) {
            return;
        }
        this.f = true;
        gjx gjxVar = (gjx) generatedComponent();
        ght ghtVar = gjxVar.a;
        gkg gkgVar = gjxVar.cl;
        gju gjuVar = gjxVar.cm;
        ((unj) this).a = new giy(ghtVar, gkgVar, gjxVar.cn);
    }

    @Override // defpackage.cc
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        componentManager().c();
        i();
    }

    @Override // defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new afpz(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
        componentManager().c();
        i();
    }
}
