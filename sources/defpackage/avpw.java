package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avpw extends AtomicInteger implements avlc, avmn {
    private static final long serialVersionUID = 4109457741734051389L;
    final avlc a;
    final avnd b;
    avmn c;

    public avpw(avlc avlcVar, avnd avndVar) {
        this.a = avlcVar;
        this.b = avndVar;
    }

    @Override // defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avlc, defpackage.avln
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

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.kn();
        c();
    }
}
