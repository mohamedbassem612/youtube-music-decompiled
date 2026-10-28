package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awgb extends AtomicReference implements avlk {
    private static final long serialVersionUID = 8410034718427740355L;
    final awgc a;
    final int b;
    final int c;
    long d;
    volatile avos e;

    public awgb(awgc awgcVar, int i) {
        this.a = awgcVar;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        this.a.f(th);
    }

    final avos d() {
        avos avosVar = this.e;
        if (avosVar != null) {
            return avosVar;
        }
        awif awifVar = new awif(this.b);
        this.e = awifVar;
        return awifVar;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.k(this, axsqVar, this.b);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.a.g(this, obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.a.d();
    }
}
