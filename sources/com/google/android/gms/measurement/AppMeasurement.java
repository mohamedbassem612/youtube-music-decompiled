package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import defpackage.kro;
import defpackage.kze;
import defpackage.kzf;
import defpackage.kzg;
import defpackage.kzu;
import defpackage.ldr;
import defpackage.les;
import defpackage.lqd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {
    private static volatile AppMeasurement a;
    private final kzg b;

    public AppMeasurement(les lesVar) {
        this.b = new kzf(lesVar);
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        les lesVar;
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    try {
                        lesVar = (les) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException | Exception unused) {
                        lesVar = null;
                    }
                    if (lesVar != null) {
                        a = new AppMeasurement(lesVar);
                    } else {
                        a = new AppMeasurement(ldr.h(context, new kzu(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return a;
    }

    public void beginAdUnitExposure(String str) {
        this.b.i(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.b.j(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.b.k(str);
    }

    public long generateEventId() {
        return this.b.b();
    }

    public String getAppInstanceId() {
        return this.b.c();
    }

    public List getConditionalUserProperties(String str, String str2) {
        List listG = this.b.g(str, str2);
        ArrayList arrayList = new ArrayList(listG == null ? 0 : listG.size());
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.b.d();
    }

    public String getCurrentScreenName() {
        return this.b.e();
    }

    public String getGmpAppId() {
        return this.b.f();
    }

    public int getMaxUserProperties(String str) {
        return this.b.a(str);
    }

    protected Map getUserProperties(String str, String str2, boolean z) {
        return this.b.h(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.b.l(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        kro.l(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            lqd.e(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        kzg kzgVar = this.b;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        kzgVar.m(bundle);
    }

    public AppMeasurement(ldr ldrVar) {
        this.b = new kze(ldrVar);
    }

    /* JADX INFO: compiled from: PG */
    public class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            kro.l(bundle);
            this.mAppId = (String) lqd.d(bundle, "app_id", String.class, null);
            this.mOrigin = (String) lqd.d(bundle, "origin", String.class, null);
            this.mName = (String) lqd.d(bundle, "name", String.class, null);
            this.mValue = lqd.d(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) lqd.d(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) lqd.d(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) lqd.d(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) lqd.d(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) lqd.d(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) lqd.d(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) lqd.d(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) lqd.d(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) lqd.d(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) lqd.d(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) lqd.d(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) lqd.d(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }

        public ConditionalUserProperty() {
        }
    }
}
