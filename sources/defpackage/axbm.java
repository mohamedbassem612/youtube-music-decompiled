package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axbm extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ axbn d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbm(axbn axbnVar, awoq awoqVar) {
        super(awoqVar);
        this.d = axbnVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
