package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pee extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ peg b;
    int c;
    aikl d;
    axst e;
    axst f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pee(peg pegVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pegVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(null, this);
    }
}
