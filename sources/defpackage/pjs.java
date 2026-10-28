package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjs extends awpg {
    Object a;
    int b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ pjv e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjs(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.p(null, null, null, this);
    }
}
