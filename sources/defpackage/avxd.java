package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxd extends AtomicReference implements avlk {
    private static final long serialVersionUID = -3592821756711087922L;
    final /* synthetic */ avxe a;

    public avxd(avxe avxeVar) {
        this.a = avxeVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        avxe avxeVar = this.a;
        awka.f(avxeVar.c);
        atqp.x(avxeVar.a, th, avxeVar, avxeVar.d);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        awka.k(this, axsqVar, Long.MAX_VALUE);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        awka.f(this);
        kn();
    }

    @Override // defpackage.axsp
    public final void kn() {
        avxe avxeVar = this.a;
        awka.f(avxeVar.c);
        atqp.v(avxeVar.a, avxeVar, avxeVar.d);
    }
}
