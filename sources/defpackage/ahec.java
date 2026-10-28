package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ahec extends agjb implements ExecutorService, AutoCloseable {
    protected ahec() {
    }

    @Override // defpackage.agjb
    /* JADX INFO: renamed from: a */
    protected /* bridge */ /* synthetic */ Object b() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return g().awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g().execute(runnable);
    }

    protected abstract ExecutorService g();

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return g().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return g().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return g().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return g().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        g().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return g().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return g().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return g().invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return g().invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return g().submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return g().submit(callable);
    }
}
