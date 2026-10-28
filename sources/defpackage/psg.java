package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class psg extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ psm b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psg(psm psmVar, awoq awoqVar) {
        super(awoqVar);
        this.b = psmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(this);
    }
}
