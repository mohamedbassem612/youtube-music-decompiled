package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awcr extends AtomicInteger implements avlw, avmn {
    private static final long serialVersionUID = 8600231336733376951L;
    final avlw a;
    final avnn e;
    avmn g;
    volatile boolean h;
    final avmm b = new avmm();
    final awkd d = new awkd();
    final AtomicInteger c = new AtomicInteger(1);
    final AtomicReference f = new AtomicReference();

    public awcr(avlw avlwVar, avnn avnnVar) {
        this.a = avlwVar;
        this.e = avnnVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.c.decrementAndGet();
        if (!awkh.e(this.d, th)) {
            atqp.n(th);
        } else {
            this.b.dispose();
            g();
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.g, avmnVar)) {
            this.g = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.h = true;
        this.g.dispose();
        this.b.dispose();
    }

    final void e() {
        awig awigVar = (awig) this.f.get();
        if (awigVar != null) {
            awigVar.c();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.h;
    }

    final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    final void h() {
        int iAddAndGet = 1;
        while (!this.h) {
            avlw avlwVar = this.a;
            awkd awkdVar = this.d;
            if (((Throwable) awkdVar.get()) != null) {
                Throwable thD = awkh.d(awkdVar);
                e();
                avlwVar.b(thD);
                return;
            }
            AtomicReference atomicReference = this.f;
            int i = this.c.get();
            awig awigVar = (awig) atomicReference.get();
            Object objKm = awigVar != null ? awigVar.km() : null;
            if (i == 0) {
                if (objKm == null) {
                    Throwable thD2 = awkh.d(awkdVar);
                    if (thD2 != null) {
                        avlwVar.b(thD2);
                        return;
                    } else {
                        avlwVar.kn();
                        return;
                    }
                }
            } else if (objKm == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            avlwVar.kk(objKm);
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [avlp, java.lang.Object] */
    @Override // defpackage.avlw
    public final void kk(Object obj) {
        try {
            ?? A = this.e.a(obj);
            this.c.getAndIncrement();
            awcq awcqVar = new awcq(this);
            if (this.h || !this.b.c(awcqVar)) {
                return;
            }
            A.F(awcqVar);
        } catch (Throwable th) {
            avkz.a(th);
            this.g.dispose();
            b(th);
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.c.decrementAndGet();
        g();
    }
}
