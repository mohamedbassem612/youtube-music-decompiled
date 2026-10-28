package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfz extends avfh {
    public final avdk a;
    private final avef b;

    public avfz(avef avefVar, avdk avdkVar) {
        this.b = avefVar;
        this.a = avdkVar;
    }

    @Override // defpackage.avfh, defpackage.avdx
    public final avdu a(avbh avbhVar, avbe avbeVar, auyq auyqVar, auyw[] auywVarArr) {
        return new avfy(this, this.b.a(avbhVar, avbeVar, auyqVar, auywVarArr));
    }

    @Override // defpackage.avfh
    protected final avef d() {
        return this.b;
    }
}
