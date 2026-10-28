package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axab implements awzd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ awzd a;
    final /* synthetic */ Object b;

    public axab(awzd awzdVar, Object obj, int i) {
        this.$cid = i;
        this.a = awzdVar;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [axab] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [awzd] */
    /* JADX WARN: Type inference failed for: r6v8, types: [axab] */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        axaa axaaVar;
        ?? r6;
        awzn awznVar;
        if (this.$cid != 0) {
            if (awoqVar instanceof awzn) {
                awznVar = (awzn) awoqVar;
                int i = awznVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    awznVar.b = i - Integer.MIN_VALUE;
                } else {
                    awznVar = new awzn(this, awoqVar);
                }
            } else {
                awznVar = new awzn(this, awoqVar);
            }
            Object obj2 = awznVar.a;
            awox awoxVar = awox.a;
            int i2 = awznVar.b;
            try {
                if (i2 == 0) {
                    atqp.j(obj2);
                    awzd awzdVar = this.a;
                    awznVar.b = 1;
                    Object objEmit = awzdVar.emit(obj, awznVar);
                    this = objEmit;
                    if (objEmit == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(obj2);
                    this = this;
                }
                return awmy.a;
            } catch (Throwable th) {
                ((awrm) this.b).a = th;
                throw th;
            }
        }
        if (awoqVar instanceof axaa) {
            axaaVar = (axaa) awoqVar;
            int i3 = axaaVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                axaaVar.b = i3 - Integer.MIN_VALUE;
            } else {
                axaaVar = new axaa(this, awoqVar);
            }
        } else {
            axaaVar = new axaa(this, awoqVar);
        }
        Object obj3 = axaaVar.a;
        awox awoxVar2 = awox.a;
        int i4 = axaaVar.b;
        if (i4 != 0) {
            if (i4 == 1) {
                Object obj4 = axaaVar.e;
                obj = axaaVar.d;
                atqp.j(obj3);
                r6 = obj4;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj3);
            }
            return awmy.a;
        }
        atqp.j(obj3);
        awzd awzdVar2 = this.a;
        ?? r7 = this.b;
        axaaVar.d = obj;
        axaaVar.e = awzdVar2;
        axaaVar.b = 1;
        if (r7.invoke(obj, axaaVar) == awoxVar2) {
            return awoxVar2;
        }
        r6 = awzdVar2;
        axaaVar.d = null;
        axaaVar.e = null;
        axaaVar.b = 2;
        if (r6.emit(obj, axaaVar) == awoxVar2) {
            return awoxVar2;
        }
        return awmy.a;
    }
}
