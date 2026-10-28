package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xzr extends awpk implements awqk {
    int a;
    final /* synthetic */ xzs b;
    final /* synthetic */ xzt c;
    final /* synthetic */ awqg d;
    final /* synthetic */ int e;
    final /* synthetic */ aihf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzr(xzs xzsVar, aihf aihfVar, int i, xzt xztVar, awqg awqgVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = xzsVar;
        this.f = aihfVar;
        this.e = i;
        this.c = xztVar;
        this.d = awqgVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new xzr(this.b, this.f, this.e, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((xzr) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        xzs xzsVar = this.b;
        aihf aihfVar = this.f;
        int i2 = this.e;
        xzt xztVar = this.c;
        awqg awqgVar = this.d;
        this.a = 1;
        Object objC = xzsVar.c(aihfVar, i2, xztVar, awqgVar, this);
        return objC == awoxVar ? awoxVar : objC;
    }
}
