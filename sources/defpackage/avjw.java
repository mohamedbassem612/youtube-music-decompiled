package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjw {
    private static final avjw c = new avjw();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(avjv avjvVar) {
        return c.b(avjvVar);
    }

    public static void c(avjv avjvVar, Object obj) throws Throwable {
        c.d(avjvVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    final synchronized Object b(avjv avjvVar) {
        avju avjuVar;
        IdentityHashMap identityHashMap = this.a;
        avjuVar = (avju) identityHashMap.get(avjvVar);
        if (avjuVar == null) {
            avjuVar = new avju(avjvVar.a());
            identityHashMap.put(avjvVar, avjuVar);
        }
        ?? r4 = avjuVar.c;
        if (r4 != 0) {
            r4.cancel(false);
            avjuVar.c = null;
        }
        avjuVar.b++;
        return avjuVar.a;
    }

    final synchronized void d(avjv avjvVar, Object obj) throws Throwable {
        Throwable th;
        avjw avjwVar;
        try {
            try {
                avju avjuVar = (avju) this.a.get(avjvVar);
                if (avjuVar == null) {
                    throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(avjvVar))));
                }
                ahno.G(obj == avjuVar.a, "Releasing the wrong instance");
                ahno.P(avjuVar.b > 0, "Refcount has already reached zero");
                int i = avjuVar.b - 1;
                avjuVar.b = i;
                if (i == 0) {
                    ahno.P(avjuVar.c == null, "Destroy task already scheduled");
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = this.b;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        try {
                            scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(avfp.f("grpc-shared-destroyer-%d"));
                            this.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    avjwVar = this;
                    avjuVar.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new avgg(new aasv(avjwVar, avjuVar, avjvVar, obj, 17)), 1L, TimeUnit.SECONDS);
                } else {
                    avjwVar = this;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }
}
