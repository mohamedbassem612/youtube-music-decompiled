package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xzq extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ xzs b;
    int c;
    xzn d;
    awrm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzq(xzs xzsVar, awoq awoqVar) {
        super(awoqVar);
        this.b = xzsVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, 0, null, null, this);
    }
}
