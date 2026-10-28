package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class y3 {
    public static final y3 OP;
    public static final y3 SPLITERATOR;
    public static final y3 STREAM;
    public static final y3 TERMINAL_OP;
    public static final y3 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ y3[] a;

    static {
        y3 y3Var = new y3("SPLITERATOR", 0);
        SPLITERATOR = y3Var;
        y3 y3Var2 = new y3("STREAM", 1);
        STREAM = y3Var2;
        y3 y3Var3 = new y3("OP", 2);
        OP = y3Var3;
        y3 y3Var4 = new y3("TERMINAL_OP", 3);
        TERMINAL_OP = y3Var4;
        y3 y3Var5 = new y3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = y3Var5;
        a = new y3[]{y3Var, y3Var2, y3Var3, y3Var4, y3Var5};
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) a.clone();
    }
}
