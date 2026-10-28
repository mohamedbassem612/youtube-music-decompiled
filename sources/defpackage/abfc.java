package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfc implements yxe {
    public final abmt a;
    public final AtomicLong g;
    public volatile acip i;
    public final AtomicReference k;
    public final AtomicReference l;
    final AtomicReference m;
    final AtomicReference n;
    public final abfe o;
    public volatile acga p;
    private final avlh q;
    private final Executor s;
    private final ytv t;
    private final Context u;
    private final adws v;
    private final dxu w;
    private final avmm r = new avmm();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicReference h = new AtomicReference(abnr.DEFAULT);
    public final ConcurrentHashMap j = new ConcurrentHashMap();

    public abfc(Context context, Executor executor, avlh avlhVar, adws adwsVar, dxu dxuVar, ytv ytvVar, abmt abmtVar) {
        this.u = context;
        this.s = executor;
        this.q = avlhVar;
        this.v = adwsVar;
        this.t = ytvVar;
        this.a = abmtVar;
        this.w = dxuVar;
        abfk abfkVar = abfk.a;
        this.k = new AtomicReference(abfkVar);
        this.l = new AtomicReference(abfkVar);
        abfd abfdVar = abfd.a;
        this.m = new AtomicReference(abfdVar);
        this.n = new AtomicReference(abfdVar);
        this.o = new abfe(1, 1, abfdVar, null, null);
        this.g = new AtomicLong(-1L);
    }

    public static long d(long j, long j2) {
        if (j2 != 0) {
            return (long) ((j * 1000.0d) / j2);
        }
        return 0L;
    }

    public static abfk e(abfk abfkVar, int i) {
        abfk abfkVar2 = abfk.a;
        int iOrdinal = abfkVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return i == 480 ? abfk.c : abfk.b;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return i == 480 ? abfk.e : abfk.d;
        }
        return abfk.a;
    }

    private static boolean h(int i) {
        return i == 360 || i == 480 || i == 720 || i == 1080 || i == 1440 || i == 2160;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Type inference failed for: r0v5, types: [ablg, java.lang.Object] */
    @Override // defpackage.yxe
    public final yxd a(long j) {
        abfk abfkVarE;
        abfm abfmVar;
        abfe abfeVar;
        abfd abfdVar;
        int i;
        int i2;
        yxd yxdVar;
        boolean zAp = this.a.ap();
        AtomicInteger atomicInteger = this.c;
        if (!zAp) {
            if (h(atomicInteger.get())) {
                boolean zE = this.w.e.e(j);
                AtomicBoolean atomicBoolean = this.d;
                if (!zE) {
                    atomicBoolean.set(false);
                    abfkVarE = abfk.a;
                } else if (!atomicBoolean.get() || ((abfkVarE = (abfk) this.l.get()) != abfk.d && abfkVarE != abfk.e)) {
                    abnr abnrVar = (abnr) this.h.get();
                    abfk abfkVar = abfk.a;
                    int iOrdinal = abnrVar.ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 6) {
                                if (atomicBoolean.getAndSet(true)) {
                                    abfkVarE = (abfk) this.l.get();
                                } else {
                                    abfkVarE = e(abfk.d, atomicInteger.get());
                                    this.l.set(abfkVarE);
                                }
                            }
                        } else if (this.u.getResources().getConfiguration().orientation == 2) {
                            if (!atomicBoolean.getAndSet(true)) {
                                this.l.set(abfk.a);
                            }
                            abfkVarE = abfk.a;
                        }
                        abfkVarE = e(abfk.b, atomicInteger.get());
                        if (!atomicBoolean.getAndSet(true)) {
                            this.l.set(abfkVarE);
                        }
                    } else if (atomicBoolean.getAndSet(true)) {
                        abfkVarE = e(abfk.d, atomicInteger.get());
                        this.l.set(abfkVarE);
                    } else {
                        abfkVarE = (abfk) this.l.get();
                    }
                }
            } else {
                this.d.set(false);
                abfkVarE = abfk.a;
            }
            AtomicReference atomicReference = this.k;
            if (abfkVarE != ((abfk) atomicReference.get()) || this.f.get()) {
                this.f.set(false);
                atomicReference.set(abfkVarE);
                this.s.execute(afwl.i(new yuj(this, (int) (this.b.get() * abfkVarE.k), (int) (atomicInteger.get() * abfkVarE.l), 4)));
            }
            return abfkVarE.j;
        }
        if (h(atomicInteger.get())) {
            Iterator it = this.j.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    abfmVar = null;
                    break;
                }
                abfmVar = (abfm) it.next();
                if (j >= TimeUnit.MILLISECONDS.toMicros(abfmVar.l()) && j <= TimeUnit.MILLISECONDS.toMicros(abfmVar.k())) {
                    break;
                }
            }
            AtomicBoolean atomicBoolean2 = this.e;
            if (abfmVar == null) {
                atomicBoolean2.set(false);
                abfeVar = this.o;
            } else {
                abfe abfeVar2 = abfmVar.a;
                if (atomicBoolean2.get() && this.n.get() == abfd.c) {
                    abfeVar = abfeVar2;
                } else {
                    abnr abnrVar2 = (abnr) this.h.get();
                    abfk abfkVar2 = abfk.a;
                    int iOrdinal2 = abnrVar2.ordinal();
                    if (iOrdinal2 == 1) {
                        if (!atomicBoolean2.getAndSet(true)) {
                            AtomicReference atomicReference2 = this.n;
                            abfd abfdVar2 = abfd.c;
                            atomicReference2.set(abfdVar2);
                            abfeVar2.d(abfdVar2);
                        }
                        abfeVar = abfeVar2;
                    } else {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 == 6) {
                                if (!atomicBoolean2.getAndSet(true)) {
                                    AtomicReference atomicReference3 = this.n;
                                    abfd abfdVar3 = abfd.c;
                                    atomicReference3.set(abfdVar3);
                                    abfeVar2.d(abfdVar3);
                                }
                            }
                            abfeVar = abfeVar2;
                        } else if (this.u.getResources().getConfiguration().orientation == 2) {
                            if (!atomicBoolean2.getAndSet(true)) {
                                this.n.set(abfd.a);
                            }
                            abfeVar2.d(abfd.a);
                            abfeVar = this.o;
                        }
                        if (!atomicBoolean2.getAndSet(true)) {
                            this.n.set(abfd.b);
                        }
                        abfeVar2.d(abfd.b);
                        abfeVar = abfeVar2;
                    }
                }
            }
        } else {
            this.e.set(false);
            abfeVar = this.o;
        }
        synchronized (abfeVar) {
            abfdVar = abfeVar.f;
            abfeVar.a();
            i = abfeVar.g;
            abfeVar.a();
            i2 = abfeVar.h;
            abfeVar.a();
            yxdVar = abfeVar.i;
        }
        AtomicReference atomicReference4 = this.m;
        if (abfdVar != atomicReference4.get() || this.f.get()) {
            this.f.set(false);
            atomicReference4.set(abfdVar);
            this.s.execute(afwl.i(new yuj(this, i, i2, 3)));
        }
        if (abfdVar != abfd.b && abfdVar != abfd.c) {
            return yxdVar;
        }
        AtomicLong atomicLong = this.g;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        atomicLong.set(j / 1000);
        return yxdVar;
    }

    @Override // defpackage.yxe
    public final void b() {
        this.r.b();
        this.b.set(0);
        this.c.set(0);
        this.d.set(false);
        this.f.set(false);
        this.h.set(abnr.DEFAULT);
        AtomicReference atomicReference = this.k;
        abfk abfkVar = abfk.a;
        atomicReference.set(abfkVar);
        this.l.set(abfkVar);
        this.i = null;
        if (this.a.ap()) {
            f();
            this.p = null;
            this.e.set(false);
            AtomicReference atomicReference2 = this.m;
            abfd abfdVar = abfd.a;
            atomicReference2.set(abfdVar);
            this.n.set(abfdVar);
        }
    }

    @Override // defpackage.yxe
    public final void c() {
        abwr abwrVar = new abwr(1);
        avlh avlhVar = this.q;
        avmn avmnVarAk = avlhVar.i(abwrVar).ak(new abae(this, 11));
        avmm avmmVar = this.r;
        avmmVar.c(avmnVarAk);
        avmmVar.c(this.v.b().i(new abwr(1)).ak(new abae(this, 13)));
        avmmVar.c(aawb.w(avlhVar, new aakt(20)).i(new abwr(1)).ak(new abae(this, 14)));
        avmmVar.c(aawb.w(avlhVar, new abfb(1)).i(new abwr(1)).ak(new abae(this, 14)));
        if (this.a.ap()) {
            avmmVar.c(aawb.w(avlhVar, new abfb(0)).i(new abwr(1)).ak(new abae(this, 15)));
            avmmVar.c(aawb.w(avlhVar, new aakt(18)).i(new abwr(1)).ak(new abae(this, 10)));
            avmmVar.c(aawb.w(avlhVar, new aakt(19)).i(new abwr(1)).ak(new abae(this, 12)));
        }
    }

    public final void f() {
        if (this.p != null) {
            this.p.o(Collection.EL.stream(this.j.values()).toList());
        }
        this.j.clear();
        this.g.set(-1L);
    }

    public final void g(int i, int i2) {
        this.t.x(i, i2);
        if (this.i != null) {
            this.i.aC().kk(new aaxb(i, i2));
        }
    }
}
