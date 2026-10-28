package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pck extends awpg {
    Object a;
    boolean b;
    boolean c;
    boolean d;
    long e;
    /* synthetic */ Object f;
    final /* synthetic */ pcm g;
    int h;
    pot i;
    pax j;
    plx k;
    plb l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pck(pcm pcmVar, awoq awoqVar) {
        super(awoqVar);
        this.g = pcmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.i(null, null, null, null, null, false, false, false, this);
    }
}
