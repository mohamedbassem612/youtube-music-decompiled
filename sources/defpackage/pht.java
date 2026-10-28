package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pht extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pic b;
    int c;
    atr d;
    pzn e;
    aidq f;
    pos g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pht(pic picVar, awoq awoqVar) {
        super(awoqVar);
        this.b = picVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, null, null, null, null, null, this);
    }
}
