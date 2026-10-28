package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgu {
    public static final pgu a;
    public static final pgu b;
    public static final pgu c;
    public static final pgu d;
    public static final pgu e;
    public static final pgu f;
    public static final pgu g;
    private static final /* synthetic */ pgu[] h;

    static {
        pgu pguVar = new pgu("IMPORTANCE_UNSPECIFIED", 0);
        a = pguVar;
        pgu pguVar2 = new pgu("IMPORTANCE_DEFAULT", 1);
        b = pguVar2;
        pgu pguVar3 = new pgu("IMPORTANCE_HIGH", 2);
        c = pguVar3;
        pgu pguVar4 = new pgu("IMPORTANCE_LOW", 3);
        d = pguVar4;
        pgu pguVar5 = new pgu("IMPORTANCE_MIN", 4);
        e = pguVar5;
        pgu pguVar6 = new pgu("IMPORTANCE_MAX", 5);
        f = pguVar6;
        pgu pguVar7 = new pgu("IMPORTANCE_NONE", 6);
        g = pguVar7;
        h = new pgu[]{pguVar, pguVar2, pguVar3, pguVar4, pguVar5, pguVar6, pguVar7};
    }

    public static pgu[] values() {
        return (pgu[]) h.clone();
    }
}
