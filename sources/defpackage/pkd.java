package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pkd extends awpg {
    Object a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ pki f;
    int g;
    pot h;
    pjw i;
    pkc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkd(pki pkiVar, awoq awoqVar) {
        super(awoqVar);
        this.f = pkiVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, null, null, null, null, null, this);
    }
}
