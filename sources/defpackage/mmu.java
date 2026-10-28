package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mmu implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Activity a;
    final /* synthetic */ Application b;
    final /* synthetic */ Object c;

    public mmu(Object obj, Activity activity, Application application, int i) {
        this.$cid = i;
        this.a = activity;
        this.b = application;
        this.c = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.$cid;
        Activity activity2 = this.a;
        if (i == 0) {
            if (activity == activity2) {
                ((mmv) this.c).e = agdf.a;
                this.b.unregisterActivityLifecycleCallbacks(this);
                return;
            }
            return;
        }
        if (activity == activity2) {
            Object obj = this.c;
            agdf agdfVar = agdf.a;
            miy miyVar = (miy) obj;
            miyVar.e = agdfVar;
            miyVar.p = agdfVar;
            this.b.unregisterActivityLifecycleCallbacks(this);
        }
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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
