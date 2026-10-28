package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class psh extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ psm d;
    int e;
    plv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psh(psm psmVar, awoq awoqVar) {
        super(awoqVar);
        this.d = psmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(null, null, null, null, null, this);
    }
}
