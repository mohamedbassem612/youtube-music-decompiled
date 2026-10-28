package defpackage;

import io.grpc.Status;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class avdb implements avhn {
    public avei a;
    public final Object b = new Object();
    public final avkf c;
    public final avhp d;
    public int e;
    public boolean f;
    public boolean g;
    public final int h;
    public final avjz i;
    public avdw j;
    public auzl k;
    public volatile boolean l;
    public boolean m;
    private boolean n;
    private boolean o;
    private Runnable p;
    private boolean q;

    protected avdb(int i, avjz avjzVar, avkf avkfVar) {
        this.c = avkfVar;
        avhp avhpVar = new avhp(this, auyx.a, i, avjzVar, avkfVar);
        this.d = avhpVar;
        this.a = avhpVar;
        this.h = 32768;
        this.k = auzl.b;
        this.o = false;
        this.i = avjzVar;
    }

    public final void a() {
        boolean zB;
        synchronized (this.b) {
            zB = b();
            if (!zB) {
                Logger logger = avdc.t;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(this.h), Boolean.valueOf(this.g)});
                }
            }
        }
        if (zB) {
            this.j.d();
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.f && this.e < this.h && !this.g) {
                z = true;
            }
        }
        return z;
    }

    public final void c(Status status, avdv avdvVar, avbe avbeVar) {
        if (this.n) {
            return;
        }
        this.n = true;
        avjz avjzVar = this.i;
        if (avjzVar.a.compareAndSet(false, true)) {
            for (avjt avjtVar : avjzVar.b) {
            }
        }
        avkf avkfVar = this.c;
        if (status.e()) {
            avkfVar.b++;
        } else {
            avkfVar.c++;
        }
        this.j.a(status, avdvVar, avbeVar);
    }

    @Override // defpackage.avhn
    public final void d(boolean z) {
        ahno.P(this.m, "status should have been reported on deframer closed");
        this.o = true;
        if (this.q && z) {
            e(Status.l.withDescription("Encountered end-of-stream mid-frame"), true, new avbe());
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            this.p = null;
        }
    }

    public final void e(Status status, boolean z, avbe avbeVar) {
        avdv avdvVar = avdv.a;
        status.getClass();
        avbeVar.getClass();
        if (this.m) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.m = true;
        this.q = status.e();
        synchronized (this.b) {
            this.g = true;
        }
        if (this.o) {
            this.p = null;
            c(status, avdvVar, avbeVar);
            return;
        }
        this.p = new aasv(this, status, avdvVar, avbeVar, 14);
        avei aveiVar = this.a;
        if (z) {
            aveiVar.close();
            return;
        }
        avhp avhpVar = (avhp) aveiVar;
        if (avhpVar.b()) {
            return;
        }
        if (avhpVar.c()) {
            avhpVar.close();
        } else {
            avhpVar.f = true;
        }
    }

    @Override // defpackage.avhn
    public final void f(auym auymVar) {
        this.j.e(auymVar);
    }
}
