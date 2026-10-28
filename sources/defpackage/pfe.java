package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pfe extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    /* synthetic */ Object g;
    final /* synthetic */ pff h;
    int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfe(pff pffVar, awoq awoqVar) {
        super(awoqVar);
        this.h = pffVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return pff.i(this.h, null, this);
    }
}
