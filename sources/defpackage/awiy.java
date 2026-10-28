package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class awiy extends avma implements avmn {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public awiy(ThreadFactory threadFactory) {
        this.b = awjf.a(threadFactory);
    }

    @Override // defpackage.avma
    public final avmn a(Runnable runnable) {
        return b(runnable, 0L, null);
    }

    @Override // defpackage.avma
    public final avmn b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.c ? avns.a : h(runnable, j, timeUnit, null);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.shutdownNow();
    }

    public final avmn e(Runnable runnable, long j, TimeUnit timeUnit) {
        awjc awjcVar = new awjc(atqp.m(runnable));
        try {
            ScheduledExecutorService scheduledExecutorService = this.b;
            awjcVar.a(j <= 0 ? scheduledExecutorService.submit(awjcVar) : scheduledExecutorService.schedule(awjcVar, j, timeUnit));
            return awjcVar;
        } catch (RejectedExecutionException e) {
            atqp.n(e);
            return avns.a;
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c;
    }

    public final avmn g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableM = atqp.m(runnable);
        if (j2 > 0) {
            awjb awjbVar = new awjb(runnableM);
            try {
                awjbVar.a(this.b.scheduleAtFixedRate(awjbVar, j, j2, timeUnit));
                return awjbVar;
            } catch (RejectedExecutionException e) {
                atqp.n(e);
                return avns.a;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.b;
        awis awisVar = new awis(runnableM, scheduledExecutorService);
        try {
            awisVar.a(j <= 0 ? scheduledExecutorService.submit(awisVar) : scheduledExecutorService.schedule(awisVar, j, timeUnit));
            return awisVar;
        } catch (RejectedExecutionException e2) {
            atqp.n(e2);
            return avns.a;
        }
    }

    public final awjd h(Runnable runnable, long j, TimeUnit timeUnit, avnq avnqVar) {
        awjd awjdVar = new awjd(atqp.m(runnable), avnqVar);
        if (avnqVar == null || avnqVar.c(awjdVar)) {
            try {
                ScheduledExecutorService scheduledExecutorService = this.b;
                awjdVar.a(j <= 0 ? scheduledExecutorService.submit((Callable) awjdVar) : scheduledExecutorService.schedule((Callable) awjdVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                if (avnqVar != null) {
                    avnqVar.h(awjdVar);
                }
                atqp.n(e);
            }
        }
        return awjdVar;
    }
}
