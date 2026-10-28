package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ldq implements Runnable {
    final /* synthetic */ lef a;
    final /* synthetic */ ldr b;

    public ldq(ldr ldrVar, lef lefVar) {
        this.a = lefVar;
        this.b = ldrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgh lghVar;
        Bundle bundle;
        ldr ldrVar = this.b;
        ldrVar.r();
        lby lbyVar = new lby(ldrVar);
        lbyVar.p();
        ldrVar.m = lbyVar;
        lef lefVar = this.a;
        kzu kzuVar = lefVar.d;
        long j = kzuVar == null ? 0L : kzuVar.a;
        String string = "";
        if (kzuVar != null && (bundle = kzuVar.d) != null) {
            string = bundle.getString("runtime_google_app_id", "");
        }
        lbt lbtVar = ldrVar.c;
        lct lctVar = new lct(ldrVar, lefVar.c, j, string);
        lctVar.b();
        ldrVar.n = lctVar;
        lgr lgrVar = new lgr(ldrVar);
        lgrVar.b();
        ldrVar.k = lgrVar;
        lff lffVar = new lff(ldrVar);
        lffVar.b();
        ldrVar.l = lffVar;
        ldrVar.g.q();
        ldrVar.d.q();
        ldrVar.n.c();
        lhm lhmVar = new lhm(ldrVar);
        lhmVar.b();
        ldrVar.o = lhmVar;
        ldrVar.o.c();
        if (lbtVar.F(null, lcl.bn)) {
            ldrVar.p = new lbv(ldrVar);
        } else {
            ldrVar.p = null;
        }
        ldrVar.aT().i.b("App measurement initialized, version", 192008L);
        ldrVar.aT().i.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strV = lctVar.v();
        if (ldrVar.l().ak(strV, lbtVar.a)) {
            ldrVar.aT().i.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            ldrVar.aT().i.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strV));
        }
        ldrVar.aT().j.a("Debug-level message logging enabled");
        int i = ldrVar.s;
        AtomicInteger atomicInteger = ldrVar.u;
        if (i != atomicInteger.get()) {
            ldrVar.aT().c.c("Not all components initialized", Integer.valueOf(ldrVar.s), Integer.valueOf(atomicInteger.get()));
        }
        ldrVar.q = true;
        ldrVar.r();
        if (((Boolean) lcl.bf.b(null)).booleanValue() && ldrVar.g().k(System.currentTimeMillis()) && ldrVar.p().v()) {
            ldrVar.i().ae("auto", "_sid", null, System.currentTimeMillis());
            ldrVar.i().ae("auto", "_sno", null, System.currentTimeMillis());
            ldrVar.i().ae("auto", "_se", null, System.currentTimeMillis());
            ldrVar.g().l.b(0L);
        }
        liv livVarU = ldrVar.q().u();
        liv livVar = liv.CLIENT_UPLOAD_ELIGIBLE;
        if (livVarU == livVar) {
            lga lgaVarL = ldrVar.l();
            lgaVarL.o();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            avg.f(lgaVarL.aS(), new lbi(lgaVarL.t), intentFilter, null, 2);
            lgaVarL.aT().j.a("Registered app receiver");
            ldrVar.q().v(((Long) lcl.F.b(null)).longValue());
            ldrVar.l();
            if (lga.az((String) lcl.J.b(null), ldrVar.e().v())) {
                lhm lhmVarQ = ldrVar.q();
                Long l = (Long) lcl.I.b(null);
                long jLongValue = l.longValue();
                lhmVarQ.a();
                lhmVarQ.o();
                liv livVarU2 = lhmVarQ.u();
                if (livVarU2 != livVar) {
                    lhmVarQ.aT().k.b("[sgtm] Not eligible for Scion upload", livVarU2.name());
                } else {
                    lhmVarQ.aT().k.c("[sgtm] Scheduling periodic upload: interval millis, jobId", l, Integer.valueOf(lhmVarQ.s() + 2));
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
                    JobInfo jobInfoBuild = new JobInfo.Builder(lhmVarQ.s() + 2, new ComponentName(lhmVarQ.aS(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setPeriodic(jLongValue).setExtras(persistableBundle).build();
                    JobScheduler jobScheduler = lhmVarQ.a;
                    if (jobScheduler == null) {
                        throw new NullPointerException("null reference");
                    }
                    lhmVarQ.aT().k.b("[sgtm] Periodic upload job scheduled with result", jobScheduler.schedule(jobInfoBuild) == 1 ? "SUCCESS" : "FAILURE");
                }
            }
        }
        lgh lghVarF = ldrVar.g().f();
        int i2 = lghVarF.d;
        int i3 = 0;
        lge lgeVarK = lbtVar.k("google_analytics_default_allow_ad_storage", false);
        lge lgeVarK2 = lbtVar.k("google_analytics_default_allow_analytics_storage", false);
        lge lgeVar = lge.UNINITIALIZED;
        if (!(lgeVarK == lgeVar && lgeVarK2 == lgeVar) && ldrVar.g().l(-10)) {
            EnumMap enumMap = new EnumMap(lgg.class);
            enumMap.put(lgg.AD_STORAGE, lgeVarK);
            enumMap.put(lgg.ANALYTICS_STORAGE, lgeVarK2);
            lghVar = new lgh(enumMap, -10);
        } else {
            if (!TextUtils.isEmpty(ldrVar.e().w()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 40)) {
                ldrVar.i().ac(new lgh(-10), false);
            }
            lghVar = null;
        }
        if (lghVar != null) {
            ldrVar.i().ac(lghVar, true);
            lghVarF = lghVar;
        }
        ldrVar.i().aa(lghVarF);
        int i4 = ldrVar.g().d().b;
        lge lgeVarK3 = lbtVar.k("google_analytics_default_allow_ad_personalization_signals", true);
        if (lgeVarK3 != lgeVar) {
            ldrVar.aT().k.b("Default ad personalization consent from Manifest", lgeVarK3);
        }
        lge lgeVarK4 = lbtVar.k("google_analytics_default_allow_ad_user_data", true);
        if (lgeVarK4 != lgeVar && lgh.p(-10, i4)) {
            ler lerVarI = ldrVar.i();
            EnumMap enumMap2 = new EnumMap(lgg.class);
            enumMap2.put(lgg.AD_USER_DATA, lgeVarK4);
            lerVarI.Y(new lgd(enumMap2, -10, (Boolean) null, (String) null), true);
        } else if (!TextUtils.isEmpty(ldrVar.e().w()) && (i4 == 0 || i4 == 30)) {
            ldrVar.i().Y(new lgd((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        Boolean boolL = lbtVar.l("google_analytics_tcf_data_enabled");
        if (boolL == null || boolL.booleanValue()) {
            ldrVar.aT().j.a("TCF client enabled.");
            ler lerVarI2 = ldrVar.i();
            lerVarI2.o();
            lerVarI2.aT().j.a("Register tcfPrefChangeListener.");
            if (lerVarI2.e == null) {
                lerVarI2.f = new lej(lerVarI2, lerVarI2.t);
                lerVarI2.e = new leh(lerVarI2, i3);
            }
            lerVarI2.J().a().registerOnSharedPreferenceChangeListener(lerVarI2.e);
            ldrVar.i().D();
        }
        if (ldrVar.g().d.a() == 0) {
            lcx lcxVar = ldrVar.aT().k;
            long j2 = ldrVar.v;
            lcxVar.b("Persisting first open", Long.valueOf(j2));
            ldrVar.g().d.b(j2);
        }
        kjc kjcVar = ldrVar.i().i;
        if (kjcVar.c() && kjcVar.d()) {
            ((ldr) kjcVar.a).g().q.b(null);
        }
        if (ldrVar.y()) {
            if (!TextUtils.isEmpty(ldrVar.e().w())) {
                ldrVar.l();
                String strW = ldrVar.e().w();
                ldl ldlVarG = ldrVar.g();
                ldlVarG.o();
                if (lga.aD(strW, ldlVarG.b().getString("gmp_app_id", null))) {
                    ldrVar.aT().i.a("Rechecking which service to use due to a GMP App Id change");
                    ldl ldlVarG2 = ldrVar.g();
                    ldlVarG2.o();
                    Boolean boolG = ldlVarG2.g();
                    SharedPreferences.Editor editorEdit = ldlVarG2.b().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolG != null) {
                        ldlVarG2.i(boolG);
                    }
                    ldrVar.m().t();
                    ldrVar.l.u();
                    ldrVar.l.t();
                    ldrVar.g().d.b(ldrVar.v);
                    ldrVar.g().f.b(null);
                }
                ldl ldlVarG3 = ldrVar.g();
                String strW2 = ldrVar.e().w();
                ldlVarG3.o();
                SharedPreferences.Editor editorEdit2 = ldlVarG3.b().edit();
                editorEdit2.putString("gmp_app_id", strW2);
                editorEdit2.apply();
            }
            if (!ldrVar.g().f().o()) {
                ldrVar.g().f.b(null);
            }
            ldrVar.i().V(ldrVar.g().f.a());
            try {
                ldrVar.l().aS().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (ClassNotFoundException unused) {
                if (!TextUtils.isEmpty(ldrVar.g().p.a())) {
                    ldrVar.aT().f.a("Remote config removed with active feature rollouts");
                    ldrVar.g().p.b(null);
                }
            }
            if (!TextUtils.isEmpty(ldrVar.e().w())) {
                boolean zW = ldrVar.w();
                SharedPreferences sharedPreferences = ldrVar.g().b;
                if ((sharedPreferences == null || !sharedPreferences.contains("deferred_analytics_collection")) && !ldrVar.c.q()) {
                    ldrVar.g().j(!zW);
                }
                if (zW) {
                    ldrVar.i().y();
                }
                ldrVar.p().d.p();
                ldrVar.k().w(new AtomicReference());
                ldrVar.k().N(ldrVar.g().s.a());
            }
        } else if (ldrVar.w()) {
            if (!ldrVar.l().ai("android.permission.INTERNET")) {
                ldrVar.aT().c.a("App is missing INTERNET permission");
            }
            if (!ldrVar.l().ai("android.permission.ACCESS_NETWORK_STATE")) {
                ldrVar.aT().c.a("App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = ldrVar.a;
            if (!kte.a.a(context).h() && !ldrVar.c.s()) {
                if (!lga.ao(context)) {
                    ldrVar.aT().c.a("AppMeasurementReceiver not registered/enabled");
                }
                if (!lga.au(context)) {
                    ldrVar.aT().c.a("AppMeasurementService not registered/enabled");
                }
            }
            ldrVar.aT().c.a("Uploading is not possible. App measurement disabled");
        }
        ldrVar.g().j.a(true);
    }
}
