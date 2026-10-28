package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface kzj extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(kzm kzmVar);

    void getAppInstanceId(kzm kzmVar);

    void getCachedAppInstanceId(kzm kzmVar);

    void getConditionalUserProperties(String str, String str2, kzm kzmVar);

    void getCurrentScreenClass(kzm kzmVar);

    void getCurrentScreenName(kzm kzmVar);

    void getGmpAppId(kzm kzmVar);

    void getMaxUserProperties(String str, kzm kzmVar);

    void getSessionId(kzm kzmVar);

    void getTestFlag(kzm kzmVar, int i);

    void getUserProperties(String str, String str2, boolean z, kzm kzmVar);

    void initForTests(Map map);

    void initialize(kuo kuoVar, kzu kzuVar, long j);

    void initializeWithElapsedTime(kuo kuoVar, kzu kzuVar, long j, long j2);

    void isDataCollectionEnabled(kzm kzmVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, kzm kzmVar, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, kuo kuoVar, kuo kuoVar2, kuo kuoVar3);

    void onActivityCreated(kuo kuoVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(kzv kzvVar, Bundle bundle, long j);

    void onActivityDestroyed(kuo kuoVar, long j);

    void onActivityDestroyedByScionActivityInfo(kzv kzvVar, long j);

    void onActivityPaused(kuo kuoVar, long j);

    void onActivityPausedByScionActivityInfo(kzv kzvVar, long j);

    void onActivityResumed(kuo kuoVar, long j);

    void onActivityResumedByScionActivityInfo(kzv kzvVar, long j);

    void onActivitySaveInstanceState(kuo kuoVar, kzm kzmVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(kzv kzvVar, kzm kzmVar, long j);

    void onActivityStarted(kuo kuoVar, long j);

    void onActivityStartedByScionActivityInfo(kzv kzvVar, long j);

    void onActivityStopped(kuo kuoVar, long j);

    void onActivityStoppedByScionActivityInfo(kzv kzvVar, long j);

    void performAction(Bundle bundle, kzm kzmVar, long j);

    void registerOnMeasurementEventListener(kzr kzrVar);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(kzp kzpVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(kuo kuoVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(kzv kzvVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(kzr kzrVar);

    void setInstanceIdProvider(kzt kztVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, kuo kuoVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(kzr kzrVar);
}
