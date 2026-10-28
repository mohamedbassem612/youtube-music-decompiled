package com.google.android.apps.youtube.music.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.preference.PreferenceScreen;
import defpackage.affd;
import defpackage.afnb;
import defpackage.afox;
import defpackage.afpd;
import defpackage.afpe;
import defpackage.afpk;
import defpackage.afpu;
import defpackage.afts;
import defpackage.afty;
import defpackage.afuu;
import defpackage.afvj;
import defpackage.afvn;
import defpackage.afwn;
import defpackage.afwt;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.aihf;
import defpackage.alos;
import defpackage.alot;
import defpackage.alou;
import defpackage.antn;
import defpackage.auom;
import defpackage.boc;
import defpackage.boh;
import defpackage.bpd;
import defpackage.bpl;
import defpackage.bpp;
import defpackage.bpt;
import defpackage.bpv;
import defpackage.iot;
import defpackage.ipr;
import defpackage.ips;
import defpackage.nh;
import defpackage.qpj;
import defpackage.xeu;
import defpackage.xff;
import defpackage.ztf;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyPrefsFragmentCompat extends TikTok_PrivacyPrefsFragmentCompat implements afnb, afpd, afvj {
    private Context componentContext;
    private boolean isPeerDestroyed;
    private ipr peer;
    private final boh tracedLifecycleRegistry = new boh(this);
    private final afts fragmentCallbacksTraceManager = new afts(this);

    @Deprecated
    public PrivacyPrefsFragmentCompat() {
        qpj.c();
    }

    static PrivacyPrefsFragmentCompat create(affd affdVar) {
        PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat = new PrivacyPrefsFragmentCompat();
        auom.f(privacyPrefsFragmentCompat);
        afpu.e(privacyPrefsFragmentCompat, affdVar);
        return privacyPrefsFragmentCompat;
    }

    private void createPeer() {
        ips ipsVar = (ips) aguu.as(this, ips.class);
        afuu afuuVarE = afwt.e(23, PrivacyPrefsFragmentCompat.class, "CreatePeer");
        try {
            this.peer = ipsVar.j();
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

    @Deprecated
    static PrivacyPrefsFragmentCompat createWithoutAccount() {
        PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat = new PrivacyPrefsFragmentCompat();
        auom.f(privacyPrefsFragmentCompat);
        afpu.f(privacyPrefsFragmentCompat);
        return privacyPrefsFragmentCompat;
    }

    @Deprecated
    public Context componentContext() {
        if (this.componentContext == null) {
            this.componentContext = new afpe(this, super.getContext());
        }
        return this.componentContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PrivacyPrefsFragmentCompat
    public afpk createComponentManager() {
        return new afpk(this, true);
    }

    @Override // defpackage.afvj
    public afwn getAnimationRef() {
        return (afwn) this.fragmentCallbacksTraceManager.c;
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PrivacyPrefsFragmentCompat, defpackage.cc
    public Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return componentContext();
    }

    @Override // defpackage.afpd
    public Locale getCustomLocale() {
        return aguu.au(this);
    }

    @Override // defpackage.cc, defpackage.bny
    public bpt getDefaultViewModelCreationExtras() {
        bpv bpvVar = new bpv(super.getDefaultViewModelCreationExtras());
        bpvVar.b(bpd.c, new Bundle());
        return bpvVar;
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PrivacyPrefsFragmentCompat, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.tracedLifecycleRegistry;
    }

    @Override // defpackage.afnb
    public Class getPeerClass() {
        return ipr.class;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
        try {
            super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
            ipr iprVarPeer = peer();
            PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat = iprVarPeer.a;
            if (privacyPrefsFragmentCompat.getActivity() != null) {
                ((iot) privacyPrefsFragmentCompat.getActivity()).n(iprVarPeer);
            }
            iprVarPeer.b.g();
            aihf aihfVarCreateBuilder = antn.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            antn antnVar = (antn) aihfVarCreateBuilder.instance;
            antnVar.c = 2;
            antnVar.b |= 1;
            xeu xeuVar = iprVarPeer.c;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_PERSISTENT_CACHE_CLEARED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                antn antnVar2 = (antn) aihfVarCreateBuilder.build();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                antnVar2.getClass();
                alouVar.d = antnVar2;
                alouVar.c = 155;
                xeuVar.b((alou) alosVar.build());
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
    public void onActivityResult(int i, int i2, Intent intent) {
        afvn afvnVarA = this.fragmentCallbacksTraceManager.a("Fragment:onActivityResult");
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PrivacyPrefsFragmentCompat, defpackage.cc
    public void onAttach(Context context) {
        this.fragmentCallbacksTraceManager.i();
        try {
            if (this.isPeerDestroyed) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.onAttach(context);
            if (this.peer == null) {
                createPeer();
                super.getLifecycle().b(new afox(this.fragmentCallbacksTraceManager, this.tracedLifecycleRegistry));
            }
            bpp parentFragment = getParentFragment();
            if (parentFragment instanceof afvj) {
                afts aftsVar = this.fragmentCallbacksTraceManager;
                if (aftsVar.c == null) {
                    aftsVar.g(((afvj) parentFragment).getAnimationRef(), true);
                }
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

    @Override // defpackage.dky, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
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

    @Override // defpackage.dky
    protected nh onCreateAdapter(PreferenceScreen preferenceScreen) {
        return super.onCreateAdapter(preferenceScreen);
    }

    @Override // defpackage.cc
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        this.fragmentCallbacksTraceManager.h(i, i2);
        afty.k();
        return null;
    }

    @Override // defpackage.dky
    public void onCreatePreferences(Bundle bundle, String str) {
        peer().a.getPreferenceManager().f("youtube");
    }

    @Override // com.google.android.apps.youtube.music.ui.preference.CustomPreferenceFragmentCompat, defpackage.dky, defpackage.cc
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
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
    public void onDestroy() {
        afvn afvnVarC = this.fragmentCallbacksTraceManager.c();
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

    @Override // defpackage.dky, defpackage.cc
    public void onDestroyView() {
        afvn afvnVarC = this.fragmentCallbacksTraceManager.c();
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

    @Override // defpackage.cc
    public void onDetach() {
        afvn afvnVarB = this.fragmentCallbacksTraceManager.b();
        try {
            super.onDetach();
            this.isPeerDestroyed = true;
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PrivacyPrefsFragmentCompat, defpackage.cc
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
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
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.fragmentCallbacksTraceManager.a("Fragment:onOptionsItemSelected").close();
        return false;
    }

    @Override // defpackage.cc
    public void onPause() {
        this.fragmentCallbacksTraceManager.i();
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
    public void onResume() {
        afvn afvnVarC = this.fragmentCallbacksTraceManager.c();
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

    @Override // defpackage.dky, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m668x22bc4f96(Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
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

    @Override // defpackage.dky, defpackage.cc
    public void onStart() {
        this.fragmentCallbacksTraceManager.i();
        try {
            super.onStart();
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

    @Override // defpackage.dky, defpackage.cc
    public void onStop() {
        this.fragmentCallbacksTraceManager.i();
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

    @Override // defpackage.dky, defpackage.cc
    public void onViewCreated(View view, Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
        try {
            super.onViewCreated(view, bundle);
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
    /* JADX INFO: renamed from: onViewStateRestored */
    public void m674lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
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

    @Override // defpackage.afnb
    public ipr peer() {
        ipr iprVar = this.peer;
        if (iprVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.isPeerDestroyed) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iprVar;
    }

    @Override // defpackage.afvj
    public void setAnimationRef(afwn afwnVar, boolean z) {
        this.fragmentCallbacksTraceManager.g(afwnVar, z);
    }

    @Override // defpackage.cc
    public void setArguments(Bundle bundle) {
        boolean z = true;
        if (getArguments() != null && getArguments() != bundle) {
            z = false;
        }
        ahno.P(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.setArguments(bundle);
    }

    @Override // defpackage.afvj
    public void setBackPressRef(afwn afwnVar) {
        this.fragmentCallbacksTraceManager.d = afwnVar;
    }

    @Override // defpackage.cc
    public void setEnterTransition(Object obj) {
        afts aftsVar = this.fragmentCallbacksTraceManager;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setEnterTransition(obj);
    }

    @Override // defpackage.cc
    public void setExitTransition(Object obj) {
        afts aftsVar = this.fragmentCallbacksTraceManager;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setExitTransition(obj);
    }

    @Override // defpackage.cc
    public void setReenterTransition(Object obj) {
        afts aftsVar = this.fragmentCallbacksTraceManager;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setReenterTransition(obj);
    }

    @Override // defpackage.cc
    public void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.cc
    public void setReturnTransition(Object obj) {
        afts aftsVar = this.fragmentCallbacksTraceManager;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setReturnTransition(obj);
    }

    @Override // defpackage.cc
    public void setSharedElementEnterTransition(Object obj) {
        afts aftsVar = this.fragmentCallbacksTraceManager;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    @Override // defpackage.cc
    public void setSharedElementReturnTransition(Object obj) {
        afts aftsVar = this.fragmentCallbacksTraceManager;
        if (aftsVar != null) {
            aftsVar.f(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    @Override // defpackage.cc
    public void startActivity(Intent intent) {
        aguu.at(intent, getContext());
        super.startActivity(intent);
    }

    @Override // defpackage.cc
    public void startActivity(Intent intent, Bundle bundle) {
        aguu.at(intent, getContext());
        super.startActivity(intent, bundle);
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PrivacyPrefsFragmentCompat, defpackage.cc
    public void onAttach(Activity activity) {
        this.fragmentCallbacksTraceManager.i();
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
