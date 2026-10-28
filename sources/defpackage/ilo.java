package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilo {
    public static final ilo a;
    public static final ilo b;
    private static final /* synthetic */ ilo[] c;

    static {
        ilo iloVar = new ilo("NOT_SNOOZED", 0);
        a = iloVar;
        ilo iloVar2 = new ilo("SNOOZED", 1);
        b = iloVar2;
        c = new ilo[]{iloVar, iloVar2};
    }

    public static ilo[] values() {
        return (ilo[]) c.clone();
    }
}
