package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avtd extends awjw implements avlk {
    private static final long serialVersionUID = 4066607327284737757L;
    final Object a;
    final boolean b;
    axsq c;
    long d;
    boolean e;

    public avtd(axsp axspVar, Object obj, boolean z) {
        super(axspVar);
        this.a = obj;
        this.b = z;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.e) {
            atqp.n(th);
        } else {
            this.e = true;
            this.f.b(th);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            this.c = axsqVar;
            this.f.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.awjw, defpackage.axsq
    public final void kj() {
        super.kj();
        this.c.kj();
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
        f(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.a;
        if (obj != null) {
            f(obj);
            return;
        }
        boolean z = this.b;
        axsp axspVar = this.f;
        if (z) {
            axspVar.b(new NoSuchElementException());
        } else {
            axspVar.kn();
        }
    }
}
