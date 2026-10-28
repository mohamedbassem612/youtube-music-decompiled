package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hei {
    public static final hei a;
    public static final hei b;
    public static final hei c;
    public static final hei d;
    public static final hei e;
    private static final /* synthetic */ hei[] f;

    static {
        hei heiVar = new hei("INITIAL", 0);
        a = heiVar;
        hei heiVar2 = new hei("LOADING", 1);
        b = heiVar2;
        hei heiVar3 = new hei("LOADED", 2);
        c = heiVar3;
        hei heiVar4 = new hei("ERROR", 3);
        d = heiVar4;
        hei heiVar5 = new hei("CANCELED", 4);
        e = heiVar5;
        f = new hei[]{heiVar, heiVar2, heiVar3, heiVar4, heiVar5};
    }

    public static hei[] values() {
        return (hei[]) f.clone();
    }
}
