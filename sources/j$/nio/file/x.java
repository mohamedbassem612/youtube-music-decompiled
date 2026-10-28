package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class x implements m {
    public static final x APPEND;
    public static final x CREATE;
    public static final x CREATE_NEW;
    public static final x DELETE_ON_CLOSE;
    public static final x DSYNC;
    public static final x READ;
    public static final x SPARSE;
    public static final x SYNC;
    public static final x TRUNCATE_EXISTING;
    public static final x WRITE;
    public static final /* synthetic */ x[] a;

    static {
        x xVar = new x("READ", 0);
        READ = xVar;
        x xVar2 = new x("WRITE", 1);
        WRITE = xVar2;
        x xVar3 = new x("APPEND", 2);
        APPEND = xVar3;
        x xVar4 = new x("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = xVar4;
        x xVar5 = new x("CREATE", 4);
        CREATE = xVar5;
        x xVar6 = new x("CREATE_NEW", 5);
        CREATE_NEW = xVar6;
        x xVar7 = new x("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = xVar7;
        x xVar8 = new x("SPARSE", 7);
        SPARSE = xVar8;
        x xVar9 = new x("SYNC", 8);
        SYNC = xVar9;
        x xVar10 = new x("DSYNC", 9);
        DSYNC = xVar10;
        a = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) a.clone();
    }
}
