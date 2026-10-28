package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axcn {
    public static final boolean a;

    static {
        boolean z;
        String property = System.getProperty("kotlinx.coroutines.google.stacktrace.recovery");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        } else {
            z = System.getenv("TEST_SRCDIR") != null;
        }
        a = z;
    }
}
