package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpd extends AtomicReference implements avlc, avmn {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        lazySet(avnr.DISPOSED);
        atqp.n(new avmy(th));
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == avnr.DISPOSED;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        lazySet(avnr.DISPOSED);
    }
}
