package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axad extends awpk implements awql {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axad(awoq awoqVar, awqn awqnVar, int i) {
        super(3, awoqVar);
        this.$cid = i;
        this.c = awqnVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awqk, java.lang.Object] */
    @Override // defpackage.awql
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.$cid == 0) {
            axad axadVar = new axad((awoq) obj3, (awqn) this.c, 0);
            axadVar.d = (awzd) obj;
            axadVar.b = (Object[]) obj2;
            return axadVar.invokeSuspend(awmy.a);
        }
        axad axadVar2 = new axad((awqk) this.c, (awoq) obj3, 1);
        axadVar2.d = (awzd) obj;
        axadVar2.b = obj2;
        return axadVar2.invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [awzd] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [awzd] */
    /* JADX WARN: Type inference failed for: r5v3, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r3;
        ?? r4;
        if (this.$cid != 0) {
            awox awoxVar = awox.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    atqp.j(obj);
                } else {
                    Object obj2 = this.d;
                    atqp.j(obj);
                    r4 = obj2;
                }
                return awmy.a;
            }
            atqp.j(obj);
            Object obj3 = this.d;
            Object obj4 = this.b;
            ?? r5 = this.c;
            this.a = 1;
            Object objInvoke = r5.invoke(obj4, this);
            if (objInvoke == awoxVar) {
                return awoxVar;
            }
            r4 = obj3;
            obj = objInvoke;
            this.d = null;
            this.a = 2;
            if (r4.emit(obj, this) == awoxVar) {
                return awoxVar;
            }
            return awmy.a;
        }
        awox awoxVar2 = awox.a;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                atqp.j(obj);
            } else {
                Object obj5 = this.d;
                atqp.j(obj);
                r3 = obj5;
            }
            return awmy.a;
        }
        atqp.j(obj);
        Object obj6 = this.d;
        Object obj7 = this.b;
        Object obj8 = this.c;
        Object[] objArr = (Object[]) obj7;
        Object obj9 = objArr[0];
        Object obj10 = objArr[1];
        Object obj11 = objArr[2];
        Object obj12 = objArr[3];
        this.a = 1;
        int iIntValue = ((Number) obj11).intValue();
        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
        iku ikuVar = new iku(((iku) obj8).e, this);
        ikuVar.a = (String) obj9;
        ikuVar.b = (String) obj10;
        ikuVar.c = iIntValue;
        ikuVar.d = zBooleanValue;
        Object objInvokeSuspend = ikuVar.invokeSuspend(awmy.a);
        if (objInvokeSuspend == awoxVar2) {
            return awoxVar2;
        }
        r3 = obj6;
        obj = objInvokeSuspend;
        this.d = null;
        this.a = 2;
        if (r3.emit(obj, this) == awoxVar2) {
            return awoxVar2;
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axad(awqk awqkVar, awoq awoqVar, int i) {
        super(3, awoqVar);
        this.$cid = i;
        this.c = awqkVar;
    }
}
