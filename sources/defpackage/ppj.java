package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ppj extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ppv c;
    int d;
    awrm e;
    axfi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppj(ppv ppvVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ppvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, null, this);
    }
}
