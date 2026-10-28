package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awcp extends avlb implements avon {
    final avlu a;
    final avnn b;

    public awcp(avlu avluVar, avnn avnnVar) {
        this.a = avluVar;
        this.b = avnnVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        this.a.ak(new awco(avlcVar, this.b));
    }

    @Override // defpackage.avon
    public final avlr a() {
        awcm awcmVar = new awcm(this.a, this.b);
        avnn avnnVar = atqp.l;
        return awcmVar;
    }
}
