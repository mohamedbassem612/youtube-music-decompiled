package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qck {
    private static final qck b;
    private static volatile boolean c;
    private static volatile qck d;
    public final qcl a;

    static {
        qck qckVar = new qck(new qcj());
        b = qckVar;
        c = true;
        d = qckVar;
    }

    public qck(qcl qclVar) {
        qclVar.getClass();
        this.a = qclVar;
    }

    public static qck a() {
        if (d == b && c) {
            c = false;
            ((agrc) ((agrc) ((agrc) qcq.a.c()).l(Math.random() < 0.01d ? agsi.FULL : agsi.NONE)).k("com/google/android/libraries/performance/primes/Primes", "get", 179, "Primes.java")).t("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    public static synchronized void b(qck qckVar) {
        if (d == b) {
            d = qckVar;
        }
    }

    public final void c(qhy qhyVar) {
        this.a.b(qhyVar);
    }
}
