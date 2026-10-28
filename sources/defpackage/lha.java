package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lha extends lea {
    public static final AtomicLong a = new AtomicLong(Long.MIN_VALUE);
    public lgz b;
    public lgz c;
    public final Object d;
    public final Semaphore e;
    public volatile boolean f;
    private final PriorityBlockingQueue g;
    private final BlockingQueue h;
    private final Thread.UncaughtExceptionHandler i;
    private final Thread.UncaughtExceptionHandler j;

    public lha(ldr ldrVar) {
        super(ldrVar);
        this.d = new Object();
        this.e = new Semaphore(2);
        this.g = new PriorityBlockingQueue();
        this.h = new LinkedBlockingQueue();
        this.i = new lgx(this, "Thread death: Uncaught exception on worker thread");
        this.j = new lgx(this, "Thread death: Uncaught exception on network thread");
    }

    private final void s(lgy lgyVar) {
        synchronized (this.d) {
            PriorityBlockingQueue priorityBlockingQueue = this.g;
            priorityBlockingQueue.add(lgyVar);
            lgz lgzVar = this.b;
            if (lgzVar == null) {
                lgz lgzVar2 = new lgz(this, "Measurement Worker", priorityBlockingQueue);
                this.b = lgzVar2;
                lgzVar2.setUncaughtExceptionHandler(this.i);
                this.b.start();
            } else {
                lgzVar.a();
            }
        }
    }

    public final Object a(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            aU().j(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                aT().f.a(a.ce(str, "Interrupted waiting for "));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj != null) {
            return obj;
        }
        aT().f.a("Timed out waiting for ".concat(str));
        return obj;
    }

    public final Future c(Callable callable) {
        m();
        lgy lgyVar = new lgy(this, callable, false);
        if (Thread.currentThread() == this.b) {
            if (!this.g.isEmpty()) {
                aT().f.a("Callable skipped the worker queue.");
            }
            lgyVar.run();
        } else {
            s(lgyVar);
        }
        return lgyVar;
    }

    public final Future d(Callable callable) {
        m();
        lgy lgyVar = new lgy(this, callable, true);
        if (Thread.currentThread() == this.b) {
            lgyVar.run();
        } else {
            s(lgyVar);
        }
        return lgyVar;
    }

    @Override // defpackage.lea
    protected final boolean e() {
        return false;
    }

    public final void g() {
        if (Thread.currentThread() == this.b) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void i(Runnable runnable) {
        m();
        lgy lgyVar = new lgy(this, runnable, false, "Task exception on network thread");
        synchronized (this.d) {
            BlockingQueue blockingQueue = this.h;
            blockingQueue.add(lgyVar);
            lgz lgzVar = this.c;
            if (lgzVar == null) {
                lgz lgzVar2 = new lgz(this, "Measurement Network", blockingQueue);
                this.c = lgzVar2;
                lgzVar2.setUncaughtExceptionHandler(this.j);
                this.c.start();
            } else {
                lgzVar.a();
            }
        }
    }

    public final void j(Runnable runnable) {
        m();
        s(new lgy(this, runnable, false, "Task exception on worker thread"));
    }

    public final void k(Runnable runnable) {
        m();
        s(new lgy(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean l() {
        return Thread.currentThread() == this.b;
    }

    @Override // defpackage.ldz
    public final void o() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
