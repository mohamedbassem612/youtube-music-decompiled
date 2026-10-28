package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class pze extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pzf c;
    int d;
    atr e;
    pot f;
    aief g;
    atr h;
    String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pze(pzf pzfVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pzfVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, null, null, this);
    }
}
