package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bet extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ beu d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bet(beu beuVar, awoq awoqVar) {
        super(awoqVar);
        this.d = beuVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
