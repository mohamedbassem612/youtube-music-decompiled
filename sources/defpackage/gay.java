package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gay implements gaz {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;

    public gay(Activity activity, Bundle bundle, int i) {
        this.$cid = i;
        this.a = activity;
        this.b = bundle;
    }

    @Override // defpackage.gaz
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        int i = this.$cid;
        Activity activity = this.a;
        Bundle bundle = this.b;
        if (i != 0) {
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
        } else {
            activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
        }
    }
}
