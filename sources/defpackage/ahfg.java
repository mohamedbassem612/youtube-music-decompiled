package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahfg implements Executor {
    public static final aheu a = new aheu(ahfg.class);
    private final Executor e;
    public final Deque b = new ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final ahff f = new ahff(this, 0);

    public ahfg(Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Deque deque = this.b;
        synchronized (deque) {
            int i = this.d;
            if (i == 4 || i == 3) {
                deque.add(runnable);
                return;
            }
            long j = this.c;
            boolean z = false;
            ahfe ahfeVar = new ahfe(runnable, 0);
            deque.add(ahfeVar);
            this.d = 2;
            try {
                this.e.execute(this.f);
                if (this.d == 2) {
                    synchronized (this.b) {
                        if (this.c == j && this.d == 2) {
                            this.d = 3;
                        }
                    }
                }
            } catch (Throwable th) {
                Deque deque2 = this.b;
                synchronized (deque2) {
                    int i2 = this.d;
                    if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(ahfeVar)) {
                        z = true;
                    }
                    if (!(th instanceof RejectedExecutionException) || z) {
                        throw th;
                    }
                }
            }
        }
    }

    public final String toString() {
        Executor executor = this.e;
        return "SequentialExecutor@" + System.identityHashCode(this) + '{' + String.valueOf(executor) + '}';
    }
}
