package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ilj extends cc implements aupi {
    private ContextWrapper a;
    private volatile afpu c;
    private boolean b = false;
    private final Object d = new Object();
    private boolean e = false;

    private final void a() {
        if (this.a == null) {
            this.a = new afpz(super.getContext(), this);
            this.b = atqp.d(super.getContext());
        }
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
        a();
        return this.a;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return aewp.p(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final afpu componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new afpu(this, true);
                }
            }
        }
        return this.c;
    }

    protected final void l() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object objGeneratedComponent = generatedComponent();
        ilc ilcVar = (ilc) this;
        gjx gjxVar = (gjx) objGeneratedComponent;
        gkg gkgVar = gjxVar.cl;
        ilcVar.i = (iky) gkgVar.ah.io();
        ilcVar.j = (afki) gjxVar.c.io();
        cc ccVar = (cc) ((aupo) gjxVar.b).b;
        awou awouVar = (awou) gjxVar.d.io();
        ccVar.getClass();
        awouVar.getClass();
        ilcVar.k = new afqq(ccVar, awouVar);
        ght ghtVar = gjxVar.a;
        ghx ghxVar = ghtVar.a;
        ilcVar.l = (wom) ghxVar.ho.io();
        ilcVar.m = (jax) gjxVar.p.io();
        ilcVar.v = (aeod) gjxVar.r.io();
        ilcVar.w = gjxVar.L();
        ilcVar.n = (jaz) gjxVar.K.io();
        ilcVar.o = (xgn) ghtVar.kk.io();
        ilcVar.p = iqf.d((afpa) gjxVar.cn.c.io());
        ilcVar.q = (advn) gjxVar.L.io();
        ilcVar.r = (avlh) ghxVar.iw.io();
        ilcVar.u = (vxz) ghtVar.cu.io();
        ilcVar.s = (avmb) ghtVar.dA.io();
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
        a();
        componentManager().c();
        l();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new afpz(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        a();
        componentManager().c();
        l();
    }
}
