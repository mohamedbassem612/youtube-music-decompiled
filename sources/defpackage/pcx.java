package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pcx extends awpg {
    Object a;
    boolean b;
    boolean c;
    long d;
    /* synthetic */ Object e;
    final /* synthetic */ pcy f;
    int g;
    pcy h;
    pax i;
    plx j;
    plb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcx(pcy pcyVar, awoq awoqVar) {
        super(awoqVar);
        this.f = pcyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return pcy.b(this.f, null, null, null, null, false, false, false, false, this);
    }
}
