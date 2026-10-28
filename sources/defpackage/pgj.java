package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pgj extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pgk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgj(pgk pgkVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pgkVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
