package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awjn extends CountDownLatch implements avlk {
    Object a;
    Throwable b;
    axsq c;
    volatile boolean d;

    public awjn() {
        super(1);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.a == null) {
            this.b = th;
        } else {
            atqp.n(th);
        }
        countDown();
    }

    public final Object d() {
        if (getCount() != 0) {
            try {
                boolean z = atqp.x;
                await();
            } catch (InterruptedException e) {
                axsq axsqVar = this.c;
                this.c = awka.CANCELLED;
                if (axsqVar != null) {
                    axsqVar.kj();
                }
                throw awkh.b(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw awkh.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            this.c = axsqVar;
            boolean z = this.d;
            axsqVar.ko(Long.MAX_VALUE);
            boolean z2 = this.d;
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.kj();
            countDown();
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        countDown();
    }
}
