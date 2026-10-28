package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class igm extends awpk implements awqk {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ axfd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igm(axfd axfdVar, String str, boolean z, boolean z2, awoq awoqVar) {
        super(2, awoqVar);
        this.e = axfdVar;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new igm(this.e, this.b, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((igm) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        axfd axfdVar = this.e;
        String str = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        this.a = 1;
        Object objAg = axfdVar.ag(str, z, z2, this);
        return objAg == awoxVar ? awoxVar : objAg;
    }
}
