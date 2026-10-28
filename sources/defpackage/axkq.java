package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axkq implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ axkr c;

    public axkq(axkr axkrVar, long j, int i) {
        this.a = j;
        this.b = i;
        this.c = axkrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.mObserver.onNetworkConnect(this.a, this.b);
    }
}
