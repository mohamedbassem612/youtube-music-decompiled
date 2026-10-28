package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pex extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pfa c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pex(pfa pfaVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pfaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, 0, null, null, null, null, this);
    }
}
