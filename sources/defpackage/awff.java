package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awff extends AtomicInteger implements avlw, avmn {
    private static final long serialVersionUID = 1418547743690811973L;
    final avlw a;
    final AtomicReference b = new AtomicReference();
    final awfe c = new awfe(this);
    final awkd d = new awkd();

    public awff(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        avnr.b(this.c);
        atqp.w(this.a, th, this, this.d);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this.b, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this.b);
        avnr.b(this.c);
    }

    final void e() {
        avnr.b(this.b);
        atqp.u(this.a, this, this.d);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) this.b.get());
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            avlw avlwVar = this.a;
            avlwVar.kk(obj);
            if (decrementAndGet() != 0) {
                Throwable thD = awkh.d(this.d);
                if (thD != null) {
                    avlwVar.b(thD);
                } else {
                    avlwVar.kn();
                }
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        avnr.b(this.c);
        atqp.u(this.a, this, this.d);
    }
}
