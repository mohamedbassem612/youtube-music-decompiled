package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awis implements Callable, avmn {
    static final FutureTask a = new FutureTask(avoi.b, null);
    final Runnable b;
    final ExecutorService e;
    Thread f;
    final AtomicReference d = new AtomicReference();
    final AtomicReference c = new AtomicReference();

    public awis(Runnable runnable, ExecutorService executorService) {
        this.b = runnable;
        this.e = executorService;
    }

    final void a(Future future) {
        AtomicReference atomicReference;
        Future future2;
        do {
            atomicReference = this.d;
            future2 = (Future) atomicReference.get();
            if (future2 == a) {
                future.cancel(this.f != Thread.currentThread());
                return;
            }
        } while (!a.av(atomicReference, future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        AtomicReference atomicReference;
        Future future;
        this.f = Thread.currentThread();
        try {
            this.b.run();
            Future futureSubmit = this.e.submit(this);
            do {
                atomicReference = this.c;
                future = (Future) atomicReference.get();
                if (future == a) {
                    futureSubmit.cancel(this.f != Thread.currentThread());
                    break;
                }
            } while (!a.av(atomicReference, future, futureSubmit));
            this.f = null;
        } catch (Throwable th) {
            this.f = null;
            atqp.n(th);
        }
        return null;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        AtomicReference atomicReference = this.d;
        FutureTask futureTask = a;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f != Thread.currentThread());
        }
        Future future2 = (Future) this.c.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f != Thread.currentThread());
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.get() == a;
    }
}
