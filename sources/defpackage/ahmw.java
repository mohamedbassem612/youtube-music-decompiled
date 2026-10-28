package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmw {
    public static final ahmw a;
    public static final ahmw b;
    private static final /* synthetic */ ahmw[] c;

    static {
        ahmw ahmwVar = new ahmw("IEEE_P1363", 0);
        a = ahmwVar;
        ahmw ahmwVar2 = new ahmw("DER", 1);
        b = ahmwVar2;
        c = new ahmw[]{ahmwVar, ahmwVar2};
    }

    public static ahmw[] values() {
        return (ahmw[]) c.clone();
    }
}
