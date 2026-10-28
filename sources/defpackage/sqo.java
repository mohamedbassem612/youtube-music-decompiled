package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class sqo extends bp implements aupi {
    private ContextWrapper k;
    private volatile auom m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void k() {
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
        k();
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
        sql sqlVar = (sql) this;
        ght ghtVar = ((gjz) objGeneratedComponent).b;
        sqlVar.q = (omj) ghtVar.ys.io();
        sqlVar.m = (Executor) ghtVar.u.io();
        sqlVar.n = (Executor) ghtVar.B.io();
        sqlVar.o = (zwb) ghtVar.bd.io();
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
        k();
        componentManager().e();
        j();
    }
}
