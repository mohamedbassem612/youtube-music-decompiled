package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvc {
    public static volatile fvd a;

    private fvc() {
    }

    public static fvd a() {
        if (a == null) {
            synchronized (fvc.class) {
                if (a == null) {
                    a = new fvb();
                }
            }
        }
        return a;
    }
}
