package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avsx extends avrf {
    final avnn c;
    final avng d;

    public avsx(avlh avlhVar, avnn avnnVar, avng avngVar) {
        super(avlhVar);
        this.c = avnnVar;
        this.d = avngVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        if (axspVar instanceof avok) {
            this.b.ap(new avsv((avok) axspVar, this.c, this.d));
        } else {
            this.b.ap(new avsw(axspVar, this.c, this.d));
        }
    }
}
