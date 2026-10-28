package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfn implements Application.ActivityLifecycleCallbacks {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/activities/TransactionTooLargeHandler");
    public final gdw b;
    private final Handler c;

    public gfn(Context context, gdw gdwVar) {
        this.c = new Handler(context.getMainLooper());
        this.b = gdwVar;
    }

    public static final int a(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(bundle, 0);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        return iDataSize;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(bundle);
        agrx agrxVar = agso.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.c.post(new bf(this, bundle, activity, 20));
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
}
