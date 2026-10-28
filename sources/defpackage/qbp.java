package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qbp extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ qbs b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbp(qbs qbsVar, awoq awoqVar) {
        super(awoqVar);
        this.b = qbsVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, null, this);
    }
}
