package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahsu implements Application.ActivityLifecycleCallbacks {
    private final Queue a = new ArrayDeque(10);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            Bundle bundle2 = null;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String strG = ahno.g(extras);
                    if (!TextUtils.isEmpty(strG)) {
                        Queue queue = this.a;
                        if (queue.contains(strG)) {
                            return;
                        } else {
                            queue.add(strG);
                        }
                    }
                    bundle2 = extras.getBundle("gcm.n.analytics_data");
                }
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
            }
            if (ahno.m(bundle2)) {
                if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc"))) {
                    ahoa ahoaVar = (ahoa) ahnr.b().f(ahoa.class);
                    if (ahoaVar != null) {
                        String string = bundle2.getString("google.c.a.c_id");
                        ahoaVar.b(string);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("source", "Firebase");
                        bundle3.putString("medium", "notification");
                        bundle3.putString("campaign", string);
                        ahoaVar.a("fcm", "_cmp", bundle3);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                }
                ahno.j("_no", bundle2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
