package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pmd extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pmg b;
    int c;
    plg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmd(pmg pmgVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pmgVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, 0, this);
    }
}
