package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpx extends avlb {
    final avle a;
    final avnd b;

    public avpx(avle avleVar, avnd avndVar) {
        this.a = avleVar;
        this.b = avndVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        this.a.kp(new avpw(avlcVar, this.b));
    }
}
