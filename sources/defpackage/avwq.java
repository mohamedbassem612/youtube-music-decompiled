package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avwq implements avlk, avmn {
    final avmd a;
    axsq b;
    boolean c;
    Object d;

    public avwq(avmd avmdVar) {
        this.a = avmdVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            atqp.n(th);
            return;
        }
        this.c = true;
        this.b = awka.CANCELLED;
        this.a.b(th);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b.kj();
        this.b = awka.CANCELLED;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.b, axsqVar)) {
            this.b = axsqVar;
            this.a.d(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b == awka.CANCELLED;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.c) {
            return;
        }
        if (this.d == null) {
            this.d = obj;
            return;
        }
        this.c = true;
        this.b.kj();
        this.b = awka.CANCELLED;
        this.a.b(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b = awka.CANCELLED;
        Object obj = this.d;
        this.d = null;
        if (obj == null) {
            obj = null;
        }
        avmd avmdVar = this.a;
        if (obj != null) {
            avmdVar.ki(obj);
        } else {
            avmdVar.b(new NoSuchElementException());
        }
    }
}
