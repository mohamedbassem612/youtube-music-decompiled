package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rix extends rjc {
    public final rfo b;
    public final AtomicReference c = new AtomicReference();
    public static final rbm d = new rbm("rix");
    public static final Duration a = Duration.ofMillis(3);

    public rix(ahxp ahxpVar, String str) {
        rfo rfoVar = new rfo(ahxpVar);
        this.b = rfoVar;
        rfoVar.setName(str);
        rfoVar.start();
        rfoVar.setUncaughtExceptionHandler(new avgk(str, 1));
        try {
            if (rfoVar.h()) {
                return;
            }
            rbc rbcVar = new rbc(d, rbd.e);
            rbcVar.c();
            rbcVar.a("Failed to initialize the dedicated gl thread, name: %s", str);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            rbc rbcVar2 = new rbc(d, rbd.e);
            rbcVar2.a = e;
            rbcVar2.c();
            rbcVar2.a("Interrupted while waiting for dedicated gl thread %s to become ready.", str);
        }
    }

    @Override // defpackage.rjc
    public final rfo a() {
        return this.b;
    }

    @Override // defpackage.rjc
    public final void b() {
        try {
            rfo rfoVar = this.b;
            Looper looper = rfoVar.n;
            if (looper != null) {
                rjs.a(rfoVar, looper);
            } else {
                rbc rbcVar = new rbc(d, rbd.e);
                rbcVar.c();
                rbcVar.a("Dedicated gl thread is not running.", new Object[0]);
            }
        } catch (InterruptedException e) {
            rbc rbcVar2 = new rbc(d, rbd.e);
            rbcVar2.a = e;
            rbcVar2.c();
            rbcVar2.a("Interrupted while closing dedicated gl thread.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.rjc
    public final void c(Runnable runnable) {
        rfo rfoVar = this.b;
        Handler handler = rfoVar.m;
        if (handler == null) {
            rbc rbcVar = new rbc(d, rbd.e);
            rbcVar.c();
            rbcVar.a("Failed to post on the dedicated gl thread %s.", rfoVar.getName());
        } else {
            if (handler.post(new rhz(this, runnable, 7, null))) {
                return;
            }
            rbc rbcVar2 = new rbc(d, rbd.e);
            rbcVar2.c();
            rbcVar2.a("Failed to post on the dedicated gl thread %s.", rfoVar.getName());
        }
    }

    @Override // defpackage.rjc
    public final void d(Runnable runnable) {
        this.c.set(runnable);
        rfo rfoVar = this.b;
        Handler handler = rfoVar.m;
        if (handler != null) {
            handler.post(new rhl(this, 13));
            return;
        }
        rbc rbcVar = new rbc(d, rbd.e);
        rbcVar.c();
        rbcVar.a("Failed to start repeating on the dedicated gl thread %s.", rfoVar.getName());
    }
}
