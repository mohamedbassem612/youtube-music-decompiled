package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bhp {
    public static final Class a = b("libcore.io.Memory");
    private static final boolean b;

    static {
        b = b("org.robolectric.Robolectric") != null;
    }

    static boolean a() {
        return (a == null || b) ? false : true;
    }

    private static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
