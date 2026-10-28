package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awdt extends AtomicReference implements avmn {
    private static final long serialVersionUID = -1100270633763673112L;
    final avlw a;

    public awdt(avlw avlwVar) {
        this.a = avlwVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((awdu) andSet).e(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == this;
    }
}
