package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adpr extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ adps c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpr(adps adpsVar, awoq awoqVar) {
        super(awoqVar);
        this.c = adpsVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return adps.a(this.c, null, this);
    }
}
