package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pcg extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ pcm d;
    int e;
    pax f;
    plx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcg(pcm pcmVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pcmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, null, null, this);
    }
}
