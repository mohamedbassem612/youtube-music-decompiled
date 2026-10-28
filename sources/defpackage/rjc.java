package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rjc implements Executor {
    private static final rbm a = rbm.c(rjc.class);

    public abstract rfo a();

    public abstract void b();

    public abstract void c(Runnable runnable);

    public abstract void d(Runnable runnable);

    public final void e(Runnable runnable) {
        if (!a().isAlive()) {
            rbc rbcVar = new rbc(a, rbd.e);
            rbcVar.c();
            rbcVar.a("Thread handle is dead, name=%s", a().getName());
        } else if (a() == Thread.currentThread()) {
            runnable.run();
        } else {
            c(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable);
    }
}
