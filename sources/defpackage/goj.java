package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class goj extends cc implements aupi {
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
        got gotVar = (got) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        gotVar.a = (tbt) ghtVar.I.io();
        ghx ghxVar = ghtVar.a;
        gotVar.b = (wom) ghxVar.ho.io();
        gotVar.c = (izf) ghtVar.cD.io();
        ghj ghjVar = gjzVar.c;
        gotVar.d = (jaz) ghjVar.ec.io();
        gotVar.n = (ci) ghjVar.h.io();
        gotVar.e = (xgn) ghtVar.kk.io();
        gotVar.f = (jer) ghjVar.bg.io();
        gotVar.o = (hhb) ghjVar.mW.io();
        gotVar.g = (jax) ghjVar.mT.io();
        gotVar.l = (aeod) ghjVar.mV.io();
        gotVar.m = gjzVar.A();
        gotVar.k = (hkl) ghjVar.il.io();
        gotVar.h = (Handler) ghtVar.cY.io();
        gotVar.i = (gmy) ghjVar.lZ.io();
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
