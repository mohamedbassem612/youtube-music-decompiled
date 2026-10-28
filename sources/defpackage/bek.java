package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bek extends awpk implements awqk {
    /* synthetic */ Object a;

    public bek(awoq awoqVar) {
        super(2, awoqVar);
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bek bekVar = new bek(awoqVar);
        bekVar.a = obj;
        return bekVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bek) create((bgk) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        bgk bgkVar = (bgk) this.a;
        atqp.j(obj);
        return Boolean.valueOf(!(bgkVar instanceof bgb));
    }
}
