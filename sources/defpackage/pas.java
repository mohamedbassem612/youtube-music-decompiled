package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pas extends awpg {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ pat d;
    int e;
    pat f;
    plx g;
    axfi h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pas(pat patVar, awoq awoqVar) {
        super(awoqVar);
        this.d = patVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return pat.b(this.d, null, false, this);
    }
}
