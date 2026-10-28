package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdk {
    public static final cnm a = new cnm(new Object(), -1, -1, -1, -1);
    public final btn b;
    public final cnm c;
    public final long d;
    public final long e;
    public final int f;
    public final cbo g;
    public final boolean h;
    public final coy i;
    public final List j;
    public final cnm k;
    public final boolean l;
    public final int m;
    public final int n;
    public final btb o;
    public final boolean p;
    public final boolean q;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    public volatile long u;
    public volatile long v = 0;
    public final pob w;

    public cdk(btn btnVar, cnm cnmVar, long j, long j2, int i, cbo cboVar, boolean z, coy coyVar, pob pobVar, List list, cnm cnmVar2, boolean z2, int i2, int i3, btb btbVar, long j3, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.b = btnVar;
        this.c = cnmVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = cboVar;
        this.h = z;
        this.i = coyVar;
        this.w = pobVar;
        this.j = list;
        this.k = cnmVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = btbVar;
        this.r = j3;
        this.s = j4;
        this.t = j5;
        this.u = j6;
        this.p = z3;
        this.q = z4;
    }

    public static cdk n(pob pobVar) {
        btn btnVar = btn.a;
        cnm cnmVar = a;
        return new cdk(btnVar, cnmVar, -9223372036854775807L, 0L, 1, null, false, coy.a, pobVar, agpi.a, cnmVar, false, 1, 0, btb.a, 0L, 0L, 0L, 0L, false, false);
    }

    public final long a(long j) {
        if (!l()) {
            return this.t;
        }
        while (true) {
            long j2 = this.v;
            long j3 = this.t;
            long j4 = this.u;
            if (j2 % 2 == 0 && j2 == this.v) {
                return bwp.y(bwp.F(j3) + ((long) (Math.min(j - j4, 1500L) * this.o.b)));
            }
        }
    }

    public final cdk b(long j) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.k, this.l, this.m, this.n, this.o, this.r, this.s, a(j), j, this.p, this.q);
    }

    public final cdk c(boolean z) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, this.g, z, this.i, this.w, this.j, this.k, this.l, this.m, this.n, this.o, this.r, this.s, this.t, this.u, this.p, this.q);
    }

    public final cdk d(cnm cnmVar) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, cnmVar, this.l, this.m, this.n, this.o, this.r, this.s, this.t, this.u, this.p, this.q);
    }

    public final cdk e(boolean z, int i, int i2) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.k, z, i, i2, this.o, this.r, this.s, this.t, this.u, this.p, this.q);
    }

    public final cdk f(cbo cboVar) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, cboVar, this.h, this.i, this.w, this.j, this.k, this.l, this.m, this.n, this.o, this.r, this.s, this.t, this.u, this.p, this.q);
    }

    public final cdk g(btb btbVar) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.k, this.l, this.m, this.n, btbVar, this.r, this.s, this.t, this.u, this.p, this.q);
    }

    public final cdk h(int i) {
        return new cdk(this.b, this.c, this.d, this.e, i, this.g, this.h, this.i, this.w, this.j, this.k, this.l, this.m, this.n, this.o, this.r, this.s, this.t, this.u, this.p, this.q);
    }

    public final cdk i(boolean z) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.k, this.l, this.m, this.n, this.o, this.r, this.s, this.t, this.u, z, this.q);
    }

    public final cdk j(btn btnVar) {
        return new cdk(btnVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.k, this.l, this.m, this.n, this.o, this.r, this.s, this.t, this.u, this.p, this.q);
    }

    public final cdk k(boolean z) {
        return new cdk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.w, this.j, this.k, this.l, this.m, this.n, this.o, this.r, this.s, this.t, this.u, this.p, z);
    }

    public final boolean l() {
        return this.f == 3 && this.l && this.n == 0;
    }

    public final cdk m(cnm cnmVar, long j, long j2, long j3, long j4, long j5, coy coyVar, pob pobVar, List list) {
        boolean z = this.p;
        boolean z2 = this.q;
        cnm cnmVar2 = this.k;
        boolean z3 = this.l;
        int i = this.m;
        int i2 = this.n;
        btb btbVar = this.o;
        long j6 = this.r;
        return new cdk(this.b, cnmVar, j2, j3, this.f, this.g, this.h, coyVar, pobVar, list, cnmVar2, z3, i, i2, btbVar, j6, j4, j, j5, z, z2);
    }
}
