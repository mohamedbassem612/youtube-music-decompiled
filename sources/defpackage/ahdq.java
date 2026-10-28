package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class ahdq extends ahet {
    private final Executor a;
    final /* synthetic */ ahdr b;

    public ahdq(ahdr ahdrVar, Executor executor) {
        this.b = ahdrVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.ahet
    public final void d(Throwable th) {
        ahdr ahdrVar = this.b;
        ahdrVar.c = null;
        if (th instanceof ExecutionException) {
            ahdrVar.setException(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            ahdrVar.cancel(false);
        } else {
            ahdrVar.setException(th);
        }
    }

    @Override // defpackage.ahet
    public final void e(Object obj) {
        this.b.c = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.setException(e);
        }
    }

    @Override // defpackage.ahet
    public final boolean g() {
        return this.b.isDone();
    }
}
