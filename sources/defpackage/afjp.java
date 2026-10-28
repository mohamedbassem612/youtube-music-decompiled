package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afjp implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public afjp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.$cid != 0) {
            ((lay) this.a).i(new lar(this, bundle, kzv.a(activity)));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.$cid != 0) {
            ((lay) this.a).i(new lax(this, kzv.a(activity)));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.$cid != 0) {
            ((lay) this.a).i(new lau(this, kzv.a(activity)));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.$cid != 0) {
            ((lay) this.a).i(new lat(this, kzv.a(activity)));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (this.$cid != 0) {
            kzv kzvVarA = kzv.a(activity);
            kzl kzlVar = new kzl();
            ((lay) this.a).i(new law(this, kzvVarA, kzlVar));
            Bundle bundleB = kzlVar.b(50L);
            if (bundleB != null) {
                bundle.putAll(bundleB);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.$cid != 0) {
            ((lay) this.a).i(new las(this, kzv.a(activity)));
            return;
        }
        afjq afjqVar = (afjq) this.a;
        int i = afjqVar.b + 1;
        afjqVar.b = i;
        if (i == 1) {
            afjqVar.a(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.$cid != 0) {
            ((lay) this.a).i(new lav(this, kzv.a(activity)));
            return;
        }
        afjq afjqVar = (afjq) this.a;
        int i = afjqVar.b - 1;
        afjqVar.b = i;
        if (i != 0 || activity.isChangingConfigurations()) {
            return;
        }
        afjqVar.a(false);
    }
}
