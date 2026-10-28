package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lay {
    private static volatile lay g;
    public final String a = "FA";
    protected final ExecutorService b;
    public final AppMeasurementSdk c;
    public boolean d;
    public volatile kzj e;
    public volatile long f;
    private int h;

    protected lay(Context context, Bundle bundle) {
        ksy ksyVar = kyq.a;
        this.b = ksy.al(1, new kyp(2, (char[]) null));
        this.c = new AppMeasurementSdk(this);
        new ArrayList();
        try {
            String strU = mda.u(context);
            if (mda.w(context.getResources(), TextUtils.isEmpty(strU) ? mda.u(context) : strU) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.d = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        i(new lac(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new afjp(this, 1));
        }
    }

    public static lay c(Context context, Bundle bundle) {
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        if (g == null) {
            synchronized (lay.class) {
                if (g == null) {
                    g = new lay(context, bundle == null ? new Bundle() : new Bundle(bundle));
                }
            }
        }
        return g;
    }

    public final long a() {
        kzl kzlVar = new kzl();
        i(new lai(this, kzlVar));
        Long l = (Long) kzl.d(kzlVar.b(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.h + 1;
        this.h = i;
        return jNextLong + ((long) i);
    }

    protected final kzj b(Context context, boolean z) {
        try {
            return kzi.asInterface(kvc.d(context, z ? kvc.c : kvc.b, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (ExceptionInInitializerError | NoClassDefFoundError | kuy e) {
            f(e, true, false);
            return null;
        }
    }

    public final String d() {
        kzl kzlVar = new kzl();
        i(new lah(this, kzlVar));
        return kzlVar.c(50L);
    }

    public final String e() {
        kzl kzlVar = new kzl();
        i(new lag(this, kzlVar));
        return kzlVar.c(500L);
    }

    public final void f(Throwable th, boolean z, boolean z2) {
        this.d |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", th);
            return;
        }
        if (z2) {
            i(new lam(this, th));
        }
        Log.w(this.a, "Error with data collection. Data lost.", th);
    }

    public final void g(String str) {
        i(new lad(this, str));
    }

    public final void h(String str) {
        i(new lae(this, str));
    }

    public final void i(laq laqVar) {
        this.b.execute(laqVar);
    }

    public final void j(String str, String str2, Bundle bundle, boolean z) {
        i(new lap(this, str, str2, bundle, z));
    }
}
