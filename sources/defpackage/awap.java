package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awap extends avlr {
    final avlp a;
    final avnn b;

    public awap(avlp avlpVar, avnn avnnVar) {
        this.a = avlpVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        awao awaoVar = new awao(avlwVar, this.b);
        avlwVar.d(awaoVar);
        this.a.F(awaoVar);
    }
}
