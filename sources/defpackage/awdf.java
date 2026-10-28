package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awdf extends AtomicReference implements Runnable, avmn {
    private static final long serialVersionUID = 346773832286157679L;
    final avlw a;
    long b;

    public awdf(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == avnr.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != avnr.DISPOSED) {
            avlw avlwVar = this.a;
            long j = this.b;
            this.b = 1 + j;
            avlwVar.kk(Long.valueOf(j));
        }
    }
}
