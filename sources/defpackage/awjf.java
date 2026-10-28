package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awjf {
    public static final boolean a;
    public static final int b;
    static final AtomicReference c = new AtomicReference();
    public static final Map d = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:12:0x0038 A[PHI: r1
      0x0038: PHI (r1v7 boolean) = (r1v2 boolean), (r1v2 boolean), (r1v9 boolean) binds: [B:9:0x002d, B:22:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[LOOP:0: B:15:0x003f->B:20:0x006d, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[LOOP:0: B:15:0x003f->B:20:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[SYNTHETIC] */
    static {
        boolean z;
        int i;
        AtomicReference atomicReference;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        Properties properties = System.getProperties();
        if (properties.containsKey("rx2.purge-enabled")) {
            z = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            if (!z) {
                i = 1;
            }
            a = z;
            b = i;
            if (z) {
                return;
            }
            while (true) {
                atomicReference = c;
                if (((ScheduledExecutorService) atomicReference.get()) == null) {
                    return;
                }
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new awja("RxSchedulerPurge", 5, false));
                if (a.ap(atomicReference, scheduledExecutorServiceNewScheduledThreadPool)) {
                    aeia aeiaVar = new aeia(11);
                    long j = b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aeiaVar, j, j, TimeUnit.SECONDS);
                    return;
                }
                scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
            }
        } else {
            z = true;
        }
        if (properties.containsKey("rx2.purge-period-seconds")) {
            try {
                i = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                i = 1;
            }
        } else {
            i = 1;
        }
        a = z;
        b = i;
        if (z) {
            return;
        }
        while (true) {
            atomicReference = c;
            if (((ScheduledExecutorService) atomicReference.get()) == null) {
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new awja("RxSchedulerPurge", 5, false));
            if (a.ap(atomicReference, scheduledExecutorServiceNewScheduledThreadPool)) {
                aeia aeiaVar2 = new aeia(11);
                long j2 = b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aeiaVar2, j2, j2, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }
}
