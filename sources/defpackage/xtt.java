package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class xtt extends dfv implements aupi {
    private ContextWrapper m;
    private volatile auom o;
    private boolean n = false;
    private final Object p = new Object();
    private boolean q = false;

    private final void m() {
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
        m();
        return this.m;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
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

    protected final void l() {
        if (this.q) {
            return;
        }
        this.q = true;
        Object objGeneratedComponent = generatedComponent();
        xuf xufVar = (xuf) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        xufVar.n = (did) ghtVar.lg.io();
        xufVar.o = ghtVar.le;
        ghj ghjVar = gjzVar.c;
        xufVar.p = (xrd) ghjVar.nC.io();
        xufVar.H = (dov) ghtVar.kQ.io();
        xufVar.q = (tbt) ghtVar.I.io();
        xufVar.G = (xsc) ghtVar.a.lY.io();
        xufVar.r = ghtVar.li;
        xufVar.s = ((Boolean) ghtVar.lh.io()).booleanValue();
        xufVar.t = ghtVar.oG;
        xufVar.u = (xla) ghtVar.de.io();
        xufVar.C = (ycp) ghtVar.kx.io();
        xufVar.v = (xmr) ghtVar.dh.io();
        xufVar.w = (ydu) ghtVar.ln.io();
        xufVar.D = (ycp) ghtVar.kx.io();
        xufVar.x = (xru) ghtVar.po.io();
        xufVar.y = (xgm) ghjVar.j.io();
        xufVar.z = (Executor) ghtVar.B.io();
        xufVar.A = (xrx) ghtVar.lj.io();
        xufVar.F = (abte) ghtVar.iS.io();
        xufVar.B = (aeda) ghjVar.n.io();
        xufVar.E = (vxz) ghtVar.dd.io();
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
        m();
        componentManager().e();
        l();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        m();
        componentManager().e();
        l();
    }
}
