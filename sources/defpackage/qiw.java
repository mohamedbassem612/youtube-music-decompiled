package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qiw extends qjl {
    public qiw(axhi axhiVar, boolean z) {
        super(z, axhiVar);
    }

    @Override // defpackage.qjl
    public final qjj a(String str) {
        axhi axhiVarC = c(null);
        return axhiVarC.equals(axhi.a) ? qjj.a : qjj.b(axhiVarC);
    }

    @Override // defpackage.qjl
    public final axhi b(qjj qjjVar) {
        return c(qjjVar);
    }

    public final axhi c(qjj qjjVar) {
        return this.a ? f(qjjVar) : e();
    }
}
