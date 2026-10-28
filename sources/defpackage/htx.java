package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class htx extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ hub c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htx(hub hubVar, awoq awoqVar) {
        super(awoqVar);
        this.c = hubVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, this);
    }
}
