package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awhc extends avlb {
    final avmf a;
    final avnn b;

    public awhc(avmf avmfVar, avnn avnnVar) {
        this.a = avmfVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        awhb awhbVar = new awhb(avlcVar, this.b);
        avlcVar.d(awhbVar);
        this.a.F(awhbVar);
    }
}
