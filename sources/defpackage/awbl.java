package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awbl extends avlr {
    final avlt a;

    public awbl(avlt avltVar) {
        this.a = avltVar;
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        awbj awbjVar = new awbj(avlwVar);
        avlwVar.d(awbjVar);
        try {
            this.a.a(awbjVar);
        } catch (Throwable th) {
            avkz.a(th);
            awbjVar.b(th);
        }
    }
}
