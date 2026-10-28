package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 {
    public static final p0 GROUP_EXECUTE;
    public static final p0 GROUP_READ;
    public static final p0 GROUP_WRITE;
    public static final p0 OTHERS_EXECUTE;
    public static final p0 OTHERS_READ;
    public static final p0 OTHERS_WRITE;
    public static final p0 OWNER_EXECUTE;
    public static final p0 OWNER_READ;
    public static final p0 OWNER_WRITE;
    public static final /* synthetic */ p0[] a;

    static {
        p0 p0Var = new p0("OWNER_READ", 0);
        OWNER_READ = p0Var;
        p0 p0Var2 = new p0("OWNER_WRITE", 1);
        OWNER_WRITE = p0Var2;
        p0 p0Var3 = new p0("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = p0Var3;
        p0 p0Var4 = new p0("GROUP_READ", 3);
        GROUP_READ = p0Var4;
        p0 p0Var5 = new p0("GROUP_WRITE", 4);
        GROUP_WRITE = p0Var5;
        p0 p0Var6 = new p0("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = p0Var6;
        p0 p0Var7 = new p0("OTHERS_READ", 6);
        OTHERS_READ = p0Var7;
        p0 p0Var8 = new p0("OTHERS_WRITE", 7);
        OTHERS_WRITE = p0Var8;
        p0 p0Var9 = new p0("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = p0Var9;
        a = new p0[]{p0Var, p0Var2, p0Var3, p0Var4, p0Var5, p0Var6, p0Var7, p0Var8, p0Var9};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) a.clone();
    }
}
