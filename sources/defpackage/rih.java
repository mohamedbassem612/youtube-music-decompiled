package defpackage;

import j$.time.Duration;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rih implements rii {
    public rig b;
    public long c;
    public long d;
    public long f;
    private final rdd g;
    private final long h;
    private final int l;
    public final Object a = new Object();
    private final List i = new ArrayList();
    private final HashSet j = new HashSet();
    public long e = 1;
    private long k = 0;

    public rih(rdd rddVar, Duration duration, int i) {
        this.g = rddVar;
        this.l = i;
        this.h = nra.l(((long) rddVar.c) * 1000000, 30L);
        this.f = nra.l((ahbt.a(duration) - 1) * 30, 1000000L);
    }

    private static final long j(long j) {
        return Math.round((j * 1000000) / 30.0d);
    }

    public final Duration a() {
        Duration durationB;
        synchronized (this.a) {
            durationB = ahbt.b(j(this.c) + this.k);
        }
        return durationB;
    }

    public final Duration b(Duration duration) {
        Duration durationA;
        synchronized (this.a) {
            this.d = -1L;
            long jMin = Math.min(nra.l(ahbt.a(duration) * 30, 1000000L), this.f);
            this.c = jMin;
            this.k = jMin < this.f ? ahbt.a(duration.minus(a())) : 0L;
            durationA = a();
        }
        return durationA;
    }

    public final Duration c(Duration duration) {
        Duration durationA;
        synchronized (this.a) {
            this.d = -1L;
            this.c = Math.min(nra.l(ahbt.a(duration) * 30, 1000000L), this.f);
            durationA = a();
        }
        return durationA;
    }

    public final void d(long j) {
        synchronized (this.a) {
            if (this.l == 2) {
                long jMin = Math.min(nra.l(j * 30, 1000000L), this.f);
                long j2 = this.d;
                if (j2 != -1 && jMin > j2 && jMin < this.c) {
                    this.j.add(Long.valueOf(jMin));
                }
            }
        }
    }

    public final void e(long j) {
        synchronized (this.a) {
            rdd rddVar = this.g;
            if (rddVar.a) {
                List list = this.i;
                list.add(Long.valueOf(Math.min(this.h, j)));
                long size = list.size();
                long j2 = rddVar.b;
                if (size == j2) {
                    long j3 = j2 * 1000000;
                    long jL = nra.l(((Collection.EL.stream(list).mapToLong(new cpt(9)).sum() * 30) + j3) - 1, j3);
                    if (Math.abs(jL - this.e) >= rddVar.d) {
                        this.e = jL;
                    }
                    list.remove(0);
                }
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            if (this.b != null) {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    rig rigVar = this.b;
                    rigVar.getClass();
                    ahbt.b(j(jLongValue));
                    rigVar.m();
                }
            }
            HashSet hashSet = this.j;
            hashSet.clear();
            long j = this.c;
            this.d = j;
            this.c = j + this.e;
            this.k = 0L;
            int i = 1;
            if (this.l == 1) {
                while (true) {
                    long j2 = i;
                    if (j2 >= this.e) {
                        break;
                    }
                    hashSet.add(Long.valueOf(this.d + j2));
                    i++;
                }
            }
        }
    }

    public final void g(Duration duration) {
        synchronized (this.a) {
            this.f = nra.l((ahbt.a(duration) - 1) * 30, 1000000L);
        }
    }

    public final boolean h() {
        return this.g.a;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.c > this.f;
        }
        return z;
    }
}
