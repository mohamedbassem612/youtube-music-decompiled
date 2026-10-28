package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qwi {
    public static final qwi a;
    public static final qwi b;
    public static final qwi c;
    public static final qwi d;
    private static final /* synthetic */ qwi[] e;

    static {
        qwi qwiVar = new qwi("NO_DECORATION", 0);
        a = qwiVar;
        qwi qwiVar2 = new qwi("UNDERLINE", 1);
        b = qwiVar2;
        qwi qwiVar3 = new qwi("OVERLINE", 2);
        c = qwiVar3;
        qwi qwiVar4 = new qwi("LINE_THROUGH", 3);
        d = qwiVar4;
        e = new qwi[]{qwiVar, qwiVar2, qwiVar3, qwiVar4};
    }

    public static qwi[] values() {
        return (qwi[]) e.clone();
    }
}
