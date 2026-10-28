package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class rnq extends bp implements aupi {
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
        roh rohVar = (roh) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        rohVar.p = (abzo) gjzVar.aJ.io();
        rohVar.q = gjzVar.E();
        rohVar.l = gjzVar.e();
        ghj ghjVar = gjzVar.c;
        aupr auprVar = ghjVar.b;
        ght ghtVar = gjzVar.b;
        aupr auprVar2 = ghtVar.bd;
        ghx ghxVar = ghtVar.a;
        rohVar.o = new swe(auprVar, auprVar2, auprVar2, ghxVar.lW, auprVar, ghtVar.cY, gjzVar.aJ, ghxVar.lX);
        rohVar.n = gjzVar.r();
        rohVar.m = (xgm) ghjVar.j.io();
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
