package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class prw extends awpg {
    Object a;
    Object b;
    Object c;
    boolean d;
    long e;
    /* synthetic */ Object f;
    final /* synthetic */ pse g;
    int h;
    aier i;
    plv j;
    String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prw(pse pseVar, awoq awoqVar) {
        super(awoqVar);
        this.g = pseVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(null, null, false, null, null, this);
    }
}
