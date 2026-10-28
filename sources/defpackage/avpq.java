package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpq extends avlb {
    final avle[] a;

    public avpq(avle[] avleVarArr) {
        this.a = avleVarArr;
    }

    @Override // defpackage.avlb
    public final void H(avlc avlcVar) {
        avpp avppVar = new avpp(avlcVar, this.a);
        avlcVar.d(avppVar.d);
        avppVar.c();
    }
}
