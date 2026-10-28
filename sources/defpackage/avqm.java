package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avqm extends AtomicReference implements Runnable, avlc, avmn {
    private static final long serialVersionUID = 8571289934935992137L;
    final avlc a;
    final avmb b;
    Throwable c;

    public avqm(avlc avlcVar, avmb avmbVar) {
        this.a = avlcVar;
        this.b = avmbVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.c = th;
        avnr.g(this, this.b.e(this));
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar)) {
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        avnr.g(this, this.b.e(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.c;
        if (th == null) {
            this.a.kn();
        } else {
            this.c = null;
            this.a.b(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.valueOf(this.a);
    }
}
