package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aweb extends AtomicBoolean implements avlw, avmn {
    private static final long serialVersionUID = -7419642935409022375L;
    final avlw a;
    final awec b;
    final awea c;
    avmn d;

    public aweb(avlw avlwVar, awec awecVar, awea aweaVar) {
        this.a = avlwVar;
        this.b = awecVar;
        this.c = aweaVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        if (!compareAndSet(false, true)) {
            atqp.n(th);
        } else {
            this.b.b(this.c);
            this.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.e(this.d, avmnVar)) {
            this.d = avmnVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.d.dispose();
        if (compareAndSet(false, true)) {
            awec awecVar = this.b;
            awea aweaVar = this.c;
            synchronized (awecVar) {
                awea aweaVar2 = awecVar.b;
                if (aweaVar2 != null && aweaVar2 == aweaVar) {
                    long j = aweaVar.c - 1;
                    aweaVar.c = j;
                    if (j == 0 && aweaVar.d) {
                        awecVar.c(aweaVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.kn();
        }
    }
}
