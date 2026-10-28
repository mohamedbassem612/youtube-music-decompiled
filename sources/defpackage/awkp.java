package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class awkp implements avlc, avmn {
    final AtomicReference b = new AtomicReference();

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        atqp.A(this.b, avmnVar, getClass());
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this.b);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.get() == avnr.DISPOSED;
    }
}
