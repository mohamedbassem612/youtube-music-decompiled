package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjj extends awpg {
    Object a;
    Object b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ pjv e;
    int f;
    pot g;
    pcv h;
    pzp i;
    pfm j;
    pot k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjj(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(null, null, null, null, null, null, null, false, this);
    }
}
