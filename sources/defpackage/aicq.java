package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aicq {
    public static final aicq a;
    public static final aicq b;
    public static final aicq c;
    public static final aicq d;
    public static final aicq e;
    public static final aicq f;
    public static final aicq g;
    private static final /* synthetic */ aicq[] h;

    static {
        aicq aicqVar = new aicq("FIXED_TEXT", 0);
        a = aicqVar;
        aicq aicqVar2 = new aicq("FIXED_INT", 1);
        b = aicqVar2;
        aicq aicqVar3 = new aicq("FIXED_FLOAT", 2);
        c = aicqVar3;
        aicq aicqVar4 = new aicq("FIXED_DATE", 3);
        d = aicqVar4;
        aicq aicqVar5 = new aicq("FIXED_TIME", 4);
        e = aicqVar5;
        aicq aicqVar6 = new aicq("TIME_DIFFERENCE", 5);
        f = aicqVar6;
        aicq aicqVar7 = new aicq("VALUE_NOT_SET", 6);
        g = aicqVar7;
        h = new aicq[]{aicqVar, aicqVar2, aicqVar3, aicqVar4, aicqVar5, aicqVar6, aicqVar7};
    }

    public static aicq a(int i) {
        switch (i) {
            case 0:
                return g;
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            default:
                return null;
        }
    }

    public static aicq[] values() {
        return (aicq[]) h.clone();
    }
}
