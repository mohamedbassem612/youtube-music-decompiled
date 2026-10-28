package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahfe implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Runnable a;

    public ahfe(Runnable runnable, int i) {
        this.$cid = i;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            this.a.run();
            return;
        }
        Runnable runnable = this.a;
        if (i != 1) {
            runnable.run();
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.toString();
        }
        Runnable runnable = this.a;
        return i != 1 ? runnable.toString() : runnable.toString();
    }
}
