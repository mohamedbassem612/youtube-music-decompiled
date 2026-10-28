package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avux extends avrf {
    final avnn c;

    public avux(avlh avlhVar, avnn avnnVar) {
        super(avlhVar);
        this.c = avnnVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        boolean z = axspVar instanceof avok;
        avlh avlhVar = this.b;
        if (z) {
            avlhVar.ap(new avuv((avok) axspVar, this.c));
        } else {
            avlhVar.ap(new avuw(axspVar, this.c));
        }
    }
}
