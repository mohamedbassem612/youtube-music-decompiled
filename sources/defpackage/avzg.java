package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avzg extends AtomicReference implements Runnable, avln, avmn {
    private static final long serialVersionUID = 8571289934935992137L;
    final avln a;
    final avmb b;
    Object c;
    Throwable d;

    public avzg(avln avlnVar, avmb avmbVar) {
        this.a = avlnVar;
        this.b = avmbVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.d = th;
        avnr.g(this, this.b.e(this));
    }

    @Override // defpackage.avln
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

    @Override // defpackage.avln
    public final void ki(Object obj) {
        this.c = obj;
        avnr.g(this, this.b.e(this));
    }

    @Override // defpackage.avln
    public final void kn() {
        avnr.g(this, this.b.e(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.d;
        if (th != null) {
            this.d = null;
            this.a.b(th);
            return;
        }
        Object obj = this.c;
        if (obj == null) {
            this.a.kn();
        } else {
            this.c = null;
            this.a.ki(obj);
        }
    }
}
