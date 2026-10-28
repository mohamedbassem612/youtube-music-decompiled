package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afti {
    public static final afti a;
    public static final afti b;
    public static final afti c;
    public static final afti d;
    private static final /* synthetic */ afti[] e;

    static {
        afti aftiVar = new afti("MANUAL_PROPAGATION", 0);
        a = aftiVar;
        afti aftiVar2 = new afti("EXECUTOR_TRACE", 1);
        b = aftiVar2;
        afti aftiVar3 = new afti("SKIP_TRACE", 2);
        c = aftiVar3;
        afti aftiVar4 = new afti("NOT_USING_MANUAL_PROPAGATION", 3);
        d = aftiVar4;
        e = new afti[]{aftiVar, aftiVar2, aftiVar3, aftiVar4};
    }

    public static afti[] values() {
        return (afti[]) e.clone();
    }
}
