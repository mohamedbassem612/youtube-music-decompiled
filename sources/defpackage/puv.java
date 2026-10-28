package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class puv extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pux b;
    int c;
    aibb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puv(pux puxVar, awoq awoqVar) {
        super(awoqVar);
        this.b = puxVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, null, this);
    }
}
