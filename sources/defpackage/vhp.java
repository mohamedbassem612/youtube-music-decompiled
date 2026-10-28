package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vhp extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ vhu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhp(vhu vhuVar, awoq awoqVar) {
        super(awoqVar);
        this.b = vhuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
