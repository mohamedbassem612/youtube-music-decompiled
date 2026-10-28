package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awgw implements avmd {
    final avmd a;
    final /* synthetic */ awgx b;

    public awgw(awgx awgxVar, avmd avmdVar) {
        this.b = awgxVar;
        this.a = avmdVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        this.a.d(avmnVar);
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        try {
            this.b.b.a(obj);
            this.a.ki(obj);
        } catch (Throwable th) {
            avkz.a(th);
            this.a.b(th);
        }
    }
}
