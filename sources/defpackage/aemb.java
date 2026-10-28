package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class aemb extends bp implements aupi {
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
        aemn aemnVar = (aemn) this;
        gjz gjzVar = (gjz) objGeneratedComponent;
        ghj ghjVar = gjzVar.c;
        aemnVar.m = (vxe) ghjVar.k.io();
        ght ghtVar = gjzVar.b;
        ghx ghxVar = ghtVar.a;
        aemnVar.x = (aeng) ghxVar.ma.io();
        aemnVar.R = (aepb) ghxVar.mb.io();
        aemnVar.y = aupm.b(ghjVar.pM);
        aemnVar.z = aupm.b(ghjVar.by);
        aemnVar.A = (Handler) ghtVar.cY.io();
        aemnVar.B = (Executor) ghtVar.B.io();
        aemnVar.O = (abfv) ghjVar.m.io();
        aemnVar.C = (xgn) ghtVar.kk.io();
        aemnVar.D = (ttm) ghtVar.cJ.io();
        aemnVar.E = (tbt) ghtVar.I.io();
        aemnVar.F = (ScheduledExecutorService) ghtVar.u.io();
        aemnVar.G = (ahex) ghtVar.z.io();
        aemnVar.H = (adhv) ghtVar.rB.io();
        aemnVar.P = (aend) ghxVar.jE.io();
        aemnVar.I = (tmo) ghtVar.gS.io();
        aemnVar.J = (SharedPreferences) ghtVar.J.io();
        aemnVar.N = (ahek) ghjVar.aO.io();
        aemnVar.Q = (ci) ghjVar.h.io();
        aemnVar.K = (mbc) ghtVar.l.io();
        aemnVar.M = (vxu) ghtVar.at.io();
        aemnVar.L = new tza(R.style.Theme_SharePanel);
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
