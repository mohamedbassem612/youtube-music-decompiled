package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bff extends awpk implements awqk {
    int a;
    final /* synthetic */ bfp b;
    final /* synthetic */ boolean c;
    final /* synthetic */ awqk d;
    final /* synthetic */ dqy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bff(bfp bfpVar, dqy dqyVar, boolean z, awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = bfpVar;
        this.e = dqyVar;
        this.c = z;
        this.d = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new bff(this.b, this.e, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bff) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        bfe bfeVar = new bfe(this.c, this.b, this.d, null);
        this.a = 1;
        Object objD = azt.d(bfeVar, this);
        return objD == awoxVar ? awoxVar : objD;
    }
}
