package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pel extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ peo b;
    int c;
    axst d;
    axst e;
    ahub f;
    ahub g;
    ahub h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pel(peo peoVar, awoq awoqVar) {
        super(awoqVar);
        this.b = peoVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
