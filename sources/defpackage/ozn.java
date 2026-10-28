package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ozn extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ ozu b;
    int c;
    aicw d;
    aiec e;
    pax f;
    ahyr g;
    plx h;
    plb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozn(ozu ozuVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ozuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, null, null, 0L, 0L, this);
    }
}
