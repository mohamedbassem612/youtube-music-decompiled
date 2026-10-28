package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class puy extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ puz c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puy(puz puzVar, awoq awoqVar) {
        super(awoqVar);
        this.c = puzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
