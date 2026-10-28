package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awit implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    final avmm c;
    public final ThreadFactory d;
    private final ScheduledExecutorService e;
    private final Future f;

    public awit(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        awit awitVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new avmm();
        this.d = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, awiw.c);
            awitVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(awitVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            awitVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        awitVar.e = scheduledExecutorServiceNewScheduledThreadPool;
        awitVar.f = scheduledFutureScheduleWithFixedDelay;
    }

    final void a() {
        this.c.dispose();
        Future future = this.f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<awiv> concurrentLinkedQueue = this.b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (awiv awivVar : concurrentLinkedQueue) {
            if (awivVar.a > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(awivVar)) {
                this.c.h(awivVar);
            }
        }
    }
}
