package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awiq extends avma implements Runnable {
    final Executor a;
    volatile boolean c;
    final AtomicInteger d = new AtomicInteger();
    final avmm e = new avmm();
    final awie b = new awie();

    public awiq(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.avma
    public final avmn a(Runnable runnable) {
        if (this.c) {
            return avns.a;
        }
        awio awioVar = new awio(atqp.m(runnable));
        this.b.j(awioVar);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            } catch (RejectedExecutionException e) {
                this.c = true;
                this.b.c();
                atqp.n(e);
                return avns.a;
            }
        }
        return awioVar;
    }

    @Override // defpackage.avma
    public final avmn b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return a(runnable);
        }
        if (this.c) {
            return avns.a;
        }
        avnv avnvVar = new avnv();
        avnv avnvVar2 = new avnv(avnvVar);
        awip awipVar = new awip(this, avnvVar2, atqp.m(runnable));
        avmm avmmVar = this.e;
        awjd awjdVar = new awjd(awipVar, avmmVar);
        avmmVar.c(awjdVar);
        Executor executor = this.a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                awjdVar.a(((ScheduledExecutorService) executor).schedule((Callable) awjdVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.c = true;
                atqp.n(e);
                return avns.a;
            }
        } else {
            awjdVar.a(new awil(awir.b.c(awjdVar, j, timeUnit)));
        }
        avnr.g(avnvVar, awjdVar);
        return avnvVar2;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.e.dispose();
        if (this.d.getAndIncrement() == 0) {
            this.b.c();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iAddAndGet = 1;
        do {
            awie awieVar = this.b;
            if (this.c) {
                awieVar.c();
                return;
            }
            while (true) {
                Runnable runnable = (Runnable) awieVar.km();
                if (runnable == null) {
                    break;
                }
                runnable.run();
                if (this.c) {
                    awieVar.c();
                    return;
                }
            }
            if (this.c) {
                awieVar.c();
                return;
            }
            iAddAndGet = this.d.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }
}
