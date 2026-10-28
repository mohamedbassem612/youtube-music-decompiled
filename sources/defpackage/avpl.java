package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avpl extends avlb {
    final avle a;
    final avle b;

    public avpl(avle avleVar, avle avleVar2) {
        this.a = avleVar;
        this.b = avleVar2;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        this.a.kp(new avpk(avlcVar, this.b));
    }
}
