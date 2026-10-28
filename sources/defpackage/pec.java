package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pec extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ peg b;
    int c;
    aibg d;
    plx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pec(peg pegVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pegVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, null, this);
    }
}
