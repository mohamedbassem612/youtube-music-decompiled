package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ybw extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ycd c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybw(ycd ycdVar, awoq awoqVar) {
        super(awoqVar);
        this.c = ycdVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, this);
    }
}
