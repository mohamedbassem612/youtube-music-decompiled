package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class exo extends ThreadPoolExecutor implements AutoCloseable {
    final /* synthetic */ exp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exo(exp expVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.a = expVar;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute((Runnable) this.a.c.apply(runnable));
    }
}
