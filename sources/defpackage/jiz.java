package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class jiz extends jiy implements aupi {
    private ContextWrapper c;
    private volatile auom e;
    private boolean d = false;
    private final Object f = new Object();
    private boolean g = false;

    private final void d() {
        if (this.c == null) {
            this.c = new aupa(super.getContext(), this);
            this.d = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.e == null) {
            synchronized (this.f) {
                if (this.e == null) {
                    this.e = new auom(this);
                }
            }
        }
        return this.e;
    }

    protected final void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        Object objGeneratedComponent = generatedComponent();
        jjf jjfVar = (jjf) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        jjfVar.c = (jjh) gjzVar.aA.io();
        jjfVar.d = (jjd) gjzVar.az.io();
        ghj ghjVar = gjzVar.c;
        jjfVar.e = ghjVar.aw;
        jjfVar.f = (xgn) gjzVar.b.kk.io();
        jjfVar.i = (yy) gjzVar.ay.io();
        jjfVar.g = (vxe) ghjVar.k.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.d) {
            return null;
        }
        d();
        return this.c;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d();
        componentManager().e();
        c();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        d();
        componentManager().e();
        c();
    }
}
