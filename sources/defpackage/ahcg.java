package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ahcg extends ahch implements ahcf {
    @Override // defpackage.ahch, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        super.addListener(runnable, executor);
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final Object get() {
        return super.get();
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return super.get(j, timeUnit);
    }
}
