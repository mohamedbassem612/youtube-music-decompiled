package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awbj extends AtomicReference implements avls, avmn {
    private static final long serialVersionUID = -3434801548987643227L;
    final avlw a;

    public awbj(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avlg
    public final void a() {
        if (f()) {
            return;
        }
        try {
            this.a.kn();
        } finally {
            avnr.b(this);
        }
    }

    @Override // defpackage.avlg
    public final void b(Throwable th) {
        if (g(th)) {
            return;
        }
        atqp.n(th);
    }

    @Override // defpackage.avlg
    public final void c(Object obj) {
        if (obj == null) {
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (f()) {
                return;
            }
            this.a.kk(obj);
        }
    }

    @Override // defpackage.avls
    public final void d(avnh avnhVar) {
        avnr.i(this, new avnp(avnhVar));
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avls
    public final void e(avmn avmnVar) {
        throw null;
    }

    @Override // defpackage.avls, defpackage.avmn
    public final boolean f() {
        return ((avmn) get()) == avnr.DISPOSED;
    }

    @Override // defpackage.avls
    public final boolean g(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (f()) {
            return false;
        }
        try {
            this.a.b(th);
            return true;
        } finally {
            avnr.b(this);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
