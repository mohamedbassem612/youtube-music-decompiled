package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awaj extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = -9140123220065488293L;
    final axsp a;
    final avnn b;
    axsq h;
    volatile boolean i;
    volatile boolean j;
    long k;
    int l;
    Object m;
    volatile int n;
    final int c = 2;
    final int o = 1;
    final AtomicLong d = new AtomicLong();
    final awkd e = new awkd();
    final awai f = new awai(this);
    final avos g = new awif(2);

    public awaj(axsp axspVar, avnn avnnVar) {
        this.a = axspVar;
        this.b = avnnVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (!awkh.e(this.e, th)) {
            atqp.n(th);
            return;
        }
        if (this.o == 1) {
            avnr.b(this.f);
        }
        this.i = true;
        d();
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [avmf, java.lang.Object] */
    final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        axsp axspVar = this.a;
        int i = this.o;
        avos avosVar = this.g;
        awkd awkdVar = this.e;
        AtomicLong atomicLong = this.d;
        int i2 = this.c;
        int iAddAndGet = 1;
        while (true) {
            if (this.j) {
                avosVar.c();
                this.m = null;
            } else {
                int i3 = this.n;
                if (awkdVar.get() != null && i == 1) {
                    avosVar.c();
                    this.m = null;
                    axspVar.b(awkh.d(awkdVar));
                    return;
                }
                if (i3 == 0) {
                    boolean z = this.i;
                    Object objKm = avosVar.km();
                    if (z) {
                        if (objKm == null) {
                            Throwable thD = awkh.d(awkdVar);
                            if (thD == null) {
                                axspVar.kn();
                                return;
                            } else {
                                axspVar.b(thD);
                                return;
                            }
                        }
                    } else if (objKm != null) {
                    }
                    int i4 = i2 - (i2 >> 1);
                    int i5 = this.l + 1;
                    if (i5 == i4) {
                        this.l = 0;
                        this.h.ko(i4);
                    } else {
                        this.l = i5;
                    }
                    try {
                        ?? A = this.b.a(objKm);
                        this.n = 1;
                        A.F(this.f);
                    } catch (Throwable th) {
                        avkz.a(th);
                        this.h.kj();
                        avosVar.c();
                        awkh.e(awkdVar, th);
                        axspVar.b(awkh.d(awkdVar));
                        return;
                    }
                } else if (i3 == 2) {
                    long j = this.k;
                    if (j != atomicLong.get()) {
                        Object obj = this.m;
                        this.m = null;
                        axspVar.kk(obj);
                        this.k = j + 1;
                        this.n = 0;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.h, axsqVar)) {
            this.h = axsqVar;
            this.a.e(this);
            axsqVar.ko(this.c);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.j = true;
        this.h.kj();
        avnr.b(this.f);
        if (getAndIncrement() == 0) {
            this.g.c();
            this.m = null;
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.g.j(obj)) {
            d();
        } else {
            this.h.kj();
            b(new avmx("queue full?!"));
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.i = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        atqp.B(this.d, j);
        d();
    }
}
