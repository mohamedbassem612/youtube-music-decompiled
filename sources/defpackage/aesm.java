package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aesm extends Thread {
    final /* synthetic */ aesn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesm(aesn aesnVar) {
        super("ANRGuard-Thread");
        this.a = aesnVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.a(-999);
    }
}
