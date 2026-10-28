package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avqy extends AtomicReference implements Runnable, avmn {
    private static final long serialVersionUID = 3167244060586201109L;
    final avlc a;

    public avqy(avlc avlcVar) {
        this.a = avlcVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.kn();
    }
}
