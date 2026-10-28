package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class avma implements avmn {
    public static final long d(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public avmn a(Runnable runnable) {
        return b(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract avmn b(Runnable runnable, long j, TimeUnit timeUnit);

    public final avmn c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        avnv avnvVar = new avnv();
        avnv avnvVar2 = new avnv(avnvVar);
        Runnable runnableM = atqp.m(runnable);
        long nanos = timeUnit.toNanos(j2);
        long jConvert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        avmn avmnVarB = b(new avlz(this, jConvert + timeUnit.toNanos(j), runnableM, jConvert, avnvVar2, nanos), j, timeUnit);
        if (avmnVarB == avns.a) {
            return avmnVarB;
        }
        avnr.g(avnvVar, avmnVarB);
        return avnvVar2;
    }
}
