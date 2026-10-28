package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class puq extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pux c;
    int d;
    aiay e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puq(pux puxVar, awoq awoqVar) {
        super(awoqVar);
        this.c = puxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, false, this);
    }
}
