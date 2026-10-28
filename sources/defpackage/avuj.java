package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avuj extends awju implements axso {
    private static final long serialVersionUID = -3852313036005250360L;
    final Object a;
    public final awig b;
    final avui c;
    public volatile boolean e;
    public Throwable f;
    boolean j;
    int k;
    final AtomicLong d = new AtomicLong();
    final AtomicBoolean g = new AtomicBoolean();
    final AtomicReference h = new AtomicReference();
    final AtomicBoolean i = new AtomicBoolean();

    public avuj(int i, avui avuiVar, Object obj) {
        this.b = new awig(i);
        this.c = avuiVar;
        this.a = obj;
    }

    @Override // defpackage.axso
    public final void aq(axsp axspVar) {
        if (!this.i.compareAndSet(false, true)) {
            awjx.f(new IllegalStateException("Only one Subscriber allowed!"), axspVar);
            return;
        }
        axspVar.e(this);
        this.h.lazySet(axspVar);
        d();
    }

    @Override // defpackage.avot
    public final void c() {
        this.b.c();
    }

    public final void d() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        boolean z = this.j;
        awig awigVar = this.b;
        if (z) {
            AtomicReference atomicReference = this.h;
            axsp axspVar = (axsp) atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                if (axspVar != null) {
                    if (this.g.get()) {
                        awigVar.c();
                        return;
                    }
                    boolean z2 = this.e;
                    if (z2 && (th = this.f) != null) {
                        awigVar.c();
                        axspVar.b(th);
                        return;
                    }
                    axspVar.kk(null);
                    if (z2) {
                        Throwable th2 = this.f;
                        if (th2 != null) {
                            axspVar.b(th2);
                            return;
                        } else {
                            axspVar.kn();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (axspVar == null) {
                    axspVar = (axsp) atomicReference.get();
                }
            }
        } else {
            AtomicReference atomicReference2 = this.h;
            axsp axspVar2 = (axsp) atomicReference2.get();
            int iAddAndGet2 = 1;
            while (true) {
                if (axspVar2 != null) {
                    AtomicLong atomicLong = this.d;
                    long j = atomicLong.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z3 = this.e;
                        Object objKm = awigVar.km();
                        boolean z4 = objKm == null;
                        if (!f(z3, z4, axspVar2)) {
                            if (z4) {
                                break;
                            }
                            axspVar2.kk(objKm);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && f(this.e, awigVar.i(), axspVar2)) {
                        return;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            atomicLong.addAndGet(-j2);
                        }
                        this.c.g.ko(j2);
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
                if (axspVar2 == null) {
                    axspVar2 = (axsp) atomicReference2.get();
                }
            }
        }
    }

    final boolean f(boolean z, boolean z2, axsp axspVar) {
        if (this.g.get()) {
            this.b.c();
            return true;
        }
        if (z) {
            Throwable th = this.f;
            if (th != null) {
                this.b.c();
                axspVar.b(th);
                return true;
            }
            if (z2) {
                axspVar.kn();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.b.i();
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.g.compareAndSet(false, true)) {
            avui avuiVar = this.c;
            Object obj = this.a;
            if (obj == null) {
                obj = avui.a;
            }
            avuiVar.e.remove(obj);
            if (avuiVar.j.decrementAndGet() == 0) {
                avuiVar.g.kj();
                if (avuiVar.getAndIncrement() == 0) {
                    avuiVar.f.c();
                }
            }
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.j = true;
        return 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        Object objKm = this.b.km();
        int i = this.k;
        if (objKm != null) {
            this.k = i + 1;
            return objKm;
        }
        if (i != 0) {
            this.k = 0;
            this.c.g.ko(i);
        }
        return null;
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.d, j);
            d();
        }
    }
}
