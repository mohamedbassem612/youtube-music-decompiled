package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avlx implements Runnable, avmn {
    final Runnable a;
    final avma b;
    Thread c;

    public avlx(Runnable runnable, avma avmaVar) {
        this.a = runnable;
        this.b = avmaVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            avma avmaVar = this.b;
            if (avmaVar instanceof awiy) {
                awiy awiyVar = (awiy) avmaVar;
                if (awiyVar.c) {
                    return;
                }
                awiyVar.c = true;
                awiyVar.b.shutdown();
                return;
            }
        }
        this.b.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.f();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            dispose();
            this.c = null;
        }
    }
}
