package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ojy implements Executor {
    private final Executor a;
    private final Object b = new Object();
    private int c = 0;
    private final Queue d = new ArrayDeque();

    public ojy(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.b) {
            Runnable runnable = (Runnable) this.d.poll();
            if (runnable == null) {
                this.c--;
                return;
            }
            try {
                this.a.execute(afwl.i(new hhy(this, runnable, 8)));
            } catch (Throwable th) {
                onb.g(th, "%s: Task submission failed: %s", "ThrottlingExecutor", runnable);
                synchronized (this.b) {
                    this.c--;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.b) {
            int i = this.c;
            if (i >= 2) {
                this.d.add(runnable);
                return;
            }
            this.c = i + 1;
            try {
                this.a.execute(afwl.i(new hhy(this, runnable, 8)));
            } catch (Throwable th) {
                synchronized (this.b) {
                    this.c--;
                    throw th;
                }
            }
        }
    }
}
