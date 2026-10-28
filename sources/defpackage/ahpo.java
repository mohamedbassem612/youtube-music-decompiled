package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahpo implements Executor {
    public static final Logger a = Logger.getLogger(ahpo.class.getName());
    private final Executor e;
    public final Deque b = new ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final ahff f = new ahff(this, 2);

    public ahpo(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("null reference");
        }
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("null reference");
        }
        Deque deque = this.b;
        synchronized (deque) {
            int i = this.d;
            if (i == 4 || i == 3) {
                deque.add(runnable);
                return;
            }
            long j = this.c;
            ahfe ahfeVar = new ahfe(runnable, 2);
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
            } catch (Error | RuntimeException e) {
                Deque deque2 = this.b;
                synchronized (deque2) {
                    int i2 = this.d;
                    boolean z = false;
                    if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(ahfeVar)) {
                        z = true;
                    }
                    if (!(e instanceof RejectedExecutionException) || z) {
                        throw e;
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
