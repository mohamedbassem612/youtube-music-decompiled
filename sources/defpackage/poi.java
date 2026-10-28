package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class poi extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    Object b;
    int c;
    final /* synthetic */ axff d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poi(axff axffVar, awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = axffVar;
        this.e = awqgVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new poi(this.d, (awqk) this.e, awoqVar, 1) : new poi(this.d, (awqg) this.e, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((poi) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((poi) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [awqg] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v5, types: [awqk] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [axff] */
    /* JADX WARN: Type inference failed for: r7v13, types: [axff] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [axff] */
    /* JADX WARN: Type inference failed for: r7v6, types: [axff] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r3;
        Object obj2;
        Throwable th;
        ?? r7;
        ?? r8;
        axff axffVar;
        Object obj3;
        Object obj4;
        ?? r4;
        Throwable th2;
        ?? r9;
        ?? r10;
        if (this.$cid != 0) {
            awox awoxVar = awox.a;
            int i = this.c;
            try {
                if (i == 0) {
                    atqp.j(obj);
                    axffVar = this.d;
                    obj3 = this.e;
                    this.a = axffVar;
                    this.b = obj3;
                    this.c = 1;
                    if (axffVar.a(this) == awoxVar) {
                        r4 = obj3;
                        obj4 = axffVar;
                        return awoxVar;
                    }
                } else {
                    if (i != 1) {
                        r9 = this.a;
                        try {
                            atqp.j(obj);
                            r10 = r9;
                            r10.c();
                            return awmy.a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            r9.c();
                            throw th2;
                        }
                    }
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    atqp.j(obj);
                    obj4 = obj6;
                    r4 = obj5;
                }
                r4 = obj3;
                obj4 = axffVar;
                dmr dmrVar = new dmr((awqk) r4, (awoq) null, 1);
                this.a = obj4;
                this.b = null;
                this.c = 2;
                if (awrc.J(dmrVar, this) == awoxVar) {
                    return awoxVar;
                }
                r10 = obj4;
                r10.c();
                return awmy.a;
            } catch (Throwable th4) {
                Object obj7 = obj4;
                th2 = th4;
                r9 = obj7;
                r9.c();
                throw th2;
            }
        }
        awox awoxVar2 = awox.a;
        int i2 = this.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                axff axffVar2 = this.d;
                Object obj8 = this.e;
                this.a = axffVar2;
                this.b = obj8;
                this.c = 1;
                if (axffVar2.a(this) == awoxVar2) {
                    return awoxVar2;
                }
                r3 = obj8;
                obj2 = axffVar2;
            } else {
                if (i2 != 1) {
                    r7 = this.a;
                    try {
                        atqp.j(obj);
                        r8 = r7;
                        r8.c();
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        r7.c();
                        throw th;
                    }
                }
                Object obj9 = this.b;
                Object obj10 = this.a;
                atqp.j(obj);
                obj2 = obj10;
                r3 = obj9;
            }
            this.a = obj2;
            this.b = null;
            this.c = 2;
            Object objInvoke = r3.invoke(this);
            if (objInvoke == awoxVar2) {
                return awoxVar2;
            }
            Object obj11 = obj2;
            obj = objInvoke;
            r8 = obj11;
            r8.c();
            return obj;
        } catch (Throwable th6) {
            Object obj12 = obj2;
            th = th6;
            r7 = obj12;
            r7.c();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poi(axff axffVar, awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = axffVar;
        this.e = awqkVar;
    }
}
