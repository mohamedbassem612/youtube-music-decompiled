package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avyd extends AtomicReference implements avmn {
    private static final long serialVersionUID = -2467358622224974244L;
    final avln a;

    public avyd(avln avlnVar) {
        this.a = avlnVar;
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
        avmn avmnVar;
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        Object obj = get();
        avnr avnrVar = avnr.DISPOSED;
        if (obj == avnrVar || (avmnVar = (avmn) getAndSet(avnrVar)) == avnrVar) {
            atqp.n(th);
            return;
        }
        try {
            this.a.b(nullPointerException);
        } finally {
            if (avmnVar != null) {
                avmnVar.dispose();
            }
        }
    }

    public final void c(Object obj) {
        avmn avmnVar;
        Object obj2 = get();
        avnr avnrVar = avnr.DISPOSED;
        if (obj2 == avnrVar || (avmnVar = (avmn) getAndSet(avnrVar)) == avnrVar) {
            return;
        }
        try {
            avln avlnVar = this.a;
            if (obj == null) {
                avlnVar.b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                avlnVar.ki(obj);
            }
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
