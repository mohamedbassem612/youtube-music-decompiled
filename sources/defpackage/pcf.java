package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pcf extends awpg {
    Object a;
    Object b;
    Object c;
    boolean d;
    /* synthetic */ Object e;
    final /* synthetic */ pcm f;
    int g;
    pax h;
    plx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcf(pcm pcmVar, awoq awoqVar) {
        super(awoqVar);
        this.f = pcmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, null, null, null, false, this);
    }
}
