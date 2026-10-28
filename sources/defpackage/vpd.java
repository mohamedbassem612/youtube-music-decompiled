package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vpd {
    public static final vpd a;
    public static final vpd b;
    private static final /* synthetic */ vpd[] c;

    static {
        vpd vpdVar = new vpd("NON_ENGAGEMENT_PANEL", 0);
        a = vpdVar;
        vpd vpdVar2 = new vpd("ENGAGEMENT_PANEL", 1);
        b = vpdVar2;
        c = new vpd[]{vpdVar, vpdVar2};
    }

    public static vpd[] values() {
        return (vpd[]) c.clone();
    }
}
