package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avzu extends AtomicReference implements avln {
    private static final long serialVersionUID = 8663801314800248617L;
    final avln a;

    public avzu(avln avlnVar) {
        this.a = avlnVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        this.a.ki(obj);
    }

    @Override // defpackage.avln
    public final void kn() {
        this.a.kn();
    }
}
