package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ppk extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ ppv e;
    final /* synthetic */ ppf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppk(ppv ppvVar, ppf ppfVar, awoq awoqVar) {
        super(2, awoqVar);
        this.e = ppvVar;
        this.f = ppfVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new ppk(this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ppk) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [axff] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        ?? r4;
        Object obj3;
        Object obj4 = awox.a;
        try {
            if (this.d == 0) {
                atqp.j(obj);
                ppv ppvVar = this.e;
                int i = ppv.h;
                ppf ppfVar = this.f;
                axff axffVar = ppvVar.f;
                this.a = axffVar;
                this.b = ppvVar;
                this.c = ppfVar;
                this.d = 1;
                if (axffVar.a(this) != obj4) {
                    obj2 = ppfVar;
                    r4 = axffVar;
                    obj3 = ppvVar;
                }
                return obj4;
            }
            obj2 = this.c;
            Object obj5 = this.b;
            Object obj6 = this.a;
            atqp.j(obj);
            obj3 = obj5;
            r4 = obj6;
            int i2 = ppv.h;
            obj4 = (awuz) ((ppv) obj3).e.remove(obj2);
            return obj4;
        } finally {
            r4.c();
        }
    }
}
