package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pov extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pow b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pov(pow powVar, awoq awoqVar) {
        super(awoqVar);
        this.b = powVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, null, this);
    }
}
