package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pai extends awpg {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ paj d;
    int e;
    aiff f;
    String g;
    String h;
    pzn i;
    aicf j;
    ahza k;
    String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pai(paj pajVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pajVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, 0L, this);
    }
}
