package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class beo extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ bfp b;
    int c;
    axfi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beo(bfp bfpVar, awoq awoqVar) {
        super(awoqVar);
        this.b = bfpVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
