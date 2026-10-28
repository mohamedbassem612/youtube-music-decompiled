package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pcd extends awpg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    boolean g;
    /* synthetic */ Object h;
    final /* synthetic */ pcm i;
    int j;
    plx k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcd(pcm pcmVar, awoq awoqVar) {
        super(awoqVar);
        this.i = pcmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(null, null, null, false, this);
    }
}
