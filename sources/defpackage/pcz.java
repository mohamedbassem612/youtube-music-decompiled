package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pcz extends awpg {
    Object a;
    boolean b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ pdb e;
    int f;
    pax g;
    plx h;
    plb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcz(pdb pdbVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pdbVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, null, null, false, false, this);
    }
}
