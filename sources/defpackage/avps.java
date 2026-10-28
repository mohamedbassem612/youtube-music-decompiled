package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avps extends avlb {
    final avld a;

    public avps(avld avldVar) {
        this.a = avldVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        avpr avprVar = new avpr(avlcVar);
        avlcVar.d(avprVar);
        try {
            this.a.a(avprVar);
        } catch (Throwable th) {
            avkz.a(th);
            avprVar.b(th);
        }
    }
}
