package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phi extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ phk d;
    int e;
    phb f;
    plb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phi(phk phkVar, awoq awoqVar) {
        super(awoqVar);
        this.d = phkVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, null, null, this);
    }
}
