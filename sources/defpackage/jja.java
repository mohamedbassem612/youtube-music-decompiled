package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class jja extends iyu implements aupi {
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
        jjm jjmVar = (jjm) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        jjmVar.k = (ttm) ghtVar.cJ.io();
        jjmVar.l = (Executor) ghtVar.B.io();
        jjmVar.m = (Executor) ghtVar.u.io();
        ghx ghxVar = ghtVar.a;
        jjmVar.n = (wom) ghxVar.ho.io();
        ghj ghjVar = gjzVar.c;
        jjmVar.D = (jnm) ghjVar.iS.io();
        jjmVar.B = (xow) ghxVar.jg.io();
        jjmVar.o = (aduv) ghtVar.cD.io();
        jjmVar.p = (adxj) ghtVar.Ad.io();
        jjmVar.q = (adhv) ghtVar.rB.io();
        jjmVar.r = (vxe) ghjVar.k.io();
        jjmVar.s = (xgn) ghtVar.kk.io();
        jjmVar.t = (jer) ghjVar.bg.io();
        jjmVar.C = (ahek) ghjVar.aO.io();
        jjmVar.E = (abxv) ghjVar.aU.io();
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
