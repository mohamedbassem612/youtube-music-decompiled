package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class psj extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    /* synthetic */ Object f;
    final /* synthetic */ psm g;
    int h;
    aier i;
    plv j;
    pqo k;
    aier l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psj(psm psmVar, awoq awoqVar) {
        super(awoqVar);
        this.g = psmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.m(null, null, null, null, null, this);
    }
}
