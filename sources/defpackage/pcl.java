package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pcl extends awpg {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pcm c;
    int d;
    aiff e;
    pbh f;
    int g;
    plx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcl(pcm pcmVar, awoq awoqVar) {
        super(awoqVar);
        this.c = pcmVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, null, 0, null, this);
    }
}
