package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awdx extends AtomicReference implements avmn {
    private static final long serialVersionUID = 7463222674719692880L;
    final avlw a;

    public awdx(avlw avlwVar, awdy awdyVar) {
        this.a = avlwVar;
        lazySet(awdyVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        awdy awdyVar = (awdy) getAndSet(null);
        if (awdyVar != null) {
            awdyVar.e(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }
}
