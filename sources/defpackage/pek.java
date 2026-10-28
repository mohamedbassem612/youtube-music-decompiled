package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pek extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ peo c;
    int d;
    axst e;
    axst f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pek(peo peoVar, awoq awoqVar) {
        super(awoqVar);
        this.c = peoVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
