package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rkf extends rkb implements afnb, afpd, afvj {
    private rkg k;
    private Context l;
    private final boh m = new boh(this);
    private final afts n = new afts(this);
    private boolean o;

    @Deprecated
    public rkf() {
        qpj.c();
    }

    @Override // defpackage.aevy, defpackage.bp
    public final void dismiss() {
        afvn afvnVarH = afty.h();
        try {
            super.dismiss();
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

    @Override // defpackage.rkb, defpackage.cc
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
        return rkg.class;
    }

    @Override // defpackage.aevy, defpackage.bp
    public final void iN() {
        afvn afvnVarH = afty.h();
        try {
            super.iN();
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

    @Override // defpackage.rkb
    protected final /* synthetic */ auom j() {
        return new afpl(this);
    }

    @Override // defpackage.adyw
    protected final int l() {
        return 0;
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final rkg peer() {
        rkg rkgVar = this.k;
        if (rkgVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.o) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return rkgVar;
    }

    @Override // defpackage.adyw
    protected final Optional n() {
        rkg rkgVarPeer = peer();
        rkf rkfVar = rkgVarPeer.a;
        adyj adyjVar = new adyj(rkfVar.requireContext().getString(R.string.turn_off_incognito));
        int iA = rkgVarPeer.e.a(aliz.INCOGNITO_CIRCLE);
        if (iA == 0) {
            iA = R.drawable.yt_outline_experimental_incognito_vd_theme_24;
        }
        adyjVar.f = rkfVar.requireContext().getDrawable(iA);
        adyjVar.c = new rhl(rkgVarPeer, 16);
        adyk adykVar = rkgVarPeer.d;
        new adly();
        adykVar.d(adyjVar);
        return Optional.of(adykVar.a);
    }

    @Override // defpackage.adyw
    protected final Optional o() {
        peer();
        return Optional.empty();
    }

    @Override // defpackage.adyw, defpackage.cc
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

    @Override // defpackage.rkb, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        this.n.i();
        try {
            if (this.o) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.k == null) {
                rkh rkhVar = (rkh) aguu.as(this, rkh.class);
                afuu afuuVarE = afwt.e(48, rkf.class, "CreatePeer");
                try {
                    this.k = rkhVar.c();
                    afuuVarE.close();
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

    @Override // defpackage.adyw, defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        apzh apzhVar;
        afvn afvnVarE = this.n.e("DialogFragment:onCancel");
        try {
            super.onCancel(dialogInterface);
            rkg rkgVarPeer = peer();
            dialogInterface.getClass();
            ajwo ajwoVar = rkgVarPeer.g;
            ajwo ajwoVar2 = null;
            if (ajwoVar != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            } else {
                apzhVar = null;
            }
            if (apzhVar != null && (apzhVar.b & SemanticState.Focused) != 0 && (ajwoVar2 = apzhVar.f) == null) {
                ajwoVar2 = ajwo.a;
            }
            if (ajwoVar2 != null) {
                rkgVarPeer.c.a(ajwoVar2);
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

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.n.i();
        try {
            super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
            rkg rkgVarPeer = peer();
            if (bundle == null) {
                bundle = rkgVarPeer.a.getArguments();
            }
            ajwo ajwoVarB = vxg.b(bundle != null ? bundle.getByteArray("endpoint") : null);
            rkgVarPeer.g = true != awrc.c(ajwoVarB, ajwo.a) ? ajwoVarB : null;
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

    @Override // defpackage.adyw, defpackage.cc
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

    @Override // defpackage.adyw, defpackage.cc
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

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
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
            rkg rkgVarPeer = peer();
            dialogInterface.getClass();
            rkgVarPeer.b.a();
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

    @Override // defpackage.rkb, defpackage.bp, defpackage.cc
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

    @Override // defpackage.adyw, defpackage.cc
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

    @Override // defpackage.adyw, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        this.n.i();
        try {
            super.m668x22bc4f96(bundle);
            rkg rkgVarPeer = peer();
            bundle.getClass();
            ajwo ajwoVar = rkgVarPeer.g;
            if (ajwoVar != null) {
                bundle.putByteArray("endpoint", ajwoVar.toByteArray());
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

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        this.n.i();
        try {
            super.onStart();
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

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        this.n.i();
        try {
            super.onStop();
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

    @Override // defpackage.adyw
    protected final Optional p() {
        peer();
        return Optional.empty();
    }

    @Override // defpackage.adyw
    protected final Optional q() {
        peer();
        return Optional.empty();
    }

    @Override // defpackage.afvj
    public final void setAnimationRef(afwn afwnVar, boolean z) {
        this.n.g(afwnVar, z);
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

    @Override // defpackage.rkb, defpackage.cc
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
