package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pvx extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pvz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvx(pvz pvzVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pvzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, 0, this);
    }
}
