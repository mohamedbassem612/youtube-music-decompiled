package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awco extends AtomicInteger implements avmn, avlw {
    private static final long serialVersionUID = 8443155186132538303L;
    final avlc a;
    final avnn c;
    avmn e;
    volatile boolean f;
    final awkd b = new awkd();
    final avmm d = new avmm();

    public awco(avlc avlcVar, avnn avnnVar) {
        this.a = avlcVar;
        this.c = avnnVar;
        lazySet(1);
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awkd awkdVar = this.b;
        if (!awkh.e(awkdVar, th)) {
            atqp.n(th);
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.a.b(awkh.d(awkdVar));
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.e, avmnVar)) {
            this.e = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.f = true;
        this.e.dispose();
        this.d.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.e.f();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [avle, java.lang.Object] */
    @Override // defpackage.avlw
    public final void kk(Object obj) {
        try {
            ?? A = this.c.a(obj);
            getAndIncrement();
            awcn awcnVar = new awcn(this);
            if (this.f || !this.d.c(awcnVar)) {
                return;
            }
            A.kp(awcnVar);
        } catch (Throwable th) {
            avkz.a(th);
            this.e.dispose();
            b(th);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (decrementAndGet() == 0) {
            Throwable thD = awkh.d(this.b);
            avlc avlcVar = this.a;
            if (thD != null) {
                avlcVar.b(thD);
            } else {
                avlcVar.kn();
            }
        }
    }
}
