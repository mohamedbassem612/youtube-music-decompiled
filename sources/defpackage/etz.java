package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etz {
    public static final etz a;
    public static final etz b;
    private static final /* synthetic */ etz[] c;

    static {
        etz etzVar = new etz("SRGB", 0);
        a = etzVar;
        etz etzVar2 = new etz("DISPLAY_P3", 1);
        b = etzVar2;
        c = new etz[]{etzVar, etzVar2};
    }

    public static etz[] values() {
        return (etz[]) c.clone();
    }
}
