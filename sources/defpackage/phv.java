package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phv extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pic b;
    int c;
    aidn d;
    aue e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phv(pic picVar, awoq awoqVar) {
        super(awoqVar);
        this.b = picVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, null, null, null, null, null, null, null, this);
    }
}
