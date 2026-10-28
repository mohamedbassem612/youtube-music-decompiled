package com.google.android.apps.youtube.music.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.settings.fragment.SettingsHeadersFragment;
import com.google.android.apps.youtube.music.settings.innertube.InnerTubeSettingsFragmentCompat;
import com.google.android.apps.youtube.music.settings.preference.SelectablePreference;
import defpackage.aduk;
import defpackage.aekf;
import defpackage.afnb;
import defpackage.afov;
import defpackage.afow;
import defpackage.afpj;
import defpackage.aftc;
import defpackage.afty;
import defpackage.afuu;
import defpackage.afvn;
import defpackage.afwl;
import defpackage.afwt;
import defpackage.agqj;
import defpackage.agqr;
import defpackage.agrc;
import defpackage.agso;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.aihl;
import defpackage.aihn;
import defpackage.ajfc;
import defpackage.ajfd;
import defpackage.ajwo;
import defpackage.apqs;
import defpackage.apqt;
import defpackage.apqu;
import defpackage.apqv;
import defpackage.aprv;
import defpackage.arqz;
import defpackage.auof;
import defpackage.awq;
import defpackage.azz;
import defpackage.boc;
import defpackage.boh;
import defpackage.cc;
import defpackage.dd;
import defpackage.fl;
import defpackage.gfa;
import defpackage.hfn;
import defpackage.iaa;
import defpackage.ibz;
import defpackage.ioh;
import defpackage.iop;
import defpackage.ior;
import defpackage.ios;
import defpackage.iov;
import defpackage.ipz;
import defpackage.irf;
import defpackage.jab;
import defpackage.nh;
import defpackage.vxg;
import defpackage.wtt;
import defpackage.xgn;
import defpackage.xhb;
import j$.util.Collection;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SettingsCompatActivity extends ioh implements afnb, afov {
    private iop c;
    private final aftc d = new aftc(this, this);
    private boolean e;
    private Context f;
    private boh g;
    private boolean h;

    public SettingsCompatActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new gfa(this, 12));
    }

    private final iop v() {
        o();
        return this.c;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f;
        }
        ahno.al(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.fx, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.f = context;
        ahno.ak(context);
        super.attachBaseContext(context);
        this.f = null;
    }

    @Override // android.app.Activity
    public final void finish() {
        afvn afvnVarA = this.d.a();
        try {
            super.finish();
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

    @Override // defpackage.qe, defpackage.ee, defpackage.bog
    public final boc getLifecycle() {
        if (this.g == null) {
            this.g = new afow(this);
        }
        return this.g;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return iop.class;
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return v().f;
    }

    @Override // defpackage.ion
    public final void hC(cc ccVar) {
        nh nhVar;
        ipz ipzVar = v().n;
        if (ipzVar != null) {
            Class<?> cls = ccVar.getClass();
            SettingsHeadersFragment settingsHeadersFragment = ipzVar.a;
            String name = cls.getName();
            PreferenceScreen preferenceScreen = settingsHeadersFragment.getPreferenceScreen();
            for (int i = 0; i < preferenceScreen.k(); i++) {
                Preference preferenceO = preferenceScreen.o(i);
                if (preferenceO instanceof SelectablePreference) {
                    SelectablePreference selectablePreference = (SelectablePreference) preferenceO;
                    boolean zEquals = name.equals(selectablePreference.v);
                    if (zEquals != selectablePreference.a) {
                        selectablePreference.a = zEquals;
                        RecyclerView listView = settingsHeadersFragment.getListView();
                        if (listView != null && (nhVar = listView.m) != null) {
                            nhVar.jX(i);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ion
    public final void hD(ipz ipzVar) {
        v().n = ipzVar;
    }

    @Override // defpackage.ioh
    public final /* synthetic */ auof i() {
        return new afpj(this);
    }

    @Override // defpackage.fx, android.app.Activity
    public final void invalidateOptionsMenu() {
        afvn afvnVarH = afty.h();
        try {
            super.invalidateOptionsMenu();
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

    @Override // defpackage.iot
    public final apqt j() {
        wtt wttVar = v().k;
        if (wttVar != null) {
            Object objA = wttVar.a();
            if (objA instanceof apqt) {
                return (apqt) objA;
            }
        }
        return null;
    }

    @Override // defpackage.iot
    public final apqt l(aprv aprvVar) {
        iop iopVarV = v();
        if (iopVarV.k == null) {
            return null;
        }
        for (Object obj : iopVarV.a()) {
            if (obj instanceof apqt) {
                apqt apqtVar = (apqt) obj;
                aprv aprvVarA = aprv.a(apqtVar.e);
                if (aprvVarA == null) {
                    aprvVarA = aprv.SETTING_CAT_UNKNOWN;
                }
                if (aprvVarA == aprvVar) {
                    return apqtVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.iot
    public final apqv m(aprv aprvVar) {
        iop iopVarV = v();
        if (iopVarV.k == null) {
            return null;
        }
        for (Object obj : iopVarV.a()) {
            if (obj instanceof apqv) {
                apqv apqvVar = (apqv) obj;
                aprv aprvVarA = aprv.a(apqvVar.d);
                if (aprvVarA == null) {
                    aprvVarA = aprv.SETTING_CAT_UNKNOWN;
                }
                if (aprvVarA == aprvVar) {
                    return apqvVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.iot
    public final void n(ios iosVar) {
        iop iopVarV = v();
        iopVarV.l = iosVar;
        iopVarV.b();
    }

    public final void o() {
        if (this.c == null) {
            if (!this.e) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.h && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            afuu afuuVarC = afwt.c(14, "CreateComponent");
            try {
                generatedComponent();
                afuuVarC.close();
                afuu afuuVarC2 = afwt.c(15, "CreatePeer");
                try {
                    this.c = ((ior) aguu.as(this, ior.class)).g();
                    afuuVarC2.close();
                    this.c.q = this;
                } catch (Throwable th) {
                    try {
                        afuuVarC2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    afuuVarC.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        afvn afvnVarB = this.d.b();
        try {
            super.onAttachedToWindow();
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

    @Override // defpackage.qe, android.app.Activity
    public final void onBackPressed() {
        afvn afvnVarC = this.d.c();
        try {
            super.onBackPressed();
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

    @Override // defpackage.fx, defpackage.qe, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        afvn afvnVarN = this.d.n("onConfigurationChanged", null);
        try {
            super.onConfigurationChanged(configuration);
            iop iopVarV = v();
            jab jabVar = iopVarV.i;
            boolean z = jabVar instanceof iov;
            SettingsCompatActivity settingsCompatActivity = iopVarV.b;
            if (z != hfn.D(settingsCompatActivity)) {
                settingsCompatActivity.finish();
                afwl.m(settingsCompatActivity, settingsCompatActivity.getIntent());
            }
            jabVar.c();
            afvnVarN.close();
        } catch (Throwable th) {
            try {
                afvnVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ioh, defpackage.izy, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aftc aftcVar = this.d;
        afvn afvnVarU = aftcVar.u();
        try {
            this.e = true;
            ((afow) getLifecycle()).g(aftcVar);
            super.onCreate(bundle);
            iop iopVarV = v();
            dd.a = false;
            SettingsCompatActivity settingsCompatActivity = iopVarV.b;
            fl supportActionBar = settingsCompatActivity.getSupportActionBar();
            if (supportActionBar != null) {
                aduk adukVar = new aduk(settingsCompatActivity, iopVarV.j.b(arqz.er));
                adukVar.b(settingsCompatActivity.getColor(R.color.ytm_icon_color_active));
                Drawable drawableA = adukVar.a();
                drawableA.setAutoMirrored(true);
                supportActionBar.k(drawableA);
            }
            Intent intent = settingsCompatActivity.getIntent();
            ajwo ajwoVarB = (intent == null || intent.getExtras() == null) ? null : vxg.b(intent.getExtras().getByteArray("navigation_endpoint"));
            if (ajwoVarB != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfd.a);
                ajwoVarB.c(aihlVarCheckIsLite);
                if (ajwoVarB.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfd.a);
                    ajwoVarB.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVarB.j.k(aihlVarCheckIsLite2.d);
                    ajfc ajfcVar = (ajfc) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    if ((ajfcVar.b & 4) != 0) {
                        iopVarV.m = ajfcVar.c;
                    }
                }
            }
            iopVarV.f.b(xhb.a(12924), ajwoVarB, null);
            if (iopVarV.k == null) {
                try {
                    iopVarV.k = (wtt) iopVarV.e.b().c();
                    wtt wttVar = iopVarV.k;
                    if (wttVar != null) {
                        wttVar.b = iopVarV.o.l(229, 45775088L, false);
                    }
                    iopVarV.p.y();
                    iopVarV.b();
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) iop.a.c().i(agso.a, "SettingsActivityPeer")).j(e)).k("com/google/android/apps/youtube/music/settings/SettingsCompatActivityPeer", "maybeFetchSettingsResponseFromOfflineStore", (char) 262, "SettingsCompatActivityPeer.java")).t("Failed to load settings response");
                }
            }
            if (!iopVarV.d()) {
                iopVarV.c();
            }
            this.e = false;
            aftcVar.o();
            afvnVarU.close();
        } catch (Throwable th) {
            try {
                afvnVarU.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.qe, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        afvn afvnVarV = this.d.v();
        try {
            super.onCreatePanelMenu(i, menu);
            afvnVarV.close();
            return true;
        } catch (Throwable th) {
            try {
                afvnVarV.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ioh, defpackage.izy, defpackage.fx, defpackage.cf, android.app.Activity
    public final void onDestroy() {
        afvn afvnVarD = this.d.d();
        try {
            super.onDestroy();
            this.h = true;
            afvnVarD.close();
        } catch (Throwable th) {
            try {
                afvnVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.izy, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        afvn afvnVarW = this.d.w();
        try {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            afvnVarW.close();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            try {
                afvnVarW.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cf, android.app.Activity
    protected final void onPause() {
        afvn afvnVarF = this.d.f();
        try {
            super.onPause();
            afvnVarF.close();
        } catch (Throwable th) {
            try {
                afvnVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qe, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        afvn afvnVarX = this.d.x();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            afvnVarX.close();
        } catch (Throwable th) {
            try {
                afvnVarX.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        afvn afvnVarY = this.d.y();
        try {
            super.onPostCreate(bundle);
            afvnVarY.close();
        } catch (Throwable th) {
            try {
                afvnVarY.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onPostResume() {
        afvn afvnVarG = this.d.g();
        try {
            super.onPostResume();
            afvnVarG.close();
        } catch (Throwable th) {
            try {
                afvnVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        afvn afvnVarH = afty.h();
        try {
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            afvnVarH.close();
            return zOnPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                afvnVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cf, defpackage.qe, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        afvn afvnVarN = this.d.n("onRequestPermissionsResult", null);
        try {
            iop iopVarV = v();
            super.onRequestPermissionsResult(i, strArr, iArr);
            iopVarV.h.c(i, strArr, iArr);
            afvnVarN.close();
        } catch (Throwable th) {
            try {
                afvnVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        afvn afvnVarH = this.d.h();
        try {
            super.onRestart();
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

    @Override // defpackage.cf, android.app.Activity
    protected final void onResume() {
        afvn afvnVarI = this.d.i();
        try {
            super.onResume();
            afvnVarI.close();
        } catch (Throwable th) {
            try {
                afvnVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        afvn afvnVarZ = this.d.z();
        try {
            super.onSaveInstanceState(bundle);
            afvnVarZ.close();
        } catch (Throwable th) {
            try {
                afvnVarZ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onStart() {
        afvn afvnVarJ = this.d.j();
        try {
            super.onStart();
            iop iopVarV = v();
            iopVarV.d.f(iopVarV);
            SettingsCompatActivity settingsCompatActivity = iopVarV.b;
            Window window = settingsCompatActivity.getWindow();
            azz.c(window, false);
            window.setNavigationBarColor(settingsCompatActivity.getResources().getColor(android.R.color.transparent));
            afvnVarJ.close();
        } catch (Throwable th) {
            try {
                afvnVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onStop() {
        afvn afvnVarK = this.d.k();
        try {
            super.onStop();
            iop iopVarV = v();
            iopVarV.d.l(iopVarV);
            afvnVarK.close();
        } catch (Throwable th) {
            try {
                afvnVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx
    public final boolean onSupportNavigateUp() {
        afvn afvnVarL = this.d.l();
        try {
            boolean zOnSupportNavigateUp = super.onSupportNavigateUp();
            afvnVarL.close();
            return zOnSupportNavigateUp;
        } catch (Throwable th) {
            try {
                afvnVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        afvn afvnVarM = this.d.m();
        try {
            super.onUserInteraction();
            afvnVarM.close();
        } catch (Throwable th) {
            try {
                afvnVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afnb
    public final /* bridge */ /* synthetic */ Object peer() {
        iop iopVar = this.c;
        if (iopVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.h) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iopVar;
    }

    @Override // defpackage.iot
    public final void q(ios iosVar) {
        iop iopVarV = v();
        if (iopVarV.l == iosVar) {
            iopVarV.l = null;
        }
    }

    @Override // defpackage.izy
    protected final boolean r(String str) {
        agqr it = ((agqj) v().c).iterator();
        while (it.hasNext()) {
            if (InnerTubeSettingsFragmentCompat.class.getName().equals(str)) {
                return true;
            }
        }
        return Collection.EL.stream(irf.a.keySet()).map(new iaa(20)).anyMatch(new ibz(str, 3));
    }

    @Override // defpackage.iot
    public final apqs s() {
        iop iopVarV = v();
        if (iopVarV.k == null) {
            return null;
        }
        for (Object obj : iopVarV.a()) {
            if (obj instanceof apqt) {
                for (apqu apquVar : ((apqt) obj).d) {
                    if ((apquVar.b & 2) != 0) {
                        apqs apqsVar = apquVar.d;
                        if (apqsVar == null) {
                            apqsVar = apqs.a;
                        }
                        if (aekf.d(apqsVar) == 9) {
                            return apqsVar;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        aguu.at(intent, getApplicationContext());
        super.startActivity(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        aguu.at(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.fx
    protected final void onLocalesChanged(awq awqVar) {
    }

    @Override // defpackage.fx
    protected final void onNightModeChanged(int i) {
    }
}
