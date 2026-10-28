package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awzn extends awpg {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ axab c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzn(axab axabVar, awoq awoqVar) {
        super(awoqVar);
        this.c = axabVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
