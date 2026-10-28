package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bey extends awpk implements awqk {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ bfp d;
    final /* synthetic */ awqk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bey(bfp bfpVar, awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = bfpVar;
        this.e = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bey beyVar = new bey(this.d, this.e, awoqVar);
        beyVar.c = ((Boolean) obj).booleanValue();
        return beyVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((bey) create(bool, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        bgk bgeVar;
        boolean z = this.c;
        awox awoxVar = awox.a;
        int i = this.b;
        try {
            if (i == 0) {
                atqp.j(obj);
                bfp bfpVar = this.d;
                awqk awqkVar = this.e;
                this.c = z;
                this.b = 1;
                obj = bfpVar.h(z, awqkVar, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    atqp.j(obj);
                    bgeVar = new bge((Throwable) obj2, ((Number) obj).intValue());
                    return new awml(bgeVar, Boolean.valueOf(z));
                }
                atqp.j(obj);
            }
            bgeVar = (bgk) obj;
        } catch (Throwable th) {
            awqk awqkVar2 = this.e;
            Boolean boolValueOf = Boolean.valueOf(z);
            this.a = th;
            this.c = z;
            this.b = 2;
            Object objInvoke = awqkVar2.invoke(boolValueOf, this);
            if (objInvoke == awoxVar) {
                return awoxVar;
            }
            obj = objInvoke;
            obj2 = th;
        }
        return new awml(bgeVar, Boolean.valueOf(z));
    }
}
