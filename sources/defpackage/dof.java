package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dof extends awpk implements awqk {
    int a;
    final /* synthetic */ awou b;
    final /* synthetic */ dmq c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ awqg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dof(awou awouVar, dmq dmqVar, boolean z, boolean z2, awqg awqgVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = awouVar;
        this.c = dmqVar;
        this.d = z;
        this.e = z2;
        this.f = awqgVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new dof(this.b, this.c, this.d, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dof) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        awou awouVar = this.b;
        dog dogVar = new dog(this.c, this.d, this.e, this.f, (awoq) null, 1);
        this.a = 1;
        Object objP = awro.p(awouVar, dogVar, this);
        return objP == awoxVar ? awoxVar : objP;
    }
}
