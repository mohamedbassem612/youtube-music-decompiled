package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahfd extends ahfa implements AutoCloseable, ahey {
    final ScheduledExecutorService a;

    public ahfd(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ahew schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ahfo ahfoVar = new ahfo(Executors.callable(runnable, null));
        return new ahfb(ahfoVar, this.a.schedule(ahfoVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ahew schedule(Callable callable, long j, TimeUnit timeUnit) {
        ahfo ahfoVar = new ahfo(callable);
        return new ahfb(ahfoVar, this.a.schedule(ahfoVar, j, timeUnit));
    }

    @Override // defpackage.ahcp, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ahew scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ahfc ahfcVar = new ahfc(runnable);
        return new ahfb(ahfcVar, this.a.scheduleAtFixedRate(ahfcVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ahew scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ahfc ahfcVar = new ahfc(runnable);
        return new ahfb(ahfcVar, this.a.scheduleWithFixedDelay(ahfcVar, j, j2, timeUnit));
    }
}
