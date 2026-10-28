package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class psi extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ psm c;
    int d;
    plv e;
    pss f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psi(psm psmVar, awoq awoqVar) {
        super(awoqVar);
        this.c = psmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, this);
    }
}
