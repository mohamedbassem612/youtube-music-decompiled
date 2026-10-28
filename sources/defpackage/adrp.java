package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adrp extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ adrq c;
    int d;
    awri e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adrp(adrq adrqVar, awoq awoqVar) {
        super(awoqVar);
        this.c = adrqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.withFrame(null, this);
    }
}
