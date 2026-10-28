package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ifh extends awpg {
    Object a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ ifj e;
    int f;
    igd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifh(ifj ifjVar, awoq awoqVar) {
        super(awoqVar);
        this.e = ifjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(null, null, null, 0, this);
    }
}
