package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vwf extends awpk implements awql {
    /* synthetic */ Object a;
    final /* synthetic */ vwg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwf(vwg vwgVar, awoq awoqVar) {
        super(3, awoqVar);
        this.b = vwgVar;
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        vwf vwfVar = new vwf(this.b, (awoq) obj3);
        vwfVar.a = (Throwable) obj2;
        return vwfVar.invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        this.b.a((Throwable) this.a, "Error in PersistentEntityStoreBlockImpl on observing PersistentEntityStore and notifying observers. Likely a missing or wrong key.");
        return awmy.a;
    }
}
