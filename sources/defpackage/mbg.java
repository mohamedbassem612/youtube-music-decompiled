package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbg extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public mbg(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return mby.b(runnableScheduledFuture);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Callable callable, RunnableScheduledFuture runnableScheduledFuture) {
        return mby.b(runnableScheduledFuture);
    }
}
