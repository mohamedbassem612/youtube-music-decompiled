package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avgq implements Executor {
    private final avhw a;
    private Executor b;

    public avgq(avhw avhwVar) {
        this.a = avhwVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized Executor a() {
        if (this.b == null) {
            ?? A = this.a.a();
            A.getClass();
            this.b = A;
        }
        return this.b;
    }

    final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}
