package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class peb extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ peg b;
    int c;
    aibe d;
    plx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peb(peg pegVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pegVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, false, null, this);
    }
}
