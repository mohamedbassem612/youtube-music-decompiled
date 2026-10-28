package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcj implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public avcj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void a() {
        while (a.ap(this.c, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.c.set(null);
                    throw th2;
                }
            }
            this.c.set(null);
            if (this.b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        runnable.getClass();
        this.b.add(runnable);
    }

    public final void c() {
        ahno.P(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    public final axoz d(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        avci avciVar = new avci(runnable);
        return new axoz(avciVar, (ScheduledFuture) scheduledExecutorService.schedule(new avch(this, avciVar, runnable), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
