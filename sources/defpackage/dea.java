package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dea implements ddr {
    private final dep a;
    private String b;
    private cwj c;
    private ddz d;
    private boolean e;
    private boolean f;
    private bse g;
    private long o;
    private final boolean[] i = new boolean[3];
    private final deg j = new deg(32);
    private final deg k = new deg(33);
    private final deg l = new deg(34);
    private final deg m = new deg(39);
    private final deg n = new deg(40);
    private long p = -9223372036854775807L;
    private int h = -1;
    private final bwb q = new bwb();

    public dea(dep depVar) {
        this.a = depVar;
    }

    private final void g() {
        this.c.getClass();
        int i = bwp.a;
    }

    private final void h(long j, int i, int i2, long j2) {
        int i3;
        ddz ddzVar = this.d;
        boolean z = this.e;
        if (ddzVar.i && ddzVar.f) {
            ddzVar.l = ddzVar.b;
            ddzVar.i = false;
        } else if (ddzVar.g || ddzVar.f) {
            if (z && ddzVar.h) {
                ddzVar.a(i + ((int) (j - ddzVar.a)));
            }
            ddzVar.j = ddzVar.a;
            ddzVar.k = ddzVar.d;
            ddzVar.l = ddzVar.b;
            ddzVar.h = true;
        }
        if (this.g == null) {
            deg degVar = this.j;
            degVar.d(i2);
            deg degVar2 = this.k;
            degVar2.d(i2);
            deg degVar3 = this.l;
            degVar3.d(i2);
            if (degVar.a && degVar2.a && degVar3.a) {
                String str = this.b;
                int i4 = this.h;
                int i5 = degVar.c;
                byte[] bArr = new byte[degVar2.c + i5 + degVar3.c];
                System.arraycopy(degVar.b, 0, bArr, 0, i5);
                System.arraycopy(degVar2.b, 0, bArr, degVar.c, degVar2.c);
                System.arraycopy(degVar3.b, 0, bArr, degVar.c + degVar2.c, degVar3.c);
                bxd bxdVarK = bxf.k(degVar2.b, 3, degVar2.c, null);
                bxb bxbVar = bxdVarK.b;
                String strG = bxbVar != null ? bvf.g(bxbVar.a, bxbVar.b, bxbVar.c, bxbVar.d, bxbVar.e, bxbVar.f) : null;
                bsd bsdVar = new bsd();
                bsdVar.a = str;
                bsdVar.a("video/mp2t");
                bsdVar.e("video/hevc");
                bsdVar.k = strG;
                bsdVar.u = bxdVarK.e;
                bsdVar.v = bxdVarK.f;
                bsdVar.w = bxdVarK.g;
                bsdVar.x = bxdVarK.h;
                bsdVar.E = new bru(bxdVarK.k, bxdVarK.l, bxdVarK.m, null, bxdVarK.c + 8, bxdVarK.d + 8);
                bsdVar.B = bxdVarK.i;
                bsdVar.q = bxdVarK.j;
                bsdVar.F = bxdVarK.a + 1;
                bsdVar.r = Collections.singletonList(bArr);
                bsdVar.D = i4;
                bse bseVar = new bse(bsdVar);
                this.g = bseVar;
                this.f = true;
                ahno.O(bseVar.s != -1);
                this.a.e(this.g.s);
            }
        }
        deg degVar4 = this.m;
        if (degVar4.d(i2)) {
            int iE = bxf.e(degVar4.b, degVar4.c);
            int iD = bxf.d(degVar4.b, 5, iE);
            if (iD != -1 && iD != (i3 = this.h) && (iD != 0 || i3 != -1)) {
                this.h = iD;
                bse bseVar2 = this.g;
                if (bseVar2 != null) {
                    bsd bsdVar2 = new bsd(bseVar2);
                    bsdVar2.D = iD;
                    this.g = new bse(bsdVar2);
                    this.f = true;
                }
            }
            bwb bwbVar = this.q;
            bwbVar.N(degVar4.b, iE);
            bwbVar.Q(5);
            this.a.b(j2, bwbVar);
        }
        deg degVar5 = this.n;
        if (degVar5.d(i2)) {
            int iE2 = bxf.e(degVar5.b, degVar5.c);
            bwb bwbVar2 = this.q;
            bwbVar2.N(degVar5.b, iE2);
            bwbVar2.Q(5);
            this.a.b(j2, bwbVar2);
        }
    }

    private final void i(byte[] bArr, int i, int i2) {
        ddz ddzVar = this.d;
        if (ddzVar.e) {
            int i3 = ddzVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                ddzVar.f = (bArr[i4] & 128) != 0;
                ddzVar.e = false;
            } else {
                ddzVar.c = i3 + (i2 - i);
            }
        }
        if (this.g == null) {
            this.j.a(bArr, i, i2);
            this.k.a(bArr, i, i2);
            this.l.a(bArr, i, i2);
        }
        this.m.a(bArr, i, i2);
        this.n.a(bArr, i, i2);
    }

    private final void j(long j, int i, int i2, long j2) {
        ddz ddzVar = this.d;
        boolean z = this.e;
        ddzVar.f = false;
        ddzVar.g = false;
        ddzVar.d = j2;
        ddzVar.c = 0;
        ddzVar.a = j;
        if (i2 >= 32 && i2 != 40) {
            if (ddzVar.h && !ddzVar.i) {
                if (z) {
                    ddzVar.a(i);
                }
                ddzVar.h = false;
            }
            if (i2 <= 35 || i2 == 39) {
                ddzVar.g = !ddzVar.i;
                ddzVar.i = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        ddzVar.b = z2;
        ddzVar.e = z2 || i2 <= 9;
        if (this.f && i2 < 32) {
            cwj cwjVar = this.c;
            bse bseVar = this.g;
            bseVar.getClass();
            cwjVar.b(bseVar);
            this.e = true;
            this.f = false;
        }
        if (this.g == null) {
            this.j.c(i2);
            this.k.c(i2);
            this.l.c(i2);
        }
        this.m.c(i2);
        this.n.c(i2);
    }

    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        g();
        while (bwbVar.d() > 0) {
            int i = bwbVar.c;
            int i2 = bwbVar.d;
            byte[] bArr = bwbVar.b;
            this.o += (long) bwbVar.d();
            this.c.c(bwbVar, bwbVar.d());
            while (i < i2) {
                int iB = bxf.b(bArr, i, i2, this.i);
                if (iB == i2) {
                    i(bArr, i, i2);
                    return;
                }
                int i3 = bArr[iB + 3] & 126;
                int i4 = 3;
                if (iB > 0) {
                    int i5 = iB - 1;
                    if (bArr[i5] == 0) {
                        i4 = 4;
                        iB = i5;
                    }
                }
                int i6 = iB - i;
                if (i6 > 0) {
                    i(bArr, i, iB);
                }
                int i7 = i2 - iB;
                long j = this.o - ((long) i7);
                h(j, i7, i6 < 0 ? -i6 : 0, this.p);
                j(j, i7, i3 >> 1, this.p);
                i = iB + i4;
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.b = devVar.b();
        this.c = cvkVar.s(devVar.a(), 2);
        this.d = new ddz(this.c);
        this.a.c(cvkVar, devVar);
    }

    @Override // defpackage.ddr
    public final void c() {
        g();
        this.a.d();
        h(this.o, 0, 0, this.p);
        if (!this.e && this.f) {
            cwj cwjVar = this.c;
            bse bseVar = this.g;
            bseVar.getClass();
            cwjVar.b(bseVar);
            this.e = true;
            this.f = false;
        }
        j(this.o, 0, 48, this.p);
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.p = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        this.o = 0L;
        this.p = -9223372036854775807L;
        bxf.i(this.i);
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.a.a();
        ddz ddzVar = this.d;
        if (ddzVar != null) {
            ddzVar.e = false;
            ddzVar.f = false;
            ddzVar.g = false;
            ddzVar.h = false;
            ddzVar.i = false;
        }
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
