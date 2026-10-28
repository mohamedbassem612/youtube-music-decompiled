package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tep extends awpk implements awqk {
    final /* synthetic */ teq a;
    final /* synthetic */ tee b;
    final /* synthetic */ tev c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tep(teq teqVar, tee teeVar, int i, tev tevVar, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.a = teqVar;
        this.b = teeVar;
        this.e = i;
        this.c = tevVar;
        this.d = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new tep(this.a, this.b, this.e, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tep) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        try {
            tet tetVarA = teu.a();
            if (tetVarA != null) {
                long jFreeMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
                int i = tetVarA.a;
                int i2 = tetVarA.b;
            }
            this.b.b();
        } catch (Exception unused) {
        }
        return awmy.a;
    }
}
