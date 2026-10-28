package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avnv extends AtomicReference implements avmn {
    private static final long serialVersionUID = -754898800686245608L;

    public avnv(avmn avmnVar) {
        lazySet(avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return ((avmn) get()) == avnr.DISPOSED;
    }
}
