package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dlt extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ dlu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlt(dlu dluVar, awoq awoqVar) {
        super(awoqVar);
        this.b = dluVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return dlu.d(this.b, null, null, this);
    }
}
