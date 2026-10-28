package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class puw extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pux c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puw(pux puxVar, awoq awoqVar) {
        super(awoqVar);
        this.c = puxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, false, this);
    }
}
