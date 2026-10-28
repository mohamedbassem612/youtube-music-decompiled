package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcg extends ahcp implements AutoCloseable, ahey {
    public final mbc a;
    public final Handler b;

    public mcg(mbc mbcVar, Handler handler) {
        this.a = mbcVar;
        this.b = handler;
    }

    public static int a(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final ahew f(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        mce mceVar = new mce(this, runnable, millis + this.a.b(), timeUnit.toMillis(j2), z);
        this.b.postDelayed(mceVar, millis);
        g(mceVar, mceVar);
        return mceVar;
    }

    private final void g(ListenableFuture listenableFuture, Runnable runnable) {
        listenableFuture.addListener(new lph(this, runnable, 4, (byte[]) null), MoreExecutors.directExecutor());
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b */
    public final ahew schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    public final ahew schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        mcf mcfVar = new mcf(this, callable, this.a.b() + millis);
        this.b.postDelayed(mcfVar, millis);
        g(mcfVar, mcfVar);
        return mcfVar;
    }

    @Override // defpackage.ahcp, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.as(this);
    }

    @Override // defpackage.ahey
    /* JADX INFO: renamed from: d */
    public final ahew scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return f(runnable, j, j2, timeUnit, true);
    }

    @Override // defpackage.ahey
    /* JADX INFO: renamed from: e */
    public final ahew scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return f(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return f(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return f(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
