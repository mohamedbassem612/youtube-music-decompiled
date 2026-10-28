package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ppm extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ ppv b;
    int c;
    pkx d;
    ppv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppm(ppv ppvVar, awoq awoqVar) {
        super(awoqVar);
        this.b = ppvVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
