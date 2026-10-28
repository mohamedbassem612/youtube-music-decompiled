package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axbh extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbh(awuj awujVar, awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = awujVar;
        this.b = awqkVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            axbh axbhVar = new axbh((awuj) this.c, (awqk) this.b, awoqVar, 1);
            axbhVar.d = obj;
            return axbhVar;
        }
        axbh axbhVar2 = new axbh((awzd) this.b, (axbi) this.c, awoqVar, 0);
        axbhVar2.d = obj;
        return axbhVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((axbh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((axbh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [awuj] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Object obj2;
        ?? r4;
        if (this.$cid == 0) {
            Object obj3 = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i == 0) {
                awut awutVar = (awut) this.d;
                ?? r2 = this.b;
                awyr awyrVarE = ((axbi) this.c).e(awutVar);
                this.a = 1;
                Object objY = awqx.y(r2, awyrVarE, true, this);
                if (objY != obj3) {
                    objY = awmy.a;
                }
                if (objY == obj3) {
                    return obj3;
                }
            }
            return awmy.a;
        }
        awox awoxVar = awox.a;
        if (this.a != 0) {
            obj2 = (awuj) this.d;
            try {
                atqp.j(obj);
                r4 = obj2;
            } catch (Throwable th2) {
                th = th2;
                obj = new awmm(th);
                r4 = obj2;
            }
        } else {
            atqp.j(obj);
            awut awutVar2 = (awut) this.d;
            Object obj4 = this.c;
            ?? r3 = this.b;
            try {
                this.d = obj4;
                this.a = 1;
                obj = r3.invoke(awutVar2, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                r4 = obj4;
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj4;
                obj = new awmm(th);
                r4 = obj2;
            }
        }
        awqx.i(r4, obj);
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbh(awzd awzdVar, axbi axbiVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awzdVar;
        this.c = axbiVar;
    }
}
