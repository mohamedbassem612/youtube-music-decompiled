package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pin extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pit b;
    int c;
    String d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pin(pit pitVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pitVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, null, 0, 0, false, null, 0, this);
    }
}
