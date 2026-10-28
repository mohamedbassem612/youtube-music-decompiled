package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pfs extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pfu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfs(pfu pfuVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pfuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(0L, this);
    }
}
