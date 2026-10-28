package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axbo extends axbj {
    public final awql e;

    public /* synthetic */ axbo(awql awqlVar, awzc awzcVar) {
        this(awqlVar, awzcVar, awov.a, -2, 1);
    }

    @Override // defpackage.axbi
    protected final axbi b(awou awouVar, int i, int i2) {
        return new axbo(this.e, this.d, awouVar, i, i2);
    }

    @Override // defpackage.axbj
    public final Object c(awzd awzdVar, awoq awoqVar) throws Throwable {
        boolean z = awuv.a;
        Object objJ = awrc.J(new afqg(this, awzdVar, (awoq) null, 2), awoqVar);
        return objJ != awox.a ? awmy.a : objJ;
    }

    public axbo(awql awqlVar, awzc awzcVar, awou awouVar, int i, int i2) {
        super(awzcVar, awouVar, i, i2);
        this.e = awqlVar;
    }
}
