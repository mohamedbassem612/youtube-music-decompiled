package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afke implements Runnable {
    private final Runnable a;
    private boolean b = false;

    public afke(Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        qpj.c();
        this.b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qpj.c();
        if (this.b) {
            return;
        }
        this.a.run();
    }
}
