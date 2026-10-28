package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfy extends avff {
    final /* synthetic */ avdu a;
    final /* synthetic */ avfz b;

    public avfy(avfz avfzVar, avdu avduVar) {
        this.a = avduVar;
        this.b = avfzVar;
    }

    @Override // defpackage.avff
    protected final avdu b() {
        return this.a;
    }

    @Override // defpackage.avff, defpackage.avdu
    public final void n(avdw avdwVar) {
        this.b.a.b();
        this.a.n(new avfx(this, avdwVar));
    }
}
