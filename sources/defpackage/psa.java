package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class psa extends awpg {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ pse e;
    int f;
    String g;
    plv h;
    aier i;
    String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psa(pse pseVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pseVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.j(null, null, null, null, null, null, null, null, this);
    }
}
