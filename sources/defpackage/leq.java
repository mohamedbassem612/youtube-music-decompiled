package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class leq implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ler a;

    public leq(ler lerVar) {
        this.a = lerVar;
    }

    public final void a(kzv kzvVar, Bundle bundle) {
        leq leqVar;
        lhh lhhVarL;
        Uri uri;
        try {
            ler lerVar = this.a;
            lerVar.aT().k.a("onActivityCreated");
            Intent intent = kzvVar.c;
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                            uri = data;
                        }
                    }
                    uri = null;
                } else {
                    uri = data;
                }
                if (uri != null && uri.isHierarchical()) {
                    lerVar.L();
                    leqVar = this;
                    try {
                        try {
                            lerVar.aU().j(new lep(leqVar, bundle == null, uri, lga.aB(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                        } catch (RuntimeException e) {
                            e = e;
                            leqVar.a.aT().c.b("Throwable caught in onActivityCreated", e);
                        }
                        lhhVarL = leqVar.a.l();
                    } catch (Throwable th) {
                        th = th;
                        leqVar.a.l().w(kzvVar, bundle);
                        throw th;
                    }
                }
                lhhVarL.w(kzvVar, bundle);
            }
            lhhVarL = lerVar.l();
        } catch (RuntimeException e2) {
            e = e2;
            leqVar = this;
        } catch (Throwable th2) {
            th = th2;
            leqVar = this;
            leqVar.a.l().w(kzvVar, bundle);
            throw th;
        }
        lhhVarL.w(kzvVar, bundle);
    }

    public final void b(kzv kzvVar) {
        lhh lhhVarL = this.a.l();
        synchronized (lhhVarL.j) {
            if (Objects.equals(lhhVarL.e, kzvVar)) {
                lhhVarL.e = null;
            }
        }
        if (lhhVarL.G().p()) {
            lhhVarL.d.remove(Integer.valueOf(kzvVar.a));
        }
    }

    public final void c(kzv kzvVar) {
        lhh lhhVarL = this.a.l();
        synchronized (lhhVarL.j) {
            lhhVarL.i = false;
            lhhVarL.f = true;
        }
        lhhVarL.aV();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (lhhVarL.G().p()) {
            lhf lhfVarS = lhhVarL.s(kzvVar);
            lhhVarL.b = lhhVarL.a;
            lhhVarL.a = null;
            lhhVarL.aU().j(new laz(lhhVarL, lhfVarS, jElapsedRealtime, 4));
        } else {
            lhhVarL.a = null;
            lhhVarL.aU().j(new jup((lbc) lhhVarL, jElapsedRealtime, 7));
        }
        lhj lhjVarM = this.a.m();
        lhjVarM.aV();
        lhjVarM.aU().j(new jup((lbc) lhjVarM, SystemClock.elapsedRealtime(), 8));
    }

    public final void d(kzv kzvVar) {
        ler lerVar = this.a;
        lhj lhjVarM = lerVar.m();
        lhjVarM.aV();
        lhjVarM.aU().j(new lhi(lhjVarM, SystemClock.elapsedRealtime(), 0));
        lhh lhhVarL = lerVar.l();
        Object obj = lhhVarL.j;
        synchronized (obj) {
            lhhVarL.i = true;
            if (!Objects.equals(kzvVar, lhhVarL.e)) {
                synchronized (obj) {
                    try {
                        lhhVarL.e = kzvVar;
                        lhhVarL.f = false;
                        if (lhhVarL.G().p()) {
                            lhhVarL.g = null;
                            lhhVarL.aU().j(new iqc((lbc) lhhVarL, 18));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (!lhhVarL.G().p()) {
            lhhVarL.a = lhhVarL.g;
            lhhVarL.aU().j(new lei(lhhVarL, 12, null));
            return;
        }
        lhhVarL.u(kzvVar.b, lhhVarL.s(kzvVar), false);
        lba lbaVarG = lhhVarL.g();
        lbaVarG.aU().j(new lhi(lbaVarG, SystemClock.elapsedRealtime(), 1));
    }

    public final void e(kzv kzvVar, Bundle bundle) {
        lhf lhfVar;
        lhh lhhVarL = this.a.l();
        if (!lhhVarL.G().p() || bundle == null || (lhfVar = (lhf) lhhVarL.d.get(Integer.valueOf(kzvVar.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", lhfVar.c);
        bundle2.putString("name", lhfVar.a);
        bundle2.putString("referrer_name", lhfVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(kzv.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(kzv.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(kzv.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(kzv.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(kzv.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
