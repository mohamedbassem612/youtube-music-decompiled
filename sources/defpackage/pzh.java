package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pzh extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pzk b;
    int c;
    atr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzh(pzk pzkVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pzkVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, null, null, this);
    }
}
