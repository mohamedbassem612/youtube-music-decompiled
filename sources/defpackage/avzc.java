package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avzc extends avmc implements avom {
    final avlp a;

    public avzc(avlp avlpVar) {
        this.a = avlpVar;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        this.a.F(new avza(avmdVar, 2));
    }

    @Override // defpackage.avom
    public final avlm a() {
        avzb avzbVar = new avzb(this.a);
        avnn avnnVar = atqp.n;
        return avzbVar;
    }
}
