package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awip implements Runnable {
    final /* synthetic */ awiq a;
    private final avnv b;
    private final Runnable c;

    public awip(awiq awiqVar, avnv avnvVar, Runnable runnable) {
        this.a = awiqVar;
        this.b = avnvVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        avnr.g(this.b, this.a.a(this.c));
    }
}
