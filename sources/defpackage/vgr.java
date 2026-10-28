package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class vgr extends cc implements aupi {
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
        vhk vhkVar = (vhk) this;
        gjz gjzVar = (gjz) generatedComponent();
        ghj ghjVar = gjzVar.c;
        Context context = (Context) ghjVar.b.io();
        gjzVar.i();
        vgw vgwVarF = gjzVar.f();
        vho vhoVarH = gjzVar.h();
        via viaVarP = rsb.p(gjzVar.p());
        via viaVarM = rsb.m(gjzVar.p());
        vil vilVar = (vil) gjzVar.p().s.io();
        vilVar.getClass();
        vil vilVar2 = (vil) gjzVar.p().p.io();
        vilVar2.getClass();
        vie vieVar = (vie) gjzVar.p().q.io();
        vieVar.getClass();
        vik vikVar = (vik) gjzVar.p().r.io();
        vikVar.getClass();
        xgm xgmVar = (xgm) ghjVar.j.io();
        vic vicVar = (vic) gjzVar.p().n.io();
        vicVar.getClass();
        vhd vhdVarG = gjzVar.g();
        aeiv aeivVar = (aeiv) gjzVar.p().m.io();
        aeivVar.getClass();
        vhkVar.a = new vhg(context, vgwVarF, vhoVarH, viaVarP, viaVarM, vilVar, vilVar2, vieVar, vikVar, xgmVar, vicVar, vhdVarG, aeivVar, gjzVar.F());
        vhkVar.e = (vxz) gjzVar.b.um.io();
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
