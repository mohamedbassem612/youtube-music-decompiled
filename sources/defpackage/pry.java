package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pry extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    int h;
    boolean i;
    /* synthetic */ Object j;
    final /* synthetic */ pse k;
    int l;
    String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pry(pse pseVar, awoq awoqVar) {
        super(awoqVar);
        this.k = pseVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, null, null, null, 0, 0, null, false, null, null, null, this);
    }
}
