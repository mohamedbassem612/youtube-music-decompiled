package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cst implements cuc {
    public final Queue a;
    public Surface b;
    public cua c;
    public Executor d;
    public ctm e;
    private final ctp f;
    private final ctq g;
    private final ctv h;
    private final csw i;
    private bse j;
    private long k;

    public cst(final ctp ctpVar, ctq ctqVar, bvd bvdVar) {
        this.f = ctpVar;
        this.g = ctqVar;
        ctpVar.b = bvdVar;
        csw cswVar = new csw(new csu() { // from class: csr
            @Override // defpackage.csu
            public final void a(float f) {
                ctpVar.l(f);
            }
        });
        this.i = cswVar;
        this.h = new ctv(new ere(this), ctpVar, ctqVar, cswVar);
        this.a = new ArrayDeque();
        this.j = new bse(new bsd());
        this.k = -9223372036854775807L;
        this.c = cua.b;
        this.d = new cte(1);
        this.e = new css();
    }

    @Override // defpackage.cuc
    public final Surface a() {
        Surface surface = this.b;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.cuc
    public final void b() {
        this.f.c();
    }

    @Override // defpackage.cuc
    public final void c() {
        this.b = null;
        this.f.j(null);
    }

    @Override // defpackage.cuc
    public final void d(boolean z) {
        if (z) {
            this.f.h();
        }
        this.g.c();
        ctv ctvVar = this.h;
        bxi bxiVar = ctvVar.l;
        bxiVar.d = 0;
        bxiVar.c = -1;
        bxiVar.a = 0;
        ctvVar.g = -9223372036854775807L;
        ctvVar.h = -9223372036854775807L;
        ctvVar.i = -9223372036854775807L;
        bwn bwnVar = ctvVar.d;
        if (bwnVar.a() > 0) {
            ctvVar.k = ((Long) ctv.a(bwnVar)).longValue();
        }
        bwn bwnVar2 = ctvVar.c;
        if (bwnVar2.a() > 0) {
            bwnVar2.e(0L, (btz) ctv.a(bwnVar2));
        }
        this.a.clear();
    }

    @Override // defpackage.cuc
    public final void e(boolean z) {
        this.f.d(z);
    }

    @Override // defpackage.cuc
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cuc
    public final void h(long j, long j2) throws cub {
        try {
            ctv ctvVar = this.h;
            while (true) {
                bxi bxiVar = ctvVar.l;
                if (bxiVar.i()) {
                    return;
                }
                if (bxiVar.a == 0) {
                    throw new NoSuchElementException();
                }
                long j3 = ((long[]) bxiVar.e)[bxiVar.d];
                Long l = (Long) ctvVar.d.d(j3);
                if (l != null && l.longValue() != ctvVar.k) {
                    ctvVar.k = l.longValue();
                    ctvVar.a.g(2);
                }
                csw cswVar = ctvVar.f;
                cswVar.c(1000 * j3);
                ctp ctpVar = ctvVar.a;
                long j4 = ctvVar.k;
                long jA = cswVar.a();
                long j5 = cswVar.a;
                ctn ctnVar = ctvVar.b;
                int iA = ctpVar.a(j3, j, j2, j4, false, false, jA, j5, false, ctnVar);
                if (iA != 5 && iA != 4) {
                    ctvVar.e.b(j3, ctnVar.a);
                }
                if (iA == 0 || iA == 1) {
                    ctvVar.h = j3;
                    long jH = bxiVar.h();
                    btz btzVar = (btz) ctvVar.c.d(jH);
                    if (btzVar != null && !btzVar.equals(btz.a) && !btzVar.equals(ctvVar.j)) {
                        ctvVar.j = btzVar;
                        ere ereVar = ctvVar.m;
                        btz btzVar2 = ctvVar.j;
                        bsd bsdVar = new bsd();
                        bsdVar.u = btzVar2.b;
                        bsdVar.v = btzVar2.c;
                        bsdVar.e("video/raw");
                        ereVar.a = new bse(bsdVar);
                        ((cst) ereVar.b).d.execute(new cqc(ereVar, 6));
                    }
                    long jNanoTime = iA == 0 ? System.nanoTime() : ctnVar.b;
                    ere ereVar2 = ctvVar.m;
                    if (ctpVar.o()) {
                        Object obj = ereVar2.b;
                        if (((cst) obj).b != null) {
                            ((cst) obj).d.execute(new cqc(ereVar2, 4));
                        }
                    }
                    Object bseVar = ereVar2.a;
                    if (bseVar == null) {
                        bseVar = new bse(new bsd());
                    }
                    Object obj2 = ereVar2.b;
                    ((cst) obj2).e.c(jH, jNanoTime, (bse) bseVar, null);
                    csz cszVar = (csz) ((cst) obj2).a.remove();
                    long j6 = cszVar.c;
                    cszVar.d.aV(cszVar.a, cszVar.b, j6, jNanoTime);
                } else if (iA == 2 || iA == 3) {
                    ctvVar.h = j3;
                    bxiVar.h();
                    ere ereVar3 = ctvVar.m;
                    Object obj3 = ereVar3.b;
                    ((cst) obj3).d.execute(new cqc(ereVar3, 5));
                    ((csz) ((cst) obj3).a.remove()).a();
                } else if (iA != 4) {
                    return;
                } else {
                    ctvVar.h = j3;
                }
            }
        } catch (cbo e) {
            throw new cub(e, this.j);
        }
    }

    @Override // defpackage.cuc
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cuc
    public final void j(int i) {
        this.f.i(i);
    }

    @Override // defpackage.cuc
    public final void k(cua cuaVar, Executor executor) {
        this.c = cuaVar;
        this.d = executor;
    }

    @Override // defpackage.cuc
    public final void l(Surface surface, bwc bwcVar) {
        this.b = surface;
        this.f.j(surface);
    }

    @Override // defpackage.cuc
    public final void m(float f) {
        this.f.k(f);
    }

    @Override // defpackage.cuc
    public final void n(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cuc
    public final void o(ctm ctmVar) {
        this.e = ctmVar;
    }

    @Override // defpackage.cuc
    public final void p() {
        ctv ctvVar = this.h;
        long j = ctvVar.g;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            ctvVar.g = Long.MIN_VALUE;
            ctvVar.h = Long.MIN_VALUE;
        }
        ctvVar.i = j;
    }

    @Override // defpackage.cuc
    public final void q() {
        this.g.c();
        this.f.e();
    }

    @Override // defpackage.cuc
    public final void r() {
        this.g.c();
        this.f.f();
    }

    @Override // defpackage.cuc
    public final boolean s() {
        ctv ctvVar = this.h;
        long j = ctvVar.i;
        return j != -9223372036854775807L && ctvVar.h == j;
    }

    @Override // defpackage.cuc
    public final boolean t() {
        return true;
    }

    @Override // defpackage.cuc
    public final boolean u(boolean z) {
        return this.f.n(z);
    }

    @Override // defpackage.cuc
    public final void v(bse bseVar, long j, int i, List list) {
        ahno.O(list.isEmpty());
        bse bseVar2 = this.j;
        int i2 = bseVar2.w;
        int i3 = bseVar.w;
        if (i3 != i2 || bseVar.x != bseVar2.x) {
            ctv ctvVar = this.h;
            int i4 = bseVar.x;
            bwn bwnVar = ctvVar.c;
            long j2 = ctvVar.g;
            bwnVar.e(j2 == -9223372036854775807L ? 0L : j2 + 1, new btz(i3, i4, 1.0f));
        }
        float f = bseVar.A;
        if (f != this.j.A) {
            this.i.b(f);
        }
        this.j = bseVar;
        if (j != this.k) {
            ctv ctvVar2 = this.h;
            if (ctvVar2.l.i()) {
                ctvVar2.a.g(i);
                ctvVar2.k = j;
            } else {
                bwn bwnVar2 = ctvVar2.d;
                long j3 = ctvVar2.g;
                bwnVar2.e(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.k = j;
        }
    }

    @Override // defpackage.cuc
    public final boolean w(long j, csz cszVar) {
        this.a.add(cszVar);
        ctv ctvVar = this.h;
        bxi bxiVar = ctvVar.l;
        int i = bxiVar.a;
        Object obj = bxiVar.e;
        int length = ((long[]) obj).length;
        if (i == length) {
            int i2 = length << 1;
            if (i2 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr = new long[i2];
            int i3 = bxiVar.d;
            int i4 = length - i3;
            System.arraycopy(obj, i3, jArr, 0, i4);
            System.arraycopy(bxiVar.e, 0, jArr, i4, i3);
            bxiVar.d = 0;
            bxiVar.c = bxiVar.a - 1;
            bxiVar.e = jArr;
            obj = bxiVar.e;
            bxiVar.b = ((long[]) obj).length - 1;
        }
        int i5 = (bxiVar.c + 1) & bxiVar.b;
        bxiVar.c = i5;
        ((long[]) obj)[i5] = j;
        bxiVar.a++;
        ctvVar.g = j;
        ctvVar.i = -9223372036854775807L;
        this.d.execute(new cqc(this, 3));
        return true;
    }

    @Override // defpackage.cuc
    public final void g() {
    }

    @Override // defpackage.cuc
    public final void x(bse bseVar) {
    }
}
