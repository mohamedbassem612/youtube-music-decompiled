package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phw extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pic b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phw(pic picVar, awoq awoqVar) {
        super(awoqVar);
        this.b = picVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, null, null, this);
    }
}
