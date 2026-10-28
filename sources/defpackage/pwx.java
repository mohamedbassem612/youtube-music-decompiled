package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pwx extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pwz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwx(pwz pwzVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pwzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
