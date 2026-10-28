package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pju extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pjv c;
    int d;
    String e;
    pax f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pju(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.r(null, null, null, null, null, null, this);
    }
}
