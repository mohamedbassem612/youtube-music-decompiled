package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avtr extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ avts a;

    public avtr(avts avtsVar) {
        this.a = avtsVar;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        avts avtsVar = this.a;
        avmm avmmVar = avtsVar.d;
        avmmVar.d(this);
        if (!awkh.e(avtsVar.f, th)) {
            atqp.n(th);
            return;
        }
        avtsVar.i.kj();
        avmmVar.dispose();
        avtsVar.e.decrementAndGet();
        avtsVar.g();
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
        avts avtsVar = this.a;
        avtsVar.d.d(this);
        if (avtsVar.get() == 0 && avtsVar.compareAndSet(0, 1)) {
            AtomicInteger atomicInteger = avtsVar.e;
            AtomicLong atomicLong = avtsVar.c;
            int iDecrementAndGet = atomicInteger.decrementAndGet();
            if (atomicLong.get() != 0) {
                axsp axspVar = avtsVar.a;
                axspVar.kk(obj);
                awig awigVar = (awig) avtsVar.h.get();
                if (iDecrementAndGet == 0 && (awigVar == null || awigVar.i())) {
                    Throwable thD = awkh.d(avtsVar.f);
                    if (thD != null) {
                        axspVar.b(thD);
                        return;
                    } else {
                        axspVar.kn();
                        return;
                    }
                }
                atqp.F(atomicLong, 1L);
                if (avtsVar.b != Integer.MAX_VALUE) {
                    avtsVar.i.ko(1L);
                }
            } else {
                awig awigVarD = avtsVar.d();
                synchronized (awigVarD) {
                    awigVarD.j(obj);
                }
            }
            if (avtsVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            awig awigVarD2 = avtsVar.d();
            synchronized (awigVarD2) {
                awigVarD2.j(obj);
            }
            avtsVar.e.decrementAndGet();
            if (avtsVar.getAndIncrement() != 0) {
                return;
            }
        }
        avtsVar.h();
    }

    @Override // defpackage.avln
    public final void kn() {
        avts avtsVar = this.a;
        avtsVar.d.d(this);
        if (avtsVar.get() != 0 || !avtsVar.compareAndSet(0, 1)) {
            avtsVar.e.decrementAndGet();
            if (avtsVar.b != Integer.MAX_VALUE) {
                avtsVar.i.ko(1L);
            }
            avtsVar.g();
            return;
        }
        AtomicInteger atomicInteger = avtsVar.e;
        AtomicReference atomicReference = avtsVar.h;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        awig awigVar = (awig) atomicReference.get();
        if (iDecrementAndGet == 0 && (awigVar == null || awigVar.i())) {
            Throwable thD = awkh.d(avtsVar.f);
            if (thD != null) {
                avtsVar.a.b(thD);
                return;
            } else {
                avtsVar.a.kn();
                return;
            }
        }
        if (avtsVar.b != Integer.MAX_VALUE) {
            avtsVar.i.ko(1L);
        }
        if (avtsVar.decrementAndGet() != 0) {
            avtsVar.h();
        }
    }
}
