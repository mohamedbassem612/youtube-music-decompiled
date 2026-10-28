package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aasm extends Thread {
    final /* synthetic */ aasn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aasm(aasn aasnVar, Runnable runnable) {
        super(runnable, "offlineTransfer");
        this.a = aasnVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long jB = this.a.b.b();
        try {
            super.run();
        } finally {
            ((agrc) ((agrc) aasn.a.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersRunner$1", "runTask", 50, "DefaultTransfersRunner.java")).v("[Offline] Transfer took %d ms", this.a.b.b() - jB);
        }
    }
}
