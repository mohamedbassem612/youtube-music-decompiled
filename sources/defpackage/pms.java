package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pms extends awpg {
    long a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ pmz d;
    int e;
    pmo f;
    aicw g;
    pmi h;
    plb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pms(pmz pmzVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pmzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, null, 0L, 0L, this);
    }
}
