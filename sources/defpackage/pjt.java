package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjt extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    long g;
    int h;
    /* synthetic */ Object i;
    final /* synthetic */ pjv j;
    int k;
    pot l;
    pzp m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjt(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.j = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(null, null, this);
    }
}
