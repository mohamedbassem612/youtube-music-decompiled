package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfj extends AtomicReference implements Runnable, avlw, avmn {
    private static final long serialVersionUID = 786994795061867455L;
    final avlw a;
    final long b;
    final TimeUnit c;
    final avma d;
    avmn e;
    volatile boolean f;
    boolean g;

    public awfj(avlw avlwVar, long j, TimeUnit timeUnit, avma avmaVar) {
        this.a = avlwVar;
        this.b = j;
        this.c = timeUnit;
        this.d = avmaVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (this.g) {
            atqp.n(th);
            return;
        }
        this.g = true;
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
        if (this.f || this.g) {
            return;
        }
        this.f = true;
        this.a.kk(obj);
        avmn avmnVar = (avmn) get();
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        avnr.g(this, this.d.b(this, this.b, this.c));
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.kn();
        this.d.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f = false;
    }
}
