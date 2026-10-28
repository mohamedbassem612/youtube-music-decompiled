package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehp extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehp(aehr aehrVar, aegg aeggVar, dvo dvoVar, aehd aehdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = aehrVar;
        this.b = aeggVar;
        this.d = dvoVar;
        this.c = aehdVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, tjk] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            Object obj2 = this.b;
            Object obj3 = this.c;
            return new aehp((yry) obj2, (ysf) obj3, (avlr) this.a, (tjk) this.d, awoqVar, 1);
        }
        Object obj4 = this.a;
        Object obj5 = this.b;
        return new aehp((aehr) obj4, (aegg) obj5, (dvo) this.d, (aehd) this.c, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((aehp) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((aehp) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tjk] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        arkm arkmVar;
        String str;
        awmy awmyVar;
        if (this.$cid != 0) {
            atqp.j(obj);
            ?? r5 = this.d;
            Object obj2 = this.a;
            Object obj3 = this.c;
            Object obj4 = this.b;
            synchronized (((yry) obj4).a) {
                if (((yry) obj4).b) {
                    awmyVar = awmy.a;
                } else {
                    ((ysf) obj3).h = ((ysf) obj3).e((avlr) obj2, r5);
                    awmyVar = awmy.a;
                }
            }
            return awmyVar;
        }
        atqp.j(obj);
        aehr aehrVar = (aehr) this.a;
        ((aegh) aehrVar.c.io()).p((aegg) this.b, aehrVar.g, (dvo) this.d);
        aehrVar.y(37);
        xir xirVar = aehrVar.h;
        xirVar.n("gw_arsu");
        aehrVar.i = true;
        aehd aehdVar = (aehd) this.c;
        if (aehdVar.i != null && (arkmVar = aehdVar.l) != null) {
            int i = arkmVar.d;
            if (i == 1) {
                str = agvp.f((agya) arkmVar.e).a;
            } else {
                str = i == 14 ? (String) arkmVar.e : "";
            }
            if (!ahno.aa(str)) {
                aehdVar.i.loadUrl(str);
            }
        }
        aehrVar.y(40);
        xirVar.n("gw_arns");
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehp(yry yryVar, ysf ysfVar, avlr avlrVar, tjk tjkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = yryVar;
        this.c = ysfVar;
        this.a = avlrVar;
        this.d = tjkVar;
    }
}
