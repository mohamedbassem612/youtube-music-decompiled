package com.google.android.apps.youtube.music.deeplink;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import defpackage.afnb;
import defpackage.afov;
import defpackage.afow;
import defpackage.afpj;
import defpackage.aftc;
import defpackage.afty;
import defpackage.afuu;
import defpackage.afvn;
import defpackage.afwt;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.ahpu;
import defpackage.ahpv;
import defpackage.ahqb;
import defpackage.ahub;
import defpackage.auof;
import defpackage.awq;
import defpackage.boc;
import defpackage.boh;
import defpackage.gfa;
import defpackage.hav;
import defpackage.haw;
import defpackage.hax;
import defpackage.hay;
import defpackage.kbf;
import defpackage.ket;
import defpackage.kmz;
import defpackage.kou;
import defpackage.lou;
import defpackage.lpa;
import defpackage.lpd;
import defpackage.lpe;
import defpackage.lpf;
import defpackage.mda;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MusicServiceDeepLinkActivity extends hav implements afnb, afov {
    private hax b;
    private final aftc c = new aftc(this, this);
    private boolean d;
    private Context e;
    private boh f;
    private boolean g;

    public MusicServiceDeepLinkActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new gfa(this, 8));
    }

    private final hax d() {
        c();
        return this.b;
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

    @Override // defpackage.hav
    public final /* synthetic */ auof b() {
        return new afpj(this);
    }

    public final void c() {
        if (this.b == null) {
            if (!this.d) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.g && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            afuu afuuVarC = afwt.c(9, "CreateComponent");
            try {
                generatedComponent();
                afuuVarC.close();
                afuu afuuVarC2 = afwt.c(10, "CreatePeer");
                try {
                    this.b = ((hay) aguu.as(this, hay.class)).e();
                    afuuVarC2.close();
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
        return hax.class;
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

    /* JADX WARN: Type inference failed for: r6v3, types: [ahrs, java.lang.Object] */
    @Override // defpackage.hav, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Uri data;
        lpe lpeVar;
        aftc aftcVar = this.c;
        afvn afvnVarU = aftcVar.u();
        int i = 1;
        try {
            this.d = true;
            ((afow) getLifecycle()).g(aftcVar);
            super.onCreate(bundle);
            hax haxVarD = d();
            MusicServiceDeepLinkActivity musicServiceDeepLinkActivity = haxVarD.a;
            musicServiceDeepLinkActivity.setContentView(R.layout.service_deep_link_activity);
            musicServiceDeepLinkActivity.setFinishOnTouchOutside(false);
            haxVarD.f = (LoadingFrameLayout) musicServiceDeepLinkActivity.findViewById(R.id.loading_spinner);
            haxVarD.f.h(3);
            Intent intent = musicServiceDeepLinkActivity.getIntent();
            if (intent == null || (data = intent.getData()) == null) {
                musicServiceDeepLinkActivity.finish();
            } else {
                musicServiceDeepLinkActivity.getOnBackPressedDispatcher().c(musicServiceDeepLinkActivity, new haw(haxVarD));
                String host = data.getHost();
                if (host == null || host.isEmpty() || !host.equals("yt.be")) {
                    haxVarD.a(data, intent);
                } else {
                    ahpu ahpuVarA = ahpu.a();
                    lpa lpaVarA = ((kmz) ahpuVarA.a).A(1, new ahqb(ahpuVarA.b, intent.getDataString()));
                    ahpv ahpvVar = (ahpv) ket.z(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", ahpv.CREATOR);
                    ahub ahubVar = ahpvVar != null ? new ahub(ahpvVar) : null;
                    if (ahubVar != null) {
                        lpaVarA = mda.m(ahubVar);
                    }
                    lou louVar = new lou(lpd.a, new kbf(haxVarD, i), 2);
                    ((lpf) lpaVarA).e.g(louVar);
                    kou kouVarM = lpe.m(musicServiceDeepLinkActivity);
                    synchronized (kouVarM) {
                        try {
                            lpeVar = (lpe) kouVarM.b("TaskOnStopCallback", lpe.class);
                            if (lpeVar == null) {
                                lpeVar = new lpe(kouVarM);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    List list = lpeVar.a;
                    synchronized (list) {
                        list.add(new WeakReference(louVar));
                    }
                    ((lpf) lpaVarA).r();
                }
            }
            this.d = false;
            aftcVar.o();
            afvnVarU.close();
        } catch (Throwable th2) {
            try {
                afvnVarU.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
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

    @Override // defpackage.hav, defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onDestroy() {
        afvn afvnVarD = this.c.d();
        try {
            super.onDestroy();
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        afvn afvnVarW = this.c.w();
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
            hax haxVarD = d();
            haxVarD.d.f(haxVarD);
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
            hax haxVarD = d();
            Runnable runnable = haxVarD.g;
            if (runnable != null) {
                haxVarD.e.removeCallbacks(runnable);
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
        hax haxVar = this.b;
        if (haxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.g) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return haxVar;
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
