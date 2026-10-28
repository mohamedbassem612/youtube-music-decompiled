package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agyk implements Closeable {
    private final Deque a = new ArrayDeque(4);
    private Throwable b;

    public final RuntimeException a(Throwable th) throws Throwable {
        this.b = th;
        agfv.c(th, IOException.class);
        agfv.d(th);
        throw new RuntimeException(th);
    }

    public final void b(Closeable closeable) {
        this.a.addFirst(closeable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.b;
        while (true) {
            Deque deque = this.a;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        agyj.a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.b != null || th == null) {
            return;
        }
        agfv.c(th, IOException.class);
        agfv.d(th);
        throw new AssertionError(th);
    }
}
