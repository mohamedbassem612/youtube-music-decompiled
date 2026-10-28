package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ozp extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ ozu b;
    int c;
    aiez d;
    ahyr e;
    plx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozp(ozu ozuVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ozuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, null, null, null, this);
    }
}
