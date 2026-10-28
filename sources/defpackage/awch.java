package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awch extends AtomicReference implements avlw {
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final awci b;
    volatile boolean c;
    volatile avot d;
    int e;

    public awch(awci awciVar, long j) {
        this.a = j;
        this.b = awciVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awci awciVar = this.b;
        if (!awkh.e(awciVar.j, th)) {
            atqp.n(th);
            return;
        }
        if (!awciVar.e) {
            awciVar.k();
        }
        this.c = true;
        awciVar.e();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar) && (avmnVar instanceof avoo)) {
            avoo avooVar = (avoo) avmnVar;
            int iKl = avooVar.kl(7);
            if (iKl == 1) {
                this.e = 1;
                this.d = avooVar;
                this.c = true;
                this.b.e();
                return;
            }
            if (iKl == 2) {
                this.e = 2;
                this.d = avooVar;
            }
        }
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        int i = this.e;
        awci awciVar = this.b;
        if (i != 0) {
            awciVar.e();
            return;
        }
        if (awciVar.get() == 0 && awciVar.compareAndSet(0, 1)) {
            awciVar.c.kk(obj);
            if (awciVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            avot avotVar = this.d;
            if (avotVar == null) {
                awig awigVar = new awig(awciVar.g);
                this.d = awigVar;
                avotVar = awigVar;
            }
            avotVar.j(obj);
            if (awciVar.getAndIncrement() != 0) {
                return;
            }
        }
        awciVar.g();
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.c = true;
        this.b.e();
    }
}
