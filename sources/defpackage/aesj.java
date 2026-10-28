package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesj implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public Boolean a;
    private final boolean b;
    private volatile Activity c;

    public aesj(boolean z) {
        this.b = z;
    }

    private final void a(Activity activity) {
        b(Boolean.valueOf(qel.d(activity.getApplicationContext())));
    }

    private final void b(Boolean bool) {
        if (bool.equals(this.a)) {
            int i = aerx.a;
        } else {
            this.a = bool;
            int i2 = aerx.a;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.c = null;
        if (this.b) {
            b(Boolean.TRUE);
        } else {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.c = null;
        if (this.b) {
            b(Boolean.TRUE);
        } else {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.c = activity;
        a(activity);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 20 && this.c != null) {
            Activity activity = this.c;
            b(Boolean.FALSE);
        }
        this.c = null;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
