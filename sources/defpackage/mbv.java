package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mbv extends aheg implements AutoCloseable, ahey {
    protected mbv() {
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b */
    public ahew schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return h().schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    public ahew schedule(Callable callable, long j, TimeUnit timeUnit) {
        return h().schedule(callable, j, timeUnit);
    }

    @Override // defpackage.aheg, defpackage.ahec, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: d */
    public ahew scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return h().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: e */
    public ahew scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return h().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.aheg
    protected /* bridge */ /* synthetic */ ahex f() {
        throw null;
    }

    protected abstract ahey h();
}
