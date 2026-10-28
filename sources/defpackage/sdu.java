package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sdu implements Executor {
    public final Executor a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final Executor c;

    public sdu(Executor executor, Executor executor2) {
        this.c = executor;
        this.a = executor2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.b.get()) {
            this.a.execute(runnable);
        } else {
            this.c.execute(runnable);
        }
    }
}
