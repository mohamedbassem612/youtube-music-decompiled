package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pmr extends awpg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ pmz c;
    int d;
    aick e;
    pmi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmr(pmz pmzVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pmzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
