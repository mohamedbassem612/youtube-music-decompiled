package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qiz extends qjl {
    private final qiw c;

    public qiz(axhi axhiVar, boolean z) {
        super(z, axhiVar);
        this.c = new qiw(axhiVar, z);
    }

    @Override // defpackage.qjl
    public final axhi b(qjj qjjVar) {
        if (qjjVar == null) {
            return this.c.c(null);
        }
        return qjjVar.d() ? f(qjjVar) : e();
    }

    @Override // defpackage.qjl
    public final qjj d(String str) {
        return this.c.a(str);
    }
}
