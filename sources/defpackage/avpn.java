package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avpn extends AtomicInteger implements avlk, avmn {
    private static final long serialVersionUID = 9032184911934499404L;
    final avlc a;
    int f;
    int g;
    avot h;
    axsq i;
    volatile boolean j;
    volatile boolean k;
    final int b = 2;
    final avpm d = new avpm(this);
    final AtomicBoolean e = new AtomicBoolean();
    final int c = 2;

    public avpn(avlc avlcVar) {
        this.a = avlcVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (!this.e.compareAndSet(false, true)) {
            atqp.n(th);
        } else {
            avnr.b(this.d);
            this.a.b(th);
        }
    }

    final void d() {
        if (getAndIncrement() == 0) {
            while (!f()) {
                if (!this.k) {
                    boolean z = this.j;
                    try {
                        avle avleVar = (avle) this.h.km();
                        if (z) {
                            if (avleVar == null) {
                                if (this.e.compareAndSet(false, true)) {
                                    this.a.kn();
                                    return;
                                }
                                return;
                            }
                        } else if (avleVar != null) {
                        }
                        this.k = true;
                        avleVar.kp(this.d);
                        if (this.f != 1) {
                            int i = this.g + 1;
                            if (i == this.c) {
                                this.g = 0;
                                this.i.ko(i);
                            } else {
                                this.g = i;
                            }
                        }
                    } catch (Throwable th) {
                        avkz.a(th);
                        g(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.i.kj();
        avnr.b(this.d);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.i, axsqVar)) {
            this.i = axsqVar;
            int i = this.b;
            long j = i;
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(3);
                if (iKl == 1) {
                    this.f = 1;
                    this.h = avoqVar;
                    this.j = true;
                    this.a.d(this);
                    d();
                    return;
                }
                if (iKl == 2) {
                    this.f = 2;
                    this.h = avoqVar;
                    this.a.d(this);
                    axsqVar.ko(j);
                    return;
                }
            }
            this.h = new awif(i);
            this.a.d(this);
            axsqVar.ko(j);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) this.d.get());
    }

    final void g(Throwable th) {
        if (!this.e.compareAndSet(false, true)) {
            atqp.n(th);
        } else {
            this.i.kj();
            this.a.b(th);
        }
    }

    @Override // defpackage.axsp
    public final /* bridge */ /* synthetic */ void kk(Object obj) {
        avle avleVar = (avle) obj;
        if (this.f != 0 || this.h.j(avleVar)) {
            d();
        } else {
            b(new avmx());
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.j = true;
        d();
    }
}
