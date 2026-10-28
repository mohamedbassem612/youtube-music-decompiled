package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tif extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ tir c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tif(tir tirVar, awoq awoqVar) {
        super(awoqVar);
        this.c = tirVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, false, this);
    }
}
