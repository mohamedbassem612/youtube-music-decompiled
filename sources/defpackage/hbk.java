package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class hbk extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ hbl c;
    int d;
    String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbk(hbl hblVar, awoq awoqVar) {
        super(awoqVar);
        this.c = hblVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, this);
    }
}
