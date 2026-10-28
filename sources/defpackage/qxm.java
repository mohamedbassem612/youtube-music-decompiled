package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxm implements AutoCloseable {
    public static final rbm z = new rbm("qxm");
    private final Looper A;
    private final int B;
    private Duration D;
    private final qcb F;
    public final Context a;
    public final rjb b;
    public final bvq c;
    public final qxp d;
    public final int e;
    public final Duration f;
    public final qyx g;
    public final qug h;
    public final qua i;
    public final qys j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Runnable n;
    public final bug q;
    public int s;
    public boolean v;
    public SettableFuture x;
    public final qxz y;
    public agke o = agpi.a;
    public final PriorityQueue p = new PriorityQueue(10, Comparator$CC.comparing(new qdi(16)));
    private final Map C = new HashMap();
    public int r = 0;
    public Duration t = Duration.ZERO;
    public Duration u = Duration.ZERO;
    private Duration E = Duration.ZERO;
    public boolean w = true;

    public qxm(qxk qxkVar) {
        Context context = qxkVar.a;
        this.a = context;
        Looper looper = qxkVar.c;
        this.A = looper;
        qyt qytVar = qxkVar.k;
        qua quaVar = qytVar.a;
        this.i = quaVar;
        this.j = qytVar.h;
        Optional optional = qxkVar.l;
        this.l = optional;
        this.m = qxkVar.m;
        this.n = qxkVar.p;
        Optional optionalOf = (qytVar.j && optional.isEmpty()) ? Optional.of(new qxr(context, quaVar.j)) : Optional.empty();
        this.k = optionalOf;
        if (true == optionalOf.isPresent()) {
            ((qxr) optionalOf.get()).a();
        }
        this.c = qxkVar.b.d(looper, null);
        qcb qcbVar = new qcb(this, null);
        this.F = qcbVar;
        bug bugVar = qxkVar.d;
        this.q = bugVar;
        qxp qxpVar = new qxp(qxkVar.b, qxkVar.e, qcbVar, bugVar, quaVar);
        this.d = qxpVar;
        new Handler(qxpVar.a);
        this.e = qxkVar.g;
        this.B = qxkVar.h;
        this.f = Duration.ofSeconds(1L).dividedBy(bugVar.b);
        this.g = qxkVar.i;
        this.h = qxkVar.j;
        this.b = qxkVar.n;
        this.y = qxkVar.o;
        quc qucVar = qxkVar.f;
        if (qucVar != null) {
            this.s++;
            qxpVar.b(qucVar);
            i(qxkVar.f, Duration.ZERO);
        }
    }

    private static String j(qxl qxlVar) {
        return "Segment[id=" + String.valueOf(qxlVar.d()) + ", start=" + String.valueOf(qxlVar.c()) + ", duration=" + String.valueOf(qxlVar.a());
    }

    private static final void k(qxl qxlVar) {
        try {
            qyh qyhVar = qxlVar.a;
            if (qyhVar != null) {
                qyhVar.close();
                qxlVar.a = null;
            }
            qxlVar.g = null;
            qxlVar.e = false;
        } catch (RuntimeException e) {
            rbc rbcVar = new rbc(z, rbd.c);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Exception while closing audio source.", new Object[0]);
        }
    }

    public final ListenableFuture a(Duration duration) {
        g();
        boolean z2 = true;
        if (!this.w && h()) {
            z2 = false;
        }
        ahno.O(z2);
        f(duration);
        SettableFuture settableFuture = this.x;
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.x = settableFutureCreate;
        if (settableFuture != null) {
            settableFuture.cancel(false);
        }
        return settableFutureCreate;
    }

    public final void b() {
        int i = this.r;
        agke agkeVar = this.o;
        if (i < ((agpi) agkeVar).d) {
            qxl qxlVar = (qxl) agkeVar.get(i);
            qxlVar.f(qxlVar.c());
        }
    }

    public final void c() {
        Duration durationMinusMillis = this.u.minusMillis(this.B);
        while (true) {
            PriorityQueue priorityQueue = this.p;
            qxl qxlVar = (qxl) priorityQueue.peek();
            if (qxlVar == null || !qxlVar.d || qxlVar.b().compareTo(durationMinusMillis) > 0) {
                return;
            }
            new rbc(z, rbd.a).a("Closing %s", j(qxlVar));
            k((qxl) priorityQueue.remove());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        g();
        g();
        if (h()) {
            new rbc(z, rbd.a).a("Stopping", new Object[0]);
            this.D = null;
            this.r = 0;
            while (true) {
                PriorityQueue priorityQueue = this.p;
                if (priorityQueue.isEmpty()) {
                    break;
                } else {
                    k((qxl) priorityQueue.remove());
                }
            }
            Optional optional = this.k;
            if (true == optional.isPresent()) {
                qxr qxrVar = (qxr) optional.get();
                Map map = qxrVar.c;
                Iterable$EL.forEach(map.values(), new hgi(8));
                map.clear();
                bxp bxpVar = qxrVar.d;
                if (bxpVar != null) {
                    bxpVar.close();
                }
                qxrVar.b();
            }
            this.s++;
            this.d.a();
        }
        this.d.close();
        this.c.f();
    }

    public final void d() {
        g();
        if (h()) {
            Iterable$EL.forEach(this.p, new hgi(6));
        } else {
            ahno.O(this.y != null);
            f(Duration.ZERO);
        }
        this.s++;
        qxp qxpVar = this.d;
        ahno.O(qxpVar.d);
        qxpVar.b.j(4).p();
        this.w = false;
    }

    public final void e(qxl qxlVar) {
        rbm rbmVar = z;
        new rbc(rbmVar, rbd.a).a("Starting %s", j(qxlVar));
        Duration duration = this.D;
        duration.getClass();
        Comparable comparableE = afyd.e(duration, qxlVar.c());
        qyh qyhVar = qxlVar.a;
        qyhVar.getClass();
        if (qxlVar.g == null) {
            qxlVar.f((Duration) comparableE);
            rbc rbcVar = new rbc(rbmVar, rbd.c);
            rbcVar.c();
            rbcVar.a("Output should have been initialized in a previous progress update.", new Object[0]);
        }
        qxlVar.e = false;
        qxn qxnVar = qxlVar.g;
        qxnVar.getClass();
        qyhVar.aJ((Duration) comparableE, qxnVar);
        qxlVar.d = false;
    }

    public final void f(Duration duration) {
        PriorityQueue priorityQueue;
        g();
        if (h()) {
            Iterable$EL.forEach(this.p, new hgi(7));
            this.s++;
            this.d.a();
        }
        Duration durationPlusMillis = duration.plus(this.f).plusNanos(1000L).plusMillis(this.e);
        while (true) {
            priorityQueue = this.p;
            if (priorityQueue.isEmpty()) {
                break;
            }
            qxl qxlVar = (qxl) priorityQueue.remove();
            Duration durationPlus = qxlVar.c().plus(qxlVar.a());
            if (!this.C.containsKey(qxlVar.d()) || qxlVar.c().compareTo(durationPlusMillis) > 0 || durationPlus.compareTo(duration) <= 0) {
                k(qxlVar);
            }
        }
        this.r = 0;
        while (true) {
            int i = this.r;
            agke agkeVar = this.o;
            if (i >= ((agpi) agkeVar).d) {
                break;
            }
            qxl qxlVar2 = (qxl) agkeVar.get(i);
            if (qxlVar2.c().compareTo(durationPlusMillis) > 0) {
                break;
            }
            if (qxlVar2.c().plus(qxlVar2.a()).compareTo(duration) > 0) {
                if (qxlVar2.a == null) {
                    qxlVar2.e();
                }
                qyh qyhVar = qxlVar2.a;
                if (qyhVar == null) {
                    continue;
                } else {
                    int i2 = qyhVar.k;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 != 2) {
                        qxlVar2.f((Duration) afyd.e(duration, qxlVar2.c()));
                        priorityQueue.add(qxlVar2);
                    }
                }
            }
            this.r++;
        }
        new rbc(z, rbd.a).a("Starting render from %s", duration);
        this.D = duration;
        this.t = duration;
        this.u = duration;
        this.v = false;
        b();
        this.s++;
        qxp qxpVar = this.d;
        long jA = ahbt.a(duration);
        qxz qxzVar = this.y;
        qxzVar.getClass();
        ahno.O(!qxpVar.d);
        qxpVar.b.k(2, new axmq(jA, qxzVar, null)).p();
        qxpVar.d = true;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            e((qxl) it.next());
        }
    }

    public final void g() {
        if (Thread.currentThread() != this.A.getThread()) {
            throw new IllegalStateException("Audio renderer is accessed on the wrong thread.");
        }
    }

    public final boolean h() {
        g();
        return this.D != null;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01b5  */
    public final boolean i(quc qucVar, Duration duration) {
        qxq qxqVar;
        boolean z2;
        boolean z3;
        boolean zB;
        boolean z4;
        agkz<qxj> agkzVarD = qucVar.d();
        HashMap map = new HashMap();
        for (qxj qxjVar : agkzVarD) {
            if (qxjVar instanceof qxh) {
                qxh qxhVar = (qxh) qxjVar;
                qvu qvuVar = qxhVar.e;
                if (qvuVar != null) {
                    UUID uuid = qvuVar.m;
                    if (!map.containsKey(uuid)) {
                        map.put(uuid, new sry((byte[]) null));
                    }
                    ((sry) map.get(uuid)).b = qxhVar;
                }
                qvu qvuVar2 = qxhVar.f;
                if (qvuVar2 != null) {
                    UUID uuid2 = qvuVar2.m;
                    if (!map.containsKey(uuid2)) {
                        map.put(uuid2, new sry((byte[]) null));
                    }
                    ((sry) map.get(uuid2)).a = qxhVar;
                }
            }
        }
        agkj agkjVarH = agkj.h(map);
        int i = 14;
        agkj agkjVar = (agkj) Collection.EL.stream(qucVar.c()).filter(new jor(8)).filter(new jor(7)).map(new qdi(13)).collect(aext.h(new qdi(i)));
        Map map2 = this.C;
        agqr it = agkz.n(map2.keySet()).iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            UUID uuid3 = (UUID) it.next();
            qvq qvqVar = (qvq) agkjVar.get(uuid3);
            if (qvqVar == null) {
                map2.remove(uuid3);
                Optional optional = this.k;
                jfn jfnVar = new jfn(uuid3, i);
                if (true == optional.isPresent()) {
                    Object obj = optional.get();
                    Object obj2 = jfnVar.a;
                    Map map3 = ((qxr) obj).c;
                    if (map3.containsKey(obj2) && (qxqVar = (qxq) map3.remove(obj2)) != null) {
                        qxqVar.a();
                    }
                }
                z5 = true;
            } else {
                qxl qxlVar = (qxl) map2.get(uuid3);
                qxlVar.getClass();
                sry sryVar = (sry) agkjVarH.get(uuid3);
                agkz agkzVarN = agkz.n(qvqVar.is());
                qyh qyhVar = qxlVar.a;
                if (qyhVar == null) {
                    zB = rjm.a.b(qxlVar.b, qvqVar).b(rjf.b);
                    z3 = true;
                } else {
                    rjg rjgVarB = rjm.a.b(qyhVar.f, qvqVar);
                    qyhVar.f = qvqVar;
                    if (rjgVarB.b(rjf.f)) {
                        qyhVar.c.post(new qca(qyhVar, 18));
                    }
                    if (rjgVarB.b(rjf.c) || rjgVarB.b(rjf.d) || rjgVarB.b(rjf.e)) {
                        qyhVar.aE();
                        qyhVar.b.e(qyh.aK(qyhVar.f));
                        qyhVar.k = 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rjgVarB.b(rjf.b)) {
                        qyhVar.aE();
                        z2 = true;
                    }
                    if (rjgVarB.b(rjf.g)) {
                        z3 = true;
                        qyhVar.b.C(true != qvqVar.e ? 0 : 2);
                    } else {
                        z3 = true;
                    }
                    zB = (z2 || qyhVar.aL(sryVar, agkzVarN)) ? z3 : false;
                }
                qxlVar.b = qvqVar;
                qxlVar.h = sryVar;
                qxlVar.c = agkzVarN;
                if (qxlVar.d) {
                    int iCompareTo = duration.compareTo(qxlVar.b.p);
                    qvq qvqVar2 = qxlVar.b;
                    int iCompareTo2 = duration.compareTo(qvqVar2.p.plus(qvqVar2.q));
                    if (iCompareTo < 0 || iCompareTo2 >= 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                } else {
                    z4 = false;
                }
                if (zB | z4) {
                    z5 = z3;
                }
                i = 14;
            }
        }
        agqr it2 = agkjVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!map2.containsKey(entry.getKey())) {
                UUID uuid4 = (UUID) entry.getKey();
                map2.put(uuid4, new qxl(this, (qvq) entry.getValue(), (sry) agkjVarH.get(uuid4), agkz.n(((qvq) entry.getValue()).is())));
                z5 = true;
            }
        }
        this.o = agke.B(Comparator$CC.comparing(new qdi(15)), map2.values());
        if (this.E.equals(qucVar.iu())) {
            return z5;
        }
        this.E = qucVar.iu();
        return true;
    }
}
