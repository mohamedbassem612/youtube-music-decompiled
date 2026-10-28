package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axbl extends awpk implements awqk {
    int a;
    final /* synthetic */ axbo b;
    final /* synthetic */ awzd c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbl(axbo axboVar, awzd awzdVar, Object obj, awoq awoqVar) {
        super(2, awoqVar);
        this.b = axboVar;
        this.c = awzdVar;
        this.d = obj;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new axbl(this.b, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((axbl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            axbo axboVar = this.b;
            awzd awzdVar = this.c;
            Object obj2 = this.d;
            this.a = 1;
            if (axboVar.e.invoke(awzdVar, obj2, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
