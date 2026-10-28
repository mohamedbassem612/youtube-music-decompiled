package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbu extends AbstractExecutorService implements AutoCloseable {
    private final ExecutorService a;
    private final zhk b;

    public mbu(ExecutorService executorService, zhk zhkVar) {
        this.a = executorService;
        this.b = zhkVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        trh trhVar;
        tro troVar = (this.b.a || (trhVar = (trh) trj.a.get()) == null) ? null : new tro(trhVar);
        ExecutorService executorService = this.a;
        if (troVar == null) {
            executorService.execute(runnable);
        } else {
            executorService.execute(new lfa(troVar, runnable, 11, (byte[]) null));
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final String toString() {
        return this.a.toString();
    }
}
