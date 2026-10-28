package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dni extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ dnl b;
    int c;
    pj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dni(dnl dnlVar, awoq awoqVar) {
        super(awoqVar);
        this.b = dnlVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
