package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwy extends AtomicReference implements avlk {
    private static final long serialVersionUID = 3837284832786408377L;
    final avwz a;
    final long b;
    final int c;
    volatile avot d;
    volatile boolean e;
    int f;

    public avwy(avwz avwzVar, long j, int i) {
        this.a = avwzVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        long j = this.b;
        avwz avwzVar = this.a;
        if (j != avwzVar.l || !awkh.e(avwzVar.g, th)) {
            atqp.n(th);
            return;
        }
        boolean z = avwzVar.e;
        avwzVar.i.kj();
        avwzVar.f = true;
        this.e = true;
        avwzVar.f();
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this, axsqVar)) {
            if (axsqVar instanceof avoq) {
                avoq avoqVar = (avoq) axsqVar;
                int iKl = avoqVar.kl(7);
                if (iKl == 1) {
                    this.f = 1;
                    this.d = avoqVar;
                    this.e = true;
                    this.a.f();
                    return;
                }
                if (iKl == 2) {
                    this.f = 2;
                    this.d = avoqVar;
                    axsqVar.ko(this.c);
                    return;
                }
            }
            int i = this.c;
            this.d = new awif(i);
            axsqVar.ko(i);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        avwz avwzVar = this.a;
        if (this.b == avwzVar.l) {
            if (this.f != 0 || this.d.j(obj)) {
                avwzVar.f();
            } else {
                b(new avmx("Queue full?!"));
            }
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        avwz avwzVar = this.a;
        if (this.b == avwzVar.l) {
            this.e = true;
            avwzVar.f();
        }
    }
}
