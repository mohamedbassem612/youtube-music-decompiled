package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awcc extends avmc implements avon {
    final avlu a;
    final Object b;

    public awcc(avlu avluVar, Object obj) {
        this.a = avluVar;
        this.b = obj;
    }

    @Override // defpackage.avmc
    public final void G(avmd avmdVar) {
        this.a.ak(new awcb(avmdVar, this.b));
    }

    @Override // defpackage.avon
    public final avlr a() {
        awby awbyVar = new awby(this.a, this.b, true);
        avnn avnnVar = atqp.l;
        return awbyVar;
    }
}
