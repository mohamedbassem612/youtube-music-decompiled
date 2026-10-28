package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awln extends AtomicBoolean implements avmn {
    private static final long serialVersionUID = 3562861878281475070L;
    final avlw a;
    final awlo b;

    public awln(avlw avlwVar, awlo awloVar) {
        this.a = avlwVar;
        this.b = awloVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.au(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get();
    }
}
