package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axba extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ axbb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axba(axbb axbbVar, awoq awoqVar) {
        super(awoqVar);
        this.b = axbbVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.collect(null, this);
    }
}
