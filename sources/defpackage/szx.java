package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class szx extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public szx(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    static final long a(long j, TimeUnit timeUnit) {
        return j > timeUnit.convert(33554432L, TimeUnit.SECONDS) ? timeUnit.convert(33554432L, TimeUnit.SECONDS) : j;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(runnable, a(j, timeUnit), timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(runnable, a(j, timeUnit), a(j2, timeUnit), timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(runnable, a(j, timeUnit), a(j2, timeUnit), timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return super.schedule(callable, a(j, timeUnit), timeUnit);
    }
}
