package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eqj {
    public static final eqj a;
    public static final eqj b;
    public static final eqj c;
    public static final eqj d;
    private static final /* synthetic */ eqj[] e;

    static {
        eqj eqjVar = new eqj("LOW", 0);
        a = eqjVar;
        eqj eqjVar2 = new eqj("NORMAL", 1);
        b = eqjVar2;
        eqj eqjVar3 = new eqj("HIGH", 2);
        c = eqjVar3;
        eqj eqjVar4 = new eqj("IMMEDIATE", 3);
        d = eqjVar4;
        e = new eqj[]{eqjVar, eqjVar2, eqjVar3, eqjVar4};
    }

    public static eqj[] values() {
        return (eqj[]) e.clone();
    }
}
