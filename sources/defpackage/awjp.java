package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awjp extends AtomicReference implements avlk, axsq, avmn {
    private static final long serialVersionUID = -7251123623727029452L;
    final avni a;
    final avni b;
    final avnd c;
    final avni d;

    public awjp(avni avniVar, avni avniVar2, avnd avndVar, avni avniVar3) {
        this.a = avniVar;
        this.b = avniVar2;
        this.c = avndVar;
        this.d = avniVar3;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        Object obj = get();
        awka awkaVar = awka.CANCELLED;
        if (obj == awkaVar) {
            atqp.n(th);
            return;
        }
        lazySet(awkaVar);
        try {
            this.b.a(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            atqp.n(new avmw(th, th2));
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        awka.f(this);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this, axsqVar)) {
            try {
                this.d.a(this);
            } catch (Throwable th) {
                avkz.a(th);
                axsqVar.kj();
                b(th);
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == awka.CANCELLED;
    }

    @Override // defpackage.axsq
    public final void kj() {
        awka.f(this);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (f()) {
            return;
        }
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            avkz.a(th);
            ((axsq) get()).kj();
            b(th);
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        Object obj = get();
        awka awkaVar = awka.CANCELLED;
        if (obj != awkaVar) {
            lazySet(awkaVar);
            try {
                this.c.a();
            } catch (Throwable th) {
                avkz.a(th);
                atqp.n(th);
            }
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        ((axsq) get()).ko(j);
    }
}
