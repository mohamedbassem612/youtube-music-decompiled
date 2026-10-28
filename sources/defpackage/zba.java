package defpackage;

import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zba implements cnk, cop, cpj {
    protected final wiu a;
    protected final wja b;
    protected final String c;
    protected final zao d;
    protected final zgy e;
    protected final cjz f;
    protected final bzg g;
    protected cnj h;
    protected final bss i;
    protected cpk[] j;
    protected final aae k;
    private final coy l;
    private final cra m;
    private cmu n;
    private final aae o;
    private final aami[] p;
    private final wjr q;

    protected zba(zgy zgyVar, cjz cjzVar, aae aaeVar, bzg bzgVar, aae aaeVar2, cra craVar, wiu wiuVar, wja wjaVar, zao zaoVar, String str, bss bssVar, wjr wjrVar) {
        zkf.a(!wjaVar.t.isEmpty());
        this.a = wiuVar;
        this.b = wjaVar;
        this.c = str;
        this.d = zaoVar;
        this.e = zgyVar;
        this.f = cjzVar;
        this.k = aaeVar;
        this.g = bzgVar;
        Pair pairV = yno.v(cjzVar, wjaVar.t, true);
        if (((coy) pairV.first).b == 0 || ((aami[]) pairV.second).length == 0) {
            zhr.d(zhq.LIVE, "ManifestlessMediaPeriod has no playable tracks");
        }
        this.l = (coy) pairV.first;
        this.p = (aami[]) pairV.second;
        this.o = aaeVar2;
        this.m = craVar;
        this.i = bssVar;
        this.j = new cpk[0];
        this.n = new cmu(this.j);
        this.q = wjrVar;
    }

    @Override // defpackage.cop
    public final /* bridge */ /* synthetic */ void b(coq coqVar) {
        t();
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        return this.n.d();
    }

    @Override // defpackage.cnk
    public long e() {
        return -9223372036854775807L;
    }

    @Override // defpackage.cnk
    public final long f(long j) throws Throwable {
        for (cpk cpkVar : this.j) {
            cpkVar.i(j);
        }
        return j;
    }

    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        SparseArray sparseArray;
        int i;
        SparseArray sparseArray2 = new SparseArray();
        int i2 = 0;
        int i3 = 0;
        while (i3 < cqsVarArr.length) {
            cqs cqsVar = cqsVarArr[i3];
            coo cooVar = cooVarArr[i3];
            if (cooVar instanceof cpk) {
                cpk cpkVar = (cpk) cooVar;
                if (cqsVar == null || !zArr[i3]) {
                    zhq zhqVar = zhq.ABR;
                    int i4 = cpkVar.a;
                    s(cpkVar.e);
                    cpkVar.h(null);
                    cooVarArr[i3] = null;
                } else {
                    sparseArray2.put(this.l.a(cqsVar.d()), cpkVar);
                }
            }
            if (cooVarArr[i3] != null || cqsVar == null) {
                sparseArray = sparseArray2;
                i = i3;
            } else {
                int iA = this.l.a(cqsVar.d());
                aami aamiVar = this.p[iA];
                zhq zhqVar2 = zhq.ABR;
                i = i3;
                cpk cpkVar2 = new cpk(aamiVar.a, null, null, u(aamiVar, cqsVar), this, this.m, j, this.f, this.k, this.q.t(new zaz(this, i2), new zaz(this, 2)), this.o, false, -9223372036854775807L);
                sparseArray = sparseArray2;
                sparseArray.put(iA, cpkVar2);
                cooVarArr[i] = cpkVar2;
                zArr2[i] = true;
            }
            i3 = i + 1;
            sparseArray2 = sparseArray;
            i2 = i2;
        }
        SparseArray sparseArray3 = sparseArray2;
        this.j = new cpk[sparseArray3.size()];
        while (i2 < sparseArray3.size()) {
            this.j[i2] = (cpk) sparseArray3.valueAt(i2);
            i2++;
        }
        this.n = new cmu(this.j);
        return j;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        return this.n.gt();
    }

    @Override // defpackage.cnk
    public final /* synthetic */ long h(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final coy i() {
        return this.l;
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        this.h = cnjVar;
        cnjVar.gp(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        this.n.m(j);
    }

    @Override // defpackage.cnk, defpackage.coq
    public boolean o(ccy ccyVar) {
        return this.n.o(ccyVar);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        return this.n.p();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        for (cpk cpkVar : this.j) {
            cpkVar.n(j);
        }
    }

    public final void r() {
        for (cpk cpkVar : this.j) {
            cpkVar.h(this);
        }
    }

    protected abstract void s(cpl cplVar);

    public final void t() {
        cnj cnjVar = this.h;
        if (cnjVar != null) {
            cnjVar.b(this);
        }
    }

    protected abstract cpl u(aami aamiVar, cqs cqsVar);

    @Override // defpackage.cnk
    public final void j() {
    }

    @Override // defpackage.cnk
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.cpj
    public final void k(cpk cpkVar) {
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        return j;
    }
}
