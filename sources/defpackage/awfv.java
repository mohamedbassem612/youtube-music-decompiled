package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfv implements avlw {
    private final awfu a;

    public awfv(awfu awfuVar) {
        this.a = awfuVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awfu awfuVar = this.a;
        avnr.b(awfuVar.c);
        awfuVar.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this.a.d, avmnVar);
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.lazySet(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
    }
}
