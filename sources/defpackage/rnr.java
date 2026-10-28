package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class rnr extends rnw implements aupi {
    private ContextWrapper g;
    private volatile auom i;
    private boolean h = false;
    private final Object j = new Object();
    private boolean k = false;

    private final void e() {
        if (this.g == null) {
            this.g = new aupa(super.getContext(), this);
            this.h = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.i == null) {
            synchronized (this.j) {
                if (this.i == null) {
                    this.i = new auom(this);
                }
            }
        }
        return this.i;
    }

    protected final void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        Object objGeneratedComponent = generatedComponent();
        roi roiVar = (roi) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        roiVar.k = (abzo) gjzVar.aJ.io();
        roiVar.l = gjzVar.E();
        roiVar.h = gjzVar.e();
        roiVar.j = gjzVar.r();
        roiVar.i = (xgm) gjzVar.c.j.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.h) {
            return null;
        }
        e();
        return this.g;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.rnw, defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.g;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e();
        componentManager().e();
        b();
    }

    @Override // defpackage.rnw, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.rnw, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        e();
        componentManager().e();
        b();
    }
}
