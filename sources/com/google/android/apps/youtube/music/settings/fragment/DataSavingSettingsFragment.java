package com.google.android.apps.youtube.music.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
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
import defpackage.amcx;
import defpackage.amdd;
import defpackage.ameb;
import defpackage.anki;
import defpackage.auom;
import defpackage.axfd;
import defpackage.boc;
import defpackage.bog;
import defpackage.boh;
import defpackage.bpl;
import defpackage.bpp;
import defpackage.fl;
import defpackage.fx;
import defpackage.gzj;
import defpackage.igt;
import defpackage.iny;
import defpackage.ipb;
import defpackage.ipc;
import defpackage.iqp;
import defpackage.jkp;
import defpackage.nh;
import defpackage.qpj;
import defpackage.taf;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xhb;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class DataSavingSettingsFragment extends TikTok_DataSavingSettingsFragment implements afnb, afpd, afvj {
    private Context componentContext;
    private boolean isPeerDestroyed;
    private ipb peer;
    private final boh tracedLifecycleRegistry = new boh(this);
    private final afts fragmentCallbacksTraceManager = new afts(this);

    @Deprecated
    public DataSavingSettingsFragment() {
        qpj.c();
    }

    static DataSavingSettingsFragment create(affd affdVar) {
        DataSavingSettingsFragment dataSavingSettingsFragment = new DataSavingSettingsFragment();
        auom.f(dataSavingSettingsFragment);
        afpu.e(dataSavingSettingsFragment, affdVar);
        return dataSavingSettingsFragment;
    }

    private void createPeer() {
        ipc ipcVar = (ipc) aguu.as(this, ipc.class);
        afuu afuuVarE = afwt.e(17, DataSavingSettingsFragment.class, "CreatePeer");
        try {
            this.peer = ipcVar.d();
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
    static DataSavingSettingsFragment createWithoutAccount() {
        DataSavingSettingsFragment dataSavingSettingsFragment = new DataSavingSettingsFragment();
        auom.f(dataSavingSettingsFragment);
        afpu.f(dataSavingSettingsFragment);
        return dataSavingSettingsFragment;
    }

    @Deprecated
    public Context componentContext() {
        if (this.componentContext == null) {
            this.componentContext = new afpe(this, super.getContext());
        }
        return this.componentContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_DataSavingSettingsFragment
    public afpk createComponentManager() {
        return new afpk(this, false);
    }

    @Override // defpackage.afvj
    public afwn getAnimationRef() {
        return (afwn) this.fragmentCallbacksTraceManager.c;
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_DataSavingSettingsFragment, defpackage.cc
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_DataSavingSettingsFragment, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.tracedLifecycleRegistry;
    }

    @Override // defpackage.afnb
    public Class getPeerClass() {
        return ipb.class;
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_DataSavingSettingsFragment, defpackage.cc
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

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, zwb] */
    @Override // defpackage.dky
    public void onCreatePreferences(Bundle bundle, String str) {
        fl supportActionBar;
        ipb ipbVarPeer = peer();
        DataSavingSettingsFragment dataSavingSettingsFragment = ipbVarPeer.b;
        dataSavingSettingsFragment.getPreferenceManager().f("youtube");
        dataSavingSettingsFragment.setPreferencesFromResource(R.xml.data_saving_settings, str);
        ipbVarPeer.h = (PreferenceCategory) dataSavingSettingsFragment.findPreference("pref_key_settings_general");
        if (!ipbVarPeer.c.getBoolean(gzj.STREAM_OVER_WIFI_ONLY, false)) {
            axfd axfdVar = ipbVarPeer.k;
            anki ankiVarAp = axfdVar.ap(axfdVar.b.e());
            if (ankiVarAp == null || !ankiVarAp.i) {
                ipbVarPeer.a(gzj.STREAM_OVER_WIFI_ONLY);
            }
        }
        if (ipbVarPeer.d.e) {
            ListPreference listPreference = (ListPreference) dataSavingSettingsFragment.getPreferenceManager().d(gzj.BITRATE_AUDIO_MOBILE);
            if (listPreference != null) {
                listPreference.p();
                listPreference.h = new CharSequence[]{"Low", "Normal", "High", "Always High"};
            }
            ListPreference listPreference2 = (ListPreference) dataSavingSettingsFragment.getPreferenceManager().d(gzj.BITRATE_AUDIO_WIFI);
            if (listPreference2 != null) {
                listPreference2.p();
                listPreference2.h = new CharSequence[]{"Low", "Normal", "High", "Always High"};
            }
        } else {
            ipbVarPeer.a(gzj.BITRATE_AUDIO_MOBILE);
            ipbVarPeer.a(gzj.BITRATE_AUDIO_WIFI);
        }
        TwoStatePreference twoStatePreference = (TwoStatePreference) dataSavingSettingsFragment.getPreferenceManager().d(gzj.DONT_PLAY_VIDEO_SETTING);
        if (twoStatePreference != null) {
            jkp jkpVar = ipbVarPeer.e;
            twoStatePreference.M(jkpVar.b(gzj.DONT_PLAY_VIDEO_SETTING));
            twoStatePreference.k(jkpVar.getBoolean(gzj.DONT_PLAY_VIDEO_SETTING, false));
            twoStatePreference.R(ipbVarPeer.j.C());
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) dataSavingSettingsFragment.getPreferenceManager().d("pref_key_dont_play_nma_video");
        if (twoStatePreference2 != null) {
            Context context = (Context) ipbVarPeer.i.a;
            twoStatePreference2.Q(context.getString(R.string.dont_play_podcast_video_setting_title));
            twoStatePreference2.n(context.getString(R.string.dont_play_podcast_video_setting_summary));
            iqp iqpVar = ipbVarPeer.g;
            twoStatePreference2.M(iqpVar.d.b("pref_key_dont_play_nma_video"));
            ListenableFuture listenableFutureA = iqpVar.a();
            igt igtVar = new igt(9);
            iny inyVar = new iny(twoStatePreference2, 6);
            bog bogVar = iqpVar.c;
            taf.k(bogVar, listenableFutureA, igtVar, inyVar);
            taf.k(bogVar, iqpVar.b(), new igt(10), new iny(twoStatePreference2, 7));
        }
        if (dataSavingSettingsFragment.getActivity() instanceof fx) {
            fx fxVar = (fx) dataSavingSettingsFragment.getActivity();
            if (dataSavingSettingsFragment.getContext() == null || (supportActionBar = fxVar.getSupportActionBar()) == null) {
                return;
            }
            supportActionBar.f(new ColorDrawable(dataSavingSettingsFragment.getContext().getColor(R.color.black_header_color)));
        }
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_DataSavingSettingsFragment, defpackage.cc
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
        SharedPreferences sharedPreferencesR;
        int i;
        SharedPreferences sharedPreferencesR2;
        super.onPreferenceTreeClick(preference);
        ipb ipbVarPeer = peer();
        if (preference != null && (str = preference.t) != null) {
            if (gzj.STREAM_OVER_WIFI_ONLY.equals(str)) {
                xgn xgnVar = ipbVarPeer.f;
                if (xgnVar != null && (sharedPreferencesR2 = preference.r()) != null) {
                    aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = amcx.a.createBuilder();
                    i = true == sharedPreferencesR2.getBoolean(gzj.STREAM_OVER_WIFI_ONLY, false) ? 2 : 3;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amcx amcxVar = (amcx) aihfVarCreateBuilder2.instance;
                    amcxVar.c = i - 1;
                    amcxVar.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                    amcx amcxVar2 = (amcx) aihfVarCreateBuilder2.build();
                    amcxVar2.getClass();
                    amddVar.l = amcxVar2;
                    amddVar.b |= 32768;
                    xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(20136)), (amdd) aihfVarCreateBuilder.build());
                }
            } else {
                jkp jkpVar = ipbVarPeer.e;
                if (jkpVar.b(gzj.DONT_PLAY_VIDEO_SETTING).equals(str)) {
                    xgn xgnVar2 = ipbVarPeer.f;
                    if (xgnVar2 != null && (sharedPreferencesR = preference.r()) != null) {
                        String strB = jkpVar.b(gzj.DONT_PLAY_VIDEO_SETTING);
                        aihf aihfVarCreateBuilder3 = amdd.a.createBuilder();
                        aihf aihfVarCreateBuilder4 = amcx.a.createBuilder();
                        i = true == sharedPreferencesR.getBoolean(strB, false) ? 2 : 3;
                        aihfVarCreateBuilder4.copyOnWrite();
                        amcx amcxVar3 = (amcx) aihfVarCreateBuilder4.instance;
                        amcxVar3.c = i - 1;
                        amcxVar3.b |= 1;
                        aihfVarCreateBuilder3.copyOnWrite();
                        amdd amddVar2 = (amdd) aihfVarCreateBuilder3.instance;
                        amcx amcxVar4 = (amcx) aihfVarCreateBuilder4.build();
                        amcxVar4.getClass();
                        amddVar2.l = amcxVar4;
                        amddVar2.b |= 32768;
                        xgnVar2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(62366)), (amdd) aihfVarCreateBuilder3.build());
                    }
                } else if (jkpVar.b("pref_key_dont_play_nma_video").equals(str)) {
                    taf.k(ipbVarPeer.b, ipbVarPeer.g.b(), new igt(5), new iny(ipbVarPeer, 4));
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cc
    public void onResume() {
        afvn afvnVarC = this.fragmentCallbacksTraceManager.c();
        try {
            super.onResume();
            ipb ipbVarPeer = peer();
            xgn xgnVar = ipbVarPeer.f;
            if (xgnVar != null) {
                DataSavingSettingsFragment dataSavingSettingsFragment = ipbVarPeer.b;
                if (dataSavingSettingsFragment.findPreference(gzj.STREAM_OVER_WIFI_ONLY) != null) {
                    xgnVar.l(new xgj(xhb.b(20136)));
                }
                jkp jkpVar = ipbVarPeer.e;
                if (dataSavingSettingsFragment.findPreference(jkpVar.b(gzj.DONT_PLAY_VIDEO_SETTING)) != null) {
                    xgnVar.l(new xgj(xhb.b(62366)));
                }
                if (dataSavingSettingsFragment.findPreference(jkpVar.b("pref_key_dont_play_nma_video")) != null) {
                    xgnVar.l(new xgj(xhb.b(181676)));
                }
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
        RecyclerView recyclerView;
        Window window;
        this.fragmentCallbacksTraceManager.i();
        try {
            super.onStart();
            DataSavingSettingsFragment dataSavingSettingsFragment = peer().b;
            if (dataSavingSettingsFragment.getActivity() != null && (window = dataSavingSettingsFragment.getActivity().getWindow()) != null && dataSavingSettingsFragment.getContext() != null) {
                window.setStatusBarColor(dataSavingSettingsFragment.getContext().getColor(R.color.black_header_color));
            }
            if (dataSavingSettingsFragment.getView() != null && (recyclerView = (RecyclerView) dataSavingSettingsFragment.getView().findViewById(R.id.recycler_view)) != null) {
                recyclerView.af(null);
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
    public ipb peer() {
        ipb ipbVar = this.peer;
        if (ipbVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.isPeerDestroyed) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ipbVar;
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_DataSavingSettingsFragment, defpackage.cc
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
