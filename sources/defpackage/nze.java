package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.Optional;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nze implements Application.ActivityLifecycleCallbacks {
    public final Optional a;
    public final long b;
    public final EnumMap c;
    public final Supplier d;
    public final Supplier e;
    public final Supplier f;
    public final Supplier g;
    private final Optional i;
    private final boolean j;
    private final long k;
    private ListenableFuture l = null;
    public long h = 0;
    private int m = 0;

    public nze(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4) {
        boolean z = false;
        this.a = optional;
        this.i = optional2;
        long millis = TimeUnit.SECONDS.toMillis(((Integer) optional4.orElse(0)).intValue());
        this.k = millis;
        long millis2 = TimeUnit.SECONDS.toMillis(((Integer) optional5.orElse(0)).intValue());
        this.b = millis2;
        this.c = new EnumMap(aslg.class);
        this.d = supplier;
        this.e = supplier2;
        this.f = supplier3;
        this.g = supplier4;
        if (((Boolean) optional3.orElse(Boolean.FALSE)).booleanValue()) {
            optional.isPresent();
            optional2.isPresent();
            if (millis > 0 && millis2 > 0) {
                z = true;
            }
        }
        this.j = z;
    }

    public final void a(Context context) {
        Application application;
        if (this.j) {
            while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Application) {
                application = (Application) context;
            } else if (context instanceof Activity) {
                application = ((Activity) context).getApplication();
            } else {
                application = context instanceof Service ? ((Service) context).getApplication() : null;
            }
            if (application != null) {
                application.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final void b(aslg aslgVar, long j) {
        nzd nzdVar = (nzd) Map.EL.computeIfAbsent(this.c, aslgVar, new ixa(18));
        nzdVar.c++;
        nzdVar.a += j;
        if (nzdVar.b < j) {
            nzdVar.b = j;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ListenableFuture listenableFuture;
        int i = this.m - 1;
        this.m = i;
        if (i != 0 || (listenableFuture = this.l) == null) {
            return;
        }
        listenableFuture.cancel(false);
        this.l = null;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ahey, java.lang.Object] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.m++;
        if (this.j && this.l == null) {
            Object obj = this.i.get();
            byte[] bArr = null;
            qcb qcbVar = new qcb(this, bArr);
            long j = this.k;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            acnp acnpVar = new acnp(obj, qcbVar, 12, bArr);
            abfv abfvVar = (abfv) obj;
            this.l = ahno.aj(acnpVar, j, j, timeUnit, abfvVar.a, abfvVar.b);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
