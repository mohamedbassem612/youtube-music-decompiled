package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mbw implements Application.ActivityLifecycleCallbacks {
    private int a;
    private final Set b;

    public mbw(Set set) {
        this.b = set;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
        this.a = i + 1;
        if (i == 0) {
            for (aami aamiVar : this.b) {
                ((mcs) ((aami) aamiVar.b).b).a(aamiVar.a);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                aami aamiVar = (aami) ((aami) it.next()).b;
                ((mcs) aamiVar.b).a(aamiVar.a);
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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
