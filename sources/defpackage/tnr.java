package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tnr {
    public static final tnr a;
    public static final tnr b;
    public static final tnr c;
    public static final tnr d;
    private static final /* synthetic */ tnr[] e;

    static {
        tnr tnrVar = new tnr("LOW", 0);
        a = tnrVar;
        tnr tnrVar2 = new tnr("NORMAL", 1);
        b = tnrVar2;
        tnr tnrVar3 = new tnr("HIGH", 2);
        c = tnrVar3;
        tnr tnrVar4 = new tnr("IMMEDIATE", 3);
        d = tnrVar4;
        e = new tnr[]{tnrVar, tnrVar2, tnrVar3, tnrVar4};
    }

    public static tnr[] values() {
        return (tnr[]) e.clone();
    }
}
