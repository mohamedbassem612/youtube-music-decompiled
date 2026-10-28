package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oyt {
    public static final oyt a;
    public static final oyt b;
    public static final oyt c;
    private static final /* synthetic */ oyt[] d;

    static {
        oyt oytVar = new oyt("WIFI_ONLY", 0);
        a = oytVar;
        oyt oytVar2 = new oyt("WIFI_OR_CELLULAR", 1);
        b = oytVar2;
        oyt oytVar3 = new oyt("NONE", 2);
        c = oytVar3;
        d = new oyt[]{oytVar, oytVar2, oytVar3};
    }

    public static oyt[] values() {
        return (oyt[]) d.clone();
    }
}
