package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kym implements ScheduledExecutorService, AutoCloseable {
    public static final AtomicLong a = new AtomicLong();
    public final ExecutorService b;
    private final ScheduledExecutorService g;
    public final Object c = new Object();
    public final Set d = ConcurrentHashMap.newKeySet();
    public final Set e = ConcurrentHashMap.newKeySet();
    private volatile boolean h = false;
    public int f = 0;

    public kym(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.b = executorService;
        this.g = scheduledExecutorService;
    }

    public static long a(long j, TimeUnit timeUnit) {
        return System.nanoTime() + Math.min(timeUnit.toNanos(Math.max(0L, j)), 4611686018427387903L);
    }

    private final void c() {
        if (this.h || this.b.isShutdown()) {
            throw new RejectedExecutionException("Executor is shut down");
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime() + Math.max(0L, timeUnit.toNanos(j));
        while (!isTerminated()) {
            long jNanoTime2 = jNanoTime - System.nanoTime();
            if (jNanoTime2 <= 0) {
                return false;
            }
            ExecutorService executorService = this.b;
            if (!executorService.isShutdown() || executorService.isTerminated()) {
                Object obj = this.c;
                synchronized (obj) {
                    if (!isTerminated() && (!executorService.isShutdown() || executorService.isTerminated())) {
                        long jNanoTime3 = jNanoTime - System.nanoTime();
                        if (jNanoTime3 <= 0) {
                            return false;
                        }
                        obj.wait(jNanoTime3 / 1000000, (int) (jNanoTime3 % 1000000));
                    }
                }
            } else if (!executorService.awaitTermination(jNanoTime2, TimeUnit.NANOSECONDS)) {
                return false;
            }
        }
        return true;
    }

    public final void b() {
        if (this.h) {
            ExecutorService executorService = this.b;
            if (executorService.isShutdown() || this.f != 0) {
                return;
            }
            executorService.shutdown();
            this.c.notifyAll();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c();
        this.b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        c();
        return this.b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        c();
        return this.b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.h || this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.b.isTerminated() && this.e.isEmpty() && this.d.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        kyj kyjVar;
        callable.getClass();
        timeUnit.getClass();
        synchronized (this.c) {
            c();
            kyjVar = new kyj(this, callable, j, timeUnit);
            this.d.add(kyjVar);
            this.f++;
        }
        try {
            ScheduledFuture<?> scheduledFutureSchedule = this.g.schedule(new iqc(kyjVar, 16), j, timeUnit);
            kyjVar.a = scheduledFutureSchedule;
            if (kyjVar.isCancelled()) {
                scheduledFutureSchedule.cancel(false);
            }
            return kyjVar;
        } catch (Throwable th) {
            this.d.remove(kyjVar);
            kyjVar.cancel(false);
            throw th;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        kyk kykVar;
        runnable.getClass();
        timeUnit.getClass();
        if (j2 <= 0) {
            throw new IllegalArgumentException("period must be > 0");
        }
        synchronized (this.c) {
            c();
            kykVar = new kyk(runnable, j, j2, timeUnit, true, this.b, this.g, new qcb(this, null));
            this.e.add(kykVar);
        }
        try {
            kykVar.d();
            return kykVar;
        } catch (Throwable th) {
            this.e.remove(kykVar);
            kykVar.cancel(false);
            throw th;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        kyk kykVar;
        runnable.getClass();
        timeUnit.getClass();
        if (j2 <= 0) {
            throw new IllegalArgumentException("delay must be > 0");
        }
        synchronized (this.c) {
            c();
            kykVar = new kyk(runnable, j, j2, timeUnit, false, this.b, this.g, new qcb(this, null));
            this.e.add(kykVar);
        }
        try {
            kykVar.d();
            return kykVar;
        } catch (Throwable th) {
            this.e.remove(kykVar);
            kykVar.cancel(false);
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        Object obj = this.c;
        synchronized (obj) {
            this.h = true;
            Set set = this.e;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((kyk) it.next()).cancel(false);
            }
            set.clear();
            b();
            obj.notifyAll();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow;
        Object obj = this.c;
        synchronized (obj) {
            this.h = true;
            Set set = this.d;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((kyj) it.next()).cancel(true);
            }
            set.clear();
            Set set2 = this.e;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ((kyk) it2.next()).cancel(true);
            }
            set2.clear();
            listShutdownNow = this.b.shutdownNow();
            obj.notifyAll();
        }
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        c();
        return this.b.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        c();
        return this.b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        c();
        return this.b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        c();
        return this.b.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        c();
        return this.b.submit(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        return schedule(Executors.callable(runnable, null), j, timeUnit);
    }
}
