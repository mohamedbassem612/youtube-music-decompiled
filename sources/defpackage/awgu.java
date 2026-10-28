package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgu implements avmd {
    final avmd a;
    final avni b;
    boolean c;

    public awgu(avmd avmdVar, avni avniVar) {
        this.a = avmdVar;
        this.b = avniVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        if (this.c) {
            atqp.n(th);
        } else {
            this.a.b(th);
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        try {
            this.b.a(avmnVar);
            this.a.d(avmnVar);
        } catch (Throwable th) {
            avkz.a(th);
            this.c = true;
            avmnVar.dispose();
            avns.h(th, this.a);
        }
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        if (this.c) {
            return;
        }
        this.a.ki(obj);
    }
}
