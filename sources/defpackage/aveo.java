package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class aveo extends auyt {
    public static final Logger a = Logger.getLogger(aveo.class.getName());
    private static final auyt h = new avel();
    public final auzh c;
    public volatile boolean d;
    public auyt e;
    public aven g;
    private final ScheduledFuture i;
    private final Executor j;
    private avbe k;
    private Status l;
    private atxy m;
    public List f = new ArrayList();
    public final String b = "name_resolver";

    protected aveo(Executor executor, ScheduledExecutorService scheduledExecutorService, auzi auziVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        executor.getClass();
        this.j = executor;
        scheduledExecutorService.getClass();
        this.c = auzh.b();
        if (auziVar != null) {
            long jB = auziVar.b(TimeUnit.NANOSECONDS);
            scheduledFutureSchedule = scheduledExecutorService.schedule(new laz(this, jB, 19), jB, TimeUnit.NANOSECONDS);
        } else {
            scheduledFutureSchedule = null;
        }
        this.i = scheduledFutureSchedule;
    }

    private final void k(Runnable runnable) {
        synchronized (this) {
            if (this.d) {
                runnable.run();
            } else {
                this.f.add(runnable);
            }
        }
    }

    @Override // defpackage.auyt
    public final void a(atxy atxyVar, avbe avbeVar) {
        Status status;
        boolean z;
        avbeVar.getClass();
        ahno.P(this.m == null, "already started");
        synchronized (this) {
            atxyVar.getClass();
            this.m = atxyVar;
            status = this.l;
            z = this.d;
            if (!z) {
                aven avenVar = new aven(this, atxyVar);
                this.g = avenVar;
                this.k = avbeVar;
                atxyVar = avenVar;
            }
        }
        if (status != null) {
            this.j.execute(new avem(this, atxyVar, status));
        } else if (z) {
            this.e.a(atxyVar, avbeVar);
        }
    }

    @Override // defpackage.auyt
    public final void b(String str, Throwable th) {
        Status status = Status.b;
        Status statusWithDescription = str != null ? status.withDescription(str) : status.withDescription("Call cancelled without message");
        if (th != null) {
            statusWithDescription = statusWithDescription.c(th);
        }
        g(statusWithDescription, false);
    }

    @Override // defpackage.auyt
    public final void c() {
        k(new afjc(this, 20, null));
    }

    @Override // defpackage.auyt
    public final void d(Object obj) {
        if (this.d) {
            this.e.d(obj);
        } else {
            k(new agrq(this, obj, 14, (char[]) null));
        }
    }

    @Override // defpackage.auyt
    public final void e() {
        if (this.d) {
            this.e.e();
        } else {
            k(new afjc(this, 19, null));
        }
    }

    public final void g(Status status, boolean z) {
        atxy atxyVar;
        boolean z2;
        synchronized (this) {
            if (this.e == null) {
                i(h);
                atxyVar = this.m;
                this.l = status;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                atxyVar = null;
                z2 = true;
            }
            if (z2) {
                k(new agrq(this, status, 13));
            } else {
                if (atxyVar != null) {
                    this.j.execute(new avem(this, atxyVar, status));
                }
                j(atxyVar);
                h();
            }
            f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L24
            r0 = 0
            r3.f = r0     // Catch: java.lang.Throwable -> L44
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L44
            aven r0 = r3.g     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.j
            avek r2 = new avek
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.f     // Catch: java.lang.Throwable -> L44
            r3.f = r0     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r0
        L44:
            r0 = move-exception
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aveo.h():void");
    }

    public final void i(auyt auytVar) {
        auyt auytVar2 = this.e;
        ahno.R(auytVar2 == null, "realCall already set to %s", auytVar2);
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.e = auytVar;
    }

    public final void j(atxy atxyVar) {
        avbe avbeVar = this.k;
        this.k = null;
        atvv atvvVar = new atvv(this, atxyVar, avbeVar, 2, (char[]) null);
        auzh auzhVar = this.c;
        auzh auzhVarA = auzhVar.a();
        try {
            atvvVar.run();
        } finally {
            auzhVar.c(auzhVarA);
        }
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("realCall", this.e);
        return ageuVarAc.toString();
    }

    protected void f() {
    }
}
