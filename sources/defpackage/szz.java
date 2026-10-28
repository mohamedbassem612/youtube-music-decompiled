package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class szz extends szx {
    static final List a = new CopyOnWriteArrayList();
    public final vwt b;

    public szz(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        this.b = new vwt((byte[]) null, (byte[]) null, (byte[]) null);
        a.add(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                Future future = (Future) runnable;
                if (future.isDone() && !future.isCancelled()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                th = e.getCause();
            }
        }
        ?? r1 = this.b.a;
        if (r1.isEmpty()) {
            return;
        }
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            ((szy) it.next()).c(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        ?? r0 = this.b.a;
        if (r0.isEmpty()) {
            return;
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((szy) it.next()).b();
        }
    }

    @Override // defpackage.szx, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        this.b.R(runnable);
        return super.schedule(runnable, j, timeUnit);
    }

    @Override // defpackage.szx, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.b.R(runnable);
        return super.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.szx, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.b.R(runnable);
        return super.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.szx, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        this.b.S(callable);
        return super.schedule(callable, j, timeUnit);
    }
}
