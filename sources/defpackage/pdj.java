package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pdj extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pdk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdj(pdk pdkVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pdkVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, 0L, 0, this);
    }
}
