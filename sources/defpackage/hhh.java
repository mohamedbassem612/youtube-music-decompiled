package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hhh extends hhl implements afnb, afpd, afvj {
    private hhj k;
    private Context l;
    private final boh m = new boh(this);
    private final afts n = new afts(this);
    private boolean o;

    @Deprecated
    public hhh() {
        qpj.c();
    }

    @Override // defpackage.iyu, defpackage.bp
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

    @Override // defpackage.hhl, defpackage.cc
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
        return hhj.class;
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final hhj peer() {
        hhj hhjVar = this.k;
        if (hhjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.o) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return hhjVar;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        super.iH(bundle);
        hhj hhjVarPeer = peer();
        hhh hhhVar = hhjVarPeer.b;
        cf cfVarRequireActivity = hhhVar.requireActivity();
        Intent intent = cfVarRequireActivity.getIntent();
        if (intent == null) {
            throw new IllegalStateException("Intent is null.");
        }
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra == null) {
            throw new IllegalStateException("Package name is null.");
        }
        String stringExtra2 = intent.getStringExtra("referring_app_name");
        if (stringExtra2 == null) {
            throw new IllegalStateException("App name is null.");
        }
        View viewInflate = LayoutInflater.from(cfVarRequireActivity).inflate(R.layout.consent_dialog, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.consent_dialog_body1)).setText(hhhVar.getString(R.string.consent_dialog_body1, stringExtra2));
        ((TextView) viewInflate.findViewById(R.id.consent_dialog_body2)).setMovementMethod(LinkMovementMethod.getInstance());
        int dimensionPixelSize = hhhVar.getResources().getDimensionPixelSize(R.dimen.consent_dialog_button_height);
        TextView textView = (TextView) viewInflate.findViewById(R.id.consent_dialog_cancel_button);
        textView.setText(android.R.string.cancel);
        textView.setHeight(dimensionPixelSize);
        textView.setOnClickListener(new gdp(hhjVarPeer, (Activity) cfVarRequireActivity, 4));
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.consent_dialog_ok_button);
        textView2.setText(android.R.string.ok);
        textView2.setHeight(dimensionPixelSize);
        textView2.setOnClickListener(new ivx(hhjVarPeer, stringExtra, (Activity) cfVarRequireActivity, 1));
        fu fuVar = new fu(cfVarRequireActivity);
        fuVar.setView(viewInflate);
        fv fvVarCreate = fuVar.create();
        Window window = fvVarCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.consent_dialog_background);
        }
        return fvVarCreate;
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

    @Override // defpackage.hhl
    protected final /* bridge */ /* synthetic */ afpu j() {
        return new afpk(this, true);
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

    @Override // defpackage.hhl, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        this.n.i();
        try {
            if (this.o) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.k == null) {
                hhk hhkVar = (hhk) aguu.as(this, hhk.class);
                afuu afuuVarE = afwt.e(11, hhh.class, "CreatePeer");
                try {
                    this.k = hhkVar.b();
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
            peer();
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

    @Override // defpackage.hhl, defpackage.bp, defpackage.cc
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

    @Override // defpackage.hhl, defpackage.cc
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
