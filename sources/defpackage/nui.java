package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nui {
    public static final nui a;
    public static final nui b;
    public static final nui c;
    private static final /* synthetic */ nui[] d;

    static {
        nui nuiVar = new nui("DISABLE", 0);
        a = nuiVar;
        nui nuiVar2 = new nui("AUTO_INITIALIZATION", 1);
        b = nuiVar2;
        nui nuiVar3 = new nui("MANUAL_INITIALIZATION", 2);
        c = nuiVar3;
        d = new nui[]{nuiVar, nuiVar2, nuiVar3};
    }

    public static nui[] values() {
        return (nui[]) d.clone();
    }
}
