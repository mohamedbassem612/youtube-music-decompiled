package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzh extends gda implements kzj {
    public kzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.kzj
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeLong(j);
        e(23, parcelC);
    }

    @Override // defpackage.kzj
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        e(9, parcelC);
    }

    @Override // defpackage.kzj
    public final void clearMeasurementEnabled(long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeLong(j);
        e(24, parcelC);
    }

    @Override // defpackage.kzj
    public final void generateEventId(kzm kzmVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kzmVar);
        e(22, parcelC);
    }

    @Override // defpackage.kzj
    public final void getAppInstanceId(kzm kzmVar) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void getCachedAppInstanceId(kzm kzmVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kzmVar);
        e(19, parcelC);
    }

    @Override // defpackage.kzj
    public final void getConditionalUserProperties(String str, String str2, kzm kzmVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.e(parcelC, kzmVar);
        e(10, parcelC);
    }

    @Override // defpackage.kzj
    public final void getCurrentScreenClass(kzm kzmVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kzmVar);
        e(17, parcelC);
    }

    @Override // defpackage.kzj
    public final void getCurrentScreenName(kzm kzmVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kzmVar);
        e(16, parcelC);
    }

    @Override // defpackage.kzj
    public final void getGmpAppId(kzm kzmVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kzmVar);
        e(21, parcelC);
    }

    @Override // defpackage.kzj
    public final void getMaxUserProperties(String str, kzm kzmVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        gdc.e(parcelC, kzmVar);
        e(6, parcelC);
    }

    @Override // defpackage.kzj
    public final void getSessionId(kzm kzmVar) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void getTestFlag(kzm kzmVar, int i) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void getUserProperties(String str, String str2, boolean z, kzm kzmVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        ClassLoader classLoader = gdc.a;
        parcelC.writeInt(z ? 1 : 0);
        gdc.e(parcelC, kzmVar);
        e(5, parcelC);
    }

    @Override // defpackage.kzj
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void initialize(kuo kuoVar, kzu kzuVar, long j) {
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        gdc.c(parcelC, kzuVar);
        parcelC.writeLong(j);
        e(1, parcelC);
    }

    @Override // defpackage.kzj
    public final void initializeWithElapsedTime(kuo kuoVar, kzu kzuVar, long j, long j2) {
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        gdc.c(parcelC, kzuVar);
        parcelC.writeLong(j);
        parcelC.writeLong(j2);
        e(60, parcelC);
    }

    @Override // defpackage.kzj
    public final void isDataCollectionEnabled(kzm kzmVar) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        parcelC.writeInt(z ? 1 : 0);
        parcelC.writeInt(1);
        parcelC.writeLong(j);
        e(2, parcelC);
    }

    @Override // defpackage.kzj
    public final void logEventAndBundle(String str, String str2, Bundle bundle, kzm kzmVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, bundle);
        parcelC.writeInt(z ? 1 : 0);
        parcelC.writeInt(1);
        parcelC.writeLong(j);
        parcelC.writeLong(j2);
        e(59, parcelC);
    }

    @Override // defpackage.kzj
    public final void logHealthData(int i, String str, kuo kuoVar, kuo kuoVar2, kuo kuoVar3) {
        Parcel parcelC = c();
        parcelC.writeInt(5);
        parcelC.writeString("Error with data collection. Data lost.");
        gdc.e(parcelC, kuoVar);
        gdc.e(parcelC, kuoVar2);
        gdc.e(parcelC, kuoVar3);
        e(33, parcelC);
    }

    @Override // defpackage.kzj
    public final void onActivityCreated(kuo kuoVar, Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void onActivityCreatedByScionActivityInfo(kzv kzvVar, Bundle bundle, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        gdc.c(parcelC, bundle);
        parcelC.writeLong(j);
        e(53, parcelC);
    }

    @Override // defpackage.kzj
    public final void onActivityDestroyed(kuo kuoVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void onActivityDestroyedByScionActivityInfo(kzv kzvVar, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        parcelC.writeLong(j);
        e(54, parcelC);
    }

    @Override // defpackage.kzj
    public final void onActivityPaused(kuo kuoVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void onActivityPausedByScionActivityInfo(kzv kzvVar, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        parcelC.writeLong(j);
        e(55, parcelC);
    }

    @Override // defpackage.kzj
    public final void onActivityResumed(kuo kuoVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void onActivityResumedByScionActivityInfo(kzv kzvVar, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        parcelC.writeLong(j);
        e(56, parcelC);
    }

    @Override // defpackage.kzj
    public final void onActivitySaveInstanceState(kuo kuoVar, kzm kzmVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void onActivitySaveInstanceStateByScionActivityInfo(kzv kzvVar, kzm kzmVar, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        gdc.e(parcelC, kzmVar);
        parcelC.writeLong(j);
        e(57, parcelC);
    }

    @Override // defpackage.kzj
    public final void onActivityStarted(kuo kuoVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void onActivityStartedByScionActivityInfo(kzv kzvVar, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        parcelC.writeLong(j);
        e(51, parcelC);
    }

    @Override // defpackage.kzj
    public final void onActivityStopped(kuo kuoVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void onActivityStoppedByScionActivityInfo(kzv kzvVar, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        parcelC.writeLong(j);
        e(52, parcelC);
    }

    @Override // defpackage.kzj
    public final void performAction(Bundle bundle, kzm kzmVar, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void registerOnMeasurementEventListener(kzr kzrVar) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void resetAnalyticsData(long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void retrieveAndUploadBatches(kzp kzpVar) {
        Parcel parcelC = c();
        gdc.e(parcelC, kzpVar);
        e(58, parcelC);
    }

    @Override // defpackage.kzj
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, bundle);
        parcelC.writeLong(j);
        e(8, parcelC);
    }

    @Override // defpackage.kzj
    public final void setConsent(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setConsentThirdParty(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setCurrentScreen(kuo kuoVar, String str, String str2, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setCurrentScreenByScionActivityInfo(kzv kzvVar, String str, String str2, long j) {
        Parcel parcelC = c();
        gdc.c(parcelC, kzvVar);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeLong(j);
        e(50, parcelC);
    }

    @Override // defpackage.kzj
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelC = c();
        gdc.c(parcelC, bundle);
        e(42, parcelC);
    }

    @Override // defpackage.kzj
    public final void setEventInterceptor(kzr kzrVar) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setInstanceIdProvider(kzt kztVar) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelC = c();
        ClassLoader classLoader = gdc.a;
        parcelC.writeInt(z ? 1 : 0);
        parcelC.writeLong(j);
        e(11, parcelC);
    }

    @Override // defpackage.kzj
    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setSessionTimeoutDuration(long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setSgtmDebugInfo(Intent intent) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setUserId(String str, long j) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void setUserProperty(String str, String str2, kuo kuoVar, boolean z, long j) {
        Parcel parcelC = c();
        parcelC.writeString("fcm");
        parcelC.writeString("_ln");
        gdc.e(parcelC, kuoVar);
        parcelC.writeInt(1);
        parcelC.writeLong(j);
        e(4, parcelC);
    }

    @Override // defpackage.kzj
    public final void unregisterOnMeasurementEventListener(kzr kzrVar) {
        throw null;
    }
}
