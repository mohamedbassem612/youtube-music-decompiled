package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awlw extends AtomicReference implements avmn {
    private static final long serialVersionUID = -7650903191002190468L;
    final avmd a;

    public awlw(avmd avmdVar, awlx awlxVar) {
        this.a = avmdVar;
        lazySet(awlxVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        awlx awlxVar = (awlx) getAndSet(null);
        if (awlxVar != null) {
            awlxVar.I(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }
}
