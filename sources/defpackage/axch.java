package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axch implements awzd {
    private final awou a;
    private final Object b;
    private final awqk c;

    public axch(awzd awzdVar, awou awouVar) {
        this.a = awouVar;
        this.b = axea.a(awouVar);
        this.c = new dmr(awzdVar, (awoq) null, 5);
    }

    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) {
        Object objN = avkz.n(this.a, obj, this.b, this.c, awoqVar);
        return objN != awox.a ? awmy.a : objN;
    }
}
