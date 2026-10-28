package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class xth extends xsn implements aupi {
    private volatile auom D;
    private ContextWrapper k;
    private boolean C = false;
    private final Object E = new Object();
    private boolean F = false;

    private final void m() {
        if (this.k == null) {
            this.k = new aupa(super.getContext(), this);
            this.C = atqp.d(super.getContext());
        }
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.C) {
            return null;
        }
        m();
        return this.k;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.D == null) {
            synchronized (this.E) {
                if (this.D == null) {
                    this.D = new auom(this);
                }
            }
        }
        return this.D;
    }

    protected final void j() {
        if (this.F) {
            return;
        }
        this.F = true;
        Object objGeneratedComponent = generatedComponent();
        xsf xsfVar = (xsf) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ght ghtVar = gjzVar.b;
        xsfVar.S = (vxz) ghtVar.cB.io();
        ghj ghjVar = gjzVar.c;
        xsfVar.A = (ahek) ghjVar.aO.io();
        ((xsn) xsfVar).l = (xsh) ghjVar.nD.io();
        xsfVar.y = (vxz) ghtVar.dd.io();
        xsfVar.z = (vxz) ghtVar.cQ.io();
        ((xsn) xsfVar).m = (mbc) ghtVar.l.io();
        ((xsn) xsfVar).n = (abvn) ghtVar.kp.io();
        ((xsn) xsfVar).o = (avmb) ghtVar.dA.io();
        xsfVar.p = (aeda) ghjVar.n.io();
        xsfVar.q = (adhv) ghtVar.rB.io();
        xsfVar.B = (abfv) ghjVar.m.io();
        xsfVar.r = (adxj) ghtVar.Ad.io();
        xsfVar.s = (xpq) ghjVar.az.io();
        xsfVar.t = (xzm) ghtVar.pk.io();
        xsfVar.x = (ycp) ghtVar.kx.io();
        xsfVar.k = (adxl) ghjVar.W.io();
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
        m();
        componentManager().e();
        j();
    }

    @Override // defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.xsn, defpackage.bp, defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        m();
        componentManager().e();
        j();
    }
}
