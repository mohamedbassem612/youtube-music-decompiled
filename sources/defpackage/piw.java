package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class piw extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ piy c;
    int d;
    piy e;
    String f;
    plx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piw(piy piyVar, awoq awoqVar) {
        super(awoqVar);
        this.c = piyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return piy.e(this.c, null, null, null, this);
    }
}
