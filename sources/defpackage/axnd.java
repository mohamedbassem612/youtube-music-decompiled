package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axnd {
    public static final axnd a;
    public static final axnd b;
    public static final axnd c;
    private static final /* synthetic */ axnd[] d;

    static {
        axnd axndVar = new axnd("CRONET_ADAPTIVE_TRAFFIC_WINNER_UNKNOWN", 0);
        a = axndVar;
        axnd axndVar2 = new axnd("CRONET_ADAPTIVE_TRAFFIC_WINNER_MAIN", 1);
        b = axndVar2;
        axnd axndVar3 = new axnd("CRONET_ADAPTIVE_TRAFFIC_WINNER_FALLBACK", 2);
        c = axndVar3;
        d = new axnd[]{axndVar, axndVar2, axndVar3};
    }

    public static axnd[] values() {
        return (axnd[]) d.clone();
    }
}
