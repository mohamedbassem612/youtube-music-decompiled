package com.google.android.apps.youtube.music.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.preference.SeekBarPreference;
import com.google.android.apps.youtube.music.ui.preference.StorageBarPreference;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import defpackage.aajc;
import defpackage.aanb;
import defpackage.aany;
import defpackage.aaqg;
import defpackage.aaus;
import defpackage.abfv;
import defpackage.abxv;
import defpackage.acwr;
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
import defpackage.afxd;
import defpackage.agke;
import defpackage.agpi;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.aihf;
import defpackage.alos;
import defpackage.alot;
import defpackage.alou;
import defpackage.amcx;
import defpackage.amdd;
import defpackage.ameb;
import defpackage.ansz;
import defpackage.aodp;
import defpackage.aohx;
import defpackage.auom;
import defpackage.boc;
import defpackage.bog;
import defpackage.boh;
import defpackage.bpd;
import defpackage.bpl;
import defpackage.bpp;
import defpackage.bpt;
import defpackage.bpv;
import defpackage.cf;
import defpackage.dkh;
import defpackage.fl;
import defpackage.fx;
import defpackage.gpr;
import defpackage.gzj;
import defpackage.gzm;
import defpackage.hcq;
import defpackage.hlp;
import defpackage.hnq;
import defpackage.hnz;
import defpackage.igt;
import defpackage.iny;
import defpackage.ipk;
import defpackage.ipm;
import defpackage.ipn;
import defpackage.iqj;
import defpackage.iqw;
import defpackage.iqx;
import defpackage.ira;
import defpackage.jkp;
import defpackage.jkx;
import defpackage.jnm;
import defpackage.mqd;
import defpackage.nh;
import defpackage.qpj;
import defpackage.syn;
import defpackage.taf;
import defpackage.tqa;
import defpackage.vxz;
import defpackage.xeu;
import defpackage.xff;
import defpackage.xgj;
import defpackage.xgm;
import defpackage.xhb;
import defpackage.xsc;
import defpackage.ztf;
import defpackage.zwb;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class OfflineSettingsFragmentCompat extends TikTok_OfflineSettingsFragmentCompat implements afnb, afpd, afvj {
    private Context componentContext;
    private boolean isPeerDestroyed;
    private ipk peer;
    private final boh tracedLifecycleRegistry = new boh(this);
    private final afts fragmentCallbacksTraceManager = new afts(this);

    @Deprecated
    public OfflineSettingsFragmentCompat() {
        qpj.c();
    }

    static OfflineSettingsFragmentCompat create(affd affdVar) {
        OfflineSettingsFragmentCompat offlineSettingsFragmentCompat = new OfflineSettingsFragmentCompat();
        auom.f(offlineSettingsFragmentCompat);
        afpu.e(offlineSettingsFragmentCompat, affdVar);
        return offlineSettingsFragmentCompat;
    }

    private void createPeer() {
        ipm ipmVar = (ipm) aguu.as(this, ipm.class);
        afuu afuuVarE = afwt.e(21, OfflineSettingsFragmentCompat.class, "CreatePeer");
        try {
            this.peer = ipmVar.h();
            afuuVarE.close();
            this.peer.G = this;
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
    static OfflineSettingsFragmentCompat createWithoutAccount() {
        OfflineSettingsFragmentCompat offlineSettingsFragmentCompat = new OfflineSettingsFragmentCompat();
        auom.f(offlineSettingsFragmentCompat);
        afpu.f(offlineSettingsFragmentCompat);
        return offlineSettingsFragmentCompat;
    }

    @Deprecated
    public Context componentContext() {
        if (this.componentContext == null) {
            this.componentContext = new afpe(this, super.getContext());
        }
        return this.componentContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_OfflineSettingsFragmentCompat
    public afpk createComponentManager() {
        return new afpk(this, true);
    }

    @Override // defpackage.afvj
    public afwn getAnimationRef() {
        return (afwn) this.fragmentCallbacksTraceManager.c;
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_OfflineSettingsFragmentCompat, defpackage.cc
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_OfflineSettingsFragmentCompat, defpackage.cc, defpackage.bny
    public /* bridge */ /* synthetic */ bpl getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.cc, defpackage.bog
    public final boc getLifecycle() {
        return this.tracedLifecycleRegistry;
    }

    @Override // defpackage.afnb
    public Class getPeerClass() {
        return ipk.class;
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_OfflineSettingsFragmentCompat, defpackage.cc
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

    /* JADX WARN: Type inference failed for: r4v42, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.dky
    public void onCreatePreferences(Bundle bundle, String str) {
        int i;
        ipk ipkVarPeer = peer();
        OfflineSettingsFragmentCompat offlineSettingsFragmentCompat = ipkVarPeer.b;
        offlineSettingsFragmentCompat.getPreferenceManager().f("youtube");
        offlineSettingsFragmentCompat.setPreferencesFromResource(R.xml.offline_settings_prefs_compat, str);
        xgm xgmVar = (xgm) offlineSettingsFragmentCompat.getActivity();
        xgmVar.getClass();
        ipkVarPeer.m = xgmVar.hB();
        TwoStatePreference twoStatePreference = (TwoStatePreference) offlineSettingsFragmentCompat.findPreference(gzj.AUTO_OFFLINE_ENABLED);
        twoStatePreference.getClass();
        ipkVarPeer.o = twoStatePreference;
        SeekBarPreference seekBarPreference = (SeekBarPreference) offlineSettingsFragmentCompat.findPreference(gzj.AUTO_OFFLINE_MAX_NUM_SONGS);
        seekBarPreference.getClass();
        ipkVarPeer.p = seekBarPreference;
        ListPreference listPreference = (ListPreference) offlineSettingsFragmentCompat.findPreference(gzj.OFFLINE_QUALITY);
        listPreference.getClass();
        ipkVarPeer.q = listPreference;
        ListPreference listPreference2 = (ListPreference) offlineSettingsFragmentCompat.findPreference(gzj.OFFLINE_AUDIO_QUALITY);
        listPreference2.getClass();
        ipkVarPeer.r = listPreference2;
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) offlineSettingsFragmentCompat.findPreference("offline_policy");
        twoStatePreference2.getClass();
        ipkVarPeer.s = twoStatePreference2;
        TwoStatePreference twoStatePreference3 = (TwoStatePreference) offlineSettingsFragmentCompat.findPreference("offline_use_sd_card");
        twoStatePreference3.getClass();
        ipkVarPeer.t = twoStatePreference3;
        TwoStatePreference twoStatePreference4 = ipkVarPeer.t;
        twoStatePreference4.n(twoStatePreference4.j.getString(R.string.pref_offline_use_sd_card_for_downloaded_content_summary));
        TwoStatePreference twoStatePreference5 = (TwoStatePreference) offlineSettingsFragmentCompat.findPreference("pref_enable_smart_download_recent_music");
        twoStatePreference5.getClass();
        ipkVarPeer.n = twoStatePreference5;
        Preference preferenceFindPreference = offlineSettingsFragmentCompat.findPreference("offline_insert_sd_card");
        preferenceFindPreference.getClass();
        StorageBarPreference storageBarPreference = (StorageBarPreference) offlineSettingsFragmentCompat.findPreference("offline_category_sdcard_storage");
        storageBarPreference.getClass();
        TwoStatePreference twoStatePreference6 = (TwoStatePreference) offlineSettingsFragmentCompat.findPreference("show_device_files");
        twoStatePreference6.getClass();
        Context context = ipkVarPeer.c;
        aanb aanbVar = ipkVarPeer.v;
        hnq hnqVar = ipkVarPeer.d;
        hlp hlpVar = ipkVarPeer.e;
        abxv abxvVar = ipkVarPeer.A;
        jkp jkpVar = ipkVarPeer.g;
        hnz hnzVar = ipkVarPeer.u;
        jkx jkxVar = ipkVarPeer.h;
        aany aanyVar = ipkVarPeer.j;
        syn synVar = ipkVarPeer.B;
        zwb zwbVar = ipkVarPeer.k;
        Executor executor = ipkVarPeer.l;
        vxz vxzVar = ipkVarPeer.y;
        abfv abfvVar = ipkVarPeer.C;
        jnm jnmVar = ipkVarPeer.E;
        ira iraVar = new ira(context, offlineSettingsFragmentCompat, aanbVar.b(), hnqVar, hlpVar, abxvVar, jkpVar, hnzVar, jkxVar, aanyVar, synVar, zwbVar, executor, vxzVar, abfvVar, jnmVar, ipkVarPeer.m);
        byte[] bArr = null;
        int i2 = 1;
        int i3 = 0;
        if (jnmVar.C()) {
            TwoStatePreference twoStatePreference7 = ipkVarPeer.o;
            jkp jkpVar2 = iraVar.g;
            twoStatePreference7.M(jkpVar2.b(gzj.AUTO_OFFLINE_ENABLED));
            twoStatePreference7.n = new iqx(iraVar, twoStatePreference7, i3);
            hnq hnqVar2 = iraVar.e;
            twoStatePreference7.k(hnqVar2.g());
            SeekBarPreference seekBarPreference2 = ipkVarPeer.p;
            seekBarPreference2.M(jkpVar2.b(gzj.AUTO_OFFLINE_MAX_NUM_SONGS));
            seekBarPreference2.K(jkpVar2.b(gzj.AUTO_OFFLINE_ENABLED));
            seekBarPreference2.l(1, 500, 1);
            seekBarPreference2.o(hnqVar2.c());
            seekBarPreference2.d = iraVar;
            seekBarPreference2.e = new mqd(iraVar, seekBarPreference2, null);
            seekBarPreference2.n = new ipn(iraVar, 6);
            TwoStatePreference twoStatePreference8 = ipkVarPeer.n;
            int iC = (int) vxzVar.c(3, 45381686L, 0L);
            if (iC == 0) {
                twoStatePreference8.n(offlineSettingsFragmentCompat.getContext().getResources().getString(R.string.pref_enable_smart_download_recent_music_summary_zero));
            } else {
                twoStatePreference8.n(offlineSettingsFragmentCompat.getContext().getResources().getQuantityString(R.plurals.pref_enable_smart_download_recent_music_summary, iC, Integer.valueOf(iC)));
            }
            twoStatePreference8.M(jkpVar2.b("pref_enable_smart_download_recent_music"));
            bog bogVar = iraVar.c;
            taf.k(bogVar, iraVar.a(), new igt(19), new hcq(iraVar, twoStatePreference8, 10, bArr));
            taf.k(bogVar, taf.a(bogVar, afxd.f(iraVar.a()).h(new gpr(12), iraVar.j), new iqj(13)), new igt(20), new iny(twoStatePreference8, 8));
        } else {
            offlineSettingsFragmentCompat.getPreferenceScreen().af(ipkVarPeer.o);
            offlineSettingsFragmentCompat.getPreferenceScreen().af(ipkVarPeer.p);
            offlineSettingsFragmentCompat.getPreferenceScreen().af(ipkVarPeer.n);
        }
        ListPreference listPreference3 = ipkVarPeer.q;
        List list = iraVar.o.C() ? gzm.b : gzm.a;
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        CharSequence[] charSequenceArr2 = new CharSequence[list.size()];
        int i4 = 0;
        while (i4 < list.size()) {
            aohx aohxVar = (aohx) list.get(i4);
            int i5 = i3;
            int iB = aaus.b(aohxVar);
            if (iB == -1) {
                charSequenceArr[i4] = "";
            } else {
                charSequenceArr[i4] = iraVar.b.getString(iB);
            }
            charSequenceArr2[i4] = Integer.toString(aaus.a(aohxVar, -1));
            i4++;
            i3 = i5;
        }
        int i6 = i3;
        listPreference3.e(charSequenceArr);
        listPreference3.h = charSequenceArr2;
        listPreference3.J(charSequenceArr2[i6]);
        hlp hlpVar2 = iraVar.f;
        listPreference3.o(Integer.toString(aaus.a(hlpVar2.e(), -1)));
        ListPreference listPreference4 = ipkVarPeer.r;
        agke agkeVar = gzm.c;
        int i7 = ((agpi) agkeVar).d;
        CharSequence[] charSequenceArr3 = new CharSequence[i7];
        CharSequence[] charSequenceArr4 = new CharSequence[i7];
        int i8 = i6;
        while (i8 < i7) {
            aodp aodpVar = (aodp) agkeVar.get(i8);
            Context context2 = iraVar.b;
            int iOrdinal = aodpVar.ordinal();
            if (iOrdinal == i2) {
                i = R.string.offline_audio_quality_low;
            } else if (iOrdinal != 2) {
                i = iOrdinal != 3 ? -1 : R.string.offline_audio_quality_high;
            } else {
                i = R.string.offline_audio_quality_normal;
            }
            charSequenceArr3[i8] = i != -1 ? context2.getString(i) : "";
            charSequenceArr4[i8] = aajc.c(aodpVar);
            i8++;
            i2 = 1;
        }
        listPreference4.e(charSequenceArr3);
        listPreference4.h = charSequenceArr4;
        listPreference4.J(charSequenceArr4[i6]);
        hlpVar2.e();
        listPreference4.o(aajc.c(hlpVar2.c()));
        ipkVarPeer.q.P(R.string.pref_offline_video_quality);
        ListPreference listPreference5 = ipkVarPeer.q;
        ((DialogPreference) listPreference5).a = listPreference5.j.getString(R.string.pref_offline_video_quality);
        if (ipkVarPeer.i.p() && ipkVarPeer.F.z() && Build.VERSION.SDK_INT >= 30) {
            xsc xscVar = ipkVarPeer.D;
            int i9 = ipkVarPeer.s.p;
            Context context3 = (Context) xscVar.b.io();
            context3.getClass();
            cf cfVar = (cf) xscVar.a.io();
            cfVar.getClass();
            aaqg aaqgVar = (aaqg) xscVar.c.io();
            aaqgVar.getClass();
            DownloadNetworkSelectionDialogPreference downloadNetworkSelectionDialogPreference = new DownloadNetworkSelectionDialogPreference(context3, cfVar, aaqgVar, i9);
            downloadNetworkSelectionDialogPreference.n = new ipn(ipkVarPeer, 1);
            ipkVarPeer.a(null);
            offlineSettingsFragmentCompat.getPreferenceScreen().ah(downloadNetworkSelectionDialogPreference);
            offlineSettingsFragmentCompat.getPreferenceScreen().af(ipkVarPeer.s);
        } else {
            ipkVarPeer.p.C = R.layout.auto_offline_tracks_preference;
            ipkVarPeer.s.k(hlpVar.j());
        }
        TwoStatePreference twoStatePreference9 = ipkVarPeer.t;
        twoStatePreference9.n = new ipn(iraVar, 5);
        twoStatePreference9.k(hlpVar2.n());
        tqa tqaVar = ipkVarPeer.w;
        if (!tqaVar.h()) {
            offlineSettingsFragmentCompat.getPreferenceScreen().af(ipkVarPeer.t);
            offlineSettingsFragmentCompat.getPreferenceScreen().af(preferenceFindPreference);
            offlineSettingsFragmentCompat.getPreferenceScreen().af(storageBarPreference);
        } else if (tqaVar.f()) {
            offlineSettingsFragmentCompat.getPreferenceScreen().af(preferenceFindPreference);
        } else {
            offlineSettingsFragmentCompat.getPreferenceScreen().af(ipkVarPeer.t);
            offlineSettingsFragmentCompat.getPreferenceScreen().af(storageBarPreference);
        }
        twoStatePreference6.M(iraVar.g.b("show_device_files"));
        twoStatePreference6.n = new iqw(iraVar, context, twoStatePreference6, i6);
        twoStatePreference6.k(hlpVar2.m());
        if (offlineSettingsFragmentCompat.findPreference("offline_use_sd_card") != null) {
            ipkVarPeer.m.w(new xgj(xhb.b(55838)), null);
        }
        fl supportActionBar = ((fx) offlineSettingsFragmentCompat.requireActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.f(new ColorDrawable(offlineSettingsFragmentCompat.getContext().getColor(R.color.black_header_color)));
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

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_OfflineSettingsFragmentCompat, defpackage.cc
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

    /* JADX WARN: Code duplicated, block: B:7:0x0028 A[Catch: all -> 0x0126, TRY_ENTER, TryCatch #1 {all -> 0x0126, blocks: (B:3:0x0005, B:5:0x001c, B:8:0x002a, B:10:0x0035, B:14:0x003c, B:16:0x0045, B:17:0x0058, B:19:0x006c, B:29:0x00ae, B:31:0x00bd, B:33:0x00c3, B:35:0x00cf, B:36:0x00d6, B:38:0x00e1, B:40:0x00e7, B:41:0x00fb, B:22:0x007c, B:25:0x0081, B:27:0x008a, B:28:0x009d, B:7:0x0028), top: B:53:0x0005 }] */
    @Override // defpackage.cc
    public void onPause() {
        aohx aohxVarC;
        boolean z;
        this.fragmentCallbacksTraceManager.i();
        try {
            super.onPause();
            ipk ipkVarPeer = peer();
            aihf aihfVarCreateBuilder = ansz.a.createBuilder();
            String str = ipkVarPeer.q.i;
            if (TextUtils.isEmpty(str)) {
                aohxVarC = aohx.AUDIO_ONLY;
            } else {
                try {
                    aohxVarC = aaus.c(Integer.parseInt(str));
                    if (aohxVarC == aohx.UNKNOWN_FORMAT_TYPE) {
                        aohxVarC = aohx.AUDIO_ONLY;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            hlp hlpVar = ipkVarPeer.e;
            boolean z2 = true;
            if (hlpVar.e() != aohxVarC) {
                ahno.F(aohxVarC != aohx.UNKNOWN_FORMAT_TYPE);
                int iA = aaus.a(aohxVarC, -1);
                if (iA != -1) {
                    hlpVar.b.edit().putString(gzj.OFFLINE_QUALITY, Integer.toString(iA)).apply();
                }
                aihfVarCreateBuilder.copyOnWrite();
                ansz anszVar = (ansz) aihfVarCreateBuilder.instance;
                anszVar.c = aohxVarC.l;
                anszVar.b |= 4;
                z = true;
            } else {
                z = false;
            }
            aodp aodpVarB = hlpVar.b(ipkVarPeer.r.i);
            if (hlpVar.c() == aodpVarB) {
                z2 = z;
            } else {
                ahno.F(aodpVarB != aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN);
                int iB = aajc.b(aodpVarB);
                if (iB != -1) {
                    hlpVar.b.edit().putString(gzj.OFFLINE_AUDIO_QUALITY, String.valueOf(iB)).apply();
                }
                aihfVarCreateBuilder.copyOnWrite();
                ansz anszVar2 = (ansz) aihfVarCreateBuilder.instance;
                anszVar2.d = aodpVarB.e;
                anszVar2.b |= 8;
            }
            hlpVar.g(ipkVarPeer.s.a);
            if (ipkVarPeer.E.C()) {
                if (ipkVarPeer.o.a) {
                    int i = ipkVarPeer.p.b;
                    hnq hnqVar = ipkVarPeer.d;
                    if (i != hnqVar.c()) {
                        hnqVar.e(ipkVarPeer.p.b);
                    }
                }
                ipkVarPeer.d.d(ipkVarPeer.o.a);
            }
            if (z2) {
                xeu xeuVar = ipkVarPeer.f;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_OFFLINE_PREFERENCES);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    ansz anszVar3 = (ansz) aihfVarCreateBuilder.build();
                    anszVar3.getClass();
                    alouVar.d = anszVar3;
                    alouVar.c = 218;
                    xeuVar.b((alou) alosVar.build());
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

    @Override // defpackage.dky, defpackage.dlf
    public boolean onPreferenceTreeClick(Preference preference) {
        String str;
        ipk ipkVarPeer = peer();
        if (preference == null || (str = preference.t) == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -240184022) {
            if (iHashCode == 6737393 && str.equals("clear_offline")) {
                acwr acwrVarF = ipkVarPeer.C.f(ipkVarPeer.c);
                acwrVarF.i(R.string.dialog_music_clear_offline_title);
                acwrVarF.d(R.string.pref_clear_offline_warning);
                acwrVarF.setPositiveButton(R.string.remove_offline_confirmed_button, new dkh(ipkVarPeer, 6, null));
                acwrVarF.setNegativeButton(R.string.dialog_negative_text, null);
                acwrVarF.j();
                ipkVarPeer.m.l(new xgj(xhb.b(302065)));
                return true;
            }
            return ipkVarPeer.G.superProxy_onPreferenceTreeClick(preference);
        }
        if (str.equals("offline_use_sd_card")) {
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amcx.a.createBuilder();
            int i = true != ipkVarPeer.t.a ? 3 : 2;
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
            ipkVarPeer.m.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(55838)), (amdd) aihfVarCreateBuilder.build());
            return true;
        }
        return ipkVarPeer.G.superProxy_onPreferenceTreeClick(preference);
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
            OfflineSettingsFragmentCompat offlineSettingsFragmentCompat = peer().b;
            Window window = offlineSettingsFragmentCompat.requireActivity().getWindow();
            if (window != null) {
                window.setStatusBarColor(offlineSettingsFragmentCompat.getContext().getColor(R.color.black_header_color));
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
    public ipk peer() {
        ipk ipkVar = this.peer;
        if (ipkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.isPeerDestroyed) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ipkVar;
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

    public boolean superProxy_onPreferenceTreeClick(Preference preference) {
        return super.onPreferenceTreeClick(preference);
    }

    @Override // defpackage.cc
    public void startActivity(Intent intent, Bundle bundle) {
        aguu.at(intent, getContext());
        super.startActivity(intent, bundle);
    }

    @Override // com.google.android.apps.youtube.music.settings.fragment.TikTok_OfflineSettingsFragmentCompat, defpackage.cc
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
