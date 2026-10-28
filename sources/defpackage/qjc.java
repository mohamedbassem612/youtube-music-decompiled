package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qjc extends qjl {
    private final double c;
    private final qiw d;

    /* JADX WARN: Illegal instructions before constructor call */
    public qjc(axhi axhiVar, double d) {
        qjj qjjVarB = qjj.b(axhiVar);
        super(qjjVarB.c > 0, axhiVar);
        this.c = d;
        this.d = new qiw(axhiVar, qjjVarB.c(d));
    }

    @Override // defpackage.qjl
    public final axhi b(qjj qjjVar) {
        if (qjjVar == null) {
            return this.d.c(null);
        }
        return qjjVar.c(this.c) ? f(qjjVar) : e();
    }

    @Override // defpackage.qjl
    public final qjj d(String str) {
        return this.d.a(str);
    }
}
