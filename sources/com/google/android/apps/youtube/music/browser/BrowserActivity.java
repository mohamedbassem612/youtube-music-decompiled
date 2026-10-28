package com.google.android.apps.youtube.music.browser;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import defpackage.adjw;
import defpackage.adur;
import defpackage.afnb;
import defpackage.afov;
import defpackage.afow;
import defpackage.afpj;
import defpackage.aftc;
import defpackage.afty;
import defpackage.afuu;
import defpackage.afvn;
import defpackage.afwt;
import defpackage.agrc;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.auof;
import defpackage.awq;
import defpackage.boc;
import defpackage.boh;
import defpackage.fl;
import defpackage.gfa;
import defpackage.gnc;
import defpackage.grw;
import defpackage.grx;
import defpackage.gry;
import defpackage.gsa;
import defpackage.gsb;
import defpackage.kmj;
import defpackage.kmk;
import defpackage.zwa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class BrowserActivity extends gsb implements afnb, afov {
    private gry b;
    private final aftc c = new aftc(this, this);
    private boolean d;
    private Context e;
    private boh f;
    private boolean g;

    public BrowserActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new gfa(this, 5));
    }

    private final gry d() {
        b();
        return this.b;
    }

    @Override // defpackage.gsb
    public final /* synthetic */ auof a() {
        return new afpj(this);
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.e;
        }
        ahno.al(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.fx, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.e = context;
        ahno.ak(context);
        super.attachBaseContext(context);
        this.e = null;
    }

    public final void b() {
        if (this.b == null) {
            if (!this.d) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.g && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            afuu afuuVarC = afwt.c(7, "CreateComponent");
            try {
                generatedComponent();
                afuuVarC.close();
                afuu afuuVarC2 = afwt.c(8, "CreatePeer");
                try {
                    this.b = ((gsa) aguu.as(this, gsa.class)).d();
                    afuuVarC2.close();
                    this.b.l = this;
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

    @Override // android.app.Activity
    public final void finish() {
        afvn afvnVarA = this.c.a();
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
        if (this.f == null) {
            this.f = new afow(this);
        }
        return this.f;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return gry.class;
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

    @Override // defpackage.cf, defpackage.qe, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        afvn afvnVarT = this.c.t();
        try {
            super.onActivityResult(i, i2, intent);
            afvnVarT.close();
        } catch (Throwable th) {
            try {
                afvnVarT.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        afvn afvnVarB = this.c.b();
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
        afvn afvnVarC = this.c.c();
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
        afvn afvnVarN = this.c.n("onConfigurationChanged", null);
        try {
            super.onConfigurationChanged(configuration);
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

    @Override // defpackage.gsb, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aftc aftcVar = this.c;
        afvn afvnVarU = aftcVar.u();
        try {
            this.d = true;
            ((afow) getLifecycle()).g(aftcVar);
            super.onCreate(bundle);
            gry gryVarD = d();
            BrowserActivity browserActivity = gryVarD.b;
            browserActivity.getWindow().setLayout(-1, -1);
            if ((browserActivity.getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            zwa zwaVarE = gryVarD.f.e();
            int intExtra = browserActivity.getIntent().getIntExtra("destination", -1);
            int i = 0;
            try {
                if (intExtra == 1) {
                    gryVarD.i = "https://history.google.com/history/youtube/watch";
                    browserActivity.setTitle(R.string.pref_watch_history_management);
                } else if (intExtra == 2) {
                    gryVarD.i = "https://history.google.com/history/youtube/search";
                    browserActivity.setTitle(R.string.pref_search_history_management);
                    gryVarD.d.execute(new gnc(gryVarD.c, 14));
                } else {
                    if (intExtra != 3) {
                        if (intExtra != 4) {
                            gryVarD.b.finish();
                        } else {
                            gryVarD.i = "https://support.google.com/youtubemusic/answer/6313542";
                            browserActivity.setTitle(R.string.pref_library_management);
                        }
                        this.d = false;
                        this.c.o();
                        afvnVarU.close();
                    }
                    gryVarD.i = "https://www.youtube.com/signin?feature=masthead_switcher&authuser=0&skip_identity_prompt=True&action_handle_signin=true&next=%2Faccount_privacy%3F";
                    if (zwaVarE.d()) {
                        gryVarD.i = gryVarD.i + "&pageid=" + zwaVarE.l();
                    }
                    browserActivity.setTitle(R.string.pref_account_privacy_management);
                }
                gryVarD.g.a = gryVarD.k.M(zwaVarE);
            } catch (RemoteException | kmj | kmk e) {
                ((agrc) ((agrc) ((agrc) gry.a.b()).j(e)).k("com/google/android/apps/youtube/music/browser/BrowserActivityPeer", "onCreate", (char) 169, "BrowserActivityPeer.java")).t("Error getting account");
            }
            ViewGroup viewGroup = (ViewGroup) browserActivity.getLayoutInflater().inflate(R.layout.browser_activity, (ViewGroup) null);
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup.findViewById(R.id.loading_frame_layout);
            loadingFrameLayout.getClass();
            gryVarD.h = loadingFrameLayout;
            Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.toolbar);
            toolbar.getClass();
            browserActivity.setSupportActionBar(toolbar);
            fl supportActionBar = browserActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.h(true);
                supportActionBar.y();
                supportActionBar.f(new ColorDrawable(browserActivity.getWindow().getStatusBarColor()));
            }
            gryVarD.g = new adur(browserActivity, gryVarD.e);
            gryVarD.g.getSettings().setAllowContentAccess(false);
            gryVarD.h.addView(gryVarD.g);
            gryVarD.g.setWebViewClient(new grx(gryVarD));
            gryVarD.g.setOnKeyListener(new grw(gryVarD, i));
            gryVarD.g.setOnLongClickListener(new adjw(1));
            gryVarD.b();
            gryVarD.b.setContentView(viewGroup);
            this.d = false;
            this.c.o();
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
        afvn afvnVarV = this.c.v();
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

    @Override // defpackage.gsb, defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onDestroy() {
        afvn afvnVarD = this.c.d();
        try {
            super.onDestroy();
            adur adurVar = d().g;
            if (adurVar != null) {
                adurVar.destroy();
                CookieManager.getInstance().removeAllCookie();
            }
            this.g = true;
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

    @Override // defpackage.qe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        afvn afvnVarE = this.c.e(intent);
        try {
            super.onNewIntent(intent);
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean zOnOptionsItemSelected;
        afvn afvnVarW = this.c.w();
        try {
            gry gryVarD = d();
            if (menuItem.getItemId() != 16908332) {
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            } else {
                gryVarD.b.finish();
                zOnOptionsItemSelected = true;
            }
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
        afvn afvnVarF = this.c.f();
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
        afvn afvnVarX = this.c.x();
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
        afvn afvnVarY = this.c.y();
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
        afvn afvnVarG = this.c.g();
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
        afvn afvnVarN = this.c.n("onRequestPermissionsResult", null);
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
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
        afvn afvnVarH = this.c.h();
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
        afvn afvnVarI = this.c.i();
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
        afvn afvnVarZ = this.c.z();
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
        afvn afvnVarJ = this.c.j();
        try {
            super.onStart();
            adur adurVar = d().g;
            if (adurVar != null) {
                adurVar.onResume();
            }
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
        afvn afvnVarK = this.c.k();
        try {
            super.onStop();
            adur adurVar = d().g;
            if (adurVar != null) {
                adurVar.onPause();
            }
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
        afvn afvnVarL = this.c.l();
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
        afvn afvnVarM = this.c.m();
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
        gry gryVar = this.b;
        if (gryVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.g) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return gryVar;
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
