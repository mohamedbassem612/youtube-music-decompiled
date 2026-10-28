package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjr extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pjv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjr(pjv pjvVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pjvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(null, null, null, this);
    }
}
