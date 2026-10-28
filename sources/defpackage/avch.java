package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avch implements Runnable {
    final /* synthetic */ avci a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ avcj c;

    public avch(avcj avcjVar, avci avciVar, Runnable runnable) {
        this.a = avciVar;
        this.b = runnable;
        this.c = avcjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
