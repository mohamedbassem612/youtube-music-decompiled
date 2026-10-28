package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awjb extends awih implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.lang.Runnable
    public final void run() {
        this.d = Thread.currentThread();
        try {
            this.c.run();
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            lazySet(a);
            atqp.n(th);
        }
    }
}
