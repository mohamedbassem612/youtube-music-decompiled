package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cwf extends cvp {
    final /* synthetic */ cvz a;
    final /* synthetic */ cwg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwf(cwg cwgVar, cvz cvzVar, cvz cvzVar2) {
        super(cvzVar);
        this.a = cvzVar2;
        this.b = cwgVar;
    }

    @Override // defpackage.cvp, defpackage.cvz
    public final cvx b(long j) {
        cvx cvxVarB = this.a.b(j);
        cwa cwaVar = cvxVarB.a;
        long j2 = cwaVar.c;
        long j3 = cwaVar.b;
        long j4 = this.b.a;
        cwa cwaVar2 = new cwa(j3, j2 + j4);
        cwa cwaVar3 = cvxVarB.b;
        return new cvx(cwaVar2, new cwa(cwaVar3.b, cwaVar3.c + j4));
    }
}
