package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pef extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ peg b;
    int c;
    aibi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pef(peg pegVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pegVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, null, this);
    }
}
