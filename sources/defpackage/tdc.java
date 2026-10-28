package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tdc implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final /* synthetic */ int e = 0;
    private final Executor f;
    private final boolean g;
    private final tqj h;
    private volatile int i;
    private volatile int j;
    private volatile int k;
    private volatile int l;
    private volatile int m;
    private volatile int n;
    private CountDownTimer o;
    private volatile String p;
    private volatile Activity q;
    private volatile Activity r;
    public final Deque c = new ArrayDeque();
    public final List a = new CopyOnWriteArrayList();
    public volatile int d = 1;
    public final List b = new ArrayList();

    public tdc(Executor executor, tqj tqjVar) {
        this.f = executor;
        this.h = tqjVar;
        int i = tqr.a;
        this.g = tqjVar.k(1073830409);
    }

    public static void b(List list, tcu tcuVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vwt vwtVar = (vwt) it.next();
            if (tcuVar.equals(vwtVar.a)) {
                list.remove(vwtVar);
                return;
            }
        }
    }

    private final int d() {
        int i = tqr.a;
        return (int) this.h.c(1073961383);
    }

    private final void e(Activity activity) {
        c(qel.d(activity.getApplicationContext()), activity);
    }

    private final void f(Class cls, Activity activity, Object obj, tdb tdbVar) {
        a(new tcv(this, cls, activity, tdbVar, 0));
        Activity activity2 = this.r;
        for (vwt vwtVar : this.a) {
            if (vwtVar.H(cls)) {
                tdbVar.a((tcu) cls.cast(vwtVar.a));
            }
        }
    }

    public final void a(Runnable runnable) {
        if (this.g) {
            this.f.execute(afwl.i(runnable));
        }
    }

    public final void c(boolean z, Activity activity) {
        CountDownTimer countDownTimer = this.o;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.o = null;
        }
        int i = z ? 2 : 3;
        if (i != this.d) {
            this.d = i;
            if (z) {
                f(tcr.class, activity, null, new tcx(2));
            } else {
                f(tcq.class, activity, null, new tcy(1));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.r = activity;
        this.i++;
        this.q = null;
        if (d() == 1) {
            c(true, activity);
        }
        f(tcj.class, activity, bundle, new tcx(3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.r) {
            this.r = null;
        }
        this.n++;
        this.q = null;
        f(tck.class, activity, null, new tcy(2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.l++;
        this.p = null;
        f(tcl.class, activity, null, new tcy(0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.r = activity;
        this.k++;
        this.q = null;
        this.p = activity.getClass().getSimpleName();
        int iD = d();
        if (iD == 1 || iD == 2 || iD == 3) {
            c(true, activity);
        }
        f(tcm.class, activity, null, new tcx(0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f(tcn.class, activity, bundle, new tcy(4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.r = activity;
        this.j++;
        this.q = null;
        int iD = d();
        if (iD == 0) {
            e(activity);
        } else if (iD == 1 || iD == 2 || iD == 4) {
            c(true, activity);
        }
        f(tco.class, activity, null, new tcx(1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.m++;
        this.q = activity;
        f(tcp.class, activity, null, new tcy(3));
        if (d() == 0) {
            e(activity);
            return;
        }
        if (this.m == this.j) {
            tqj tqjVar = this.h;
            int i = tqr.a;
            long jC = tqjVar.c(1074419996);
            long jMax = jC > 0 ? Math.max(jC * 5, 250L) : 700L;
            tcz tczVar = new tcz(this, jMax, jMax, activity);
            this.o = tczVar;
            tczVar.start();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        f(tct.class, null, null, new tdb() { // from class: tcw
            @Override // defpackage.tdb
            public final void a(tcu tcuVar) {
                int i2 = tdc.e;
                ((tct) tcuVar).b(i);
            }
        });
        if (i >= 20 && this.q != null) {
            c(false, this.q);
        }
        this.q = null;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
