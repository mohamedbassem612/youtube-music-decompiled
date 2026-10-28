package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgu extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    /* synthetic */ Object a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgu(axp axpVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axpVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [axp, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            bgu bguVar = new bgu((bgk) this.b, awoqVar, 1);
            bguVar.a = obj;
            return bguVar;
        }
        bgu bguVar2 = new bgu((axp) this.b, awoqVar, 0);
        bguVar2.a = obj;
        return bguVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((bgu) create((bgk) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((bgu) create(obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [axp, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        Object obj2 = this.a;
        if (i == 0) {
            atqp.j(obj);
            Object objA = this.b.a(obj2);
            objA.getClass();
            return objA;
        }
        bgk bgkVar = (bgk) obj2;
        atqp.j(obj);
        boolean z = false;
        if ((bgkVar instanceof bdw) && ((bdw) bgkVar).c <= ((bdw) this.b).c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgu(bgk bgkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bgkVar;
    }
}
