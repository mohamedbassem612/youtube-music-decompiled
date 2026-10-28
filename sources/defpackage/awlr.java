package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awlr extends AtomicInteger implements avmn {
    private static final long serialVersionUID = 466549804534799122L;
    final avlw a;
    final awlu b;
    Object c;
    volatile boolean d;

    public awlr(avlw avlwVar, awlu awluVar) {
        this.a = avlwVar;
        this.b = awluVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.aw(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d;
    }
}
