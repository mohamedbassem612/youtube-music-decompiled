package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcj {
    public static final mcj a;
    public static final mcj b;
    public static final mcj c;
    public static mcj d;
    private static final /* synthetic */ mcj[] e;

    static {
        mcj mcjVar = new mcj("LOG_ERROR", 0);
        a = mcjVar;
        mcj mcjVar2 = new mcj("REPORT_STRICT_MODE_VIOLATION", 1);
        b = mcjVar2;
        mcj mcjVar3 = new mcj("CRASH_APP", 2);
        c = mcjVar3;
        e = new mcj[]{mcjVar, mcjVar2, mcjVar3};
        d = mcjVar;
    }

    public static mcj[] values() {
        return (mcj[]) e.clone();
    }
}
