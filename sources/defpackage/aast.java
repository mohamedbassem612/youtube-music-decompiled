package defpackage;

import android.os.PowerManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aast implements Runnable {
    public final PowerManager.WakeLock a;
    public final mbc b;
    private final ScheduledExecutorService g;
    public final Object c = new Object();
    public long d = 0;
    private long h = 0;
    public ScheduledFuture e = null;
    public long f = 0;

    public aast(PowerManager.WakeLock wakeLock, ScheduledExecutorService scheduledExecutorService, mbc mbcVar) {
        this.a = wakeLock;
        this.g = scheduledExecutorService;
        this.b = mbcVar;
    }

    public final void a() {
        PowerManager.WakeLock wakeLock = this.a;
        if (wakeLock.isHeld()) {
            try {
                wakeLock.release();
            } catch (RuntimeException unused) {
            }
        }
        this.f = 0L;
    }

    final void b(long j) {
        mbc mbcVar = this.b;
        long jB = mbcVar.b() + j;
        synchronized (this.c) {
            this.d = jB;
            long jB2 = mbcVar.b();
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture == null || scheduledFuture.isDone() || this.h > jB) {
                ScheduledFuture scheduledFuture2 = this.e;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                }
                long jMax = Math.max(0L, jB - jB2);
                this.h = jB;
                this.e = this.g.schedule(this, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            if (this.e == null) {
                return;
            }
            long jB = this.b.b();
            long j = this.d;
            if (j != 0 && jB >= j) {
                this.e = null;
                this.d = 0L;
                a();
            } else if (j != 0) {
                this.h = j;
                this.e = this.g.schedule(this, j - jB, TimeUnit.MILLISECONDS);
            }
        }
    }
}
