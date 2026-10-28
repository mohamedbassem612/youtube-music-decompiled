package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pqx extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    Object i;
    Object j;
    Object k;
    Object l;
    Object m;
    long n;
    /* synthetic */ Object o;
    final /* synthetic */ pra p;
    int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqx(pra praVar, awoq awoqVar) {
        super(awoqVar);
        this.p = praVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(null, null, null, null, 0L, null, this);
    }
}
