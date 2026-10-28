package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tlp implements tmf {
    public final ScheduledExecutorService a;
    public final long b;
    public tmd e;
    public ScheduledFuture f;
    private final long j;
    private final boolean k;
    public long g = 0;
    public volatile int d = 0;
    public final szq h = new szq(this, 5);
    public volatile int c = 0;

    public tlp(ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this.a = scheduledExecutorService;
        this.j = j;
        this.b = j2;
        this.k = z;
    }

    @Override // defpackage.tmf
    public final int a() {
        return this.d;
    }

    @Override // defpackage.tmf
    public final /* synthetic */ tme b() {
        return nsi.f(this);
    }

    @Override // defpackage.tmf
    public final synchronized void c() {
        this.c = 3;
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.tmf
    public final synchronized void d() {
        this.c = 3;
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.tmf
    public final synchronized void e() {
        this.f.getClass();
        ahno.P(this.c == 2, "Read completed in non READING_RESPONSE state");
        if (!this.k) {
            this.g = this.f.getDelay(TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.tmf
    public final synchronized void f() {
        this.f.getClass();
        ahno.P(this.c == 1, "Redirect can only be received in CONNECTING state");
        this.f.cancel(false);
        this.f = this.a.schedule(this.h, this.j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.tmf
    public final synchronized void g() {
        this.f.getClass();
        ahno.P(this.c == 1, "Response started can only be received in CONNECTING state");
        this.c = 2;
        this.f.cancel(false);
        if (!this.k) {
            this.g = 0L;
            this.f = this.a.schedule(this.h, this.b, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.tmf
    public final synchronized void h() {
        this.f.getClass();
        this.c = 3;
        this.f.cancel(false);
    }

    @Override // defpackage.tmf
    public final synchronized void i(tmd tmdVar) {
        ahno.P(this.c == 0, "Other request is already being monitored");
        this.e = tmdVar;
        this.c = 1;
        this.f = this.a.schedule(this.h, this.j, TimeUnit.MILLISECONDS);
    }
}
