package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pnf extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ png b;
    int c;
    plx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnf(png pngVar, awoq awoqVar) {
        super(awoqVar);
        this.b = pngVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
