package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhl extends awpk implements awqk {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ awqk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhl(awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bhl bhlVar = new bhl(this.d, awoqVar);
        bhlVar.c = obj;
        return bhlVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bhl) create((bhj) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        bhj bhjVar = (bhj) this.c;
        awox awoxVar = awox.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            atqp.j(obj);
            return obj2;
        }
        atqp.j(obj);
        bhj bhjVarF = bhjVar.f();
        awqk awqkVar = this.d;
        this.c = null;
        this.a = bhjVarF;
        this.b = 1;
        return awqkVar.invoke(bhjVarF, this) != awoxVar ? bhjVarF : awoxVar;
    }
}
