package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abtf extends Thread {
    final /* synthetic */ abth a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abtf(abth abthVar) {
        super("playerProxyUnregister");
        this.a = abthVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        } finally {
            this.a.a.g(0);
        }
    }
}
