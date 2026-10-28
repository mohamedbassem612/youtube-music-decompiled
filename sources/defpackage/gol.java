package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class gol extends gnf implements aupi {
    private ContextWrapper U;
    private volatile auom W;
    private boolean V = false;
    private final Object X = new Object();
    private boolean Y = false;

    private final void U() {
        if (this.U == null) {
            this.U = new aupa(super.getContext(), this);
            this.V = atqp.d(super.getContext());
        }
    }

    protected final void T() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        Object objGeneratedComponent = generatedComponent();
        gpl gplVar = (gpl) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        gplVar.b = (gmy) ghjVar.lZ.io();
        gplVar.c = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        gplVar.S = (vwt) ghxVar.kb.io();
        gplVar.T = gjzVar.B();
        gplVar.d = (jki) ghjVar.g.io();
        gplVar.e = (xgn) ghtVar.kk.io();
        gplVar.f = (Handler) ghtVar.cY.io();
        gplVar.O = gjzVar.w();
        gplVar.g = (avlh) ghtVar.jG.io();
        gplVar.L = (jnj) ghtVar.mp.io();
        gplVar.G = (hkl) ghjVar.il.io();
        gplVar.h = (iwe) ghjVar.nP.io();
        gplVar.i = gjzVar.b();
        gplVar.j = (jer) ghjVar.bg.io();
        gplVar.k = (xit) ghtVar.fa.io();
        gplVar.l = aupm.b(ghjVar.hW);
        gplVar.H = (vxz) ghtVar.cu.io();
        gplVar.I = (vxz) ghtVar.ga.io();
        gplVar.J = (vxz) ghtVar.fK.io();
        gplVar.K = (vxz) ghtVar.et.io();
        gplVar.m = (avmb) ghtVar.dA.io();
        gplVar.n = (hkq) ghjVar.lV.io();
        gplVar.o = (acxn) ghxVar.ip.io();
        gplVar.p = aupm.b(ghjVar.mS);
        gplVar.q = (awku) ghtVar.gb.io();
        gplVar.r = (adxj) ghtVar.Ad.io();
        gplVar.R = gjzVar.A();
        gplVar.Q = (aeod) ghjVar.mV.io();
        gplVar.V = (wom) ghxVar.ho.io();
        gplVar.aC = new aczl(ghjVar.lY, ghjVar.lW, ghtVar.gK, gjzVar.p, ghtVar.fa, ghtVar.I, ghtVar.B, (byte[]) null, (char[]) null);
        gplVar.W = (izf) ghtVar.cD.io();
        gplVar.X = (tbt) ghtVar.I.io();
        gplVar.Y = (jaz) ghjVar.ec.io();
        gplVar.Z = (ttm) ghtVar.cJ.io();
        gplVar.au = (jin) ghjVar.v.io();
        gplVar.aa = (gny) gjzVar.q.io();
        gplVar.ab = (gqt) gjzVar.r.io();
        gplVar.ac = new gpz();
        gplVar.ad = gjzVar.a();
        gplVar.aB = (aczl) ghjVar.pd.io();
        gplVar.ae = (ahey) ghtVar.du.io();
        gplVar.af = (iwd) gjzVar.s.io();
        gplVar.az = (hfn) ghjVar.i.io();
        gplVar.av = (hcb) ghtVar.mN.io();
        gplVar.ax = (hef) ghtVar.iQ.io();
        gplVar.aA = (hhb) ghjVar.mW.io();
        gplVar.aw = ghjVar.bT();
        gplVar.ag = aupm.b(ghjVar.pe);
        gplVar.ay = ghjVar.cd();
        gplVar.ah = (jax) ghjVar.mT.io();
        gplVar.ai = ghjVar.aI();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auom componentManager() {
        if (this.W == null) {
            synchronized (this.X) {
                if (this.W == null) {
                    this.W = new auom(this);
                }
            }
        }
        return this.W;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null && !this.V) {
            return null;
        }
        U();
        return this.U;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return atqp.c(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.U;
        boolean z = true;
        if (contextWrapper != null && auom.d(contextWrapper) != activity) {
            z = false;
        }
        atqq.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        U();
        componentManager().e();
        T();
    }

    @Override // defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new aupa(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.cc
    public final void onAttach(Context context) {
        super.onAttach(context);
        U();
        componentManager().e();
        T();
    }
}
