package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pmp extends awpg {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ pmz c;
    int d;
    pmi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmp(pmz pmzVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pmzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(false, null, this);
    }
}
