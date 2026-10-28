package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pzi extends awpg {
    float a;
    /* synthetic */ Object b;
    final /* synthetic */ pzk c;
    int d;
    pot e;
    atr f;
    aidg g;
    atp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzi(pzk pzkVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pzkVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, null, null, this);
    }
}
