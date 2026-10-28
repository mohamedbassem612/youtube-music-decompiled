package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnr extends awpg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dnv c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnr(dnv dnvVar, awoq awoqVar) {
        super(awoqVar);
        this.c = dnvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
