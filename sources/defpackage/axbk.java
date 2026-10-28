package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axbk extends axbj {
    public /* synthetic */ axbk(awzc awzcVar, int i, int i2) {
        super(awzcVar, awov.a, i, i2);
    }

    @Override // defpackage.axbi
    protected final axbi b(awou awouVar, int i, int i2) {
        return new axbk(this.d, awouVar, i, i2);
    }

    @Override // defpackage.axbj
    public final Object c(awzd awzdVar, awoq awoqVar) {
        Object objCollect = this.d.collect(awzdVar, awoqVar);
        return objCollect != awox.a ? awmy.a : objCollect;
    }
}
