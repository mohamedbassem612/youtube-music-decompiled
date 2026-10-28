package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwv extends vxn implements afnb {
    private vwt a;
    private Context d;
    private boolean e;

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vwt peer() {
        vwt vwtVar = this.a;
        if (vwtVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return vwtVar;
    }

    @Override // defpackage.vxn
    protected final /* bridge */ /* synthetic */ afpu b() {
        return new afpk(this, true);
    }

    @Override // defpackage.vxn, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new afpe(this, super.getContext());
        }
        return this.d;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return vwt.class;
    }

    @Override // defpackage.vxn, defpackage.afou, defpackage.cc
    public final void onAttach(Context context) {
        this.b.i();
        try {
            if (this.e) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.a == null) {
                vww vwwVar = (vww) aguu.as(this, vww.class);
                afuu afuuVarE = afwt.e(68, vwv.class, "CreatePeer");
                try {
                    this.a = vwwVar.y();
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

    @Override // defpackage.vxn, defpackage.cc
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

    @Override // defpackage.cc
    public final void setArguments(Bundle bundle) {
        boolean z = true;
        if (getArguments() != null && getArguments() != bundle) {
            z = false;
        }
        ahno.P(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.setArguments(bundle);
    }

    @Override // defpackage.vxn, defpackage.cc
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
