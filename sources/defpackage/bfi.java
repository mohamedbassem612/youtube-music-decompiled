package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfi extends awpk implements awqk {
    int a;
    final /* synthetic */ bfp b;
    final /* synthetic */ awqk c;
    final /* synthetic */ bdw d;
    final /* synthetic */ dqy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfi(bfp bfpVar, dqy dqyVar, awqk awqkVar, bdw bdwVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = bfpVar;
        this.e = dqyVar;
        this.c = awqkVar;
        this.d = bdwVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new bfi(this.b, this.e, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bfi) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        bfh bfhVar = new bfh(this.c, this.d, (awoq) null, 0);
        this.a = 1;
        Object objD = azt.d(bfhVar, this);
        return objD == awoxVar ? awoxVar : objD;
    }
}
