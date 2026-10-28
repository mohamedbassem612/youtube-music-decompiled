package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pji extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    boolean f;
    /* synthetic */ Object g;
    final /* synthetic */ pjv h;
    int i;
    pot j;
    pfm k;
    pot l;
    String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pji(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.h = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(null, null, null, null, null, null, null, null, false, this);
    }
}
