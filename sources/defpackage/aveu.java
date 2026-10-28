package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class aveu implements avdu {
    private Status b;
    private avet c;
    private long d;
    private long e;
    public volatile boolean f;
    public avdw g;
    public avdu h;
    public List i = new ArrayList();
    private List j = new ArrayList();
    private final String a = "connecting_and_lb";

    private final void b(Runnable runnable) {
        ahno.P(this.g != null, "May only be called after start");
        synchronized (this) {
            if (this.f) {
                runnable.run();
            } else {
                this.i.add(runnable);
            }
        }
    }

    @Override // defpackage.avdu
    public final auyo a() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x004d, TryCatch #1 {, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:16:0x002d, B:17:0x0031), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[LOOP:3: B:19:0x0036->B:21:0x003c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r5)
            java.util.List r1 = r5.i     // Catch: java.lang.Throwable -> L70
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L50
            r0 = 0
            r5.i = r0     // Catch: java.lang.Throwable -> L70
            r1 = 1
            r5.f = r1     // Catch: java.lang.Throwable -> L70
            avet r2 = r5.c     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L4f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4d
            r2.b = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L2d:
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4d
            r2.c = r5     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r5 = r3.iterator()
        L36:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r5.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L36
        L46:
            r3.clear()
            r5 = r3
            goto L1e
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r5
        L4d:
            r5 = move-exception
            goto L4b
        L4f:
            return
        L50:
            java.util.List r1 = r5.i     // Catch: java.lang.Throwable -> L70
            r5.i = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r0 = r1.iterator()
        L59:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L59
        L69:
            r1.clear()
            r0 = r1
            goto L5
        L6e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            throw r0
        L70:
            r0 = move-exception
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aveu.f():void");
    }

    @Override // defpackage.avdu
    public void g(avfu avfuVar) {
        synchronized (this) {
            if (this.g == null) {
                return;
            }
            avdu avduVar = this.h;
            String str = this.a;
            if (avduVar != null) {
                avfuVar.b(str + "_delay", (this.e - this.d) + "ns");
                this.h.g(avfuVar);
            } else {
                avfuVar.b(str + "_delay", (System.nanoTime() - this.d) + "ns");
                avfuVar.a("was_still_waiting");
            }
        }
    }

    @Override // defpackage.avdu
    public void h(Status status) {
        boolean z = false;
        ahno.P(this.g != null, "May only be called after start");
        status.getClass();
        synchronized (this) {
            if (this.h == null) {
                q(avhv.a);
                this.b = status;
            } else {
                z = true;
            }
        }
        if (z) {
            b(new aves(this, status, 1));
            return;
        }
        f();
        e();
        this.g.a(status, avdv.a, new avbe());
    }

    @Override // defpackage.avdu
    public final void i() {
        ahno.P(this.g != null, "May only be called after start");
        b(new avep(this, 9));
    }

    @Override // defpackage.avdu
    public final void j(auzi auziVar) {
        ahno.P(this.g == null, "May only be called before start");
        this.j.add(new agrq(this, auziVar, 19));
    }

    @Override // defpackage.avdu
    public final void k(auzl auzlVar) {
        ahno.P(this.g == null, "May only be called before start");
        auzlVar.getClass();
        this.j.add(new agrq(this, auzlVar, 18));
    }

    @Override // defpackage.avdu
    public final void l(int i) {
        ahno.P(this.g == null, "May only be called before start");
        this.j.add(new aesl(this, i, 3, null));
    }

    @Override // defpackage.avdu
    public final void m(int i) {
        ahno.P(this.g == null, "May only be called before start");
        this.j.add(new aesl(this, i, 4, null));
    }

    @Override // defpackage.avdu
    public final void n(avdw avdwVar) {
        Status status;
        boolean z;
        ahno.P(this.g == null, "already started");
        synchronized (this) {
            status = this.b;
            z = this.f;
            if (!z) {
                avet avetVar = new avet(avdwVar);
                this.c = avetVar;
                avdwVar = avetVar;
            }
            this.g = avdwVar;
            this.d = System.nanoTime();
        }
        if (status != null) {
            avdwVar.a(status, avdv.a, new avbe());
        } else if (z) {
            p(avdwVar);
        }
    }

    @Override // defpackage.avka
    public final boolean o() {
        if (this.f) {
            return this.h.o();
        }
        return false;
    }

    public final void p(avdw avdwVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.j = null;
        this.h.n(avdwVar);
    }

    public final void q(avdu avduVar) {
        avdu avduVar2 = this.h;
        ahno.R(avduVar2 == null, "realStream already set to %s", avduVar2);
        this.h = avduVar;
        this.e = System.nanoTime();
    }

    @Override // defpackage.avka
    public final void r() {
        ahno.P(this.g != null, "May only be called after start");
        if (this.f) {
            this.h.r();
        } else {
            b(new avep(this, 8));
        }
    }

    @Override // defpackage.avka
    public final void s() {
        ahno.P(this.g == null, "May only be called before start");
        this.j.add(new avep(this, 6));
    }

    @Override // defpackage.avka
    public final void t(auyz auyzVar) {
        ahno.P(this.g == null, "May only be called before start");
        this.j.add(new agrq(this, auyzVar, 17));
    }

    @Override // defpackage.avka
    public final void u(InputStream inputStream) {
        ahno.P(this.g != null, "May only be called after start");
        if (this.f) {
            this.h.u(inputStream);
        } else {
            b(new agrq(this, inputStream, 20, (char[]) null));
        }
    }

    @Override // defpackage.avka
    public final void v() {
        ahno.P(this.g != null, "May only be called after start");
        if (this.f) {
            this.h.v();
        } else {
            b(new avep(this, 5));
        }
    }

    protected void e() {
    }
}
