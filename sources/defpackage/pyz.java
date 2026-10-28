package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class pyz extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pza b;
    int c;
    pot d;
    aicg e;
    ozj f;
    plx g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyz(pza pzaVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pzaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, 0, this);
    }
}
