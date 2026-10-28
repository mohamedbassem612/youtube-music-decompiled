package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class hdl extends bp implements aupi {
    private ContextWrapper k;
    private volatile auom m;
    private boolean l = false;
    private final Object n = new Object();
    private boolean o = false;

    private final void i() {
        if (this.k == null) {
            this.k = new aupa(super.getContext(), this);
            this.l = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
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

    protected final void G() {
        if (this.o) {
            return;
        }
        this.o = true;
        Object objGeneratedComponent = generatedComponent();
        hdj hdjVar = (hdj) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        hdjVar.z = (xgn) ghtVar.kk.io();
        hdjVar.A = (adhv) ghtVar.rB.io();
        ghj ghjVar = gjzVar.c;
        hdjVar.M = (abxv) ghjVar.aU.io();
        hdjVar.B = (jer) ghjVar.bg.io();
        hdjVar.K = (ahek) ghjVar.aO.io();
        hdjVar.C = (zwb) ghtVar.bd.io();
        hdjVar.D = (vxe) ghjVar.k.io();
        hdjVar.E = (avmb) ghtVar.dA.io();
        hdjVar.N = new xpl((Context) ghtVar.v.io(), (syn) ghtVar.cs.io(), (short[]) null);
        hdjVar.J = (jij) ghjVar.bc.io();
        hdjVar.I = (jin) ghjVar.v.io();
        hdjVar.F = (ttm) ghtVar.cJ.io();
        hdjVar.G = (Executor) ghtVar.u.io();
        hdjVar.H = (adxj) ghtVar.Ad.io();
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
        i();
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
        i();
        componentManager().e();
        G();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        i();
        componentManager().e();
        G();
    }
}
