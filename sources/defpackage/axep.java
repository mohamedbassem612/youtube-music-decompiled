package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axep extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ axeq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axep(axeq axeqVar, awoq awoqVar) {
        super(awoqVar);
        this.b = axeqVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
