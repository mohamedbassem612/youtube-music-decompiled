package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class syg implements Runnable {
    public sxu a;
    public Object b;
    public Object c;
    public Exception d;
    public boolean e;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.e;
        sxu sxuVar = this.a;
        if (z) {
            sxuVar.b(this.b, this.c);
        } else {
            sxuVar.iT(this.b, this.d);
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        agrf agrfVar = syh.a;
        try {
            syh.b.put(this);
        } catch (InterruptedException e) {
            ((agrc) ((agrc) ((agrc) syh.a.c()).j(e)).k("com/google/android/libraries/youtube/common/async/ThreadingCallback", "releaseRunnable", 'C', "ThreadingCallback.java")).t("Interrupted when releasing runnable to the queue");
        }
    }
}
