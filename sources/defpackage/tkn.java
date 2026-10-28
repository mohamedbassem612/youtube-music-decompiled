package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tkn extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ tko b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkn(tko tkoVar, awoq awoqVar) {
        super(awoqVar);
        this.b = tkoVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
