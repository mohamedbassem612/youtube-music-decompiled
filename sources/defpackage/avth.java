package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avth implements avlk, avmn {
    final avmd a;
    final Object b;
    axsq c;
    long d;
    boolean e;

    public avth(avmd avmdVar, Object obj) {
        this.a = avmdVar;
        this.b = obj;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.e) {
            atqp.n(th);
            return;
        }
        this.e = true;
        this.c = awka.CANCELLED;
        this.a.b(th);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c.kj();
        this.c = awka.CANCELLED;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            this.c = axsqVar;
            this.a.d(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c == awka.CANCELLED;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.kj();
        this.c = awka.CANCELLED;
        this.a.ki(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.c = awka.CANCELLED;
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.b;
        avmd avmdVar = this.a;
        if (obj != null) {
            avmdVar.ki(obj);
        } else {
            avmdVar.b(new NoSuchElementException());
        }
    }
}
