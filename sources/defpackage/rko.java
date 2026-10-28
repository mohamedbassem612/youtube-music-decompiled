package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rko {
    public static final rko a;
    public static final rko b;
    public static final rko c;
    public static final rko d;
    private static final /* synthetic */ rko[] e;

    static {
        rko rkoVar = new rko("UNKNOWN", 0);
        a = rkoVar;
        rko rkoVar2 = new rko("CREATED", 1);
        b = rkoVar2;
        rko rkoVar3 = new rko("HIDDEN", 2);
        c = rkoVar3;
        rko rkoVar4 = new rko("RESTORED", 3);
        d = rkoVar4;
        e = new rko[]{rkoVar, rkoVar2, rkoVar3, rkoVar4};
    }

    public static rko[] values() {
        return (rko[]) e.clone();
    }
}
