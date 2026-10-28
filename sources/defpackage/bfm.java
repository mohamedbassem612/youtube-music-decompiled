package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfm extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ bfp b;
    int c;
    awrk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfm(bfp bfpVar, awoq awoqVar) {
        super(awoqVar);
        this.b = bfpVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, false, this);
    }
}
