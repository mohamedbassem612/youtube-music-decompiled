package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avqi extends AtomicInteger implements avlk, avmn {
    private static final long serialVersionUID = -2108443387387077490L;
    final avlc a;
    axsq f;
    final int b = Alert.DURATION_SHOW_INDEFINITELY;
    final boolean c = true;
    final avmm e = new avmm();
    final awkd d = new awkd();

    public avqi(avlc avlcVar) {
        this.a = avlcVar;
        lazySet(1);
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            awkd awkdVar = this.d;
            if (!awkh.e(awkdVar, th)) {
                atqp.n(th);
                return;
            } else {
                if (decrementAndGet() == 0) {
                    this.a.b(awkh.d(awkdVar));
                    return;
                }
                return;
            }
        }
        this.e.dispose();
        awkd awkdVar2 = this.d;
        if (!awkh.e(awkdVar2, th)) {
            atqp.n(th);
        } else if (getAndSet(0) > 0) {
            this.a.b(awkh.d(awkdVar2));
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.f.kj();
        this.e.dispose();
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.f, axsqVar)) {
            this.f = axsqVar;
            this.a.d(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                axsqVar.ko(Long.MAX_VALUE);
            } else {
                axsqVar.ko(i);
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.e.b;
    }

    @Override // defpackage.axsp
    public final /* bridge */ /* synthetic */ void kk(Object obj) {
        getAndIncrement();
        avqh avqhVar = new avqh(this);
        this.e.c(avqhVar);
        ((avle) obj).kp(avqhVar);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (decrementAndGet() == 0) {
            awkd awkdVar = this.d;
            Throwable th = (Throwable) awkdVar.get();
            avlc avlcVar = this.a;
            if (th != null) {
                avlcVar.b(awkh.d(awkdVar));
            } else {
                avlcVar.kn();
            }
        }
    }
}
