package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avoy extends CountDownLatch implements avmd, avlc, avln {
    public Object a;
    public Throwable b;
    avmn c;
    volatile boolean d;

    public avoy() {
        super(1);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.b = th;
        countDown();
    }

    public final Object c() {
        if (getCount() != 0) {
            try {
                boolean z = atqp.x;
                await();
            } catch (InterruptedException e) {
                e();
                throw awkh.b(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw awkh.b(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        this.c = avmnVar;
        if (this.d) {
            avmnVar.dispose();
        }
    }

    public final void e() {
        this.d = true;
        avmn avmnVar = this.c;
        if (avmnVar != null) {
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.a = obj;
        countDown();
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        countDown();
    }
}
