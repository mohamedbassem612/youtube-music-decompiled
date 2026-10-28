package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awjg extends avma {
    final ScheduledExecutorService a;
    final avmm b = new avmm();
    volatile boolean c;

    public awjg(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.avma
    public final avmn b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            return avns.a;
        }
        Runnable runnableM = atqp.m(runnable);
        avmm avmmVar = this.b;
        awjd awjdVar = new awjd(runnableM, avmmVar);
        avmmVar.c(awjdVar);
        try {
            ScheduledExecutorService scheduledExecutorService = this.a;
            awjdVar.a(j <= 0 ? scheduledExecutorService.submit((Callable) awjdVar) : scheduledExecutorService.schedule((Callable) awjdVar, j, timeUnit));
            return awjdVar;
        } catch (RejectedExecutionException e) {
            dispose();
            atqp.n(e);
            return avns.a;
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c;
    }
}
