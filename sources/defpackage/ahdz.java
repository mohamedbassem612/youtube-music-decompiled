package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdz extends AtomicReference implements Executor, Runnable {
    Executor a;
    ahfo b;
    Thread c;
    auor d;

    public ahdz(Executor executor, auor auorVar) {
        super(ahdy.a);
        this.a = executor;
        this.d = auorVar;
    }

    public final boolean a() {
        return compareAndSet(ahdy.a, ahdy.b);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == ahdy.b) {
            this.a = null;
            this.d = null;
            return;
        }
        this.c = Thread.currentThread();
        ahfo ahfoVar = (ahfo) runnable;
        try {
            auor auorVar = this.d;
            auorVar.getClass();
            Object obj = auorVar.a;
            if (((ahea) obj).a == this.c) {
                this.d = null;
                if (((ahea) obj).b != null) {
                    throw new IllegalStateException();
                }
                ((ahea) obj).b = ahfoVar;
                Executor executor = this.a;
                executor.getClass();
                ((ahea) obj).c = executor;
                this.a = null;
            } else {
                Executor executor2 = this.a;
                executor2.getClass();
                this.a = null;
                this.b = ahfoVar;
                try {
                    executor2.execute(this);
                } catch (RejectedExecutionException e) {
                    a();
                    ahfoVar.setException(e);
                }
            }
            this.c = null;
        } catch (Throwable th) {
            this.c = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.c) {
            ahfo ahfoVar = this.b;
            ahfoVar.getClass();
            this.b = null;
            ahfoVar.run();
            return;
        }
        ahea aheaVar = new ahea();
        aheaVar.a = threadCurrentThread;
        auor auorVar = this.d;
        auorVar.getClass();
        auorVar.a = aheaVar;
        this.d = null;
        try {
            ahfo ahfoVar2 = this.b;
            ahfoVar2.getClass();
            this.b = null;
            ahfoVar2.run();
            while (true) {
                ahfo ahfoVar3 = aheaVar.b;
                if (ahfoVar3 == null || (executor = aheaVar.c) == null) {
                    break;
                }
                aheaVar.b = null;
                aheaVar.c = null;
                try {
                    executor.execute(ahfoVar3);
                } catch (RejectedExecutionException e) {
                    ahfoVar3.setException(e);
                }
            }
            aheaVar.a = null;
        } catch (Throwable th) {
            aheaVar.a = null;
            throw th;
        }
    }
}
