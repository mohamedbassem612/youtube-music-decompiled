package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bel extends awpk implements awql {
    int a;
    final /* synthetic */ bfp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bel(bfp bfpVar, awoq awoqVar) {
        super(3, awoqVar);
        this.b = bfpVar;
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new bel(this.b, (awoq) obj3).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            bfp bfpVar = this.b;
            this.a = 1;
            if (bfpVar.d(this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
