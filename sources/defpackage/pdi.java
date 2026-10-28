package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pdi extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pdk c;
    int d;
    pdk e;
    plx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdi(pdk pdkVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pdkVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return pdk.d(this.c, null, null, 0L, null, false, false, this);
    }
}
