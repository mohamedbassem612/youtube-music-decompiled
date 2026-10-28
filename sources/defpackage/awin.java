package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awin extends AtomicReference implements Runnable, avmn {
    private static final long serialVersionUID = -4101336210206799084L;
    final avnv a;
    final avnv b;

    public awin(Runnable runnable) {
        super(runnable);
        this.a = new avnv();
        this.b = new avnv();
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (getAndSet(null) != null) {
            avnr.b(this.a);
            avnr.b(this.b);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                avnv avnvVar = this.a;
                avnr avnrVar = avnr.DISPOSED;
                avnvVar.lazySet(avnrVar);
                this.b.lazySet(avnrVar);
            }
        }
    }
}
