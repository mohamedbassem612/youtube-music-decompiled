package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ppq extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ppv c;
    int d;
    String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppq(ppv ppvVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ppvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, null, this);
    }
}
