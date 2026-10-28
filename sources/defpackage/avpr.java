package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpr extends AtomicReference implements avmn {
    private static final long serialVersionUID = -2467358622224974244L;
    final avlc a;

    public avpr(avlc avlcVar) {
        this.a = avlcVar;
    }

    public final void a() {
        avmn avmnVar;
        Object obj = get();
        avnr avnrVar = avnr.DISPOSED;
        if (obj == avnrVar || (avmnVar = (avmn) getAndSet(avnrVar)) == avnrVar) {
            return;
        }
        try {
            this.a.kn();
        } finally {
            if (avmnVar != null) {
                avmnVar.dispose();
            }
        }
    }

    public final void b(Throwable th) {
        if (d(th)) {
            return;
        }
        atqp.n(th);
    }

    public final void c(avnh avnhVar) {
        avnr.i(this, new avnp(avnhVar));
    }

    public final boolean d(Throwable th) {
        avmn avmnVar;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj = get();
        avnr avnrVar = avnr.DISPOSED;
        if (obj == avnrVar || (avmnVar = (avmn) getAndSet(avnrVar)) == avnrVar) {
            return false;
        }
        try {
            this.a.b(th);
            return true;
        } finally {
            if (avmnVar != null) {
                avmnVar.dispose();
            }
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return ((avmn) get()) == avnr.DISPOSED;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
