package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class rna extends cc implements aupi {
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
        rnf rnfVar = (rnf) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        rnfVar.q = (rmy) ghjVar.mi.io();
        rnfVar.b = (rng) ghjVar.pI.io();
        ght ghtVar = gjzVar.b;
        rnfVar.c = (ScheduledExecutorService) ghtVar.u.io();
        rnfVar.d = (Executor) ghtVar.B.io();
        rnfVar.e = (woz) ghtVar.a.ij.io();
        rnfVar.f = (vxe) ghjVar.k.io();
        rnfVar.g = (ttm) ghtVar.cJ.io();
        rnfVar.h = (SharedPreferences) ghtVar.J.io();
        rnfVar.t = new ijt((byte[]) null, (byte[]) null);
        rnfVar.i = (zwb) ghtVar.bd.io();
        rnfVar.j = (tqj) ghtVar.q.io();
        rnfVar.k = (wbz) ghtVar.es.io();
        rnfVar.r = ghtVar.eN();
        rnfVar.s = (vxz) ghtVar.bM.io();
        rnfVar.l = (rg) ghjVar.mj.io();
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
