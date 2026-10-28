package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afrd {
    public static final afrd a;
    public static final afrd b;
    public static final afrd c;
    private static final /* synthetic */ afrd[] d;

    static {
        afrd afrdVar = new afrd("ON_CHARGER", 0);
        a = afrdVar;
        afrd afrdVar2 = new afrd("ON_NETWORK_UNMETERED", 1);
        b = afrdVar2;
        afrd afrdVar3 = new afrd("ON_NETWORK_CONNECTED", 2);
        c = afrdVar3;
        d = new afrd[]{afrdVar, afrdVar2, afrdVar3};
    }

    public static afrd[] values() {
        return (afrd[]) d.clone();
    }
}
