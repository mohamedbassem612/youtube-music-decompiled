package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class szu implements Executor {
    private final Executor a;
    private final Object b = new Object();
    private final List c = new ArrayList();
    private volatile boolean d;

    public szu(Executor executor, boolean z) {
        this.a = executor;
        this.d = z;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.d) {
            this.a.execute(runnable);
            return;
        }
        synchronized (this.b) {
            if (this.d) {
                this.c.add(runnable);
            } else {
                this.a.execute(runnable);
            }
        }
    }
}
