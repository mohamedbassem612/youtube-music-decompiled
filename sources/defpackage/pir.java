package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pir extends awpg {
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
    boolean n;
    int o;
    /* synthetic */ Object p;
    final /* synthetic */ pit q;
    int r;
    pot s;
    plx t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pir(pit pitVar, awoq awoqVar) {
        super(awoqVar);
        this.q = pitVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.e(null, null, null, false, this);
    }
}
