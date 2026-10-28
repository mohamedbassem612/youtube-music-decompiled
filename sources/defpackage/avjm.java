package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avjm implements Executor {
    private static final Logger a = Logger.getLogger(avjm.class.getName());
    private boolean b;
    private ArrayDeque c;

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[DONT_GENERATE] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        if (this.b) {
            ArrayDeque arrayDeque = this.c;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque(4);
                this.c = arrayDeque;
            }
            arrayDeque.add(runnable);
            return;
        }
        this.b = true;
        try {
            runnable.run();
            if (this.c != null) {
            }
        } catch (Throwable th) {
            try {
                a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", a.co(runnable, "Exception while executing runnable "), th);
            } finally {
                if (this.c != null) {
                    a();
                }
                this.b = false;
            }
        }
    }
}
