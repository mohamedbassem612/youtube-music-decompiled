package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qbe extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qbf c;
    int d;
    tge e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbe(qbf qbfVar, awoq awoqVar) {
        super(awoqVar);
        this.c = qbfVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, null, false, null, this);
    }
}
