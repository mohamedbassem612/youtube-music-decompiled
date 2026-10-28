package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awll extends AtomicReference implements avmn {
    private static final long serialVersionUID = -7650903191002190468L;
    final avln a;

    public awll(avln avlnVar, awlm awlmVar) {
        this.a = avlnVar;
        lazySet(awlmVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        awlm awlmVar = (awlm) getAndSet(null);
        if (awlmVar != null) {
            awlmVar.I(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }
}
