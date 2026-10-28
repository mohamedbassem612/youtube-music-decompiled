package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zkf {
    public static boolean a = true;

    public static void a(boolean z) {
        if (a && !z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (a && !z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void c(boolean z) {
        if (a && !z) {
            throw new IllegalStateException();
        }
    }

    public static void d(Object obj) {
        if (a) {
            obj.getClass();
        }
    }
}
