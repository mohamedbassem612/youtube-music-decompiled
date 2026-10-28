package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbr extends aheg implements AutoCloseable, ahey {
    public static final /* synthetic */ int b = 0;
    public final ahey a;
    private final ahex c;

    public mbr(ahex ahexVar, ahey aheyVar) {
        this.c = ahexVar;
        this.a = aheyVar;
    }

    @Override // defpackage.ahec, defpackage.agjb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object b() {
        return this.c;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b */
    public final ahew schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ahev ahevVar = new ahev(runnable);
        return j <= 0 ? new mbq(this.c.submit(runnable), System.nanoTime()) : new mbp(ahevVar, this.a.schedule(new lph(this, ahevVar, 2, (byte[]) null), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    public final ahew schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new mbq(this.c.submit(callable), System.nanoTime());
        }
        ahev ahevVar = new ahev(callable);
        return new mbp(ahevVar, this.a.schedule(new lph(this, ahevVar, 3, (byte[]) null), j, timeUnit));
    }

    @Override // defpackage.aheg, defpackage.ahec, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: d */
    public final ahew scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final ahfg ahfgVar = new ahfg(this);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        return new mbp(settableFutureCreate, this.a.scheduleAtFixedRate(new Runnable() { // from class: mbl
            @Override // java.lang.Runnable
            public final void run() {
                int i = mbr.b;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = settableFutureCreate;
                ahfgVar.execute(new Runnable() { // from class: mbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = mbr.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            settableFuture.setException(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: e */
    public final ahew scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        mbp mbpVar = new mbp(settableFutureCreate, null);
        mbpVar.a = this.a.schedule(new mbn(this, runnable, settableFutureCreate, mbpVar, j2, timeUnit), j, timeUnit);
        return mbpVar;
    }

    @Override // defpackage.aheg
    public final ahex f() {
        return this.c;
    }

    @Override // defpackage.aheg, defpackage.ahec
    public final /* synthetic */ ExecutorService g() {
        return this.c;
    }
}
