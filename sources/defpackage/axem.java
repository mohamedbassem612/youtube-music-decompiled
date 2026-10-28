package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axem extends awpg {
    Object a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ axen d;
    int e;
    axeq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axem(axen axenVar, awoq awoqVar) {
        super(awoqVar);
        this.d = axenVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
