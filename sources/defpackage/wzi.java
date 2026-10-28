package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class wzi extends wzk implements aupi {
    private ContextWrapper a;
    private volatile auom c;
    private boolean b = false;
    private final Object d = new Object();
    private boolean e = false;

    private final void d() {
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
        wzq wzqVar = (wzq) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        wzqVar.a = (wrb) ghxVar.kv.io();
        ghj ghjVar = gjzVar.c;
        wzqVar.b = (advb) ghjVar.pL.io();
        wzqVar.c = (wyz) ghxVar.kA.io();
        wzqVar.d = (wzb) ghjVar.mD.io();
        wzqVar.e = (Executor) ghtVar.B.io();
        wzqVar.f = (ttm) ghtVar.cJ.io();
        wzqVar.g = (vxe) ghjVar.k.io();
        wzqVar.h = (wwn) ghjVar.kt.io();
        wzqVar.o = (ssj) ghjVar.eD.io();
        wzqVar.i = (xgn) ghtVar.kk.io();
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
        d();
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
        d();
        componentManager().e();
        b();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.wzk, defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        d();
        componentManager().e();
        b();
    }
}
