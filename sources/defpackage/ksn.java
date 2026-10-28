package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ksn {
    private static lqd a;

    public static synchronized void a() {
        if (a == null) {
            b(new lqd(null));
        }
    }

    public static synchronized void b(lqd lqdVar) {
        ahno.P(a == null, "Redundantly setting SignatureVerificationConfiguration");
        a = lqdVar;
    }
}
