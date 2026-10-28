package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class piv extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ piy c;
    int d;
    piy e;
    String f;
    pzn g;
    plx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piv(piy piyVar, awoq awoqVar) {
        super(awoqVar);
        this.c = piyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return piy.d(this.c, null, null, null, null, this);
    }
}
