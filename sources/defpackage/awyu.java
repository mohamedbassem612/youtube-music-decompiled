package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awyu extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ awyv b;
    int c;
    axcb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awyu(awyv awyvVar, awoq awoqVar) {
        super(awoqVar);
        this.b = awyvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.collect(null, this);
    }
}
