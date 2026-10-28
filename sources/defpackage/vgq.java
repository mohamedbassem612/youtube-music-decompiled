package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class vgq extends vgn implements aupi {
    private ContextWrapper p;
    private volatile auom r;
    private boolean q = false;
    private final Object s = new Object();
    private boolean t = false;

    private final void p() {
        if (this.p == null) {
            this.p = new aupa(super.getContext(), this);
            this.q = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.q) {
            return null;
        }
        p();
        return this.p;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.r == null) {
            synchronized (this.s) {
                if (this.r == null) {
                    this.r = new auom(this);
                }
            }
        }
        return this.r;
    }

    protected final void n() {
        if (this.t) {
            return;
        }
        this.t = true;
        Object objGeneratedComponent = generatedComponent();
        vhc vhcVar = (vhc) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        vhcVar.k = gjzVar.i();
        ghj ghjVar = gjzVar.c;
        ((vgn) vhcVar).l = (xgm) ghjVar.j.io();
        vhcVar.q = (zwb) ghtVar.bd.io();
        vhcVar.N = new xpl((Context) ghtVar.v.io(), (syn) ghtVar.cs.io());
        vhcVar.r = gjzVar.f();
        vhcVar.s = gjzVar.h();
        gjzVar.F();
        vhcVar.t = (Executor) ghtVar.B.io();
        vhcVar.u = new vhe(gjzVar.g(), (xgm) ghjVar.j.io());
        vhcVar.K = new xsc(rsb.o(gjzVar.p()), (Handler) ghtVar.cY.io(), (xgm) ghjVar.j.io());
        vhcVar.v = (aeda) ghjVar.n.io();
        vhcVar.L = new xsc((cf) ghjVar.d.io(), (Context) ghjVar.kx.io(), (vxz) ghjVar.a.ga.io());
        vhcVar.M = (aciz) ghjVar.V.io();
        vhcVar.w = ghjVar.pJ;
        vhcVar.J = (vxz) ghtVar.um.io();
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.p;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p();
        componentManager().e();
        n();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        p();
        componentManager().e();
        n();
    }
}
