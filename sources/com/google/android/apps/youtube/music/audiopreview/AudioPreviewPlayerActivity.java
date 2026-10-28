package com.google.android.apps.youtube.music.audiopreview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import defpackage.afnb;
import defpackage.afov;
import defpackage.afow;
import defpackage.afpj;
import defpackage.aftc;
import defpackage.afty;
import defpackage.afuu;
import defpackage.afvn;
import defpackage.afwt;
import defpackage.agrx;
import defpackage.agso;
import defpackage.aguu;
import defpackage.ahew;
import defpackage.ahno;
import defpackage.auof;
import defpackage.avg;
import defpackage.awq;
import defpackage.boc;
import defpackage.boh;
import defpackage.dxk;
import defpackage.gfa;
import defpackage.glp;
import defpackage.glq;
import defpackage.glr;
import defpackage.gls;
import defpackage.glu;
import defpackage.glv;
import defpackage.jkx;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AudioPreviewPlayerActivity extends glv implements afnb, afov {
    private gls a;
    private final aftc b = new aftc(this, this);
    private boolean c;
    private Context d;
    private boh e;
    private boolean f;

    public AudioPreviewPlayerActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new gfa(this, 2));
    }

    private final gls e() {
        b();
        return this.a;
    }

    @Override // defpackage.glw
    public final /* synthetic */ auof a() {
        return new afpj(this);
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.d;
        }
        ahno.al(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.fx, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.d = context;
        ahno.ak(context);
        super.attachBaseContext(context);
        this.d = null;
    }

    public final void b() {
        if (this.a == null) {
            if (!this.c) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.f && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            afuu afuuVarC = afwt.c(5, "CreateComponent");
            try {
                generatedComponent();
                afuuVarC.close();
                afuu afuuVarC2 = afwt.c(6, "CreatePeer");
                try {
                    this.a = ((glu) aguu.as(this, glu.class)).c();
                    afuuVarC2.close();
                    this.a.v = this;
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
        afvn afvnVarA = this.b.a();
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
        if (this.e == null) {
            this.e = new afow(this);
        }
        return this.e;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return gls.class;
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
        afvn afvnVarB = this.b.b();
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
        afvn afvnVarC = this.b.c();
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
        afvn afvnVarN = this.b.n("onConfigurationChanged", null);
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

    @Override // defpackage.glw, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aftc aftcVar = this.b;
        afvn afvnVarU = aftcVar.u();
        try {
            this.c = true;
            ((afow) getLifecycle()).g(aftcVar);
            super.onCreate(bundle);
            gls glsVarE = e();
            if (avg.c(glsVarE.b.getApplicationContext(), jkx.a()) != 0) {
                agrx agrxVar = agso.a;
                glsVarE.d.f(Optional.of(new glp(glsVarE)));
            } else {
                glsVarE.b();
            }
            this.c = false;
            aftcVar.o();
            afvnVarU.close();
        } catch (Throwable th) {
            try {
                afvnVarU.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qe, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        afvn afvnVarV = this.b.v();
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

    @Override // defpackage.glw, defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onDestroy() {
        afvn afvnVarD = this.b.d();
        try {
            super.onDestroy();
            gls glsVarE = e();
            ahew ahewVar = glsVarE.u;
            if (ahewVar != null) {
                ahewVar.cancel(false);
            }
            glr glrVar = glsVarE.i;
            if (glrVar != null) {
                glrVar.release();
                glsVarE.i = null;
                glsVarE.a();
            }
            TouchImageView touchImageView = glsVarE.o;
            if (touchImageView != null) {
                touchImageView.setOnClickListener(null);
            }
            TimeBar timeBar = glsVarE.p;
            if (timeBar != null) {
                timeBar.t(glsVarE);
            }
            glq glqVar = glsVarE.g;
            if (glqVar != null && glsVarE.h) {
                glsVarE.b.unregisterReceiver(glqVar);
                glsVarE.h = false;
            }
            glsVarE.j();
            this.f = true;
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        gls glsVarE = e();
        if (i != 4) {
            if (i != 79) {
                if (i == 126) {
                    glsVarE.i();
                    return true;
                }
                if (i == 127) {
                    glsVarE.g();
                    return true;
                }
                switch (i) {
                    case 85:
                        break;
                    case 86:
                        break;
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                        return true;
                    default:
                        return super.onKeyUp(i, keyEvent);
                }
            }
            glsVarE.l();
            return true;
        }
        glsVarE.b.finish();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        afvn afvnVarW = this.b.w();
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
        afvn afvnVarF = this.b.f();
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
        afvn afvnVarX = this.b.x();
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
        afvn afvnVarY = this.b.y();
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
        afvn afvnVarG = this.b.g();
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
        afvn afvnVarN = this.b.n("onRequestPermissionsResult", null);
        try {
            gls glsVarE = e();
            super.onRequestPermissionsResult(i, strArr, iArr);
            glsVarE.d.c(i, strArr, iArr);
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
        afvn afvnVarH = this.b.h();
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
        afvn afvnVarI = this.b.i();
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

    @Override // defpackage.qe
    public final Object onRetainCustomNonConfigurationInstance() {
        gls glsVarE = e();
        glr glrVar = glsVarE.i;
        glsVarE.i = null;
        return glrVar;
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        afvn afvnVarZ = this.b.z();
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
        afvn afvnVarJ = this.b.j();
        try {
            super.onStart();
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
        afvn afvnVarK = this.b.k();
        try {
            super.onStop();
            gls glsVarE = e();
            AudioPreviewPlayerActivity audioPreviewPlayerActivity = glsVarE.b;
            PowerManager powerManager = (PowerManager) audioPreviewPlayerActivity.getApplicationContext().getSystemService("power");
            if (powerManager != null && powerManager.isInteractive()) {
                glsVarE.u = glsVarE.e.schedule(new dxk(audioPreviewPlayerActivity, 16), 1000L, TimeUnit.MILLISECONDS);
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
        afvn afvnVarL = this.b.l();
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
        afvn afvnVarM = this.b.m();
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
        gls glsVar = this.a;
        if (glsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return glsVar;
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
