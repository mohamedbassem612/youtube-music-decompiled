package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class psy extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ psz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psy(psz pszVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pszVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
