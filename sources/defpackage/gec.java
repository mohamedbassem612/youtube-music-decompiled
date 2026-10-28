package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gec implements Application.ActivityLifecycleCallbacks {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    public final void a(gdx gdxVar) {
        this.b.add(gdxVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof gfr) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity instanceof gfr) {
            List list = this.a;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityDestroyed(activity);
            }
            list.clear();
            this.b.clear();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity instanceof gfr) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity instanceof gfr) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (activity instanceof gfr) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity instanceof gfr) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity instanceof gfr) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStopped(activity);
            }
        }
    }
}
