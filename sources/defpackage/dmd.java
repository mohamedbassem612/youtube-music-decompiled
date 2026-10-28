package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmd extends awpk implements awqk {
    final /* synthetic */ dmg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmd(dmg dmgVar, awoq awoqVar) {
        super(2, awoqVar);
        this.a = dmgVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new dmd(this.a, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dmd) create((awzd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        this.a.e.incrementAndGet();
        return awmy.a;
    }
}
