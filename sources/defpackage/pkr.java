package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pkr extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    /* synthetic */ Object h;
    final /* synthetic */ pks i;
    int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkr(pks pksVar, awoq awoqVar) {
        super(awoqVar);
        this.i = pksVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
