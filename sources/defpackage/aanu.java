package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aanu {
    public static final aanu a;
    public static final aanu b;
    public static final aanu c;
    public static final aanu d;
    public static final aanu e;
    public static final aanu f;
    private static final /* synthetic */ aanu[] g;

    static {
        aanu aanuVar = new aanu("WAITING", 0);
        a = aanuVar;
        aanu aanuVar2 = new aanu("SUCCESS_WAITING_ON_SUBACTIONS", 1);
        b = aanuVar2;
        aanu aanuVar3 = new aanu("PROGRESS_SUBACTION_PROCESSED", 2);
        c = aanuVar3;
        aanu aanuVar4 = new aanu("SUCCESS_FULLY_COMPLETE", 3);
        d = aanuVar4;
        aanu aanuVar5 = new aanu("DEQUEUED", 4);
        e = aanuVar5;
        aanu aanuVar6 = new aanu("FAILED", 5);
        f = aanuVar6;
        g = new aanu[]{aanuVar, aanuVar2, aanuVar3, aanuVar4, aanuVar5, aanuVar6};
    }

    public static aanu[] values() {
        return (aanu[]) g.clone();
    }
}
