package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acos {
    public static final acos a;
    public static final acos b;
    public static final acos c;
    public static final acos d;
    public static final acos e;
    public static final acos f;
    public static final acos g;
    private static final /* synthetic */ acos[] h;

    static {
        acos acosVar = new acos("DEFAULT", 0);
        a = acosVar;
        acos acosVar2 = new acos("TOP_LEFT", 1);
        b = acosVar2;
        acos acosVar3 = new acos("BOTTOM_LEFT", 2);
        c = acosVar3;
        acos acosVar4 = new acos("BOTTOM_CENTER", 3);
        d = acosVar4;
        acos acosVar5 = new acos("BELOW_VIDEO", 4);
        e = acosVar5;
        acos acosVar6 = new acos("BELOW_TOP_BAR", 5);
        f = acosVar6;
        acos acosVar7 = new acos("BOTTOM_LEFT_OF_VIDEO", 6);
        g = acosVar7;
        h = new acos[]{acosVar, acosVar2, acosVar3, acosVar4, acosVar5, acosVar6, acosVar7};
    }

    public static acos[] values() {
        return (acos[]) h.clone();
    }
}
