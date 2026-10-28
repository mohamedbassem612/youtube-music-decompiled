package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pch extends awpg {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ pcm d;
    int e;
    aiff f;
    ahza g;
    int h;
    plx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pch(pcm pcmVar, awoq awoqVar) {
        super(awoqVar);
        this.d = pcmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(null, null, null, 0, null, this);
    }
}
