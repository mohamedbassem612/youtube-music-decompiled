package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbp {
    public static final adbp a;
    public static final adbp b;
    private static final /* synthetic */ adbp[] c;

    static {
        adbp adbpVar = new adbp("INACTIVE", 0);
        a = adbpVar;
        adbp adbpVar2 = new adbp("ACTIVE", 1);
        b = adbpVar2;
        c = new adbp[]{adbpVar, adbpVar2};
    }

    public static adbp[] values() {
        return (adbp[]) c.clone();
    }
}
