package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obb {
    public static final obb a;
    public static final obb b;
    public static final obb c;
    private static final /* synthetic */ obb[] d;

    static {
        obb obbVar = new obb("QUERY", 0);
        a = obbVar;
        obb obbVar2 = new obb("VIEW", 1);
        b = obbVar2;
        obb obbVar3 = new obb("CLICK", 2);
        c = obbVar3;
        d = new obb[]{obbVar, obbVar2, obbVar3};
    }

    public static obb[] values() {
        return (obb[]) d.clone();
    }
}
