package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wiz {
    public static final wiz a;
    public static final wiz b;
    public static final wiz c;
    public static final wiz d;
    public static final wiz e;
    public static final wiz f;
    private static final /* synthetic */ wiz[] g;

    static {
        wiz wizVar = new wiz("RECTANGULAR_2D", 0);
        a = wizVar;
        wiz wizVar2 = new wiz("SPHERICAL", 1);
        b = wizVar2;
        wiz wizVar3 = new wiz("SPHERICAL_3D", 2);
        c = wizVar3;
        wiz wizVar4 = new wiz("RECTANGULAR_3D", 3);
        d = wizVar4;
        wiz wizVar5 = new wiz("NOOP", 4);
        e = wizVar5;
        wiz wizVar6 = new wiz("MESH", 5);
        f = wizVar6;
        g = new wiz[]{wizVar, wizVar2, wizVar3, wizVar4, wizVar5, wizVar6};
    }

    public static wiz[] values() {
        return (wiz[]) g.clone();
    }

    public final boolean a() {
        return this == b || this == c || this == f;
    }
}
