package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awir extends avmb {
    static final avmb b;
    public static final /* synthetic */ int d = 0;
    final Executor c;

    static {
        avmb avmbVar = awlg.a;
        avnn avnnVar = atqp.h;
        b = avmbVar;
    }

    public awir(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.avmb
    public final avma a() {
        return new awiq(this.c);
    }

    @Override // defpackage.avmb
    public final avmn c(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableM = atqp.m(runnable);
        Executor executor = this.c;
        if (!(executor instanceof ScheduledExecutorService)) {
            awin awinVar = new awin(runnableM);
            avnr.g(awinVar.a, b.c(new awim(this, awinVar, 0), j, timeUnit));
            return awinVar;
        }
        try {
            awjc awjcVar = new awjc(runnableM);
            awjcVar.a(((ScheduledExecutorService) executor).schedule(awjcVar, j, timeUnit));
            return awjcVar;
        } catch (RejectedExecutionException e) {
            atqp.n(e);
            return avns.a;
        }
    }

    @Override // defpackage.avmb
    public final avmn d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.c;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.d(runnable, j, j2, timeUnit);
        }
        try {
            awjb awjbVar = new awjb(atqp.m(runnable));
            awjbVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(awjbVar, j, j2, timeUnit));
            return awjbVar;
        } catch (RejectedExecutionException e) {
            atqp.n(e);
            return avns.a;
        }
    }

    @Override // defpackage.avmb
    public final avmn e(Runnable runnable) {
        avmn avmnVar;
        Runnable runnableM = atqp.m(runnable);
        try {
            Executor executor = this.c;
            if (executor instanceof ExecutorService) {
                awjc awjcVar = new awjc(runnableM);
                awjcVar.a(((ExecutorService) executor).submit(awjcVar));
                avmnVar = awjcVar;
            } else {
                awio awioVar = new awio(runnableM);
                executor.execute(awioVar);
                avmnVar = awioVar;
            }
            return avmnVar;
        } catch (RejectedExecutionException e) {
            atqp.n(e);
            return avns.a;
        }
    }
}
