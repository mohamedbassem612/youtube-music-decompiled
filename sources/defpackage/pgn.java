package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pgn extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    /* synthetic */ Object f;
    final /* synthetic */ pgp g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgn(pgp pgpVar, awoq awoqVar) {
        super(awoqVar);
        this.g = pgpVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
