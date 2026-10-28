package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bgm extends awpk implements awql {
    int a;
    private /* synthetic */ Object b;

    public bgm(awoq awoqVar) {
        super(3, awoqVar);
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        bgm bgmVar = new bgm((awoq) obj3);
        bgmVar.b = (bft) obj;
        return bgmVar.invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.b;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        this.b = null;
        this.a = 1;
        bft bftVar = (bft) obj2;
        bftVar.b();
        Object objE = azu.e(bftVar.a, new bfs(bftVar, null), this);
        return objE == awoxVar ? awoxVar : objE;
    }
}
