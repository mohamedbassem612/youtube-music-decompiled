package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class plo extends aheg implements AutoCloseable, ahey {
    public static final /* synthetic */ int b = 0;
    public final ahey a;
    private final ahex c;

    public plo(ahex ahexVar, ahey aheyVar) {
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
        return j <= 0 ? new pln(this.c.submit(runnable), System.nanoTime()) : new plm(ahevVar, this.a.schedule(new plj(this, ahevVar, 1), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    public final ahew schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new pln(this.c.submit(callable), System.nanoTime());
        }
        ahev ahevVar = new ahev(callable);
        return new plm(ahevVar, this.a.schedule(new plj(this, ahevVar, 0), j, timeUnit));
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
        return new plm(settableFutureCreate, this.a.scheduleAtFixedRate(new Runnable() { // from class: plh
            @Override // java.lang.Runnable
            public final void run() {
                int i = plo.b;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = settableFutureCreate;
                ahfgVar.execute(new Runnable() { // from class: pli
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = plo.b;
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
        plm plmVar = new plm(settableFutureCreate, null);
        plmVar.a = this.a.schedule(new pll(this, runnable, settableFutureCreate, plmVar, j2, timeUnit), j, timeUnit);
        return plmVar;
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
