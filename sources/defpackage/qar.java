package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qar extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qas d;
    int e;
    aibg f;
    plx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qar(qas qasVar, awoq awoqVar) {
        super(awoqVar);
        this.d = qasVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, null, this);
    }
}
