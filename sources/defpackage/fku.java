package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fku implements fvu {
    private final fvu d;
    public final Deque a = new ArrayDeque();
    public int c = 1;
    public long b = 0;
    private final ahff e = new ahff(this, 1);

    public fku(fvu fvuVar) {
        this.d = fvuVar;
    }

    @Override // defpackage.fvu
    public final void a(Runnable runnable) {
        Deque deque = this.a;
        if (deque.isEmpty()) {
            return;
        }
        synchronized (deque) {
            deque.remove(runnable);
        }
    }

    @Override // defpackage.fvu
    public final void c(Runnable runnable) {
        if (runnable != null) {
            Deque deque = this.a;
            synchronized (deque) {
                int i = this.c;
                if (i == 4 || i == 3) {
                    deque.add(runnable);
                } else {
                    long j = this.b;
                    ahfe ahfeVar = new ahfe(runnable, 1);
                    deque.add(ahfeVar);
                    this.c = 2;
                    try {
                        this.d.c(this.e);
                        if (this.c == 2) {
                            synchronized (this.a) {
                                if (this.b == j && this.c == 2) {
                                    this.c = 3;
                                }
                            }
                        }
                    } catch (Error | RuntimeException e) {
                        Deque deque2 = this.a;
                        synchronized (deque2) {
                            int i2 = this.c;
                            boolean z = (i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(ahfeVar);
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        fvu fvuVar = this.d;
        return "SequentialLithoHandler@" + System.identityHashCode(this) + '{' + String.valueOf(fvuVar) + '}';
    }

    @Override // defpackage.fvu
    public final void b() {
    }
}
