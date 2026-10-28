package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tlk implements tmf {
    public volatile int a;
    public volatile int b;
    public tmd c;
    private final ScheduledExecutorService d;
    private final long e;
    private final long f;
    private final Runnable g;
    private ScheduledFuture h;
    private final boolean j;

    public tlk(ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        this.j = false;
        this.d = scheduledExecutorService;
        this.e = j;
        this.f = j2;
        this.b = 0;
        this.g = new szq(this, 4);
        this.a = 0;
    }

    @Override // defpackage.tmf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.tmf
    public final /* synthetic */ tme b() {
        return nsi.f(this);
    }

    @Override // defpackage.tmf
    public final void c() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.tmf
    public final void d() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.tmf
    public final void e() {
        this.h.getClass();
        ahno.P(this.a == 2, "Read completed in non READING_RESPONSE state");
        this.h.cancel(false);
        if (this.j) {
            return;
        }
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.tmf
    public final void f() {
        this.h.getClass();
        ahno.P(this.a == 1, "Redirect can only be received in CONNECTING state");
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.tmf
    public final void g() {
        this.h.getClass();
        ahno.P(this.a == 1, "Response started can only be received in CONNECTING state");
        this.a = 2;
        this.h.cancel(false);
        if (this.j) {
            return;
        }
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.tmf
    public final void h() {
        this.h.getClass();
        this.a = 3;
        this.h.cancel(false);
    }

    @Override // defpackage.tmf
    public final void i(tmd tmdVar) {
        ahno.P(this.a == 0, "Other request is already being monitored");
        this.c = tmdVar;
        this.a = 1;
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }

    public tlk(ScheduledExecutorService scheduledExecutorService, long j) {
        this(scheduledExecutorService, j, 2147483647L);
        this.j = true;
    }
}
