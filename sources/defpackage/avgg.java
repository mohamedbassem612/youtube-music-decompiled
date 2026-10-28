package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avgg implements Runnable {
    private static final Logger a = Logger.getLogger(avgg.class.getName());
    private final Runnable b;

    public avgg(Runnable runnable) {
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.b.toString()), th);
            agfv.d(th);
            throw new AssertionError(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.b.toString() + ')';
    }
}
