package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class ivk extends cc implements aupi {
    private ContextWrapper a;
    private volatile auom c;
    private boolean b = false;
    private final Object d = new Object();
    private boolean e = false;

    private final void c() {
        if (this.a == null) {
            this.a = new aupa(super.getContext(), this);
            this.b = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new auom(this);
                }
            }
        }
        return this.c;
    }

    protected final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object objGeneratedComponent = generatedComponent();
        ivn ivnVar = (ivn) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        ivnVar.b = (avmb) ghtVar.dA.io();
        ghj ghjVar = gjzVar.c;
        ivnVar.p = (jij) ghjVar.bc.io();
        ivnVar.c = (hex) ghjVar.pw.io();
        ivnVar.d = (ttm) ghtVar.cJ.io();
        ivnVar.e = (zwb) ghtVar.bd.io();
        ivnVar.o = (rql) ghtVar.AE.io();
        ivnVar.f = (xgn) ghtVar.kk.io();
        ivnVar.t = (hfn) ghtVar.a.lM.io();
        ivnVar.r = (hfn) ghjVar.oJ.io();
        ivnVar.s = (hfn) ghjVar.i.io();
        ivnVar.g = (tbt) ghtVar.I.io();
        ivnVar.q = (hkk) ghjVar.is.io();
        ivnVar.h = (vxe) ghjVar.k.io();
        ivnVar.i = Boolean.TRUE;
        ivnVar.j = aupm.b(gjzVar.ax);
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.b) {
            return null;
        }
        c();
        return this.a;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c();
        componentManager().e();
        b();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        c();
        componentManager().e();
        b();
    }
}
