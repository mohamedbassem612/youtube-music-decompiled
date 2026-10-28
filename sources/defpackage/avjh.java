package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjh implements avdu {
    static final avbb a;
    static final avbb b;
    public static final Status c;
    public static final Random d;
    public static final boolean e;
    public boolean A;
    final /* synthetic */ avbh B;
    final /* synthetic */ auyq C;
    final /* synthetic */ auzh D;
    final /* synthetic */ avgm E;
    public axlj F;
    public final axst G;
    private final avbe H;
    private Status I;
    public final avbh f;
    public final Executor g;
    public final Executor h;
    public final ScheduledExecutorService i;
    public final avji j;
    public final avfq k;
    public final boolean l;
    public final Object m;
    public final long n;
    public final long o;
    public final avjg p;
    public final avfu q;
    public volatile avjd r;
    public final AtomicBoolean s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public long v;
    public avdw w;
    public avjb x;
    public avjb y;
    public long z;

    static {
        avba avbaVar = avbe.b;
        int i = avbb.c;
        a = new avaz("grpc-previous-rpc-attempts", avbaVar);
        b = new avaz("grpc-retry-pushback-ms", avbe.b);
        c = Status.b.withDescription("Stream thrown away because RetriableStream committed");
        d = new Random();
        avbb avbbVar = avfp.a;
        e = auzn.a("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public avjh(avgm avgmVar, avbh avbhVar, avbe avbeVar, auyq auyqVar, avji avjiVar, avfq avfqVar, auzh auzhVar) {
        this.B = avbhVar;
        this.C = auyqVar;
        this.D = auzhVar;
        this.E = avgmVar;
        avhb avhbVar = avgmVar.b;
        axst axstVar = avhbVar.W;
        long j = avhbVar.O;
        long j2 = avhbVar.P;
        Executor executorF = avhbVar.f(auyqVar);
        ScheduledExecutorService scheduledExecutorServiceA = avhbVar.k.a();
        avjg avjgVar = avgmVar.a;
        this.h = new avcj(new rdf(5));
        this.m = new Object();
        this.q = new avfu();
        this.r = new avjd(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.s = new AtomicBoolean();
        this.t = new AtomicInteger();
        this.u = new AtomicInteger();
        this.f = avbhVar;
        this.G = axstVar;
        this.n = j;
        this.o = j2;
        this.g = executorF;
        this.i = scheduledExecutorServiceA;
        this.H = avbeVar;
        this.j = avjiVar;
        if (avjiVar != null) {
            this.z = avjiVar.b;
        }
        this.k = avfqVar;
        ahno.G(avjiVar == null || avfqVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.l = avfqVar != null;
        this.p = avjgVar;
    }

    @Override // defpackage.avdu
    public final auyo a() {
        throw null;
    }

    public final avjf b(int i, boolean z, boolean z2) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.u;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        avjf avjfVar = new avjf(i);
        aviy aviyVar = new aviy(new avja(this, avjfVar));
        avbe avbeVar = this.H;
        avbe avbeVar2 = new avbe();
        avbeVar2.d(avbeVar);
        if (i > 0) {
            avbeVar2.e(a, String.valueOf(i));
        }
        auyq auyqVar = this.C;
        List list = auyqVar.e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(aviyVar);
        avcl avclVarF = auyq.f(auyqVar);
        avclVarF.a = DesugarCollections.unmodifiableList(arrayList);
        auyq auyqVar2 = new auyq(avclVarF);
        auyw[] auywVarArrG = avfp.g(auyqVar2, i, z, z2);
        auzh auzhVarA = this.D.a();
        try {
            avdu avduVarA = this.E.b.A.a(this.B, avbeVar2, auyqVar2, auywVarArrG);
            this.D.c(auzhVarA);
            avjfVar.a = avduVarA;
            return avjfVar;
        } catch (Throwable th) {
            this.D.c(auzhVarA);
            throw th;
        }
    }

    public final Runnable c(avjf avjfVar) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.m) {
            if (this.r.f != null) {
                return null;
            }
            Collection collection = this.r.c;
            avjd avjdVar = this.r;
            ahno.P(avjdVar.f == null, "Already committed");
            List list2 = avjdVar.b;
            if (avjdVar.c.contains(avjfVar)) {
                list = null;
                collectionSingleton = Collections.singleton(avjfVar);
                z = true;
            } else {
                list = list2;
                z = false;
                collectionSingleton = Collections.EMPTY_LIST;
            }
            this.r = new avjd(list, collectionSingleton, avjdVar.d, avjfVar, avjdVar.g, z, avjdVar.h, avjdVar.e);
            this.G.f(-this.v);
            avjb avjbVar = this.x;
            boolean z2 = avjbVar == null;
            boolean z3 = avjbVar != null ? avjbVar.c : false;
            boolean z4 = !z2;
            if (z2) {
                future = null;
            } else {
                Future futureA = avjbVar.a();
                this.x = null;
                future = futureA;
            }
            avjb avjbVar2 = this.y;
            if (avjbVar2 != null) {
                Future futureA2 = avjbVar2.a();
                this.y = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new avit(this, collection, avjfVar, z4, future, z3, future2);
        }
    }

    public final void d(avjf avjfVar) {
        Runnable runnableC = c(avjfVar);
        if (runnableC != null) {
            this.g.execute(runnableC);
        }
    }

    public final void e(aviz avizVar) {
        Collection collection;
        synchronized (this.m) {
            if (!this.r.a) {
                this.r.b.add(avizVar);
            }
            collection = this.r.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            avizVar.a((avjf) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        if (r5 >= r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        r7 = (defpackage.aviz) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.avjc);
        r7 = r9.r;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r8 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        if (r8 != r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (r7.g == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.avjf r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.m
            monitor-enter(r5)
            avjd r6 = r9.r     // Catch: java.lang.Throwable -> La8
            avjf r7 = r6.f     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            goto L36
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            goto L36
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> La8
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La8
            if (r2 != r8) goto L5b
            avjd r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La8
            r9.r = r0     // Catch: java.lang.Throwable -> La8
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            goto L60
        L2e:
            avgv r1 = new avgv     // Catch: java.lang.Throwable -> La8
            r0 = 13
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r9 = r9.h
            r9.execute(r1)
            goto L60
        L3e:
            if (r4 != 0) goto L4a
            avdu r0 = r10.a
            avje r1 = new avje
            r1.<init>(r9, r10)
            r0.n(r1)
        L4a:
            avdu r0 = r10.a
            avjd r1 = r9.r
            avjf r1 = r1.f
            if (r1 != r10) goto L55
            io.grpc.Status r9 = r9.I
            goto L57
        L55:
            io.grpc.Status r9 = defpackage.avjh.c
        L57:
            r0.h(r9)
            goto L60
        L5b:
            boolean r6 = r10.b     // Catch: java.lang.Throwable -> La8
            if (r6 == 0) goto L61
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
        L60:
            return
        L61:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La8
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La8
            if (r3 != 0) goto L77
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La8
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La8
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La8
            goto L81
        L77:
            r3.clear()     // Catch: java.lang.Throwable -> La8
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La8
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La8
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            int r2 = r3.size()
            r5 = r0
        L87:
            if (r5 >= r2) goto La3
            java.lang.Object r7 = r3.get(r5)
            aviz r7 = (defpackage.aviz) r7
            r7.a(r10)
            boolean r7 = r7 instanceof defpackage.avjc
            r4 = r4 | r7
            avjd r7 = r9.r
            avjf r8 = r7.f
            if (r8 == 0) goto L9d
            if (r8 != r10) goto La3
        L9d:
            boolean r7 = r7.g
            int r5 = r5 + 1
            if (r7 == 0) goto L87
        La3:
            r2 = r6
            goto L5
        La6:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            throw r9
        La8:
            r9 = move-exception
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avjh.f(avjf):void");
    }

    @Override // defpackage.avdu
    public final void g(avfu avfuVar) {
        avjd avjdVar;
        synchronized (this.m) {
            avfuVar.b("closed", this.q);
            avjdVar = this.r;
        }
        avjf avjfVar = avjdVar.f;
        if (avjfVar != null) {
            avfu avfuVar2 = new avfu();
            avjfVar.a.g(avfuVar2);
            avfuVar.b("committed", avfuVar2);
            return;
        }
        avfu avfuVar3 = new avfu();
        for (avjf avjfVar2 : avjdVar.c) {
            avfu avfuVar4 = new avfu();
            avjfVar2.a.g(avfuVar4);
            avfuVar3.a(avfuVar4);
        }
        avfuVar.b("open", avfuVar3);
    }

    @Override // defpackage.avdu
    public final void h(Status status) {
        avjf avjfVar;
        avjf avjfVar2 = new avjf(0);
        avjfVar2.a = new avhv();
        Runnable runnableC = c(avjfVar2);
        Object obj = this.m;
        if (runnableC != null) {
            synchronized (obj) {
                this.r = this.r.c(avjfVar2);
            }
            runnableC.run();
            q(status, avdv.a, new avbe());
            return;
        }
        synchronized (obj) {
            if (this.r.c.contains(this.r.f)) {
                avjfVar = this.r.f;
            } else {
                this.I = status;
                avjfVar = null;
            }
            avjd avjdVar = this.r;
            this.r = new avjd(avjdVar.b, avjdVar.c, avjdVar.d, avjdVar.f, true, avjdVar.a, avjdVar.h, avjdVar.e);
        }
        if (avjfVar != null) {
            avjfVar.a.h(status);
        }
    }

    @Override // defpackage.avdu
    public final void i() {
        e(new aviv(0));
    }

    @Override // defpackage.avdu
    public final void j(auzi auziVar) {
        e(new aviu(auziVar, 0));
    }

    @Override // defpackage.avdu
    public final void k(auzl auzlVar) {
        e(new aviu(auzlVar, 2));
    }

    @Override // defpackage.avdu
    public final void l(int i) {
        e(new aviw(i, 1));
    }

    @Override // defpackage.avdu
    public final void m(int i) {
        e(new aviw(i, 0));
    }

    @Override // defpackage.avdu
    public final void n(avdw avdwVar) {
        Status status;
        avjb avjbVar;
        boolean z;
        avjg avjgVar;
        this.w = avdwVar;
        avha avhaVar = this.E.b.B;
        synchronized (avhaVar.a) {
            status = avhaVar.c;
            avjbVar = null;
            if (status == null) {
                avhaVar.b.add(this);
                status = null;
            }
        }
        if (status != null) {
            h(status);
            return;
        }
        synchronized (this.m) {
            z = this.r.f != null;
            if (!z) {
                this.r.b.add(new avjc(this));
            }
        }
        if (z) {
            x();
            return;
        }
        avjf avjfVarB = b(0, false, false);
        if (avjfVarB != null) {
            if (this.l) {
                Object obj = this.m;
                synchronized (obj) {
                    this.r = this.r.a(avjfVarB);
                    if (w(this.r) && ((avjgVar = this.p) == null || avjgVar.a())) {
                        avjbVar = new avjb(obj);
                        this.y = avjbVar;
                    }
                }
                if (avjbVar != null) {
                    avjbVar.b(this.i.schedule(new awim(this, avjbVar, 1), this.k.b, TimeUnit.NANOSECONDS));
                }
            }
            f(avjfVarB);
        }
    }

    @Override // defpackage.avka
    public final boolean o() {
        Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((avjf) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        Future future;
        synchronized (this.m) {
            avjb avjbVar = this.y;
            future = null;
            if (avjbVar != null) {
                Future futureA = avjbVar.a();
                this.y = null;
                future = futureA;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void q(Status status, avdv avdvVar, avbe avbeVar) {
        this.F = new axlj(status, avdvVar, avbeVar);
        if (this.u.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.h.execute(new aasv((Object) this, status, avdvVar, avbeVar, 16));
        }
    }

    @Override // defpackage.avka
    public final void r() {
        avjd avjdVar = this.r;
        if (avjdVar.a) {
            avjdVar.f.a.r();
        } else {
            e(new aviv(1));
        }
    }

    @Override // defpackage.avka
    public final void s() {
        e(new aviv(2));
    }

    @Override // defpackage.avka
    public final void t(auyz auyzVar) {
        e(new aviu(auyzVar, 1));
    }

    @Override // defpackage.avka
    public final void u(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.avka
    public final void v() {
        avjd avjdVar = this.r;
        if (avjdVar.a) {
            avjdVar.f.a.v();
        } else {
            e(new aviv(3));
        }
    }

    public final boolean w(avjd avjdVar) {
        return avjdVar.f == null && avjdVar.e < this.k.a && !avjdVar.h;
    }

    public final void x() {
        Status status;
        avha avhaVar = this.E.b.B;
        synchronized (avhaVar.a) {
            avhaVar.b.remove(this);
            if (avhaVar.b.isEmpty()) {
                status = avhaVar.c;
                avhaVar.b = new HashSet();
            } else {
                status = null;
            }
        }
        if (status != null) {
            avhaVar.d.A.e(status);
        }
    }
}
