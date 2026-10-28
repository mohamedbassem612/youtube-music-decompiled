package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vhq extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vhu c;
    int d;
    awno e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhq(vhu vhuVar, awoq awoqVar) {
        super(awoqVar);
        this.c = vhuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
