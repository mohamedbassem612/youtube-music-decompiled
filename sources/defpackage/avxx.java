package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxx extends AtomicReference implements avlk {
    private static final long serialVersionUID = 3256684027868224024L;
    final avxw a;
    final int b;
    boolean c;

    public avxx(avxw avxwVar, int i) {
        this.a = avxwVar;
        this.b = i;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        avxw avxwVar = this.a;
        avxwVar.h = true;
        awka.f(avxwVar.e);
        avxwVar.f(this.b);
        atqp.x(avxwVar.a, th, avxwVar, avxwVar.g);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.k(this, axsqVar, Long.MAX_VALUE);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (!this.c) {
            this.c = true;
        }
        avxw avxwVar = this.a;
        avxwVar.d.set(this.b, obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.c) {
            return;
        }
        int i = this.b;
        avxw avxwVar = this.a;
        avxwVar.h = true;
        awka.f(avxwVar.e);
        avxwVar.f(i);
        atqp.v(avxwVar.a, avxwVar, avxwVar.g);
    }
}
