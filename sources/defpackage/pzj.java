package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pzj extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pzk b;
    int c;
    pot d;
    pzq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzj(pzk pzkVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pzkVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, null, null, this);
    }
}
