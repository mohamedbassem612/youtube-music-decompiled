package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aduf extends awpg {
    int a;
    int b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ aduh e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aduf(aduh aduhVar, awoq awoqVar) {
        super(awoqVar);
        this.e = aduhVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
