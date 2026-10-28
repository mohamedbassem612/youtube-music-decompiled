package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mcf extends ahch implements Runnable, ahew {
    final /* synthetic */ mcg a;
    private Callable b;
    private final long c;

    public mcf(mcg mcgVar, Callable callable, long j) {
        this.a = mcgVar;
        this.b = callable;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return mcg.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.c - this.a.a.b(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            Callable callable = this.b;
            this.b = null;
            set(callable.call());
        } catch (Throwable th) {
            setException(th);
        }
    }
}
