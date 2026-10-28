package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twg {
    public static boolean a = false;

    public static IllegalStateException a(String str) {
        return new IllegalStateException("<NO_PII>".concat(str));
    }

    public static void b(Object obj, String str) {
        if (a && obj == null) {
            throw new IllegalArgumentException("<NO_PII>".concat(str));
        }
    }

    public static void c(boolean z, String str) {
        if (a && !z) {
            throw a(str);
        }
    }
}
