package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agvl {
    private static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final agvo b;

    static {
        agvo agvqVar;
        for (int i = 0; i < 2; i++) {
            agvqVar = null;
            try {
                agvqVar = (agvo) Class.forName(a[i]).asSubclass(agvo.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (agvqVar != null) {
                b = agvqVar;
            }
        }
        agvqVar = new agvq();
        b = agvqVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        cls.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bR(i, "skip count cannot be negative: "));
        }
        return b.a(cls, i + 1);
    }

    public static StackTraceElement[] b(Class cls, int i, int i2) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("invalid maximum depth: 0");
        }
        return b.b(cls, i, i2 + 1);
    }
}
