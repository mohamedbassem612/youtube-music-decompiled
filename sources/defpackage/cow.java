package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cow implements cnk, cnj {
    public final cnk a;
    public long b;
    private cnj c;

    public cow(cnk cnkVar, long j) {
        this.a = cnkVar;
        this.b = j;
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        return this.a.a(j - this.b, cdvVar) + this.b;
    }

    @Override // defpackage.cop
    public final /* bridge */ /* synthetic */ void b(coq coqVar) {
        cnj cnjVar = this.c;
        cnjVar.getClass();
        cnjVar.b(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        long jD = this.a.d();
        if (jD != Long.MIN_VALUE) {
            return this.b + jD;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final long e() {
        long jE = this.a.e();
        if (jE != -9223372036854775807L) {
            return this.b + jE;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.cnk
    public final long f(long j) {
        return this.a.f(j - this.b) + this.b;
    }

    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        coo[] cooVarArr2 = new coo[cooVarArr.length];
        int i = 0;
        while (true) {
            coo cooVar = null;
            if (i >= cooVarArr.length) {
                break;
            }
            cov covVar = (cov) cooVarArr[i];
            if (covVar != null) {
                cooVar = covVar.a;
            }
            cooVarArr2[i] = cooVar;
            i++;
        }
        long jG = this.a.g(cqsVarArr, zArr, cooVarArr2, zArr2, j - this.b);
        for (int i2 = 0; i2 < cooVarArr.length; i2++) {
            coo cooVar2 = cooVarArr2[i2];
            if (cooVar2 == null) {
                cooVarArr[i2] = null;
            } else {
                coo cooVar3 = cooVarArr[i2];
                if (cooVar3 == null || ((cov) cooVar3).a != cooVar2) {
                    cooVarArr[i2] = new cov(this, cooVar2);
                }
            }
        }
        return jG + this.b;
    }

    @Override // defpackage.cnj
    public final void gp(cnk cnkVar) {
        cnj cnjVar = this.c;
        cnjVar.getClass();
        cnjVar.gp(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        long jGt = this.a.gt();
        if (jGt != Long.MIN_VALUE) {
            return this.b + jGt;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final long h(long j) {
        long jH = this.a.h(j == Long.MIN_VALUE ? Long.MIN_VALUE : j - this.b);
        if (jH != Long.MIN_VALUE) {
            return this.b + jH;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final coy i() {
        return this.a.i();
    }

    @Override // defpackage.cnk
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        this.c = cnjVar;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        this.a.m(j - this.b);
    }

    @Override // defpackage.cnk
    public final void n() {
        int i = bwp.a;
        this.a.n();
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        ccx ccxVar = new ccx(ccyVar);
        ccxVar.a = ccyVar.a - this.b;
        return this.a.o(new ccy(ccxVar));
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        this.a.q(j - this.b);
    }
}
