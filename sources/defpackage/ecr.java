package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecr extends awpk implements awql {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public ecr(awoq awoqVar) {
        super(3, awoqVar);
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ecr ecrVar = new ecr((awoq) obj3);
        ecrVar.c = (awzd) obj;
        ecrVar.b = (Object[]) obj2;
        return ecrVar.invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [awzd, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        bou bouVar;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            ?? r8 = this.c;
            bou[] bouVarArr = (bou[]) this.b;
            int length = bouVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    bouVar = null;
                    break;
                }
                bouVar = bouVarArr[i2];
                if (!awrc.c(bouVar, ech.a)) {
                    break;
                }
                i2++;
            }
            if (bouVar == null) {
                bouVar = ech.a;
            }
            this.c = null;
            this.b = null;
            this.a = 1;
            if (r8.emit(bouVar, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
