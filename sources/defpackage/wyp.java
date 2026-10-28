package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyp {
    public static final wyp a;
    public static final wyp b;
    private static final /* synthetic */ wyp[] c;

    static {
        wyp wypVar = new wyp("CREATOR_GOAL", 0);
        a = wypVar;
        wyp wypVar2 = new wyp("FANZONE", 1);
        b = wypVar2;
        c = new wyp[]{wypVar, wypVar2};
    }

    public static wyp[] values() {
        return (wyp[]) c.clone();
    }
}
