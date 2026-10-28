package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class prs extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pse b;
    int c;
    pqo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prs(pse pseVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pseVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
