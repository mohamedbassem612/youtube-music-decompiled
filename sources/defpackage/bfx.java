package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfx extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ bfy c;
    int d;
    bfo e;
    axfi f;
    bft g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfx(bfy bfyVar, awoq awoqVar) {
        super(awoqVar);
        this.c = bfyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
