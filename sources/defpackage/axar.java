package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axar extends awpk implements awql {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ axas c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axar(axas axasVar, awoq awoqVar) {
        super(3, awoqVar);
        this.c = axasVar;
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        axar axarVar = new axar(this.c, (awoq) obj3);
        axarVar.d = (awzd) obj;
        axarVar.b = iIntValue;
        return axarVar.invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awzd] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r1;
        ?? r2;
        Object objEmit;
        ?? r3;
        ?? r4;
        axan axanVar;
        awox awoxVar = awox.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Object obj2 = this.d;
                    atqp.j(obj);
                    r2 = obj2;
                    r2 = r1;
                    axan axanVar2 = axan.b;
                    this.d = r2;
                    this.a = 3;
                    objEmit = r2.emit(axanVar2, this);
                    r3 = r2;
                    if (objEmit == awoxVar) {
                        return awoxVar;
                    }
                    this.d = r3;
                    this.a = 4;
                    r4 = r3;
                    if (avkz.y(Long.MAX_VALUE, this) == awoxVar) {
                        return awoxVar;
                    }
                } else if (i == 3) {
                    Object obj3 = this.d;
                    atqp.j(obj);
                    r3 = obj3;
                    this.d = r3;
                    this.a = 4;
                    r4 = r3;
                    if (avkz.y(Long.MAX_VALUE, this) == awoxVar) {
                        return awoxVar;
                    }
                } else if (i == 4) {
                    Object obj4 = this.d;
                    atqp.j(obj);
                    r4 = obj4;
                }
                axanVar = axan.c;
                this.d = null;
                this.a = 5;
                if (r4.emit(axanVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
            atqp.j(obj);
        } else {
            atqp.j(obj);
            r1 = this.d;
            if (this.b > 0) {
                axan axanVar3 = axan.a;
                this.a = 1;
                if (r1.emit(axanVar3, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                this.a = 2;
                if (avkz.y(5000L, this) == awoxVar) {
                    r2 = r1;
                    return awoxVar;
                }
                r2 = r1;
                axan axanVar4 = axan.b;
                this.d = r2;
                this.a = 3;
                objEmit = r2.emit(axanVar4, this);
                r3 = r2;
                if (objEmit == awoxVar) {
                    return awoxVar;
                }
                this.d = r3;
                this.a = 4;
                r4 = r3;
                if (avkz.y(Long.MAX_VALUE, this) == awoxVar) {
                    return awoxVar;
                }
                axanVar = axan.c;
                this.d = null;
                this.a = 5;
                if (r4.emit(axanVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        return awmy.a;
    }
}
