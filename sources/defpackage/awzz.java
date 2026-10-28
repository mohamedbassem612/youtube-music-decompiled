package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awzz extends awpk implements awqk {
    /* synthetic */ int a;

    public awzz(awoq awoqVar) {
        super(2, awoqVar);
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        awzz awzzVar = new awzz(awoqVar);
        awzzVar.a = ((Number) obj).intValue();
        return awzzVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((awzz) create(Integer.valueOf(((Number) obj).intValue()), (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        return Boolean.valueOf(this.a > 0);
    }
}
