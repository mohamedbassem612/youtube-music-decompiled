package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avsd extends avrf {
    final avnn c;
    final int d;
    final int e;

    public avsd(avlh avlhVar, avnn avnnVar, int i, int i2) {
        super(avlhVar);
        this.c = avnnVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        this.b.ap(new avsc(axspVar, this.c, this.d, this.e));
    }
}
