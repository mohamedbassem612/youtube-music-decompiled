package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bez extends awpk implements awqk {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ bfp c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bez(bfp bfpVar, int i, awoq awoqVar) {
        super(2, awoqVar);
        this.c = bfpVar;
        this.d = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bez bezVar = new bez(this.c, this.d, awoqVar);
        bezVar.b = ((Boolean) obj).booleanValue();
        return bezVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((bez) create(bool, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        boolean z = this.b;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            iIntValue = ((Number) obj).intValue();
        } else if (z) {
            ayq ayqVarN = this.c.n();
            this.b = true;
            this.a = 1;
            obj = ayqVarN.h();
            if (obj == awoxVar) {
                return awoxVar;
            }
            iIntValue = ((Number) obj).intValue();
        } else {
            iIntValue = this.d;
        }
        return new Integer(iIntValue);
    }
}
