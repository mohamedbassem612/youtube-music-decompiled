package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qig implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final /* synthetic */ qih b;

    public qig(qih qihVar, Application application) {
        this.b = qihVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        qih qihVar = this.b;
        qie qieVar = qihVar.n;
        if (qieVar.b != null) {
            qieVar = qihVar.o;
        }
        qieVar.a = activity.getClass().getSimpleName();
        qieVar.b = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        qih qihVar = this.b;
        qie qieVar = qihVar.o;
        if (qieVar.b == null) {
            qieVar = qihVar.n;
        }
        if (qieVar.d == null) {
            qieVar.d = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new qif(this, viewFindViewById));
            viewTreeObserver.addOnPreDrawListener(new aebm(this, viewFindViewById, 1));
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        qih qihVar = this.b;
        qie qieVar = qihVar.o;
        if (qieVar.b == null) {
            qieVar = qihVar.n;
        }
        if (qieVar.c == null) {
            qieVar.c = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
