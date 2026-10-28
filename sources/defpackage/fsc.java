package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fsc implements fhq {
    final /* synthetic */ fsy a;

    public fsc(fsy fsyVar) {
        this.a = fsyVar;
    }

    @Override // defpackage.fhq
    public final void a(int i, int i2, boolean z) {
        float f = fna.B;
        fsy fsyVar = this.a;
        if (f > i2 / fsyVar.u) {
            fsyVar.G.getAndIncrement();
        }
    }
}
