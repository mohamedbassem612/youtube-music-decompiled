package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pns extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pnt b;
    int c;
    pnp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pns(pnt pntVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pntVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
