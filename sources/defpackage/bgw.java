package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bgw extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ bgx b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgw(bgx bgxVar, awoq awoqVar) {
        super(awoqVar);
        this.b = bgxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
