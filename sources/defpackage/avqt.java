package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avqt extends AtomicReference implements Runnable, avlc, avmn {
    private static final long serialVersionUID = 7000911171163930287L;
    final avlc a;
    final avnv b = new avnv();
    final avle c;

    public avqt(avlc avlcVar, avle avleVar) {
        this.a = avlcVar;
        this.c = avleVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
        avnr.b(this.b);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.kn();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.kp(this);
    }
}
