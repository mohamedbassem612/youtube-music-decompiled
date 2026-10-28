package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awjh extends avmb {
    static final awja b;
    static final ScheduledExecutorService c;
    final AtomicReference d;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        b = new awja("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public awjh() {
        awja awjaVar = b;
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        atomicReference.lazySet(awjf.a(awjaVar));
    }

    @Override // defpackage.avmb
    public final avma a() {
        return new awjg((ScheduledExecutorService) this.d.get());
    }

    @Override // defpackage.avmb
    public final avmn c(Runnable runnable, long j, TimeUnit timeUnit) {
        awjc awjcVar = new awjc(atqp.m(runnable));
        try {
            AtomicReference atomicReference = this.d;
            awjcVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(awjcVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(awjcVar, j, timeUnit));
            return awjcVar;
        } catch (RejectedExecutionException e) {
            atqp.n(e);
            return avns.a;
        }
    }

    @Override // defpackage.avmb
    public final avmn d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableM = atqp.m(runnable);
        if (j2 > 0) {
            awjb awjbVar = new awjb(runnableM);
            try {
                awjbVar.a(((ScheduledExecutorService) this.d.get()).scheduleAtFixedRate(awjbVar, j, j2, timeUnit));
                return awjbVar;
            } catch (RejectedExecutionException e) {
                atqp.n(e);
                return avns.a;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.get();
        awis awisVar = new awis(runnableM, scheduledExecutorService);
        try {
            awisVar.a(j <= 0 ? scheduledExecutorService.submit(awisVar) : scheduledExecutorService.schedule(awisVar, j, timeUnit));
            return awisVar;
        } catch (RejectedExecutionException e2) {
            atqp.n(e2);
            return avns.a;
        }
    }
}
