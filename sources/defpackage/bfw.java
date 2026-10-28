package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfw extends awpg {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ bfy c;
    int d;
    bft e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfw(bfy bfyVar, awoq awoqVar) {
        super(awoqVar);
        this.c = bfyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
