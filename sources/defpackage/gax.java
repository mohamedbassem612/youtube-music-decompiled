package defpackage;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gax implements gaz {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Activity a;

    public gax(Activity activity, int i) {
        this.$cid = i;
        this.a = activity;
    }

    @Override // defpackage.gaz
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        int i = this.$cid;
        if (i == 0) {
            activityLifecycleCallbacks.onActivityResumed(this.a);
            return;
        }
        if (i == 1) {
            activityLifecycleCallbacks.onActivityStarted(this.a);
            return;
        }
        if (i == 2) {
            activityLifecycleCallbacks.onActivityPaused(this.a);
            return;
        }
        Activity activity = this.a;
        if (i != 3) {
            activityLifecycleCallbacks.onActivityDestroyed(activity);
        } else {
            activityLifecycleCallbacks.onActivityStopped(activity);
        }
    }
}
