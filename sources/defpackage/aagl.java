package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aagl {
    public wjf a;
    public long b;
    public long c;
    public aamt d;
    final /* synthetic */ aagn e;
    private aamo f;
    private final aohx g;
    private final int h;
    private final byte[] i;
    private alvl j;
    private aogq k;
    private long l;
    private long m;
    private aamw n;
    private aamg o;
    private final aamn p;
    private long q;
    private long r;
    private Instant s;
    private aams t;

    public aagl(aagn aagnVar, aamo aamoVar, aohx aohxVar, int i, byte[] bArr, aamg aamgVar, aamn aamnVar, long j) {
        this.e = aagnVar;
        this.f = aamoVar;
        this.g = aohxVar;
        this.h = i;
        this.i = bArr;
        this.o = aamgVar;
        this.p = aamnVar;
        this.c = j;
    }

    public final long a() {
        long j;
        synchronized (this.e.k) {
            j = this.l;
        }
        return j;
    }

    public final aamg b() {
        aamg aamgVar;
        synchronized (this.e.k) {
            aamgVar = this.o;
        }
        return aamgVar;
    }

    public final aamo c() {
        aamo aamoVar;
        synchronized (this.e.k) {
            aamoVar = this.f;
        }
        return aamoVar;
    }

    public final aams d() {
        aams aamsVar;
        aagn aagnVar = this.e;
        synchronized (aagnVar.k) {
            aamsVar = this.t;
            aogq aogqVar = this.k;
            if (aamsVar == null && aogqVar != null) {
                aams aamsVar2 = new aams(this.f.d(), aogqVar, this.l, this.b, aagnVar.j);
                this.t = aamsVar2;
                aamsVar = aamsVar2;
            }
        }
        return aamsVar;
    }

    public final aamt e() throws Throwable {
        aagn aagnVar = this.e;
        synchronized (aagnVar.k) {
            try {
                try {
                    aamt aamtVar = this.d;
                    if (aamtVar == null) {
                        aagk aagkVarM = aagnVar.m(this.f.d());
                        aamo aamoVar = this.f;
                        aamt aamtVar2 = new aamt(aamoVar, this.g, this.h, this.i, aagnVar.k(aamoVar.d()), this.l, this.q, this.r, this.s, this.c, this.m, d(), this.j, this.o, this.p, aagkVarM == null ? null : aagkVarM.d(), this.n, this.a);
                        this.d = aamtVar2;
                        aamtVar = aamtVar2;
                    }
                    return aamtVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void f() {
        synchronized (this.e.k) {
            this.a = null;
            this.j = null;
            this.k = null;
            this.t = null;
        }
    }

    public final void g() {
        synchronized (this.e.k) {
            this.d = null;
        }
    }

    public final void h(long j) {
        synchronized (this.e.k) {
            this.r = j;
            this.d = null;
        }
    }

    public final void i(Instant instant) {
        synchronized (this.e.k) {
            this.s = instant;
            this.d = null;
        }
    }

    public final void j(long j) {
        synchronized (this.e.k) {
            this.q = j;
            this.d = null;
        }
    }

    public final void k(aamg aamgVar) {
        synchronized (this.e.k) {
            this.o = aamgVar;
            this.d = null;
        }
    }

    public final void l(wjf wjfVar, long j, long j2) {
        synchronized (this.e.k) {
            f();
            this.a = wjfVar;
            this.j = wjfVar.t();
            this.k = wjfVar.v();
            this.l = j;
            this.b = j2;
            this.d = null;
        }
    }

    public final void m(aamw aamwVar) {
        synchronized (this.e.k) {
            this.n = aamwVar;
            this.d = null;
        }
    }

    public final void n(aamo aamoVar) {
        synchronized (this.e.k) {
            this.f = aamoVar;
            this.d = null;
        }
    }

    public final void o(long j) {
        synchronized (this.e.k) {
            this.m = j;
            this.d = null;
        }
    }
}
