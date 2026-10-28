package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axbr extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ axbs b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbr(axbs axbsVar, awoq awoqVar) {
        super(awoqVar);
        this.b = axbsVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
