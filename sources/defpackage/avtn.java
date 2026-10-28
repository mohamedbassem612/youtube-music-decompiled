package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avtn extends avrf {
    final avno c;

    public avtn(avlh avlhVar, avno avnoVar) {
        super(avlhVar);
        this.c = avnoVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        boolean z = axspVar instanceof avok;
        avlh avlhVar = this.b;
        if (z) {
            avlhVar.ap(new avtl((avok) axspVar, this.c));
        } else {
            avlhVar.ap(new avtm(axspVar, this.c));
        }
    }
}
