package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avya extends AtomicReference implements avmn {
    private static final long serialVersionUID = -5791853038359966195L;
    final avln a;

    public avya(avln avlnVar, avyb avybVar) {
        super(avybVar);
        this.a = avlnVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avyb avybVar = (avyb) getAndSet(null);
        if (avybVar != null) {
            avybVar.I(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get() == null;
    }
}
