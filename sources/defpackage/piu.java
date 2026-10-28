package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class piu extends awpg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ piy c;
    int d;
    piy e;
    String f;
    pot g;
    pzn h;
    String i;
    plx j;
    pos k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public piu(piy piyVar, awoq awoqVar) {
        super(awoqVar);
        this.c = piyVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return piy.c(this.c, null, null, null, null, null, this);
    }
}
