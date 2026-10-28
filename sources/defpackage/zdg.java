package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdg implements cnk, cop {
    public final wja a;
    public List b;
    private final cra c;
    private final String d;
    private final cjz e;
    private final zdd f;
    private final agfr g;
    private final zjd h;
    private final long i;
    private final coy j;
    private final bzg k;
    private cnj l;
    private coq m;
    private boolean n;
    private final zcf p;
    private final aae s;
    private final aae t;
    private final aami[] u;
    private final wjr v;
    private int q = 1;
    private int r = 1;
    private long o = 0;

    public zdg(cra craVar, zcf zcfVar, cjz cjzVar, aae aaeVar, zdd zddVar, aae aaeVar2, zjd zjdVar, bzg bzgVar, wjr wjrVar) {
        this.c = craVar;
        this.p = zcfVar;
        this.d = zcfVar.a;
        this.e = cjzVar;
        this.t = aaeVar;
        this.f = zddVar;
        this.s = aaeVar2;
        this.g = new zaz(zcfVar, 6);
        wja wjaVar = zcfVar.A;
        this.a = wjaVar;
        this.h = zjdVar;
        this.i = bwp.y(zcfVar.y.q());
        this.k = bzgVar;
        this.v = wjrVar;
        agke agkeVar = agpi.a;
        this.b = agkeVar;
        this.m = new cmu(k(agkeVar));
        zjdVar.aF();
        Pair pairV = yno.v(cjzVar, wjaVar.t, false);
        zjdVar.aE();
        this.j = (coy) pairV.first;
        this.u = (aami[]) pairV.second;
    }

    private static coq[] k(List list) {
        return (coq[]) list.toArray(new coq[list.size()]);
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        for (cpk cpkVar : this.b) {
            if (cpkVar.a == 2) {
                return cpkVar.e(j, cdvVar);
            }
        }
        return j;
    }

    @Override // defpackage.cop
    public final /* synthetic */ void b(coq coqVar) {
        cnj cnjVar = this.l;
        if (cnjVar != null) {
            cnjVar.b(this);
        }
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        return this.m.d();
    }

    @Override // defpackage.cnk
    public final long e() {
        return -9223372036854775807L;
    }

    @Override // defpackage.cnk
    public final long f(long j) throws Throwable {
        this.o = j;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((cpk) it.next()).i(j);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        int i;
        long j2 = j;
        zjd zjdVar = this.h;
        zjdVar.aL();
        this.o = j2;
        int i2 = 0;
        while (i2 < cqsVarArr.length) {
            if (cqsVarArr[i2] == 0 || !zArr[i2]) {
                coo cooVar = cooVarArr[i2];
                if (cooVar instanceof cpk) {
                    ((cpk) cooVar).h(null);
                }
                cooVarArr[i2] = null;
            }
            cqs cqsVar = cqsVarArr[i2];
            if (cooVarArr[i2] != null || cqsVar == null) {
                i = i2;
            } else {
                aami aamiVar = this.u[this.j.a(cqsVar.d())];
                zArr2[i2] = true;
                zjdVar.aH();
                cio cioVarD = this.a.d(this.d);
                zjdVar.aG();
                int[] iArrT = yno.T(cioVarD, aamiVar);
                zdd zddVar = this.f;
                Object obj = aamiVar.b;
                int i3 = aamiVar.a;
                bzg bzgVar = this.k;
                agfr agfrVar = this.g;
                i = i2;
                cooVarArr[i] = new cpk(i3, null, null, zddVar.a(cioVarD, (wgs[]) obj, iArrT, cqsVar, i3, bzgVar, (wiu) agfrVar.io(), this.p.J), this, this.c, j2, this.e, this.t, this.v.t(agfrVar, new zaz(this, 5)), this.s, false, -9223372036854775807L);
            }
            i2 = i + 1;
            j2 = j;
            zjdVar = zjdVar;
        }
        zjd zjdVar2 = zjdVar;
        this.b = new ArrayList();
        for (coo cooVar2 : cooVarArr) {
            if (cooVar2 instanceof cpk) {
                this.b.add((cpk) cooVar2);
            }
        }
        this.m = new cmu(k(this.b));
        zjdVar2.aK();
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        if (this.q != 3 || this.r != 3) {
            cpk cpkVar = null;
            cpk cpkVar2 = null;
            for (cpk cpkVar3 : this.b) {
                int i = cpkVar3.a;
                if (i == 1) {
                    cpkVar = cpkVar3;
                } else if (i == 2) {
                    cpkVar2 = cpkVar3;
                } else {
                    zvp.a(zvn.a, zvm.f, a.bR(i, "Unexpected primary track type: "));
                }
            }
            if (this.q != 3) {
                long jGt = (cpkVar != null ? cpkVar.gt() : 0L) - this.o;
                int i2 = this.q;
                if (i2 == 1) {
                    if (jGt >= this.i / 2) {
                        this.h.d();
                        this.q = 2;
                        if (jGt >= this.i) {
                            this.h.c();
                            this.q = 3;
                        }
                    }
                } else if (i2 == 2) {
                    if (jGt >= this.i) {
                        this.h.c();
                        this.q = 3;
                    }
                }
            }
            if (this.r != 3) {
                long jGt2 = (cpkVar2 != null ? cpkVar2.gt() : 0L) - this.o;
                int i3 = this.r;
                if (i3 == 1) {
                    if (jGt2 >= this.i / 2) {
                        this.h.ax();
                        this.r = 2;
                        if (jGt2 >= this.i) {
                            this.h.aw();
                            this.r = 3;
                        }
                    }
                } else if (i3 == 2) {
                    if (jGt2 >= this.i) {
                        this.h.aw();
                        this.r = 3;
                    }
                }
            }
        }
        return this.m.gt();
    }

    @Override // defpackage.cnk
    public final /* synthetic */ long h(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final coy i() {
        return this.j;
    }

    @Override // defpackage.cnk
    public final synchronized void l(cnj cnjVar, long j) {
        this.l = cnjVar;
        cnjVar.gp(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        this.m.m(j);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        return this.m.o(ccyVar);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        return this.m.p();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        if (!this.n) {
            this.h.aJ();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((cpk) it.next()).n(j);
        }
        if (!this.n) {
            this.h.aI();
        }
        this.n = true;
    }

    @Override // defpackage.cnk
    public final void j() {
    }

    @Override // defpackage.cnk
    public final /* synthetic */ void n() {
    }
}
