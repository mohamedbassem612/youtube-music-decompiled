package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pqv extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ pra d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqv(pra praVar, awoq awoqVar) {
        super(awoqVar);
        this.d = praVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, null, null, null, null, null, 0L, this);
    }
}
