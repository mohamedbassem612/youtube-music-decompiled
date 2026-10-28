package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awhm extends AtomicReference implements Runnable, avmd, avmn {
    private static final long serialVersionUID = 3528003840217436037L;
    final avmd a;
    final avmb b;
    Object c;
    Throwable d;

    public awhm(avmd avmdVar, avmb avmbVar) {
        this.a = avmdVar;
        this.b = avmbVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.d = th;
        avnr.g(this, this.b.e(this));
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.c = obj;
        avnr.g(this, this.b.e(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.d;
        avmd avmdVar = this.a;
        if (th != null) {
            avmdVar.b(th);
        } else {
            avmdVar.ki(this.c);
        }
    }
}
