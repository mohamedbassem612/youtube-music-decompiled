package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awhr extends avmc {
    final avmf a;
    final avmb b;

    public awhr(avmf avmfVar, avmb avmbVar) {
        this.a = avmfVar;
        this.b = avmbVar;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        awhq awhqVar = new awhq(avmdVar, this.a);
        avmdVar.d(awhqVar);
        avnr.g(awhqVar.b, this.b.e(awhqVar));
    }
}
