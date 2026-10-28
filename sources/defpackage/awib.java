package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awib extends AtomicReference implements avmd, avmn {
    private static final long serialVersionUID = -5331524057054083935L;
    final avmd a;
    final avni b;
    final boolean c;
    avmn d;

    public awib(avmd avmdVar, Object obj, avni avniVar) {
        super(obj);
        this.a = avmdVar;
        this.c = true;
        this.b = avniVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.d = avnr.DISPOSED;
        if (this.c) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.b.a(andSet);
            } catch (Throwable th2) {
                avkz.a(th2);
                th = new avmw(th, th2);
            }
        }
        this.a.b(th);
        if (this.c) {
            return;
        }
        c();
    }

    final void c() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.b.a(andSet);
            } catch (Throwable th) {
                avkz.a(th);
                atqp.n(th);
            }
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.d, avmnVar)) {
            this.d = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.d.dispose();
        this.d = avnr.DISPOSED;
        c();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.d = avnr.DISPOSED;
        if (this.c) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.b.a(andSet);
            } catch (Throwable th) {
                avkz.a(th);
                this.a.b(th);
                return;
            }
        }
        this.a.ki(obj);
        if (this.c) {
            return;
        }
        c();
    }
}
