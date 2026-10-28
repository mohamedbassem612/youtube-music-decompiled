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
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.youtube.music.R;
import defpackage.aazo;
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
import defpackage.ameb;
import defpackage.auom;
import defpackage.boc;
import defpackage.boh;
import defpackage.bpl;
import defpackage.bpp;
import defpackage.cf;
import defpackage.fl;
import defpackage.fx;
import defpackage.gzj;
import defpackage.iot;
import defpackage.ipn;
import defpackage.ipo;
import defpackage.ipp;
import defpackage.jkp;
import defpackage.nh;
import defpackage.qpj;
import defpackage.vxz;
import defpackage.wiu;
import defpackage.wja;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xhb;
import defpackage.ytv;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackSettingsFragment extends TikTok_PlaybackSettingsFragment implements afnb, afpd, afvj {
    private Context componentContext;
    private boolean isPeerDestroyed;
    private ipo peer;
    private final boh tracedLifecycleRegistry = new boh(this);
    private final afts fragmentCallbacksTraceManager = new afts(this);

    @Deprecated
    public PlaybackSettingsFragment() {
        qpj.c();
    }

    static PlaybackSettingsFragment create(affd affdVar) {
        PlaybackSettingsFragment playbackSettingsFragment = new PlaybackSettingsFragment();
        auom.f(playbackSettingsFragment);
        afpu.e(playbackSettingsFragment, affdVar);
        return playbackSettingsFragment;
    }

    private void createPeer() {
        ipp ippVar = (ipp) aguu.as(this, ipp.class);
        afuu afuuVarE = afwt.e(22, PlaybackSettingsFragment.class, "CreatePeer");
        try {
            this.peer = ippVar.i();
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
    static PlaybackSettingsFragment createWithoutAccount() {
        PlaybackSettingsFragment playbackSettingsFragment = new PlaybackSettingsFragment();
        auom.f(playbackSettingsFragment);
        afpu.f(playbackSettingsFragment);
        return playbackSettingsFragment;
    }

    @Deprecated
    public Context componentContext() {
        if (this.componentContext == null) {
            this.componentContext = new afpe(this, super.getContext());
        }
        return this.componentContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PlaybackSettingsFragment
    public afpk createComponentManager() {
        return new afpk(this, false);
    }

    @Override // defpackage.afvj
    public afwn getAnimationRef() {
        return (afwn) this.fragmentCallbacksTraceManager.c;
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PlaybackSettingsFragment, defpackage.cc
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PlaybackSettingsFragment, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.tracedLifecycleRegistry;
    }

    @Override // defpackage.afnb
    public Class getPeerClass() {
        return ipo.class;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        iot iotVar;
        this.fragmentCallbacksTraceManager.i();
        try {
            super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
            ipo ipoVarPeer = peer();
            if (ipoVarPeer.g.l(248, 45805953L, false) && (iotVar = (iot) ipoVarPeer.b.getActivity()) != null) {
                iotVar.n(ipoVarPeer);
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PlaybackSettingsFragment, defpackage.cc
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
        ipo ipoVarPeer = peer();
        PlaybackSettingsFragment playbackSettingsFragment = ipoVarPeer.b;
        playbackSettingsFragment.getPreferenceManager().f("youtube");
        playbackSettingsFragment.setPreferencesFromResource(R.xml.playback_settings, str);
        ipoVarPeer.f = (PreferenceCategory) playbackSettingsFragment.findPreference("pref_key_settings_general");
        if ((ipoVarPeer.c.o().c.g(wja.c, wiu.c).a & 16) == 0 || !ipoVarPeer.h.a()) {
            ipoVarPeer.a("equalizer");
        }
        vxz vxzVar = ipoVarPeer.g;
        int i = 0;
        if (!vxzVar.l(248, 45805953L, false)) {
            ipoVarPeer.b();
        }
        jkp jkpVar = ipoVarPeer.e;
        String strB = jkpVar.b(gzj.AUTOPLAY_ENABLED);
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) playbackSettingsFragment.findPreference(strB);
        if (switchPreferenceCompat != null) {
            if (vxzVar.l(241, 45799010L, false)) {
                switchPreferenceCompat.k(jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, true));
                switchPreferenceCompat.n = new ipn(ipoVarPeer, i);
            } else {
                ipoVarPeer.a(strB);
            }
        }
        fx fxVar = (fx) playbackSettingsFragment.getActivity();
        if (fxVar == null || (supportActionBar = fxVar.getSupportActionBar()) == null || playbackSettingsFragment.getContext() == null) {
            return;
        }
        supportActionBar.f(new ColorDrawable(playbackSettingsFragment.getContext().getColor(R.color.black_header_color)));
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
        iot iotVar;
        afvn afvnVarC = this.fragmentCallbacksTraceManager.c();
        try {
            super.onDestroy();
            ipo ipoVarPeer = peer();
            if (ipoVarPeer.g.l(248, 45805953L, false) && (iotVar = (iot) ipoVarPeer.b.getActivity()) != null) {
                iotVar.q(ipoVarPeer);
            }
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PlaybackSettingsFragment, defpackage.cc
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

    @Override // defpackage.dky, defpackage.dlf
    public boolean onPreferenceTreeClick(Preference preference) {
        String str;
        super.onPreferenceTreeClick(preference);
        ipo ipoVarPeer = peer();
        if (preference == null || (str = preference.t) == null || !"equalizer".equals(str)) {
            return false;
        }
        xgn xgnVar = ipoVarPeer.d;
        if (xgnVar != null) {
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(56666)), null);
        }
        aazo aazoVar = ipoVarPeer.h;
        if (aazoVar.a()) {
            Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
            intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
            int i = ((ytv) aazoVar.b).d.d;
            if (i > 0) {
                intent.putExtra("android.media.extra.AUDIO_SESSION", i);
            }
            ((Activity) aazoVar.a).startActivityForResult(intent, 440);
        }
        return true;
    }

    @Override // defpackage.cc
    public void onResume() {
        afvn afvnVarC = this.fragmentCallbacksTraceManager.c();
        try {
            super.onResume();
            ipo ipoVarPeer = peer();
            xgn xgnVar = ipoVarPeer.d;
            if (xgnVar != null && ipoVarPeer.b.findPreference("equalizer") != null) {
                xgnVar.l(new xgj(xhb.b(56666)));
            }
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
            PlaybackSettingsFragment playbackSettingsFragment = peer().b;
            cf activity = playbackSettingsFragment.getActivity();
            if (activity != null && (window = activity.getWindow()) != null && playbackSettingsFragment.getContext() != null) {
                window.setStatusBarColor(playbackSettingsFragment.getContext().getColor(R.color.black_header_color));
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
    public ipo peer() {
        ipo ipoVar = this.peer;
        if (ipoVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.isPeerDestroyed) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ipoVar;
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_PlaybackSettingsFragment, defpackage.cc
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
