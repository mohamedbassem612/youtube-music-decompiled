package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awvw extends awvv implements awvb {
    private final Executor a;

    public awvw(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = axct.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = axct.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
        } catch (Throwable unused) {
        }
    }

    private static final void j(awou awouVar, RejectedExecutionException rejectedExecutionException) {
        awro.z(awouVar, avkz.v("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture k(ScheduledExecutorService scheduledExecutorService, Runnable runnable, awou awouVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            j(awouVar, e);
            return null;
        }
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            j(awouVar, e);
            awuq awuqVar = awvi.a;
            axew.a.a(awouVar, runnable);
        }
    }

    @Override // defpackage.awvb
    public final awvk c(long j, Runnable runnable, awou awouVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureK = scheduledExecutorService != null ? k(scheduledExecutorService, runnable, awouVar, j) : null;
        return scheduledFutureK != null ? new awvj(scheduledFutureK) : awux.a.u(j, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.awvb
    public final void d(long j, awuc awucVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureK = scheduledExecutorService != null ? k(scheduledExecutorService, new awwy(this, awucVar, 0), ((awud) awucVar).b, j) : null;
        if (scheduledFutureK != null) {
            ((awud) awucVar).x(new awua(scheduledFutureK));
        } else {
            awux.a.d(j, awucVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awvw) && ((awvw) obj).a == this.a;
    }

    @Override // defpackage.awvv
    public final Executor h() {
        return this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.awuq
    public final String toString() {
        return this.a.toString();
    }
}
