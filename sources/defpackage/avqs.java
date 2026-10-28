package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avqs extends avlb {
    final avle a;
    final avnn b;

    public avqs(avle avleVar, avnn avnnVar) {
        this.a = avleVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        avqr avqrVar = new avqr(avlcVar, this.b);
        avlcVar.d(avqrVar);
        this.a.kp(avqrVar);
    }
}
