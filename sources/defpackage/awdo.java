package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awdo extends awav {
    final avmb b;
    final int c;

    public awdo(avlu avluVar, avmb avmbVar, int i) {
        super(avluVar);
        this.b = avmbVar;
        this.c = i;
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        avmb avmbVar = this.b;
        boolean z = avmbVar instanceof awjk;
        avlu avluVar = this.a;
        if (z) {
            avluVar.ak(avlwVar);
        } else {
            avluVar.ak(new awdn(avlwVar, avmbVar.a(), this.c));
        }
    }
}
