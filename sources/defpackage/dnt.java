package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnt extends awpk implements awqg {
    final /* synthetic */ dnv a;
    final /* synthetic */ String b;
    final /* synthetic */ awqg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnt(dnv dnvVar, String str, awqg awqgVar, awoq awoqVar) {
        super(1, awoqVar);
        this.a = dnvVar;
        this.b = str;
        this.c = awqgVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new dnt(this.a, this.b, this.c, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((dnt) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        atqp.j(obj);
        awqg awqgVar = this.c;
        dpb dpbVarA = this.a.a.a(this.b);
        try {
            Object objInvoke = awqgVar.invoke(dpbVarA);
            dpbVarA.close();
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    dpbVarA.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }
}
