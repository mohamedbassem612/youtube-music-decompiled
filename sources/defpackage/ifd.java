package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ifd extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ ifj b;
    int c;
    abnl d;
    abnp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifd(ifj ifjVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ifjVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
