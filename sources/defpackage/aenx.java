package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aenx extends aeof implements afnb {
    private aeod a;
    private Context d;
    private boolean e;

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aeod peer() {
        aeod aeodVar = this.a;
        if (aeodVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aeodVar;
    }

    @Override // defpackage.aeof
    protected final /* bridge */ /* synthetic */ afpu b() {
        return new afpk(this, true);
    }

    @Override // defpackage.aeof, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new afpe(this, super.getContext());
        }
        return this.d;
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpt getDefaultViewModelCreationExtras() {
        bpv bpvVar = new bpv(super.getDefaultViewModelCreationExtras());
        bpvVar.b(bpd.c, new Bundle());
        return bpvVar;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return aeod.class;
    }

    @Override // defpackage.aeof, defpackage.afou, defpackage.cc
    public final void onAttach(Context context) {
        this.b.i();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.a == null) {
                aeoe aeoeVar = (aeoe) aguu.as(this, aeoe.class);
                afuu afuuVarE = afwt.e(96, aenx.class, "CreatePeer");
                try {
                    this.a = aeoeVar.B();
                    afuuVarE.close();
                } catch (Throwable th) {
                    try {
                        afuuVarE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            afty.k();
        } catch (Throwable th3) {
            try {
                afty.k();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [aunn, java.lang.Object] */
    @Override // defpackage.afou, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.b.i();
        try {
            f(bundle);
            aeod aeodVarPeer = peer();
            Object obj = aeodVarPeer.c;
            ((tre) obj).h.r(190);
            try {
                boh bohVar = ((afou) aeodVarPeer.a).c;
                Object objIo = aeodVarPeer.b.io();
                objIo.getClass();
                bohVar.b((bof) objIo);
                ((tre) obj).h.i(190);
                afty.k();
            } catch (Throwable th) {
                ((tre) obj).h.i(190);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                afty.k();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [aunn, java.lang.Object] */
    @Override // defpackage.afou, defpackage.cc
    public final void onDestroy() {
        afvn afvnVarC = this.b.c();
        try {
            g();
            aeod aeodVarPeer = peer();
            Object obj = aeodVarPeer.c;
            ((tre) obj).h.r(195);
            try {
                boh bohVar = ((afou) aeodVarPeer.a).c;
                Object objIo = aeodVarPeer.b.io();
                objIo.getClass();
                bohVar.c((bof) objIo);
                ((tre) obj).h.i(195);
                afvnVarC.close();
            } catch (Throwable th) {
                ((tre) obj).h.i(195);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                afvnVarC.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onDetach() {
        afvn afvnVarB = this.b.b();
        try {
            i();
            this.e = true;
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aeof, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.b.i();
        try {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new afpe(this, layoutInflaterOnGetLayoutInflater));
            afty.k();
            return layoutInflaterCloneInContext;
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onPause() {
        this.b.i();
        try {
            j();
            Object obj = peer().c;
            ((tre) obj).h.r(193);
            ((tre) obj).h.i(193);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onResume() {
        afvn afvnVarC = this.b.c();
        try {
            k();
            Object obj = peer().c;
            ((tre) obj).h.r(192);
            ((tre) obj).h.i(192);
            afvnVarC.close();
        } catch (Throwable th) {
            try {
                afvnVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onStart() {
        this.b.i();
        try {
            l();
            Object obj = peer().c;
            ((tre) obj).h.r(191);
            ((tre) obj).h.i(191);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afou, defpackage.cc
    public final void onStop() {
        this.b.i();
        try {
            m();
            Object obj = peer().c;
            ((tre) obj).h.r(194);
            ((tre) obj).h.i(194);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cc
    public final void setArguments(Bundle bundle) {
        boolean z = true;
        if (getArguments() != null && getArguments() != bundle) {
            z = false;
        }
        ahno.P(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.setArguments(bundle);
    }

    @Override // defpackage.aeof, defpackage.cc
    public final void onAttach(Activity activity) {
        this.b.i();
        try {
            super.onAttach(activity);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
