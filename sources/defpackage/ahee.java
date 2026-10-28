package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ahee extends agjb implements Future, ListenableFuture {
    protected ahee() {
    }

    @Override // defpackage.agjb
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        ia().addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return ib().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return ib().get();
    }

    protected abstract ListenableFuture ia();

    protected /* bridge */ /* synthetic */ Future ib() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ib().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ib().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return ib().get(j, timeUnit);
    }
}
