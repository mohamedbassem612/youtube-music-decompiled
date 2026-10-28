package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdk {
    public static final rdk a;
    public static final rdk b;
    public static final rdk c;
    public static final rdk d;
    private static final /* synthetic */ rdk[] e;

    static {
        rdk rdkVar = new rdk("SEEK", 0);
        a = rdkVar;
        rdk rdkVar2 = new rdk("UPDATE", 1);
        b = rdkVar2;
        rdk rdkVar3 = new rdk("UPDATE_AND_SEEK", 2);
        c = rdkVar3;
        rdk rdkVar4 = new rdk("GENERIC", 3);
        d = rdkVar4;
        e = new rdk[]{rdkVar, rdkVar2, rdkVar3, rdkVar4};
    }

    public static rdk[] values() {
        return (rdk[]) e.clone();
    }
}
