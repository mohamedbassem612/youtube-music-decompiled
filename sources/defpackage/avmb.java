package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avmb {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract avma a();

    public avmn c(Runnable runnable, long j, TimeUnit timeUnit) {
        avma avmaVarA = a();
        avlx avlxVar = new avlx(atqp.m(runnable), avmaVarA);
        avmaVarA.b(avlxVar, j, timeUnit);
        return avlxVar;
    }

    public avmn d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        avma avmaVarA = a();
        avly avlyVar = new avly(atqp.m(runnable), avmaVarA);
        avmn avmnVarC = avmaVarA.c(avlyVar, j, j2, timeUnit);
        return avmnVarC == avns.a ? avmnVarC : avlyVar;
    }

    public avmn e(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
