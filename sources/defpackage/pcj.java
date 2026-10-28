package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pcj extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    boolean g;
    boolean h;
    boolean i;
    int j;
    /* synthetic */ Object k;
    final /* synthetic */ pcm l;
    int m;
    pot n;
    plx o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcj(pcm pcmVar, awoq awoqVar) {
        super(awoqVar);
        this.l = pcmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, null, null, null, false, false, false, this);
    }
}
