package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pby extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pbz c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pby(pbz pbzVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pbzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
