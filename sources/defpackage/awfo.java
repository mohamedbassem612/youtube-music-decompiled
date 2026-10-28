package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awfo extends AtomicReference implements Runnable, avmn {
    private static final long serialVersionUID = -2809475196591179431L;
    final avlw a;

    public awfo(avlw avlwVar) {
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
        if (f()) {
            return;
        }
        avlw avlwVar = this.a;
        avlwVar.kk(0L);
        lazySet(avns.a);
        avlwVar.kn();
    }
}
