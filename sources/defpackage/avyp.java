package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avyp extends avlb {
    final avlp a;
    final avnn b;

    public avyp(avlp avlpVar, avnn avnnVar) {
        this.a = avlpVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        avyo avyoVar = new avyo(avlcVar, this.b);
        avlcVar.d(avyoVar);
        this.a.F(avyoVar);
    }
}
