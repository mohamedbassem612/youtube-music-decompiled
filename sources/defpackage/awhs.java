package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awhs extends AtomicReference implements avmd {
    private static final long serialVersionUID = 2071387740092105509L;
    final avmd a;

    public awhs(avmd avmdVar) {
        this.a = avmdVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.a.ki(obj);
    }
}
