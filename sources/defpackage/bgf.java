package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bgf extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ bgg b;
    int c;
    axfi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgf(bgg bggVar, awoq awoqVar) {
        super(awoqVar);
        this.b = bggVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
