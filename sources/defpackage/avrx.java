package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avrx extends awju {
    private static final long serialVersionUID = -5082275438355852221L;
    final axsp a;
    final avnn b;
    final avry[] c;
    final awig d;
    final Object[] e;
    boolean f;
    int g;
    int h;
    volatile boolean i;
    final AtomicLong j;
    volatile boolean k;
    final AtomicReference l;

    public avrx(axsp axspVar, avnn avnnVar, int i, int i2) {
        this.a = axspVar;
        this.b = avnnVar;
        avry[] avryVarArr = new avry[i];
        for (int i3 = 0; i3 < i; i3++) {
            avryVarArr[i3] = new avry(this, i3, i2);
        }
        this.c = avryVarArr;
        this.e = new Object[i];
        this.d = new awig(i2);
        this.j = new AtomicLong();
        this.l = new AtomicReference();
    }

    @Override // defpackage.avot
    public final void c() {
        this.d.c();
    }

    final void d() {
        for (avry avryVar : this.c) {
            awka.f(avryVar);
        }
    }

    final void f() {
        if (getAndIncrement() == 0) {
            boolean z = this.f;
            axsp axspVar = this.a;
            int iAddAndGet = 1;
            if (z) {
                awig awigVar = this.d;
                while (!this.i) {
                    Throwable th = (Throwable) this.l.get();
                    if (th != null) {
                        awigVar.c();
                        axspVar.b(th);
                        return;
                    }
                    boolean z2 = this.k;
                    boolean zI = awigVar.i();
                    if (!zI) {
                        axspVar.kk(null);
                    }
                    if (z2 && zI) {
                        axspVar.kn();
                        return;
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                awigVar.c();
                return;
            }
            awig awigVar2 = this.d;
            int iAddAndGet2 = 1;
            do {
                AtomicLong atomicLong = this.j;
                long j = atomicLong.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z3 = this.k;
                    Object objKm = awigVar2.km();
                    boolean z4 = objKm == null;
                    if (!g(z3, z4, axspVar, awigVar2)) {
                        if (z4) {
                            break;
                        }
                        try {
                            Object objA = this.b.a((Object[]) awigVar2.km());
                            objA.getClass();
                            axspVar.kk(objA);
                            ((avry) objKm).d();
                            j2++;
                        } catch (Throwable th2) {
                            avkz.a(th2);
                            d();
                            AtomicReference atomicReference = this.l;
                            awkh.e(atomicReference, th2);
                            axspVar.b(awkh.d(atomicReference));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 == j && g(this.k, awigVar2.i(), axspVar, awigVar2)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    atomicLong.addAndGet(-j2);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }
    }

    final boolean g(boolean z, boolean z2, axsp axspVar, awig awigVar) {
        if (this.i) {
            d();
            awigVar.c();
            return true;
        }
        if (z) {
            Throwable thD = awkh.d(this.l);
            if (thD != null && thD != awkh.a) {
                d();
                awigVar.c();
                axspVar.b(thD);
                return true;
            }
            if (z2) {
                d();
                axspVar.kn();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.d.i();
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.i = true;
        d();
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 4) != 0) {
            return 0;
        }
        int i2 = i & 2;
        this.f = i2 != 0;
        return i2;
    }

    @Override // defpackage.avot
    public final Object km() {
        awig awigVar = this.d;
        Object objKm = awigVar.km();
        if (objKm == null) {
            return null;
        }
        Object objA = this.b.a((Object[]) awigVar.km());
        objA.getClass();
        ((avry) objKm).d();
        return objA;
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.j, j);
            f();
        }
    }
}
