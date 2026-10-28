package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbt implements cpl {
    private final cqs a;
    private final cpl[] b;
    private cpl c;

    public zbt(cqs cqsVar, cpl[] cplVarArr) {
        ahno.F(cqsVar.q() == cplVarArr.length);
        this.a = cqsVar;
        this.b = cplVarArr;
        this.c = cplVarArr[cqsVar.f()];
    }

    @Override // defpackage.cpl
    public final int a(long j, List list) {
        return this.a.e(j, list);
    }

    @Override // defpackage.cpl
    public final void e(cpg cpgVar) {
        this.c.e(cpgVar);
    }

    @Override // defpackage.cpl
    public final void f() {
        int i = 0;
        while (true) {
            cpl[] cplVarArr = this.b;
            if (i >= cplVarArr.length) {
                return;
            }
            cplVarArr[i].f();
            i++;
        }
    }

    @Override // defpackage.cpl
    public final boolean h(cpg cpgVar, boolean z, aae aaeVar, crj crjVar) {
        return this.c.h(cpgVar, z, aaeVar, crjVar);
    }

    @Override // defpackage.cpl
    public final void i(ccy ccyVar, long j, List list, fsz fszVar) {
        cpo cpoVar = list.isEmpty() ? null : (cpo) aguu.K(list);
        cqs cqsVar = this.a;
        cpq[] cpqVarArr = new cpq[cqsVar.q()];
        for (int i = 0; i < cqsVar.q(); i++) {
            cpl cplVar = this.b[i];
            if (cplVar instanceof zdf) {
                zdf zdfVar = (zdf) cplVar;
                cpqVarArr[i] = cqsVar != zdfVar.a ? cpq.b : zdfVar.c(i, j, cpoVar, 1000 * System.currentTimeMillis());
            } else {
                cpqVarArr[i] = cpq.b;
            }
        }
        long j2 = ccyVar.a;
        cqsVar.m(j2, j - j2, -9223372036854775807L, list, cpqVarArr);
        cpl cplVar2 = this.b[cqsVar.f()];
        this.c = cplVar2;
        cplVar2.i(ccyVar, j, list, fszVar);
    }

    @Override // defpackage.cpl
    public final void d() {
    }

    @Override // defpackage.cpl
    public final void g() {
    }

    @Override // defpackage.cpl
    public final long b(long j, cdv cdvVar) {
        return j;
    }
}
