package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjq extends awpg {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ pjv d;
    int e;
    pcv f;
    String g;
    atr h;
    pzp i;
    pfm j;
    pot k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjq(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.n(null, null, null, null, null, false, this);
    }
}
