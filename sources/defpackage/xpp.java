package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xpp extends awpg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xpq c;
    int d;
    amyt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpp(xpq xpqVar, awoq awoqVar) {
        super(awoqVar);
        this.c = xpqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
