package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awef extends AtomicInteger implements avmn {
    private static final long serialVersionUID = 2728361546769921047L;
    final awei a;
    final avlw b;
    Object c;
    volatile boolean d;

    public awef(awei aweiVar, avlw avlwVar) {
        this.a = aweiVar;
        this.b = avlwVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.e(this);
        this.c = null;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d;
    }
}
