package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Optional;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpk extends xpj implements afnb, afpd, afvj {
    private xpl k;
    private Context l;
    private final boh m = new boh(this);
    private final afts n = new afts(this);
    private boolean o;

    @Deprecated
    public xpk() {
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

    @Override // defpackage.xpj, defpackage.cc
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
        return xpl.class;
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

    @Override // defpackage.xpj
    protected final /* synthetic */ auom j() {
        return new afpl(this);
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final xpl peer() {
        xpl xplVar = this.k;
        if (xplVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.o) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return xplVar;
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

    @Override // defpackage.xpj, defpackage.bp, defpackage.cc
    public final void onAttach(Context context) {
        this.n.i();
        try {
            if (this.o) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.k == null) {
                xpm xpmVar = (xpm) aguu.as(this, xpm.class);
                afuu afuuVarE = afwt.e(85, xpk.class, "CreatePeer");
                try {
                    this.k = xpmVar.j();
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

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xpl xplVarPeer = peer();
        configuration.getClass();
        if (configuration.orientation == 2) {
            ((bp) xplVarPeer.a).dismiss();
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.n.i();
        try {
            super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
            ((bp) peer().a).iO(0, R.style.Theme.Translucent.NoTitleBar.Fullscreen);
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
        xgn xgnVarHB;
        this.n.i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            xpl xplVarPeer = peer();
            layoutInflater.getClass();
            Object obj = xplVarPeer.a;
            boolean z = false;
            View viewInflate = layoutInflater.cloneInContext(((cc) obj).requireActivity()).inflate(com.google.android.apps.youtube.music.R.layout.lnp_permission_prompt, viewGroup, false);
            LayoutInflater.Factory activity = ((cc) obj).getActivity();
            xgm xgmVar = activity instanceof xgm ? (xgm) activity : null;
            if (xgmVar == null || (xgnVarHB = xgmVar.hB()) == null) {
                xgnVarHB = xgn.l;
            }
            xgnVarHB.b(xhb.a(108035), null, null);
            TypedValue typedValue = new TypedValue();
            Context contextRequireContext = ((cc) obj).requireContext();
            if (contextRequireContext.getTheme().resolveAttribute(com.google.android.apps.youtube.music.R.attr.ytThemeType, typedValue, true) && typedValue.data == 1) {
                z = true;
            }
            ImageView imageView = (ImageView) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.lnp_permission_icon);
            if (z) {
                imageView.setImageResource(com.google.android.apps.youtube.music.R.drawable.mdx_local_network_permissions_dark);
            } else {
                imageView.setImageResource(com.google.android.apps.youtube.music.R.drawable.mdx_local_network_permissions_light);
            }
            ((TextView) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.go_to_settings_button)).setOnClickListener(new vhv(xplVarPeer, 20));
            ((TextView) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.dismiss_button)).setOnClickListener(new xpr(xplVarPeer, 1));
            if (awrc.c(((Optional) xplVarPeer.b).orElse(Boolean.FALSE), Boolean.TRUE)) {
                ((TextView) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.lnp_permission_title)).setText(com.google.android.apps.youtube.music.R.string.lnp_permission_prompt_title_music);
                ((TextView) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.lnp_permission_subtitle)).setText(com.google.android.apps.youtube.music.R.string.lnp_permission_prompt_subtitle_music);
                ((TextView) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.lnp_permission_subtitle)).setContentDescription(contextRequireContext.getString(com.google.android.apps.youtube.music.R.string.lnp_permission_prompt_subtitle_content_description_music));
            }
            viewInflate.getClass();
            afty.k();
            return viewInflate;
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

    @Override // defpackage.xpj, defpackage.bp, defpackage.cc
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
        Window window;
        this.n.i();
        try {
            super.onStart();
            Dialog dialog = ((bp) peer().a).f;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                azz.c(window, false);
                zf zfVar = new zf(window, window.getDecorView());
                zfVar.b(519);
                zfVar.e();
                window.setLayout(-1, -1);
                window.setBackgroundDrawableResource(R.color.transparent);
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

    @Override // defpackage.xpj, defpackage.cc
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
