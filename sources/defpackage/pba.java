package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pba extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pbc b;
    int c;
    axst d;
    axst e;
    axst f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pba(pbc pbcVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pbcVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(this);
    }
}
