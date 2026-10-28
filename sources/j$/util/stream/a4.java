package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a4 {
    public static final a4 DOUBLE_VALUE;
    public static final a4 INT_VALUE;
    public static final a4 LONG_VALUE;
    public static final a4 REFERENCE;
    public static final /* synthetic */ a4[] a;

    static {
        a4 a4Var = new a4("REFERENCE", 0);
        REFERENCE = a4Var;
        a4 a4Var2 = new a4("INT_VALUE", 1);
        INT_VALUE = a4Var2;
        a4 a4Var3 = new a4("LONG_VALUE", 2);
        LONG_VALUE = a4Var3;
        a4 a4Var4 = new a4("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = a4Var4;
        a = new a4[]{a4Var, a4Var2, a4Var3, a4Var4};
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) a.clone();
    }
}
