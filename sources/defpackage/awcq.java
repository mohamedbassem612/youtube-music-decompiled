package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awcq extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ awcr a;

    public awcq(awcr awcrVar) {
        this.a = awcrVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        awcr awcrVar = this.a;
        avmm avmmVar = awcrVar.b;
        avmmVar.d(this);
        if (!awkh.e(awcrVar.d, th)) {
            atqp.n(th);
            return;
        }
        awcrVar.g.dispose();
        avmmVar.dispose();
        awcrVar.c.decrementAndGet();
        awcrVar.g();
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
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
        AtomicReference atomicReference;
        awig awigVar;
        awcr awcrVar = this.a;
        awcrVar.b.d(this);
        if (awcrVar.get() == 0 && awcrVar.compareAndSet(0, 1)) {
            avlw avlwVar = awcrVar.a;
            avlwVar.kk(obj);
            AtomicInteger atomicInteger = awcrVar.c;
            AtomicReference atomicReference2 = awcrVar.f;
            int iDecrementAndGet = atomicInteger.decrementAndGet();
            awig awigVar2 = (awig) atomicReference2.get();
            if (iDecrementAndGet == 0 && (awigVar2 == null || awigVar2.i())) {
                Throwable thD = awkh.d(awcrVar.d);
                if (thD != null) {
                    avlwVar.b(thD);
                    return;
                } else {
                    avlwVar.kn();
                    return;
                }
            }
            if (awcrVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            do {
                atomicReference = awcrVar.f;
                awigVar = (awig) atomicReference.get();
                if (awigVar != null) {
                    break;
                } else {
                    awigVar = new awig(avlh.a);
                }
            } while (!a.ap(atomicReference, awigVar));
            synchronized (awigVar) {
                awigVar.j(obj);
            }
            awcrVar.c.decrementAndGet();
            if (awcrVar.getAndIncrement() != 0) {
                return;
            }
        }
        awcrVar.h();
    }

    @Override // defpackage.avln
    public final void kn() {
        awcr awcrVar = this.a;
        awcrVar.b.d(this);
        if (awcrVar.get() != 0 || !awcrVar.compareAndSet(0, 1)) {
            awcrVar.c.decrementAndGet();
            awcrVar.g();
            return;
        }
        AtomicInteger atomicInteger = awcrVar.c;
        AtomicReference atomicReference = awcrVar.f;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        awig awigVar = (awig) atomicReference.get();
        if (iDecrementAndGet != 0 || (awigVar != null && !awigVar.i())) {
            if (awcrVar.decrementAndGet() != 0) {
                awcrVar.h();
            }
        } else {
            Throwable thD = awkh.d(awcrVar.d);
            if (thD != null) {
                awcrVar.a.b(thD);
            } else {
                awcrVar.a.kn();
            }
        }
    }
}
