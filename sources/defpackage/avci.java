package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avci implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public avci(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
