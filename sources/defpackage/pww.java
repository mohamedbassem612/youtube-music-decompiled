package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pww extends awpg {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ pwz e;
    int f;
    aihf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pww(pwz pwzVar, awoq awoqVar) {
        super(awoqVar);
        this.e = pwzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, this);
    }
}
