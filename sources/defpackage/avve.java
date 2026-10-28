package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avve extends avrf {
    final avmb c;
    final int d;

    public avve(avlh avlhVar, avmb avmbVar, int i) {
        super(avlhVar);
        this.c = avmbVar;
        this.d = i;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        boolean z = axspVar instanceof avok;
        avma avmaVarA = this.c.a();
        avlh avlhVar = this.b;
        if (z) {
            avlhVar.ap(new avvc((avok) axspVar, avmaVarA, this.d));
        } else {
            avlhVar.ap(new avvd(axspVar, avmaVarA, this.d));
        }
    }
}
