package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ycb extends awpk implements awql {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public ycb(awoq awoqVar) {
        super(3, awoqVar);
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ycb ycbVar = new ycb((awoq) obj3);
        ycbVar.c = (awzd) obj;
        ycbVar.b = (ybq) obj2;
        return ycbVar.invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [awzd] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [awzd, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r1;
        ?? r2;
        awox awoxVar = awox.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.c;
                atqp.j(obj);
                r1 = obj2;
            } else if (i != 2) {
                atqp.j(obj);
            } else {
                Object obj3 = this.c;
                atqp.j(obj);
                r2 = obj3;
                this.c = null;
                this.a = 3;
                if (r2.emit(null, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        atqp.j(obj);
        ?? r6 = this.c;
        Object obj4 = this.b;
        this.a = 1;
        if (r6.emit(obj4, this) == awoxVar) {
            return awoxVar;
        }
        r1 = r6;
        long millis = ahng.D(1).toMillis();
        this.c = r1;
        this.a = 2;
        r2 = r1;
        if (avkz.y(millis, this) == awoxVar) {
            return awoxVar;
        }
        this.c = null;
        this.a = 3;
        if (r2.emit(null, this) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }
}
