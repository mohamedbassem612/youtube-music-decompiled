package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqm implements ListenableFuture {
    final WeakReference a;
    public final aqh b = new aql(this);

    public aqm(aqi aqiVar) {
        this.a = new WeakReference(aqiVar);
    }

    public final boolean a(Throwable th) {
        return this.b.f(th);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        aqi aqiVar = (aqi) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || aqiVar == null) {
            return zCancel;
        }
        aqiVar.a = null;
        aqiVar.b = null;
        aqiVar.c.e(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
