package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acot {
    public static final acot a;
    public static final acot b;
    public static final acot c;
    public static final acot d;
    private static final /* synthetic */ acot[] e;

    static {
        acot acotVar = new acot("DEFAULT", 0);
        a = acotVar;
        acot acotVar2 = new acot("TOP_LEFT", 1);
        b = acotVar2;
        acot acotVar3 = new acot("BOTTOM_LEFT", 2);
        c = acotVar3;
        acot acotVar4 = new acot("BOTTOM_CENTER", 3);
        d = acotVar4;
        e = new acot[]{acotVar, acotVar2, acotVar3, acotVar4};
    }

    public static acot[] values() {
        return (acot[]) e.clone();
    }
}
