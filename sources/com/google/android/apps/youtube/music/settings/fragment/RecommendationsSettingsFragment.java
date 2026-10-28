package com.google.android.apps.youtube.music.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.music.R;
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
import defpackage.apqs;
import defpackage.apqt;
import defpackage.apqu;
import defpackage.aprb;
import defpackage.aprv;
import defpackage.aprw;
import defpackage.auom;
import defpackage.boc;
import defpackage.boh;
import defpackage.bpl;
import defpackage.bpp;
import defpackage.cf;
import defpackage.fl;
import defpackage.fx;
import defpackage.iot;
import defpackage.ipt;
import defpackage.ipu;
import defpackage.nh;
import defpackage.qpj;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RecommendationsSettingsFragment extends TikTok_RecommendationsSettingsFragment implements afnb, afpd, afvj {
    private Context componentContext;
    private boolean isPeerDestroyed;
    private ipt peer;
    private final boh tracedLifecycleRegistry = new boh(this);
    private final afts fragmentCallbacksTraceManager = new afts(this);

    @Deprecated
    public RecommendationsSettingsFragment() {
        qpj.c();
    }

    static RecommendationsSettingsFragment create(affd affdVar) {
        RecommendationsSettingsFragment recommendationsSettingsFragment = new RecommendationsSettingsFragment();
        auom.f(recommendationsSettingsFragment);
        afpu.e(recommendationsSettingsFragment, affdVar);
        return recommendationsSettingsFragment;
    }

    private void createPeer() {
        ipu ipuVar = (ipu) aguu.as(this, ipu.class);
        afuu afuuVarE = afwt.e(24, RecommendationsSettingsFragment.class, "CreatePeer");
        try {
            this.peer = ipuVar.k();
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
    static RecommendationsSettingsFragment createWithoutAccount() {
        RecommendationsSettingsFragment recommendationsSettingsFragment = new RecommendationsSettingsFragment();
        auom.f(recommendationsSettingsFragment);
        afpu.f(recommendationsSettingsFragment);
        return recommendationsSettingsFragment;
    }

    @Deprecated
    public Context componentContext() {
        if (this.componentContext == null) {
            this.componentContext = new afpe(this, super.getContext());
        }
        return this.componentContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_RecommendationsSettingsFragment
    public afpk createComponentManager() {
        return new afpk(this, true);
    }

    @Override // defpackage.afvj
    public afwn getAnimationRef() {
        return (afwn) this.fragmentCallbacksTraceManager.c;
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_RecommendationsSettingsFragment, defpackage.cc
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_RecommendationsSettingsFragment, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.tracedLifecycleRegistry;
    }

    @Override // defpackage.afnb
    public Class getPeerClass() {
        return ipt.class;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.fragmentCallbacksTraceManager.i();
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_RecommendationsSettingsFragment, defpackage.cc
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
        fl supportActionBar;
        apqt apqtVarL;
        Preference preferenceB;
        ipt iptVarPeer = peer();
        RecommendationsSettingsFragment recommendationsSettingsFragment = iptVarPeer.a;
        recommendationsSettingsFragment.getPreferenceManager().f("youtube");
        recommendationsSettingsFragment.setPreferencesFromResource(R.xml.recommendations_settings, str);
        PreferenceCategory preferenceCategory = (PreferenceCategory) recommendationsSettingsFragment.findPreference("pref_key_settings_music_top_level");
        if (preferenceCategory != null) {
            preferenceCategory.p();
            iot iotVar = (iot) recommendationsSettingsFragment.getActivity();
            if (iotVar != null && (apqtVarL = iotVar.l(aprv.SETTING_CAT_MUSIC_TOP_LEVEL)) != null) {
                for (apqu apquVar : apqtVarL.d) {
                    if ((apquVar.b & 2) != 0) {
                        apqs apqsVar = apquVar.d;
                        if (apqsVar == null) {
                            apqsVar = apqs.a;
                        }
                        aprw aprwVarA = aprw.a(apqsVar.c);
                        if (aprwVarA == null) {
                            aprwVarA = aprw.SETTING_ITEM_ID_UNKNOWN;
                        }
                        if (aprwVarA != aprw.MUSIC_DYNAMIC_QUEUE) {
                            apqs apqsVar2 = apquVar.d;
                            if (apqsVar2 == null) {
                                apqsVar2 = apqs.a;
                            }
                            aprw aprwVarA2 = aprw.a(apqsVar2.c);
                            if (aprwVarA2 == null) {
                                aprwVarA2 = aprw.SETTING_ITEM_ID_UNKNOWN;
                            }
                            if (aprwVarA2 != aprw.ENABLE_CROSS_DEVICE_QUEUE_RESTORATION_ON_SHARED_DEVICE) {
                            }
                        }
                    }
                    aprb aprbVar = apquVar.h;
                    if (aprbVar == null) {
                        aprbVar = aprb.a;
                    }
                    aprw aprwVarA3 = aprw.a(aprbVar.b);
                    if (aprwVarA3 == null) {
                        aprwVarA3 = aprw.SETTING_ITEM_ID_UNKNOWN;
                    }
                    if (aprwVarA3 != aprw.MUSIC_VOICE_LANGUAGE && (preferenceB = iptVarPeer.b.b(apquVar)) != null) {
                        preferenceCategory.ah(preferenceB);
                    }
                }
            }
        }
        fx fxVar = (fx) recommendationsSettingsFragment.getActivity();
        if (fxVar == null || (supportActionBar = fxVar.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.f(new ColorDrawable(recommendationsSettingsFragment.getContext().getColor(R.color.black_header_color)));
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_RecommendationsSettingsFragment, defpackage.cc
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
        Window window;
        this.fragmentCallbacksTraceManager.i();
        try {
            super.onStart();
            RecommendationsSettingsFragment recommendationsSettingsFragment = peer().a;
            cf activity = recommendationsSettingsFragment.getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setStatusBarColor(recommendationsSettingsFragment.getContext().getColor(R.color.black_header_color));
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
    public ipt peer() {
        ipt iptVar = this.peer;
        if (iptVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.isPeerDestroyed) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iptVar;
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_RecommendationsSettingsFragment, defpackage.cc
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
