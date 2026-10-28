package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avty extends avlh {
    final Object[] b;

    public avty(Object[] objArr) {
        this.b = objArr;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        if (axspVar instanceof avok) {
            axspVar.e(new avtv((avok) axspVar, this.b));
        } else {
            axspVar.e(new avtw(axspVar, this.b));
        }
    }
}
