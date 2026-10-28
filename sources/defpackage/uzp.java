package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uzp extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ uzt b;
    int c;
    usd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzp(uzt uztVar, awoq awoqVar) {
        super(awoqVar);
        this.b = uztVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(null, null, this);
    }
}
