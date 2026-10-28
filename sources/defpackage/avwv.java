package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avwv extends avrf {
    final avmb c;
    final boolean d;

    public avwv(avlh avlhVar, avmb avmbVar, boolean z) {
        super(avlhVar);
        this.c = avmbVar;
        this.d = z;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        avma avmaVarA = this.c.a();
        avwu avwuVar = new avwu(axspVar, avmaVarA, this.b, this.d);
        axspVar.e(avwuVar);
        avmaVarA.a(avwuVar);
    }
}
