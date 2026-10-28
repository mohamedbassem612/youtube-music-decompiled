package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awbn implements avlw, avmn {
    final avlw a;
    final long b;
    final TimeUnit c;
    final avma d;
    avmn e;
    avmn f;
    volatile long g;
    boolean h;

    public awbn(avlw avlwVar, long j, TimeUnit timeUnit, avma avmaVar) {
        this.a = avlwVar;
        this.b = j;
        this.c = timeUnit;
        this.d = avmaVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
            return;
        }
        Object obj = this.f;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        this.h = true;
        this.a.b(th);
        this.d.dispose();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.e, avmnVar)) {
            this.e = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.h) {
            return;
        }
        long j = this.g + 1;
        this.g = j;
        Object obj2 = this.f;
        if (obj2 != null) {
            avnr.b((AtomicReference) obj2);
        }
        awbm awbmVar = new awbm(obj, j, this);
        this.f = awbmVar;
        avnr.g(awbmVar, this.d.b(awbmVar, this.b, this.c));
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.h) {
            return;
        }
        this.h = true;
        Object obj = this.f;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            ((awbm) obj).run();
        }
        this.a.kn();
        this.d.dispose();
    }
}
