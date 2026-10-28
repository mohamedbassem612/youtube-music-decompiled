package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahfc extends ahcg implements Runnable {
    private final Runnable a;

    public ahfc(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.ahch
    protected final String jK() {
        return "task=[" + this.a.toString() + ']';
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }
}
