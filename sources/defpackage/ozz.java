package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ozz extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ paa b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozz(paa paaVar, awoq awoqVar) {
        super(awoqVar);
        this.b = paaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
