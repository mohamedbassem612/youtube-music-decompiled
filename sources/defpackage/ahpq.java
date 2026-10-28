package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahpq extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahpq(bhi bhiVar, Object obj, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = bhiVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, mbb] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            ahpq ahpqVar = new ahpq((vwg) this.b, (mbb) this.c, awoqVar, 1);
            ahpqVar.a = obj;
            return ahpqVar;
        }
        ahpq ahpqVar2 = new ahpq((bhi) this.c, this.b, awoqVar, 0);
        ahpqVar2.a = obj;
        return ahpqVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((ahpq) create((weo) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((ahpq) create((bhj) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mbb] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid == 0) {
            atqp.j(obj);
            ((bhj) this.a).e((bhi) this.c, this.b);
            return awmy.a;
        }
        atqp.j(obj);
        weo weoVar = (weo) this.a;
        weoVar.getClass();
        weh wehVar = weoVar.c;
        if (wehVar != null) {
            this.c.d(yno.eH(wehVar));
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahpq(vwg vwgVar, mbb mbbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = vwgVar;
        this.c = mbbVar;
    }
}
