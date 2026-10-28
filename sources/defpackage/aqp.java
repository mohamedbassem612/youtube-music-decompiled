package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aqp implements ListenableFuture, awoq {
    private final awuz a;
    private final aqo b = new aqo();

    public aqp(awuz awuzVar) {
        this.a = awuzVar;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        this.b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.b.cancel(z);
        if (zCancel) {
            this.a.p(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.b.get(j, timeUnit);
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return aqr.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) {
        Throwable thA = awmn.a(obj);
        if (thA == null) {
            this.b.e(obj);
            return;
        }
        boolean z = thA instanceof CancellationException;
        aqo aqoVar = this.b;
        if (z) {
            aqoVar.cancel(false);
        } else {
            aqoVar.f(thA);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }
}
