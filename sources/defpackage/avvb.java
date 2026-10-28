package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class avvb extends awju implements Runnable, avlk {
    private static final long serialVersionUID = -8241002408341274697L;
    final avma a;
    final int b;
    final int c;
    final AtomicLong d = new AtomicLong();
    axsq e;
    avot f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    int j;
    long k;
    boolean l;

    public avvb(avma avmaVar, int i) {
        this.a = avmaVar;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
            return;
        }
        this.i = th;
        this.h = true;
        h();
    }

    @Override // defpackage.avot
    public final void c() {
        this.f.c();
    }

    public abstract void d();

    public abstract void f();

    public abstract void g();

    final void h() {
        if (getAndIncrement() == 0) {
            this.a.a(this);
        }
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.f.i();
    }

    final boolean k(boolean z, boolean z2, axsp axspVar) {
        if (this.g) {
            c();
            return true;
        }
        if (z) {
            Throwable th = this.i;
            if (th != null) {
                this.g = true;
                c();
                axspVar.b(th);
                this.a.dispose();
                return true;
            }
            if (z2) {
                this.g = true;
                axspVar.kn();
                this.a.dispose();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.kj();
        this.a.dispose();
        if (getAndIncrement() == 0) {
            this.f.c();
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.h) {
            return;
        }
        if (this.j == 2) {
            h();
            return;
        }
        if (!this.f.j(obj)) {
            this.e.kj();
            this.i = new avmx("Queue is full?!");
            this.h = true;
        }
        h();
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.l = true;
        return 2;
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        h();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.d, j);
            h();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.l) {
            f();
        } else if (this.j == 1) {
            g();
        } else {
            d();
        }
    }
}
