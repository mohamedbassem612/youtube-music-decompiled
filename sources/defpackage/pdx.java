package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pdx extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ peg b;
    int c;
    aiau d;
    plx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdx(peg pegVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pegVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, 0L, null, null, this);
    }
}
