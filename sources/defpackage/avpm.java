package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avpm extends AtomicReference implements avlc {
    private static final long serialVersionUID = -5454794857847146511L;
    final avpn a;

    public avpm(avpn avpnVar) {
        this.a = avpnVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.g(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.g(this, avmnVar);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        avpn avpnVar = this.a;
        avpnVar.k = false;
        avpnVar.d();
    }
}
