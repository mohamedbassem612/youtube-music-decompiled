package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class htu extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ hub b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htu(hub hubVar, awoq awoqVar) {
        super(awoqVar);
        this.b = hubVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
