package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class izn extends izp implements aupi {
    private ContextWrapper o;
    private volatile auom q;
    private boolean p = false;
    private final Object r = new Object();
    private boolean s = false;

    private final void r() {
        if (this.o == null) {
            this.o = new aupa(super.getContext(), this);
            this.p = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.p) {
            return null;
        }
        r();
        return this.o;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.q == null) {
            synchronized (this.r) {
                if (this.q == null) {
                    this.q = new auom(this);
                }
            }
        }
        return this.q;
    }

    protected final void j() {
        if (this.s) {
            return;
        }
        this.s = true;
        Object objGeneratedComponent = generatedComponent();
        izs izsVar = (izs) this;
        ghj ghjVar = ((gjz) objGeneratedComponent).c;
        ((izp) izsVar).n = (ahek) ghjVar.aO.io();
        izsVar.k = (advb) ghjVar.bl.io();
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.o;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r();
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
        r();
        componentManager().e();
        j();
    }
}
