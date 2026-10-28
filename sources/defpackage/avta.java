package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avta extends avrf {
    final avni c;
    final avni d;
    final avnd e;
    final avnd f;

    public avta(avlh avlhVar, avni avniVar, avni avniVar2, avnd avndVar, avnd avndVar2) {
        super(avlhVar);
        this.c = avniVar;
        this.d = avniVar2;
        this.e = avndVar;
        this.f = avndVar2;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        boolean z = axspVar instanceof avok;
        avlh avlhVar = this.b;
        if (z) {
            avlhVar.ap(new avsy((avok) axspVar, this.c, this.d, this.e, this.f));
        } else {
            avlhVar.ap(new avsz(axspVar, this.c, this.d, this.e, this.f));
        }
    }
}
