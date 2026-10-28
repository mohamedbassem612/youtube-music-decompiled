package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfo extends awpk implements awqk {
    int a;
    final /* synthetic */ bfp b;
    final /* synthetic */ awrk c;
    final /* synthetic */ Object d;
    final /* synthetic */ boolean e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfo(bfp bfpVar, awrk awrkVar, Object obj, boolean z, awoq awoqVar) {
        super(2, awoqVar);
        this.b = bfpVar;
        this.c = awrkVar;
        this.d = obj;
        this.e = z;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bfo bfoVar = new bfo(this.b, this.c, this.d, this.e, awoqVar);
        bfoVar.f = obj;
        return bfoVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bfo) create((bft) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        bft bftVar = (bft) this.f;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            bfn bfnVar = new bfn(this.c, this.b, bftVar, this.d, this.e, null);
            this.f = null;
            this.a = 1;
            if (azt.d(bfnVar, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
