package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avzx extends avxz {
    final avlp b;
    final avlp c;

    public avzx(avlp avlpVar, avlp avlpVar2, avlp avlpVar3) {
        super(avlpVar);
        this.b = avlpVar2;
        this.c = avlpVar3;
    }

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        avzv avzvVar = new avzv(avlnVar, this.c);
        avlnVar.d(avzvVar);
        this.b.F(avzvVar.b);
        this.a.F(avzvVar);
    }
}
