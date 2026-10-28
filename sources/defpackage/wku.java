package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wku {
    public static final wku a;
    public static final wku b;
    public static final wku c;
    public static final wku d;
    private static final /* synthetic */ wku[] e;

    static {
        wku wkuVar = new wku("DISK_IO", 0);
        a = wkuVar;
        wku wkuVar2 = new wku("BINDER", 1);
        b = wkuVar2;
        wku wkuVar3 = new wku("HEAVY_COMPUTE", 2);
        c = wkuVar3;
        wku wkuVar4 = new wku("BLOCKING_GET", 3);
        d = wkuVar4;
        e = new wku[]{wkuVar, wkuVar2, wkuVar3, wkuVar4};
    }

    public static wku[] values() {
        return (wku[]) e.clone();
    }
}
