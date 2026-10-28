package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgr extends AtomicInteger implements avmd, avmn {
    private static final long serialVersionUID = 4109457741734051389L;
    final avmd a;
    final avnd b;
    avmn c;

    public awgr(avmd avmdVar, avnd avndVar) {
        this.a = avmdVar;
        this.b = avndVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
        c();
    }

    final void c() {
        if (compareAndSet(0, 1)) {
            try {
                this.b.a();
            } catch (Throwable th) {
                avkz.a(th);
                atqp.n(th);
            }
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        if (avnr.e(this.c, avmnVar)) {
            this.c = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c.dispose();
        c();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.a.ki(obj);
        c();
    }
}
