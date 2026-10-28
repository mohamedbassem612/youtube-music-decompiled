package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pyv extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pyw b;
    int c;
    atr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyv(pyw pywVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pywVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, null, null, this);
    }
}
