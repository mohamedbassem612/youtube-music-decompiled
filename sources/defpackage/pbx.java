package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pbx extends awpg {
    Object a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ pbz d;
    int e;
    plx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbx(pbz pbzVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pbzVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, this);
    }
}
