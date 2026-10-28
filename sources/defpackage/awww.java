package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awww extends awwg {
    private final awud a;

    public awww(awud awudVar) {
        this.a = awudVar;
    }

    @Override // defpackage.awwg
    public final void a(Throwable th) {
        Object objZ = e().z();
        boolean z = awuv.a;
        boolean z2 = objZ instanceof awum;
        awud awudVar = this.a;
        if (!z2) {
            awudVar.resumeWith(awwl.b(objZ));
            return;
        }
        Throwable th2 = ((awum) objZ).b;
        th2.getClass();
        awudVar.resumeWith(new awmm(th2));
    }

    @Override // defpackage.awwg
    public final boolean b() {
        return false;
    }
}
