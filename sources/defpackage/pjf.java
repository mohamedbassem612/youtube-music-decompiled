package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjf extends awpg {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ pjv e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjf(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, null, this);
    }
}
