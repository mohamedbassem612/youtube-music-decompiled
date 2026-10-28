package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qbc extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ qbf b;
    int c;
    tge d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbc(qbf qbfVar, awoq awoqVar) {
        super(awoqVar);
        this.b = qbfVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, this);
    }
}
