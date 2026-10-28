package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awjo extends AtomicReference implements avlk, axsq {
    private static final long serialVersionUID = 22876611072430776L;
    final int a;
    public final int b;
    public volatile avot c;
    public volatile boolean d;
    public long e;
    public int f;
    final avsc g;

    public awjo(avsc avscVar, int i) {
        this.g = avscVar;
        this.a = i;
        this.b = i - (i >> 2);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.g.i(this, th);
    }

    public final void d() {
        this.d = true;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this, axsqVar)) {
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(3);
                if (iKl == 1) {
                    this.f = 1;
                    this.c = avoqVar;
                    this.d = true;
                    this.g.h(this);
                    return;
                }
                if (iKl == 2) {
                    this.f = 2;
                    this.c = avoqVar;
                    atqp.q(axsqVar, this.a);
                    return;
                }
            }
            int i = this.a;
            this.c = atqp.p(i);
            atqp.q(axsqVar, i);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        awka.f(this);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        int i = this.f;
        avsc avscVar = this.g;
        if (i != 0) {
            avscVar.f();
        } else if (this.c.j(obj)) {
            avscVar.f();
        } else {
            awka.f(this);
            avscVar.i(this, new avmx());
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.g.h(this);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (this.f != 1) {
            long j2 = this.e + j;
            if (j2 < this.b) {
                this.e = j2;
            } else {
                this.e = 0L;
                ((axsq) get()).ko(j2);
            }
        }
    }
}
