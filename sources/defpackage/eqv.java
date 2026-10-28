package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eqv {
    public static final /* synthetic */ int a = 0;
    private boolean b;

    static {
        String str = eqw.a;
    }

    public final synchronized void a() {
        this.b = true;
        throw null;
    }

    protected final void finalize() {
        if (this.b) {
            return;
        }
        a();
        eqw.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
