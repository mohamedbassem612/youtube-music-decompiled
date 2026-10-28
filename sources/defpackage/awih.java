package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class awih extends AtomicReference implements avmn {
    protected static final FutureTask a = new FutureTask(avoi.b, null);
    protected static final FutureTask b = new FutureTask(avoi.b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable c;
    protected Thread d;

    public awih(Runnable runnable) {
        this.c = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == a) {
                return;
            }
            if (future2 == b) {
                future.cancel(this.d != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.avmn
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == a || future == (futureTask = b) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.d != Thread.currentThread());
    }

    @Override // defpackage.avmn
    public final boolean f() {
        Future future = (Future) get();
        return future == a || future == b;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.valueOf(this.c);
    }
}
