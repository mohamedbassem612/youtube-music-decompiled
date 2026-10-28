package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afmc extends awom implements CoroutineExceptionHandler, ScheduledExecutorService, AutoCloseable {
    public static final /* synthetic */ int b = 0;
    public final ThreadLocal a;
    private final ScheduledExecutorService d;

    public afmc(ScheduledExecutorService scheduledExecutorService) {
        super(CoroutineExceptionHandler.c);
        this.d = scheduledExecutorService;
        this.a = new ThreadLocal();
    }

    private final Runnable b(Runnable runnable) {
        afii afiiVar = new afii(runnable, this, 6);
        long j = afwl.a;
        return afwl.p() ? new afii(afwl.n(), (Runnable) afiiVar, 7) : afiiVar;
    }

    public final Callable a(Callable callable) {
        afmn afmnVar = new afmn(callable, this, 1);
        long j = afwl.a;
        return afwl.p() ? afwl.k(afmnVar) : afmnVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.d.execute(b(runnable));
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(awou awouVar, Throwable th) {
        awouVar.getClass();
        th.getClass();
        try {
            ((agrc) ((agrc) ((agrf) afmd.b.a()).b()).j(th).k("com/google/apps/tiktok/coroutines/TikTokExceptionHandler", "handleException", 61, "TikTokExceptionHandler.kt")).t("Uncaught exception from runnable");
        } catch (Throwable th2) {
            Logger logger = afmd.a;
            logger.log(Level.SEVERE, "GoogleLogger failed to log", th2);
            Log.e("TikTokExceptionHandler2", "GoogleLogger failed to log", th2);
            logger.log(Level.SEVERE, "Uncaught exception from runnable", th);
            Log.e("TikTokExceptionHandler2", "Uncaught exception from runnable", th);
        }
        this.a.set(th);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        List listInvokeAll = this.d.invokeAll(new aghw(collection, new aeqk(new acqe((Object) this, 8, (byte[][]) null), 12)), j, timeUnit);
        listInvokeAll.getClass();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        collection.getClass();
        return this.d.invokeAny(new aghw(collection, new aeqk(new acqe((Object) this, 9, (byte[][]) null), 11)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduledFutureSchedule = this.d.schedule(b(runnable), j, timeUnit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.d.scheduleAtFixedRate(b(runnable), j, j2, timeUnit);
        scheduledFutureScheduleAtFixedRate.getClass();
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable.getClass();
        timeUnit.getClass();
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = this.d.scheduleWithFixedDelay(b(runnable), j, j2, timeUnit);
        scheduledFutureScheduleWithFixedDelay.getClass();
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow = this.d.shutdownNow();
        listShutdownNow.getClass();
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        Future<?> futureSubmit = this.d.submit(b(runnable));
        futureSubmit.getClass();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        Future futureSubmit = this.d.submit(b(runnable), obj);
        futureSubmit.getClass();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        callable.getClass();
        timeUnit.getClass();
        ScheduledFuture scheduledFutureSchedule = this.d.schedule(a(callable), j, timeUnit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        Future futureSubmit = this.d.submit(a(callable));
        futureSubmit.getClass();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        return this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        collection.getClass();
        List listInvokeAll = this.d.invokeAll(new aghw(collection, new aeqk(new acqe((Object) this, 7, (byte[][]) null), 13)));
        listInvokeAll.getClass();
        return listInvokeAll;
    }
}
