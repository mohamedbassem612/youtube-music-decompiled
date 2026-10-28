package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avpu extends AtomicReference implements Runnable, avlc, avmn {
    private static final long serialVersionUID = 465972761105851022L;
    final avlc a;
    final long b = 15;
    final TimeUnit c;
    final avmb d;
    Throwable e;

    public avpu(avlc avlcVar, TimeUnit timeUnit, avmb avmbVar) {
        this.a = avlcVar;
        this.c = timeUnit;
        this.d = avmbVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.e = th;
        avnr.g(this, this.d.c(this, 0L, this.c));
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
        avnr.g(this, this.d.c(this, this.b, this.c));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.e;
        this.e = null;
        avlc avlcVar = this.a;
        if (th != null) {
            avlcVar.b(th);
        } else {
            avlcVar.kn();
        }
    }
}
