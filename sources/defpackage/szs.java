package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class szs implements Executor {
    private final Executor a;
    private final AtomicBoolean b;
    private final Queue c;

    public szs(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new AtomicBoolean(false);
        this.c = new ConcurrentLinkedQueue();
    }

    private final void c() {
        while (true) {
            Object objPoll = this.c.poll();
            Runnable runnable = (Runnable) objPoll;
            if (objPoll == null) {
                return;
            }
            try {
                Executor executor = this.a;
                runnable.getClass();
                executor.execute(runnable);
            } catch (Throwable th) {
                twu.d("LockFreePausableExecutor", 6, "Error executing deferred task", th);
            }
        }
    }

    public final void a() {
        this.b.set(true);
    }

    public final void b() {
        if (this.b.compareAndSet(true, false)) {
            c();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (atomicBoolean.get()) {
            return;
        }
        c();
    }
}
