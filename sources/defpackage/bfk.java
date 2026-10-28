package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfk extends awpk implements awqg {
    int a;
    final /* synthetic */ bfp b;
    final /* synthetic */ awou c;
    final /* synthetic */ awqk d;
    final /* synthetic */ dqy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfk(bfp bfpVar, dqy dqyVar, awou awouVar, awqk awqkVar, awoq awoqVar) {
        super(1, awoqVar);
        this.b = bfpVar;
        this.e = dqyVar;
        this.c = awouVar;
        this.d = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bfk(this.b, this.e, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bfk) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        bfj bfjVar = new bfj(this.b, this.c, this.d, null);
        this.a = 1;
        Object objD = azt.d(bfjVar, this);
        return objD == awoxVar ? awoxVar : objD;
    }
}
