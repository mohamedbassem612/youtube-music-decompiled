package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tvz {
    public static final tvz a;
    public static final tvz b;
    public static final tvz c;
    public static final tvz d;
    private static final /* synthetic */ tvz[] e;

    static {
        tvz tvzVar = new tvz("DISABLE_FULLSCREEN", 0);
        a = tvzVar;
        tvz tvzVar2 = new tvz("ENABLE_FULLSCREEN", 1);
        b = tvzVar2;
        tvz tvzVar3 = new tvz("ENABLE_FULLSCREEN_NAV_BAR_ONLY", 2);
        c = tvzVar3;
        tvz tvzVar4 = new tvz("ENABLE_FULLSCREEN_HIDE_ALL", 3);
        d = tvzVar4;
        e = new tvz[]{tvzVar, tvzVar2, tvzVar3, tvzVar4};
    }

    public static tvz[] values() {
        return (tvz[]) e.clone();
    }
}
