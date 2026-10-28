package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avqu extends avlb {
    final avle a;
    final avmb b;

    public avqu(avle avleVar, avmb avmbVar) {
        this.a = avleVar;
        this.b = avmbVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        avqt avqtVar = new avqt(avlcVar, this.a);
        avlcVar.d(avqtVar);
        avnr.g(avqtVar.b, this.b.e(avqtVar));
    }
}
