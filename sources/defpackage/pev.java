package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pev extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pfa b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pev(pfa pfaVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pfaVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
