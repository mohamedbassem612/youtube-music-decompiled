package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahed extends aheo {
    private final ListenableFuture a;

    public ahed(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.a = listenableFuture;
    }

    @Override // defpackage.ahch, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.a.addListener(runnable, executor);
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.ahch
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.ahch, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
