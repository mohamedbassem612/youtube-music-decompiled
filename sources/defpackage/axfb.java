package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axfb {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        String property;
        int i = axdz.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = awrc.aa("kotlinx.coroutines.scheduler.resolution.ns", 100000L, Long.MAX_VALUE);
        c = awrc.Z("kotlinx.coroutines.scheduler.core.pool.size", awro.f(axdz.a, 2), Alert.DURATION_SHOW_INDEFINITELY);
        d = awrc.Z("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 2097150);
        e = TimeUnit.SECONDS.toNanos(awrc.aa("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, Long.MAX_VALUE));
    }
}
