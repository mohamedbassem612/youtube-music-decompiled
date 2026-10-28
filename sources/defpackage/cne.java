package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cne implements cnk, cnj {
    public final cnm a;
    public final long b;
    public cno c;
    public cnk d;
    public long e = -9223372036854775807L;
    private final cra f;
    private cnj g;
    private boolean h;

    public cne(cnm cnmVar, cra craVar, long j) {
        this.a = cnmVar;
        this.f = craVar;
        this.b = j;
    }

    private final long r(long j) {
        long j2 = this.e;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        cnk cnkVar = this.d;
        int i = bwp.a;
        return cnkVar.a(j, cdvVar);
    }

    @Override // defpackage.cop
    public final /* bridge */ /* synthetic */ void b(coq coqVar) {
        cnj cnjVar = this.g;
        int i = bwp.a;
        cnjVar.b(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        cnk cnkVar = this.d;
        int i = bwp.a;
        return cnkVar.d();
    }

    @Override // defpackage.cnk
    public final long e() {
        cnk cnkVar = this.d;
        int i = bwp.a;
        return cnkVar.e();
    }

    @Override // defpackage.cnk
    public final long f(long j) {
        cnk cnkVar = this.d;
        int i = bwp.a;
        return cnkVar.f(j);
    }

    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        long j2 = this.e;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.e = -9223372036854775807L;
        cnk cnkVar = this.d;
        int i = bwp.a;
        return cnkVar.g(cqsVarArr, zArr, cooVarArr, zArr2, j);
    }

    @Override // defpackage.cnj
    public final void gp(cnk cnkVar) {
        cnj cnjVar = this.g;
        int i = bwp.a;
        cnjVar.gp(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        cnk cnkVar = this.d;
        int i = bwp.a;
        return cnkVar.gt();
    }

    @Override // defpackage.cnk
    public final long h(long j) {
        cnk cnkVar = this.d;
        if (cnkVar != null) {
            return cnkVar.h(j);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final coy i() {
        cnk cnkVar = this.d;
        int i = bwp.a;
        return cnkVar.i();
    }

    @Override // defpackage.cnk
    public final void j() {
        cnk cnkVar = this.d;
        if (cnkVar != null) {
            cnkVar.j();
            return;
        }
        cno cnoVar = this.c;
        if (cnoVar != null) {
            cnoVar.jG();
        }
    }

    public final void k(cnm cnmVar) {
        long jR = r(this.b);
        cno cnoVar = this.c;
        cnoVar.getClass();
        cnk cnkVarC = cnoVar.c(cnmVar, this.f, jR);
        this.d = cnkVarC;
        if (this.h) {
            cnkVarC.n();
        }
        if (this.g != null) {
            this.d.l(this, jR);
        }
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        this.g = cnjVar;
        cnk cnkVar = this.d;
        if (cnkVar != null) {
            cnkVar.l(this, r(this.b));
        }
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        cnk cnkVar = this.d;
        int i = bwp.a;
        cnkVar.m(j);
    }

    @Override // defpackage.cnk
    public final void n() {
        this.h = true;
        cnk cnkVar = this.d;
        if (cnkVar != null) {
            cnkVar.n();
        }
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        cnk cnkVar = this.d;
        return cnkVar != null && cnkVar.o(ccyVar);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        cnk cnkVar = this.d;
        return cnkVar != null && cnkVar.p();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        cnk cnkVar = this.d;
        int i = bwp.a;
        cnkVar.q(j);
    }
}
