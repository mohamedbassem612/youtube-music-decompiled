package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lta {
    private static lsz a;

    public static synchronized lsz a() {
        if (a == null) {
            b(new ltd());
        }
        return a;
    }

    public static synchronized void b(lsz lszVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = lszVar;
    }
}
