package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ppr extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ppv d;
    int e;
    String f;
    ppv g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppr(ppv ppvVar, awoq awoqVar) {
        super(awoqVar);
        this.d = ppvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.m(null, null, this);
    }
}
