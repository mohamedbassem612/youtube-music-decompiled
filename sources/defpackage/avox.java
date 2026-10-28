package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avox extends CountDownLatch implements avlw, avmn {
    Object a;
    Throwable b;
    avmn c;
    volatile boolean d;

    public avox() {
        super(1);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        this.c = avmnVar;
        if (this.d) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.d = true;
        avmn avmnVar = this.c;
        if (avmnVar != null) {
            avmnVar.dispose();
        }
    }

    public final Object e() {
        if (getCount() != 0) {
            try {
                boolean z = atqp.x;
                await();
            } catch (InterruptedException e) {
                dispose();
                throw awkh.b(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw awkh.b(th);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.dispose();
            countDown();
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        countDown();
    }
}
