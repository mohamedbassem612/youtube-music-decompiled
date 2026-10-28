package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmr implements Application.ActivityLifecycleCallbacks {
    public final twv a;
    public final syy b;
    public volatile wmq c;
    private final tqj d;
    private volatile Activity e;

    public wmr(Context context, syy syyVar, tqj tqjVar) {
        this.b = syyVar;
        this.d = tqjVar;
        this.a = new wmp(this, context);
    }

    public final DisplayMetrics a(Context context) {
        DisplayMetrics displayMetrics;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 30) {
                this.b.b(activity);
            }
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        return displayMetrics == null ? context.getResources().getDisplayMetrics() : displayMetrics;
    }

    public final void b(Activity activity) {
        this.c = new wmq(a(activity), false);
    }

    public final void c() {
        Activity activity = this.e;
        if (activity != null) {
            this.b.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.e = activity;
        activity.getClass();
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (Objects.equals(this.e, activity)) {
            this.e = null;
            tqj tqjVar = this.d;
            int i = tqr.a;
            if (tqjVar.k(1073830286)) {
                this.b.b(activity);
            }
            activity.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        int i = tqr.a;
        if (this.d.k(1073830286)) {
            this.e = activity;
            activity.getClass();
            b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.e = activity;
        activity.getClass();
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.e = activity;
        activity.getClass();
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (Objects.equals(this.e, activity)) {
            this.e = null;
            tqj tqjVar = this.d;
            int i = tqr.a;
            if (tqjVar.k(1073830286)) {
                this.b.b(activity);
            }
            activity.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
