package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class sth extends sta implements aupi {
    private ContextWrapper k;
    private volatile auom m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void l() {
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
        l();
        return this.k;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
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
        l();
        componentManager().e();
        t();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
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

    protected final void t() {
        if (this.o) {
            return;
        }
        this.o = true;
        Object objGeneratedComponent = generatedComponent();
        ssz sszVar = (ssz) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        sszVar.I = (vxu) ghtVar.at.io();
        ghj ghjVar = gjzVar.c;
        sszVar.k = (vxe) ghjVar.k.io();
        ghx ghxVar = ghtVar.a;
        sszVar.N = ghxVar.j();
        sszVar.L = ghjVar.ck();
        sszVar.K = (aeiv) ghxVar.kj.io();
        sszVar.M = ghjVar.cJ();
        sszVar.l = (adhv) ghtVar.rB.io();
        sszVar.m = (aduv) ghtVar.cD.io();
        sszVar.n = (xgn) ghtVar.kk.io();
        sszVar.o = new aefv(ghjVar.bV(), (vxe) ghjVar.k.io(), (xgm) ghjVar.j.io());
        sszVar.p = (Context) ghjVar.jc.io();
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        l();
        componentManager().e();
        t();
    }
}
