package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bex extends awpg {
    boolean a;
    Object b;
    Object c;
    int d;
    int e;
    /* synthetic */ Object f;
    final /* synthetic */ bfp g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bex(bfp bfpVar, awoq awoqVar) {
        super(awoqVar);
        this.g = bfpVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(false, this);
    }
}
