package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlj extends AtomicReference implements avmn {
    private static final long serialVersionUID = -7650903191002190468L;
    final avlc a;

    public awlj(avlc avlcVar, awlk awlkVar) {
        this.a = avlcVar;
        lazySet(awlkVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        awlk awlkVar = (awlk) getAndSet(null);
        if (awlkVar != null) {
            awlkVar.J(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }
}
