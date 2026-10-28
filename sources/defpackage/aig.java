package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aig extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aih c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aig(aih aihVar, awoq awoqVar) {
        super(awoqVar);
        this.c = aihVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
