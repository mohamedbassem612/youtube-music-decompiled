package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class til extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    boolean f;
    /* synthetic */ Object g;
    final /* synthetic */ tir h;
    int i;
    String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public til(tir tirVar, awoq awoqVar) {
        super(awoqVar);
        this.h = tirVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(null, null, null, this);
    }
}
