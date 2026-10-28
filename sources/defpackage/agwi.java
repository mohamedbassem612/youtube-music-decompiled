package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agwi {
    public static final agwi a;
    public static final agwi b;
    public static final agwi c;
    public static final agwi d;
    private static final /* synthetic */ agwi[] e;

    static {
        agwi agwiVar = new agwi("UNORDERED", 0);
        a = agwiVar;
        agwi agwiVar2 = new agwi("STABLE", 1);
        b = agwiVar2;
        agwi agwiVar3 = new agwi("INSERTION", 2);
        c = agwiVar3;
        agwi agwiVar4 = new agwi("SORTED", 3);
        d = agwiVar4;
        e = new agwi[]{agwiVar, agwiVar2, agwiVar3, agwiVar4};
    }

    public static agwi[] values() {
        return (agwi[]) e.clone();
    }
}
