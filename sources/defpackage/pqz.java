package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pqz extends awpg {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ pra c;
    int d;
    aiba e;
    plw f;
    plx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqz(pra praVar, awoq awoqVar) {
        super(awoqVar);
        this.c = praVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, null, 0L, null, 0L, false, this);
    }
}
