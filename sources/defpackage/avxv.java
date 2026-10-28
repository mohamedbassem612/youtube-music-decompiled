package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avxv extends avrf {
    final avnf c;
    final axso d;

    public avxv(avlh avlhVar, avnf avnfVar, axso axsoVar) {
        super(avlhVar);
        this.c = avnfVar;
        this.d = axsoVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        awmb awmbVar = new awmb(axspVar);
        avxu avxuVar = new avxu(awmbVar, this.c);
        awmbVar.e(avxuVar);
        this.d.aq(new avxt(avxuVar));
        this.b.ap(avxuVar);
    }
}
