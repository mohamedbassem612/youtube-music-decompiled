package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bfc extends awpk implements awqk {
    Object a;
    int b;
    int c;
    /* synthetic */ boolean d;
    final /* synthetic */ bfp e;
    final /* synthetic */ awqk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfc(bfp bfpVar, awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.e = bfpVar;
        this.f = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bfc bfcVar = new bfc(this.e, this.f, awoqVar);
        bfcVar.d = ((Boolean) obj).booleanValue();
        return bfcVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((bfc) create(bool, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        int i;
        boolean z = this.d;
        awox awoxVar = awox.a;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                i = this.b;
                obj2 = this.a;
                atqp.j(obj);
            } else {
                atqp.j(obj);
            }
            return new bdw(obj2, i, ((Number) obj).intValue());
        }
        atqp.j(obj);
        bfp bfpVar = this.e;
        this.d = z;
        this.c = 1;
        obj = bfpVar.g(this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        int iHashCode = obj != null ? obj.hashCode() : 0;
        awqk awqkVar = this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        this.a = obj;
        this.d = z;
        this.b = iHashCode;
        this.c = 2;
        Object objInvoke = awqkVar.invoke(boolValueOf, this);
        if (objInvoke == awoxVar) {
            return awoxVar;
        }
        Object obj3 = obj;
        obj = objInvoke;
        obj2 = obj3;
        i = iHashCode;
        return new bdw(obj2, i, ((Number) obj).intValue());
    }
}
