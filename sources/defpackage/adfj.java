package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfj extends adfp implements afnb, afpd, afvj {
    private adfk k;
    private Context l;
    private final boh m = new boh(this);
    private final afts n = new afts(this);
    private boolean o;

    @Deprecated
    public adfj() {
        qpj.c();
    }

    @Override // defpackage.bp
    public final void dismiss() {
        afvn afvnVarH = afty.h();
        try {
            super.iQ(false, false, false);
            afvnVarH.close();
        } catch (Throwable th) {
            try {
                afvnVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afvj
    public final afwn getAnimationRef() {
        return (afwn) this.n.c;
    }

    @Override // defpackage.adfp, defpackage.cc
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        if (this.l == null) {
            this.l = new afpe(this, super.getContext());
        }
        return this.l;
    }

    @Override // defpackage.afpd
    public final Locale getCustomLocale() {
        return aguu.au(this);
    }

    @Override // defpackage.cc, defpackage.bny
    public final bpt getDefaultViewModelCreationExtras() {
        bpv bpvVar = new bpv(super.getDefaultViewModelCreationExtras());
        bpvVar.b(bpd.c, new Bundle());
        return bpvVar;
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.m;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return adfk.class;
    }

    @Override // defpackage.acwk
    protected final Drawable i(Context context) {
        super.i(context);
        peer();
        return new ColorDrawable(0);
    }

    @Override // defpackage.bp
    public final void iN() {
        afvn afvnVarH = afty.h();
        try {
            super.iQ(true, false, false);
            afvnVarH.close();
        } catch (Throwable th) {
            try {
                afvnVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acwk
    protected final View j() {
        adfk adfkVarPeer = peer();
        byte[] bArrG = adfkVarPeer.b.c.G();
        ntw ntwVarB = ntx.b(adfkVarPeer.c);
        ntwVarB.c(false);
        ntwVarB.i = adfkVarPeer.f.e(adfkVarPeer.d);
        mel melVar = new mel(adfkVarPeer.a.getContext(), ntwVarB.a());
        melVar.a(bArrG, null);
        melVar.setId(R.id.elements_dialog_fragment_elements_view);
        abfv abfvVar = adfkVarPeer.g;
        if (abfvVar.l()) {
            melVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            if (!abfvVar.k()) {
                melVar.setClickable(true);
            }
        }
        return melVar;
    }

    @Override // defpackage.acwk
    protected final xgn k() {
        return peer().d;
    }

    @Override // defpackage.acwk
    protected final ajwo l() {
        ajwo ajwoVar = peer().b.e;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.acwk
    protected final boolean m() {
        return peer().g.k();
    }

    @Override // defpackage.acwk
    protected final boolean n() {
        return peer().g.l();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.n.i();
        try {
            super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
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
    public final void onActivityResult(int i, int i2, Intent intent) {
        afvn afvnVarA = this.n.a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            afvnVarA.close();
        } catch (Throwable th) {
            try {
                afvnVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adfp, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        this.n.i();
        try {
            if (this.o) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.k == null) {
                adfm adfmVar = (adfm) aguu.as(this, adfm.class);
                afuu afuuVarE = afwt.e(95, adfj.class, "CreatePeer");
                try {
                    this.k = adfmVar.A();
                    afuuVarE.close();
                    this.k.i = this;
                    super.getLifecycle().b(new afox(this.n, this.m));
                } catch (Throwable th) {
                    try {
                        afuuVarE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bpp parentFragment = getParentFragment();
            if (parentFragment instanceof afvj) {
                afts aftsVar = this.n;
                if (aftsVar.c == null) {
                    aftsVar.g(((afvj) parentFragment).getAnimationRef(), true);
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

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.n.e("DialogFragment:onCancel").close();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.n.i();
        try {
            super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
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
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.n.h(i, i2);
        afty.k();
        return null;
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.n.i();
        try {
            View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            afty.k();
            return viewOnCreateView;
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
    public final void onDestroy() {
        afvn afvnVarC = this.n.c();
        try {
            super.onDestroy();
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

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        afvn afvnVarC = this.n.c();
        try {
            super.onDestroyView();
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

    @Override // defpackage.bp, defpackage.cc
    public final void onDetach() {
        afvn afvnVarB = this.n.b();
        try {
            super.onDetach();
            this.o = true;
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

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        afvn afvnVarE = this.n.e("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            adfk adfkVarPeer = peer();
            mfw mfwVar = adfkVarPeer.e;
            if (mfwVar != null) {
                mfwVar.a();
                adfkVarPeer.e = null;
            }
            afvnVarE.close();
        } catch (Throwable th) {
            try {
                afvnVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.adfp, defpackage.bp, defpackage.cc
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.n.i();
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
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        this.n.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    @Override // defpackage.cc
    public final void onPause() {
        this.n.i();
        try {
            super.onPause();
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
    public final void onResume() {
        afvn afvnVarC = this.n.c();
        try {
            super.onResume();
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

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        this.n.i();
        try {
            super.m668x22bc4f96(bundle);
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

    @Override // defpackage.acwk, defpackage.bp, defpackage.cc
    public final void onStart() {
        this.n.i();
        try {
            super.onStart();
            adfk adfkVarPeer = peer();
            abfv abfvVar = adfkVarPeer.g;
            if (abfvVar.l() && !abfvVar.k()) {
                xgn xgnVar = adfkVarPeer.d;
                xhc xhcVarA = xhb.a(222112);
                ajwo ajwoVar = adfkVarPeer.b.e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                xgnVar.b(xhcVarA, ajwoVar, null);
            }
            afxw.D(this);
            if (this.d) {
                afxw.C(this);
            }
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

    @Override // defpackage.acwk, defpackage.bp, defpackage.cc
    public final void onStop() {
        this.n.i();
        try {
            super.onStop();
            adfk adfkVarPeer = peer();
            abfv abfvVar = adfkVarPeer.g;
            if (abfvVar.l() && !abfvVar.k()) {
                adfkVarPeer.d.t();
            }
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
    public final void onViewCreated(View view, Bundle bundle) {
        this.n.i();
        afty.k();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onViewStateRestored */
    public final void m674lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        this.n.i();
        try {
            super.m674lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
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

    @Override // defpackage.acwk
    protected final abfv p() {
        return peer().h;
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final adfk peer() {
        adfk adfkVar = this.k;
        if (adfkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.o) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adfkVar;
    }

    @Override // defpackage.adfp
    protected final /* bridge */ /* synthetic */ afpu r() {
        return new afpk(this, true);
    }

    @Override // defpackage.afvj
    public final void setAnimationRef(afwn afwnVar, boolean z) {
        this.n.g(afwnVar, z);
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

    @Override // defpackage.afvj
    public final void setBackPressRef(afwn afwnVar) {
        this.n.d = afwnVar;
    }

    @Override // defpackage.cc
    public final void setEnterTransition(Object obj) {
        afts aftsVar = this.n;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setEnterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setExitTransition(Object obj) {
        afts aftsVar = this.n;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setExitTransition(obj);
    }

    @Override // defpackage.cc
    public final void setReenterTransition(Object obj) {
        afts aftsVar = this.n;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setReenterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.cc
    public final void setReturnTransition(Object obj) {
        afts aftsVar = this.n;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setReturnTransition(obj);
    }

    @Override // defpackage.cc
    public final void setSharedElementEnterTransition(Object obj) {
        afts aftsVar = this.n;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    @Override // defpackage.cc
    public final void setSharedElementReturnTransition(Object obj) {
        afts aftsVar = this.n;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    @Override // defpackage.cc
    public final void startActivity(Intent intent) {
        aguu.at(intent, getContext());
        super.startActivity(intent);
    }

    @Override // defpackage.cc
    public final void startActivity(Intent intent, Bundle bundle) {
        aguu.at(intent, getContext());
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.adfp, defpackage.cc
    public final void onAttach(Activity activity) {
        this.n.i();
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
