package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avui extends awju implements avlk {
    static final Object a = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final axsp b;
    final avnn c;
    final int d;
    final Map e;
    final awig f;
    axsq g;
    final AtomicBoolean h = new AtomicBoolean();
    final AtomicLong i = new AtomicLong();
    final AtomicInteger j = new AtomicInteger(1);
    Throwable k;
    volatile boolean l;
    boolean m;
    boolean n;

    public avui(axsp axspVar, avnn avnnVar, int i, Map map) {
        this.b = axspVar;
        this.c = avnnVar;
        this.d = i;
        this.e = map;
        this.f = new awig(i);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.m) {
            atqp.n(th);
            return;
        }
        this.m = true;
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            avuj avujVar = ((avnc) it.next()).b;
            avujVar.f = th;
            avujVar.e = true;
            avujVar.d();
        }
        map.clear();
        this.k = th;
        this.l = true;
        d();
    }

    @Override // defpackage.avot
    public final void c() {
        this.f.c();
    }

    final void d() {
        Throwable th;
        if (getAndIncrement() == 0) {
            boolean z = this.n;
            awig awigVar = this.f;
            int iAddAndGet = 1;
            if (z) {
                axsp axspVar = this.b;
                while (!this.h.get()) {
                    boolean z2 = this.l;
                    if (z2 && (th = this.k) != null) {
                        awigVar.c();
                        axspVar.b(th);
                        return;
                    }
                    axspVar.kk(null);
                    if (z2) {
                        Throwable th2 = this.k;
                        if (th2 != null) {
                            axspVar.b(th2);
                            return;
                        } else {
                            axspVar.kn();
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                awigVar.c();
                return;
            }
            axsp axspVar2 = this.b;
            int iAddAndGet2 = 1;
            do {
                AtomicLong atomicLong = this.i;
                long j = atomicLong.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z3 = this.l;
                    avnc avncVar = (avnc) awigVar.km();
                    boolean z4 = avncVar == null;
                    if (!f(z3, z4, axspVar2, awigVar)) {
                        if (z4) {
                            break;
                        }
                        axspVar2.kk(avncVar);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (j2 == j && f(this.l, awigVar.i(), axspVar2, awigVar)) {
                    return;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        atomicLong.addAndGet(-j2);
                    }
                    this.g.ko(j2);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.g, axsqVar)) {
            this.g = axsqVar;
            this.b.e(this);
            axsqVar.ko(this.d);
        }
    }

    final boolean f(boolean z, boolean z2, axsp axspVar, awig awigVar) {
        if (this.h.get()) {
            awigVar.c();
            return true;
        }
        if (z) {
            Throwable th = this.k;
            if (th != null) {
                awigVar.c();
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
        return this.f.i();
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.h.compareAndSet(false, true) && this.j.decrementAndGet() == 0) {
            this.g.kj();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        boolean z;
        if (this.m) {
            return;
        }
        awig awigVar = this.f;
        try {
            Object objA = this.c.a(obj);
            Object obj2 = objA != null ? objA : a;
            Map map = this.e;
            avnc avncVar = (avnc) map.get(obj2);
            if (avncVar != null) {
                z = false;
            } else {
                if (this.h.get()) {
                    return;
                }
                int i = this.d;
                int i2 = avnc.c;
                avncVar = new avnc(new avuj(i, this, objA));
                map.put(obj2, avncVar);
                this.j.getAndIncrement();
                z = true;
            }
            try {
                obj.getClass();
                avuj avujVar = avncVar.b;
                avujVar.b.j(obj);
                avujVar.d();
                if (z) {
                    awigVar.j(avncVar);
                    d();
                }
            } catch (Throwable th) {
                avkz.a(th);
                this.g.kj();
                b(th);
            }
        } catch (Throwable th2) {
            avkz.a(th2);
            this.g.kj();
            b(th2);
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.n = true;
        return 2;
    }

    @Override // defpackage.avot
    public final /* bridge */ /* synthetic */ Object km() {
        return (avnc) this.f.km();
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.m) {
            return;
        }
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            avuj avujVar = ((avnc) it.next()).b;
            avujVar.e = true;
            avujVar.d();
        }
        map.clear();
        this.m = true;
        this.l = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.i, j);
            d();
        }
    }
}
