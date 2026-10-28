package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awzp extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ awzq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzp(awzq awzqVar, awoq awoqVar) {
        super(awoqVar);
        this.c = awzqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
