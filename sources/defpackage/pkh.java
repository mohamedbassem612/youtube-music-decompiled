package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pkh extends awpg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ pki c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkh(pki pkiVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pkiVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0, null, this);
    }
}
