package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qnq implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ agev c;
    final /* synthetic */ Set d;
    final /* synthetic */ awmd e;
    final /* synthetic */ omr f;

    public qnq(Application application, agev agevVar, Set set, omr omrVar, awmd awmdVar) {
        this.b = application;
        this.c = agevVar;
        this.d = set;
        this.f = omrVar;
        this.e = awmdVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [agek, java.lang.Object] */
    private final agke a() {
        if (this.a) {
            return agpi.a;
        }
        this.a = true;
        Application application = this.b;
        application.unregisterActivityLifecycleCallbacks(this);
        agkx agkxVar = new agkx();
        agkxVar.j(this.d);
        if (this.f.m()) {
            agkxVar.j((Iterable) this.e.io());
        } else {
            Boolean.FALSE.booleanValue();
        }
        agkz agkzVarG = agkxVar.g();
        int size = agkzVarG.size();
        aguu.ag(size, "expectedSize");
        agjz agjzVar = new agjz(size);
        agqr it = agkzVarG.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((agfa) this.c).a.apply((Application.ActivityLifecycleCallbacks) it.next());
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            agjzVar.h(activityLifecycleCallbacks);
        }
        return agjzVar.g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        agke agkeVarA = a();
        int i = ((agpi) agkeVarA).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) agkeVarA.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ahno.O(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ahno.O(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        agke agkeVarA = a();
        int i = ((agpi) agkeVarA).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) agkeVarA.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!this.a) {
            throw new IllegalStateException();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ahno.O(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.a) {
            throw new IllegalStateException();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ahno.O(this.a);
    }
}
