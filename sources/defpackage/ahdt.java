package defpackage;

import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahdt extends ahcp {
    private final aggb a = new aggb();
    private int b = 0;
    private boolean c = false;

    private final void a() {
        aggb aggbVar = this.a;
        synchronized (aggbVar) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                aggbVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        aggb aggbVar = this.a;
        long nanos = timeUnit.toNanos(j);
        synchronized (aggbVar) {
            while (true) {
                if (this.c && this.b == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(aggbVar, nanos);
                nanos -= System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            if (this.c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.b++;
        }
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.b == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        aggb aggbVar = this.a;
        synchronized (aggbVar) {
            this.c = true;
            if (this.b == 0) {
                aggbVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return agpi.a;
    }
}
