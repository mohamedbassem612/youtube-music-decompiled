package defpackage;

import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aath {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/transfer/service/OfflineUidtWatchdog");
    public static final long b;
    public static final long c;
    public final ScheduledExecutorService d;
    public final mbc e;
    public final aauk f;
    public final aesq l;
    private final awmd m;
    private Runnable o;
    public ScheduledFuture g = null;
    public volatile long h = -1;
    public volatile String i = null;
    public volatile long j = -1;
    public volatile boolean k = false;
    private final aarp n = new aatg(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 10000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        c = 30000L;
    }

    public aath(awmd awmdVar, ScheduledExecutorService scheduledExecutorService, mbc mbcVar, aauk aaukVar, aesq aesqVar) {
        this.m = awmdVar;
        this.d = scheduledExecutorService;
        this.e = mbcVar;
        this.f = aaukVar;
        this.l = aesqVar;
    }

    private final synchronized void i() {
        if (this.k) {
            this.k = false;
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.g = null;
            }
            Runnable runnable = this.o;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final aati a() {
        agev agevVar = (agev) this.m.io();
        if (agevVar.g()) {
            return (aati) agevVar.c();
        }
        return null;
    }

    public final synchronized void b(aamw aamwVar) {
        if (this.k && aamwVar.a.equals(this.i) && !aamwVar.b()) {
            i();
        }
    }

    public final synchronized void c() {
        if (this.k) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/offline/transfer/service/OfflineUidtWatchdog", "onFallbackRescheduleTimeout", 201, "OfflineUidtWatchdog.java")).t("[Offline][UIDT] Watchdog: Reschedule callback fallback timeout reached. Forcing reschedule.");
            i();
        }
    }

    public final synchronized void d() {
        Duration durationE = this.f.e();
        if (a.y(durationE)) {
            this.g = this.d.schedule(new aadm(this, 14), durationE.toMinutes(), TimeUnit.MINUTES);
        }
    }

    public final synchronized void e(Runnable runnable) {
        this.o = runnable;
        aati aatiVarA = a();
        if (aatiVarA == null) {
            return;
        }
        aatiVarA.n(this.n);
        aatiVarA.c();
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.k = false;
        this.h = this.e.b();
        for (aamw aamwVar : aatiVarA.f().values()) {
            if (aamwVar.b()) {
                this.i = aamwVar.a;
                this.j = aamwVar.d;
                break;
            }
        }
        d();
        this.f.e().toMinutes();
    }

    public final synchronized void f() {
        aati aatiVarA = a();
        if (aatiVarA != null) {
            aatiVarA.o(this.n);
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.g = null;
        }
        this.o = null;
        this.k = false;
        this.i = null;
        this.j = -1L;
    }

    public final synchronized void g(aamw aamwVar) {
        String str = aamwVar.a;
        if (!str.equals(this.i)) {
            this.i = str;
            this.j = aamwVar.d;
            this.h = this.e.b();
        }
    }

    public final synchronized void h(aamw aamwVar) {
        String str = aamwVar.a;
        boolean zEquals = str.equals(this.i);
        long j = aamwVar.d;
        if (!zEquals || j > this.j) {
            this.i = str;
            this.j = j;
            this.h = this.e.b();
        }
    }
}
