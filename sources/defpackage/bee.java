package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bee extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ bef d;
    int e;
    bfp f;
    bdz g;
    axfi h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bee(bef befVar, awoq awoqVar) {
        super(awoqVar);
        this.d = befVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
