package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ber extends awpk implements awqg {
    Object a;
    int b;
    final /* synthetic */ bfp c;
    final /* synthetic */ axfd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ber(bfp bfpVar, axfd axfdVar, awoq awoqVar) {
        super(1, awoqVar);
        this.c = bfpVar;
        this.d = axfdVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new ber(this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ber) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [awuj] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4, types: [awou, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        axfd axfdVar;
        bfp bfpVar;
        Object obj2;
        dqy dqyVar;
        Throwable th;
        Object obj3;
        ?? r8;
        awox awoxVar = awox.a;
        int i = this.b;
        try {
            if (i != 0) {
                if (i != 1) {
                    Object obj4 = this.a;
                    try {
                        atqp.j(obj);
                        r8 = obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        obj3 = obj4;
                        obj = new awmm(th);
                        r8 = obj3;
                    }
                } else {
                    atqp.j(obj);
                }
                return Boolean.valueOf(awqx.i(r8, obj));
            }
            atqp.j(obj);
            this.b = 1;
            obj = null;
            awou awouVarPlus = axfdVar.a.plus(getContext());
            beh behVar = new beh(bfpVar, axfdVar, dqyVar, (awoq) null, 2);
            this.a = obj2;
            this.b = 2;
            obj = awro.p(awouVarPlus, behVar, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            r8 = obj2;
            return Boolean.valueOf(awqx.i(r8, obj));
        } catch (Throwable th3) {
            th = th3;
            obj3 = obj2;
            obj = new awmm(th);
            r8 = obj3;
        }
        axfdVar = this.d;
        bfpVar = this.c;
        obj2 = axfdVar.e;
        dqyVar = (dqy) obj;
    }
}
