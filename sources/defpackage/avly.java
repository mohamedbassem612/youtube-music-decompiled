package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avly implements Runnable, avmn {
    final Runnable a;
    final avma b;
    volatile boolean c;

    public avly(Runnable runnable, avma avmaVar) {
        this.a = runnable;
        this.b = avmaVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c = true;
        this.b.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            avkz.a(th);
            this.b.dispose();
            throw awkh.b(th);
        }
    }
}
