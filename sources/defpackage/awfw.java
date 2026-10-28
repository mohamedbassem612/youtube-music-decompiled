package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awfw extends awav {
    final avnf b;
    final avlu c;

    public awfw(avlu avluVar, avnf avnfVar, avlu avluVar2) {
        super(avluVar);
        this.b = avnfVar;
        this.c = avluVar2;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        awkr awkrVar = new awkr(avlwVar);
        awfu awfuVar = new awfu(awkrVar, this.b);
        awkrVar.d(awfuVar);
        this.c.ak(new awfv(awfuVar));
        this.a.ak(awfuVar);
    }
}
