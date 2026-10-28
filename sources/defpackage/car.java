package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class car extends Thread {
    final /* synthetic */ cas a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public car(cas casVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = casVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.j());
    }
}
