package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class avse extends AtomicLong implements avli, axsq {
    private static final long serialVersionUID = 7326289992464377023L;
    final axsp a;
    final avnv b = new avnv();

    public avse(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.avlg
    public final void a() {
        throw null;
    }

    @Override // defpackage.avlg
    public final void b(Throwable th) {
        if (k(th)) {
            return;
        }
        atqp.n(th);
    }

    @Override // defpackage.avli
    public final void d(avnh avnhVar) {
        avnr.i(this.b, new avnp(avnhVar));
    }

    protected final void f() {
        if (j()) {
            return;
        }
        try {
            this.a.kn();
        } finally {
            avnr.b(this.b);
        }
    }

    protected final boolean i(Throwable th) {
        if (j()) {
            return false;
        }
        try {
            this.a.b(th);
            return true;
        } finally {
            avnr.b(this.b);
        }
    }

    public final boolean j() {
        return this.b.f();
    }

    public boolean k(Throwable th) {
        return i(th);
    }

    @Override // defpackage.axsq
    public final void kj() {
        avnr.b(this.b);
        h();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this, j);
            g();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }

    public void g() {
    }

    public void h() {
    }
}
