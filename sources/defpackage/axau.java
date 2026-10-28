package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axau extends awpg {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ axav e;
    int f;
    axax g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axau(axav axavVar, awoq awoqVar) {
        super(awoqVar);
        this.e = axavVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.collect(null, this);
    }
}
