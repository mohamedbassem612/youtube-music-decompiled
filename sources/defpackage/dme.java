package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dme extends awpk implements awql {
    final /* synthetic */ dmg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dme(dmg dmgVar, awoq awoqVar) {
        super(3, awoqVar);
        this.a = dmgVar;
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new dme(this.a, (awoq) obj3).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        this.a.e.decrementAndGet();
        return awmy.a;
    }
}
