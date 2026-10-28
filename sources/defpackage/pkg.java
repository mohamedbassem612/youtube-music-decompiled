package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pkg extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    /* synthetic */ Object f;
    final /* synthetic */ pki g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkg(pki pkiVar, awoq awoqVar) {
        super(awoqVar);
        this.g = pkiVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}
