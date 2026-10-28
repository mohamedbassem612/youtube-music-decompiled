package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qtl implements Application.ActivityLifecycleCallbacks, qth {
    private static final long i;
    public final ScheduledExecutorService a;
    public qtj b;
    public ScheduledFuture g;
    private final qti j;
    public final AtomicLong f = new AtomicLong(0);
    public long c = 100;
    public long d = i;
    public boolean e = true;
    protected final Object h = new Object();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        i = 60000L;
    }

    public qtl(qtj qtjVar, ScheduledExecutorService scheduledExecutorService, qti qtiVar) {
        this.b = qtjVar;
        this.a = scheduledExecutorService;
        this.j = qtiVar;
    }

    public static qtl a(qtj qtjVar, ScheduledExecutorService scheduledExecutorService, qti qtiVar, Application application) {
        qtl qtlVar = new qtl(qtjVar, scheduledExecutorService, qtiVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(qtlVar);
        }
        qtiVar.a = qtlVar;
        return qtlVar;
    }

    public final void b() {
        synchronized (this.h) {
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.g = null;
            }
        }
    }

    public final void c() {
        if (this.e) {
            this.f.set(0L);
            this.b.a(this.j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.h) {
            c();
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
