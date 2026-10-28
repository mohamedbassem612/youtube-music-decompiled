package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pet extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ peu c;
    int d;
    plx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pet(peu peuVar, awoq awoqVar) {
        super(awoqVar);
        this.c = peuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, null, this);
    }
}
