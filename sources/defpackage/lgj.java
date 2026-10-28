package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgj {
    public static final lgj a;
    public static final lgj b;
    public static final lgj c;
    public static final lgj d;
    private static final /* synthetic */ lgj[] e;

    static {
        lgj lgjVar = new lgj("CONSENT", 0);
        a = lgjVar;
        lgj lgjVar2 = new lgj("LEGITIMATE_INTEREST", 1);
        b = lgjVar2;
        lgj lgjVar3 = new lgj("FLEXIBLE_CONSENT", 2);
        c = lgjVar3;
        lgj lgjVar4 = new lgj("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        d = lgjVar4;
        e = new lgj[]{lgjVar, lgjVar2, lgjVar3, lgjVar4};
    }

    public static lgj[] values() {
        return (lgj[]) e.clone();
    }
}
