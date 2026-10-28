package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class t4 {
    public static final t4 MAYBE_MORE;
    public static final t4 NO_MORE;
    public static final t4 UNLIMITED;
    public static final /* synthetic */ t4[] a;

    static {
        t4 t4Var = new t4("NO_MORE", 0);
        NO_MORE = t4Var;
        t4 t4Var2 = new t4("MAYBE_MORE", 1);
        MAYBE_MORE = t4Var2;
        t4 t4Var3 = new t4("UNLIMITED", 2);
        UNLIMITED = t4Var3;
        a = new t4[]{t4Var, t4Var2, t4Var3};
    }

    public static t4 valueOf(String str) {
        return (t4) Enum.valueOf(t4.class, str);
    }

    public static t4[] values() {
        return (t4[]) a.clone();
    }
}
