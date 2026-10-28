package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pru extends awpg {
    Object a;
    Object b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ pse e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pru(pse pseVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pseVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(0, 0, null, null, this);
    }
}
