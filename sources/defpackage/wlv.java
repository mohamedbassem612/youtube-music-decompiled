package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wlv {
    public static final wlv a;
    public static final wlv b;
    private static final /* synthetic */ wlv[] c;

    static {
        wlv wlvVar = new wlv("DISABLED", 0);
        a = wlvVar;
        wlv wlvVar2 = new wlv("ENABLED", 1);
        b = wlvVar2;
        c = new wlv[]{wlvVar, wlvVar2};
    }

    public static wlv[] values() {
        return (wlv[]) c.clone();
    }
}
