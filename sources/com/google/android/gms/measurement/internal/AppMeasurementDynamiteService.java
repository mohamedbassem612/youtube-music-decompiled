package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.aew;
import defpackage.afv;
import defpackage.csd;
import defpackage.ihq;
import defpackage.jmi;
import defpackage.jup;
import defpackage.kcx;
import defpackage.kro;
import defpackage.kun;
import defpackage.kuo;
import defpackage.kzi;
import defpackage.kzm;
import defpackage.kzp;
import defpackage.kzr;
import defpackage.kzt;
import defpackage.kzu;
import defpackage.kzv;
import defpackage.lbc;
import defpackage.lbe;
import defpackage.lbf;
import defpackage.lbt;
import defpackage.lcc;
import defpackage.lcd;
import defpackage.lcl;
import defpackage.ldr;
import defpackage.ldu;
import defpackage.lei;
import defpackage.leq;
import defpackage.ler;
import defpackage.lga;
import defpackage.lgh;
import defpackage.lhf;
import defpackage.lhh;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends kzi {
    public ldr a = null;
    private final Map b = new afv();

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, kzp kzpVar) {
        try {
            kzpVar.a();
        } catch (RemoteException e) {
            ldr ldrVar = appMeasurementDynamiteService.a;
            kro.l(ldrVar);
            ldrVar.aT().f.b("Failed to call IDynamiteUploadBatchesCallback", e);
        }
    }

    private final void b() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void c(kzm kzmVar, String str) {
        b();
        this.a.l().Z(kzmVar, str);
    }

    @Override // defpackage.kzj
    public void beginAdUnitExposure(String str, long j) {
        b();
        this.a.c().a(str, j);
    }

    @Override // defpackage.kzj
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        b();
        this.a.i().A(str, str2, bundle);
    }

    @Override // defpackage.kzj
    public void clearMeasurementEnabled(long j) {
        b();
        this.a.i().Z(null);
    }

    @Override // defpackage.kzj
    public void endAdUnitExposure(String str, long j) {
        b();
        this.a.c().b(str, j);
    }

    @Override // defpackage.kzj
    public void generateEventId(kzm kzmVar) {
        b();
        long jS = this.a.l().s();
        b();
        this.a.l().Y(kzmVar, jS);
    }

    @Override // defpackage.kzj
    public void getAppInstanceId(kzm kzmVar) {
        b();
        this.a.aU().j(new jmi(this, kzmVar, 17, (byte[]) null));
    }

    @Override // defpackage.kzj
    public void getCachedAppInstanceId(kzm kzmVar) {
        b();
        c(kzmVar, this.a.i().u());
    }

    @Override // defpackage.kzj
    public void getConditionalUserProperties(String str, String str2, kzm kzmVar) {
        b();
        this.a.aU().j(new aew(this, kzmVar, (Object) str, str2, 13));
    }

    @Override // defpackage.kzj
    public void getCurrentScreenClass(kzm kzmVar) {
        b();
        c(kzmVar, this.a.i().v());
    }

    @Override // defpackage.kzj
    public void getCurrentScreenName(kzm kzmVar) {
        b();
        c(kzmVar, this.a.i().w());
    }

    @Override // defpackage.kzj
    public void getGmpAppId(kzm kzmVar) {
        b();
        c(kzmVar, this.a.i().x());
    }

    @Override // defpackage.kzj
    public void getMaxUserProperties(String str, kzm kzmVar) {
        b();
        this.a.i();
        kro.i(str);
        b();
        this.a.l().X(kzmVar, 25);
    }

    @Override // defpackage.kzj
    public void getSessionId(kzm kzmVar) {
        b();
        ler lerVarI = this.a.i();
        lerVarI.aU().j(new ldu((Object) lerVarI, (Object) kzmVar, 14));
    }

    @Override // defpackage.kzj
    public void getTestFlag(kzm kzmVar, int i) {
        b();
        if (i == 0) {
            lga lgaVarL = this.a.l();
            ler lerVarI = this.a.i();
            AtomicReference atomicReference = new AtomicReference();
            lgaVarL.Z(kzmVar, (String) lerVarI.aU().a(atomicReference, 15000L, "String test flag value", new ldu(lerVarI, atomicReference, 15, (byte[]) null)));
            return;
        }
        if (i == 1) {
            lga lgaVarL2 = this.a.l();
            ler lerVarI2 = this.a.i();
            AtomicReference atomicReference2 = new AtomicReference();
            lgaVarL2.Y(kzmVar, ((Long) lerVarI2.aU().a(atomicReference2, 15000L, "long test flag value", new ldu(lerVarI2, atomicReference2, 16, (byte[]) null))).longValue());
            return;
        }
        if (i == 2) {
            lga lgaVarL3 = this.a.l();
            ler lerVarI3 = this.a.i();
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) lerVarI3.aU().a(atomicReference3, 15000L, "double test flag value", new ldu(lerVarI3, atomicReference3, 18, (byte[]) null))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                kzmVar.a(bundle);
                return;
            } catch (RemoteException e) {
                lgaVarL3.t.aT().f.b("Error returning double value to wrapper", e);
                return;
            }
        }
        if (i == 3) {
            lga lgaVarL4 = this.a.l();
            ler lerVarI4 = this.a.i();
            AtomicReference atomicReference4 = new AtomicReference();
            lgaVarL4.X(kzmVar, ((Integer) lerVarI4.aU().a(atomicReference4, 15000L, "int test flag value", new ldu(lerVarI4, atomicReference4, 17, (byte[]) null))).intValue());
            return;
        }
        if (i == 4) {
            lga lgaVarL5 = this.a.l();
            ler lerVarI5 = this.a.i();
            AtomicReference atomicReference5 = new AtomicReference();
            lgaVarL5.T(kzmVar, ((Boolean) lerVarI5.aU().a(atomicReference5, 15000L, "boolean test flag value", new ldu(lerVarI5, atomicReference5, 11, (byte[]) null))).booleanValue());
        }
    }

    @Override // defpackage.kzj
    public void getUserProperties(String str, String str2, boolean z, kzm kzmVar) {
        b();
        this.a.aU().j(new lbe(this, kzmVar, str, str2, z, 0));
    }

    @Override // defpackage.kzj
    public void initForTests(Map map) {
        b();
    }

    @Override // defpackage.kzj
    @Deprecated
    public void initialize(kuo kuoVar, kzu kzuVar, long j) {
        ldr ldrVar = this.a;
        if (ldrVar != null) {
            ldrVar.aT().f.a("Attempting to initialize multiple times");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = (Context) kun.b(kuoVar);
        kro.l(context);
        ldr ldrVarH = ldr.h(context, kzuVar, Long.valueOf(j), null);
        this.a = ldrVarH;
        ldrVarH.aU().j(new jup(ldrVarH, SystemClock.elapsedRealtime() - jElapsedRealtime, 4, null));
    }

    @Override // defpackage.kzj
    public void initializeWithElapsedTime(kuo kuoVar, kzu kzuVar, long j, long j2) {
        ldr ldrVar = this.a;
        if (ldrVar != null) {
            ldrVar.aT().f.a("Attempting to initialize multiple times");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = (Context) kun.b(kuoVar);
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        ldr ldrVarH = ldr.h(context, kzuVar, Long.valueOf(j), Long.valueOf(j2));
        this.a = ldrVarH;
        lbt lbtVar = ldrVarH.c;
        if (lbtVar.F(null, lcl.bm) && lbtVar.F(null, lcl.aT)) {
            ldrVarH.aU().j(new jup(ldrVarH, SystemClock.elapsedRealtime() - jElapsedRealtime, 3));
        }
    }

    @Override // defpackage.kzj
    public void isDataCollectionEnabled(kzm kzmVar) {
        b();
        this.a.aU().j(new jmi(this, kzmVar, 19, (byte[]) null));
    }

    @Override // defpackage.kzj
    @Deprecated
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        b();
        ldr ldrVar = this.a;
        try {
            if (ldrVar.c.F(null, lcl.bi)) {
                ldrVar.aU().j(new kcx(ldrVar, 16));
            }
        } catch (IllegalStateException e) {
            ldrVar.aT().f.b("Failed to record legacy logEvent diagnostic", e);
        }
        ldrVar.i().F(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // defpackage.kzj
    public void logEventAndBundle(String str, String str2, Bundle bundle, kzm kzmVar, long j) {
        b();
        kro.i(str2);
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", "auto");
        this.a.aU().j(new aew(this, kzmVar, (Object) new lcd(str2, new lcc(bundle2), "auto", j, 0L), str, 12));
    }

    @Override // defpackage.kzj
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        b();
        this.a.i().F(str, str2, bundle, z, z2, j, j2);
    }

    @Override // defpackage.kzj
    public void logHealthData(int i, String str, kuo kuoVar, kuo kuoVar2, kuo kuoVar3) {
        b();
        this.a.aT().g(i, true, false, str, kuoVar == null ? null : kun.b(kuoVar), kuoVar2 == null ? null : kun.b(kuoVar2), kuoVar3 != null ? kun.b(kuoVar3) : null);
    }

    @Override // defpackage.kzj
    public void onActivityCreated(kuo kuoVar, Bundle bundle, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        onActivityCreatedByScionActivityInfo(kzv.a(activity), bundle, j);
    }

    @Override // defpackage.kzj
    public void onActivityCreatedByScionActivityInfo(kzv kzvVar, Bundle bundle, long j) {
        b();
        leq leqVar = this.a.i().a;
        if (leqVar != null) {
            this.a.i().B();
            leqVar.a(kzvVar, bundle);
        }
    }

    @Override // defpackage.kzj
    public void onActivityDestroyed(kuo kuoVar, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        onActivityDestroyedByScionActivityInfo(kzv.a(activity), j);
    }

    @Override // defpackage.kzj
    public void onActivityDestroyedByScionActivityInfo(kzv kzvVar, long j) {
        b();
        leq leqVar = this.a.i().a;
        if (leqVar != null) {
            this.a.i().B();
            leqVar.b(kzvVar);
        }
    }

    @Override // defpackage.kzj
    public void onActivityPaused(kuo kuoVar, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        onActivityPausedByScionActivityInfo(kzv.a(activity), j);
    }

    @Override // defpackage.kzj
    public void onActivityPausedByScionActivityInfo(kzv kzvVar, long j) {
        b();
        leq leqVar = this.a.i().a;
        if (leqVar != null) {
            this.a.i().B();
            leqVar.c(kzvVar);
        }
    }

    @Override // defpackage.kzj
    public void onActivityResumed(kuo kuoVar, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        onActivityResumedByScionActivityInfo(kzv.a(activity), j);
    }

    @Override // defpackage.kzj
    public void onActivityResumedByScionActivityInfo(kzv kzvVar, long j) {
        b();
        leq leqVar = this.a.i().a;
        if (leqVar != null) {
            this.a.i().B();
            leqVar.d(kzvVar);
        }
    }

    @Override // defpackage.kzj
    public void onActivitySaveInstanceState(kuo kuoVar, kzm kzmVar, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        onActivitySaveInstanceStateByScionActivityInfo(kzv.a(activity), kzmVar, j);
    }

    @Override // defpackage.kzj
    public void onActivitySaveInstanceStateByScionActivityInfo(kzv kzvVar, kzm kzmVar, long j) {
        b();
        leq leqVar = this.a.i().a;
        Bundle bundle = new Bundle();
        if (leqVar != null) {
            this.a.i().B();
            leqVar.e(kzvVar, bundle);
        }
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.a.aT().f.b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.kzj
    public void onActivityStarted(kuo kuoVar, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        onActivityStartedByScionActivityInfo(kzv.a(activity), j);
    }

    @Override // defpackage.kzj
    public void onActivityStartedByScionActivityInfo(kzv kzvVar, long j) {
        b();
        if (this.a.i().a != null) {
            this.a.i().B();
        }
    }

    @Override // defpackage.kzj
    public void onActivityStopped(kuo kuoVar, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        onActivityStoppedByScionActivityInfo(kzv.a(activity), j);
    }

    @Override // defpackage.kzj
    public void onActivityStoppedByScionActivityInfo(kzv kzvVar, long j) {
        b();
        if (this.a.i().a != null) {
            this.a.i().B();
        }
    }

    @Override // defpackage.kzj
    public void performAction(Bundle bundle, kzm kzmVar, long j) {
        b();
        kzmVar.a(null);
    }

    @Override // defpackage.kzj
    public void registerOnMeasurementEventListener(kzr kzrVar) {
        lbf lbfVar;
        b();
        Map map = this.b;
        synchronized (map) {
            lbfVar = (lbf) map.get(Integer.valueOf(kzrVar.a()));
            if (lbfVar == null) {
                lbfVar = new lbf(this, kzrVar);
                map.put(Integer.valueOf(kzrVar.a()), lbfVar);
            }
        }
        ler lerVarI = this.a.i();
        lerVarI.a();
        if (lerVarI.b.add(lbfVar)) {
            return;
        }
        lerVarI.aT().f.a("OnEventListener already registered");
    }

    @Override // defpackage.kzj
    @Deprecated
    public void resetAnalyticsData(long j) {
        b();
        this.a.i().ak(j);
    }

    @Override // defpackage.kzj
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        b();
        this.a.i().ak(j);
    }

    @Override // defpackage.kzj
    public void retrieveAndUploadBatches(kzp kzpVar) {
        b();
        this.a.i().R(new jmi(this, kzpVar, 16, (char[]) null));
    }

    @Override // defpackage.kzj
    public void setConditionalUserProperty(Bundle bundle, long j) {
        b();
        ldr ldrVar = this.a;
        if (bundle == null) {
            ldrVar.aT().c.a("Conditional user property must not be null");
        } else {
            ldrVar.i().W(bundle, j);
        }
    }

    @Override // defpackage.kzj
    public void setConsentThirdParty(Bundle bundle, long j) {
        b();
        ler lerVarI = this.a.i();
        if (lerVarI.G().F(null, lcl.bk)) {
            lgh lghVar = lgh.a;
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                if (!lgh.b.contains(it.next())) {
                    lerVarI.aU().j(new kcx(lerVarI, 20));
                    break;
                }
            }
        }
        lerVarI.X(bundle, -20, j);
    }

    @Override // defpackage.kzj
    public void setCurrentScreen(kuo kuoVar, String str, String str2, long j) {
        b();
        Activity activity = (Activity) kun.b(kuoVar);
        kro.l(activity);
        setCurrentScreenByScionActivityInfo(kzv.a(activity), str, str2, j);
    }

    @Override // defpackage.kzj
    public void setCurrentScreenByScionActivityInfo(kzv kzvVar, String str, String str2, long j) {
        b();
        lhh lhhVarO = this.a.o();
        if (!lhhVarO.G().p()) {
            lhhVarO.aT().h.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        lhf lhfVar = lhhVarO.a;
        if (lhfVar == null) {
            lhhVarO.aT().h.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = lhhVarO.d;
        Integer numValueOf = Integer.valueOf(kzvVar.a);
        if (map.get(numValueOf) == null) {
            lhhVarO.aT().h.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        String strY = str2 == null ? lhhVarO.y(kzvVar.b) : str2;
        String str3 = lhfVar.b;
        String str4 = lhfVar.a;
        boolean zEquals = Objects.equals(str3, strY);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            lhhVarO.aT().h.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > lhhVarO.G().c(null, false))) {
            lhhVarO.aT().h.b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (strY != null && (strY.length() <= 0 || strY.length() > lhhVarO.G().c(null, false))) {
            lhhVarO.aT().h.b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(strY.length()));
            return;
        }
        lhhVarO.aT().k.c("Setting current screen to name, class", str == null ? "null" : str, strY);
        lhf lhfVar2 = new lhf(str, strY, lhhVarO.L().s(), false, 0L, 0L);
        map.put(numValueOf, lhfVar2);
        lhhVarO.u(kzvVar.b, lhfVar2, true);
    }

    @Override // defpackage.kzj
    public void setDataCollectionEnabled(boolean z) {
        b();
        ler lerVarI = this.a.i();
        lerVarI.a();
        lerVarI.aU().j(new csd(lerVarI, z, 4, null));
    }

    @Override // defpackage.kzj
    public void setDefaultEventParameters(Bundle bundle) {
        b();
        ler lerVarI = this.a.i();
        lerVarI.aU().j(new ihq((Object) lerVarI, (Object) (bundle == null ? new Bundle() : new Bundle(bundle)), 10, (byte[]) null));
    }

    @Override // defpackage.kzj
    public void setEventInterceptor(kzr kzrVar) {
        b();
        lbf lbfVar = new lbf(this, kzrVar);
        boolean zL = this.a.aU().l();
        ldr ldrVar = this.a;
        if (zL) {
            ldrVar.i().an(lbfVar);
        } else {
            ldrVar.aU().j(new jmi(this, lbfVar, 18, (byte[]) null));
        }
    }

    @Override // defpackage.kzj
    public void setInstanceIdProvider(kzt kztVar) {
        b();
    }

    @Override // defpackage.kzj
    public void setMeasurementEnabled(boolean z, long j) {
        b();
        this.a.i().Z(Boolean.valueOf(z));
    }

    @Override // defpackage.kzj
    public void setMinimumSessionDuration(long j) {
        b();
    }

    @Override // defpackage.kzj
    public void setSessionTimeoutDuration(long j) {
        b();
        ler lerVarI = this.a.i();
        lerVarI.aU().j(new jup((lbc) lerVarI, j, 5));
    }

    @Override // defpackage.kzj
    public void setSgtmDebugInfo(Intent intent) {
        b();
        ler lerVarI = this.a.i();
        if (intent != null) {
            Uri data = intent.getData();
            if (data == null) {
                lerVarI.aT().i.a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            if (lerVarI.G().F(null, lcl.aH)) {
                data = Uri.parse(data.toString());
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                lerVarI.aT().i.a("[sgtm] Preview Mode was not enabled.");
                lerVarI.G().a = null;
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            lerVarI.aT().i.b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            lerVarI.G().a = queryParameter2;
        }
    }

    @Override // defpackage.kzj
    public void setUserId(String str, long j) {
        b();
        ler lerVarI = this.a.i();
        if (str == null || !TextUtils.isEmpty(str)) {
            lerVarI.aU().j(new ldu(lerVarI, (Object) str, 8));
            lerVarI.ad(null, "_id", str, true, j);
        } else {
            lerVarI.t.aT().f.a("User ID must be non-empty or null");
            if (lerVarI.G().F(null, lcl.bj)) {
                lerVarI.aU().j(new lei(lerVarI, 0));
            }
        }
    }

    @Override // defpackage.kzj
    public void setUserProperty(String str, String str2, kuo kuoVar, boolean z, long j) {
        b();
        this.a.i().ad(str, str2, kun.b(kuoVar), z, j);
    }

    @Override // defpackage.kzj
    public void unregisterOnMeasurementEventListener(kzr kzrVar) {
        lbf lbfVar;
        b();
        Map map = this.b;
        synchronized (map) {
            lbfVar = (lbf) map.remove(Integer.valueOf(kzrVar.a()));
        }
        if (lbfVar == null) {
            lbfVar = new lbf(this, kzrVar);
        }
        ler lerVarI = this.a.i();
        lerVarI.a();
        if (lerVarI.b.remove(lbfVar)) {
            return;
        }
        lerVarI.aT().f.a("OnEventListener had not been registered");
    }

    @Override // defpackage.kzj
    public void setConsent(Bundle bundle, long j) {
    }
}
