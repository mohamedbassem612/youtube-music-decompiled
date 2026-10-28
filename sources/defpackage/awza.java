package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awza implements awzc {
    public final awqg a;
    public final awqk b;
    private final awzc c;

    public awza(awzc awzcVar, awqg awqgVar, awqk awqkVar) {
        this.c = awzcVar;
        this.a = awqgVar;
        this.b = awqkVar;
    }

    @Override // defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) {
        awrm awrmVar = new awrm();
        awrmVar.a = axca.a;
        Object objCollect = this.c.collect(new awyz(this, awrmVar, awzdVar), awoqVar);
        return objCollect != awox.a ? awmy.a : objCollect;
    }
}
