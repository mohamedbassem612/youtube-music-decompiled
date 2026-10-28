package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afth extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ awqk d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afth(awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        afth afthVar = new afth(this.d, awoqVar);
        afthVar.e = obj;
        return afthVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((afth) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [afvl] */
    /* JADX WARN: Type inference failed for: r0v5, types: [afvl] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ?? r0;
        aftj aftjVar;
        Object obj2;
        ?? r1;
        awox awoxVar = awox.a;
        int i = this.c;
        try {
            if (i == 0) {
                atqp.j(obj);
                awut awutVar = (awut) this.e;
                afur afurVar = afur.a;
                afurVar.getClass();
                awqk awqkVar = this.d;
                afvh afvhVar = (afvh) afty.d.get();
                aftj aftjVar2 = afvhVar.e;
                if (aftjVar2 == null) {
                    this.c = 1;
                    if (awqkVar.invoke(awutVar, this) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    afti aftiVar = afti.a;
                    Object obj3 = aftjVar2.b;
                    if (afurVar == afur.a) {
                        aftiVar = afti.c;
                    }
                    aftjVar2.b = aftiVar;
                    afvl afvlVarE = afty.e(afvhVar, afurVar);
                    try {
                        this.e = aftjVar2;
                        this.a = obj3;
                        this.b = afvlVarE;
                        this.c = 2;
                        if (awqkVar.invoke(awutVar, this) == awoxVar) {
                            return awoxVar;
                        }
                        r1 = afvlVarE;
                        aftjVar = aftjVar2;
                        obj2 = obj3;
                        afty.e((afvh) afty.d.get(), r1);
                        aftjVar.b = obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        r0 = afvlVarE;
                        aftjVar = aftjVar2;
                        obj2 = obj3;
                        aftt.a(th);
                        throw th;
                    }
                }
            } else if (i != 1) {
                r0 = this.b;
                obj2 = this.a;
                aftjVar = (aftj) this.e;
                try {
                    atqp.j(obj);
                    r1 = r0;
                    afty.e((afvh) afty.d.get(), r1);
                    aftjVar.b = obj2;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        aftt.a(th);
                        throw th;
                    } catch (Throwable th4) {
                        afty.e((afvh) afty.d.get(), r0);
                        aftjVar.b = obj2;
                        throw th4;
                    }
                }
            } else {
                atqp.j(obj);
            }
            return awmy.a;
        } catch (Throwable th5) {
            aftt.a(th5);
            throw th5;
        }
    }
}
