package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pqy extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pra b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqy(pra praVar, awoq awoqVar) {
        super(awoqVar);
        this.b = praVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, null, this);
    }
}
