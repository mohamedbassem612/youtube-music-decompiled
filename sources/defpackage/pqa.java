package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pqa extends awpg {
    Object a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ pqc d;
    int e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqa(pqc pqcVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pqcVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, null, null, this);
    }
}
