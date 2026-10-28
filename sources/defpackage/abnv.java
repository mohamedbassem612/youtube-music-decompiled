package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnv {
    public static final abnv a;
    public static final abnv b;
    public static final abnv c;
    public static final abnv d;
    public static final abnv e;
    public static final abnv f;
    public static final abnv g;
    public static final abnv h;
    private static final /* synthetic */ abnv[] i;

    static {
        abnv abnvVar = new abnv("PLAYBACK_PENDING", 0);
        a = abnvVar;
        abnv abnvVar2 = new abnv("PLAYBACK_LOADED", 1);
        b = abnvVar2;
        abnv abnvVar3 = new abnv("PLAYBACK_INTERRUPTED", 2);
        c = abnvVar3;
        abnv abnvVar4 = new abnv("READY", 3);
        d = abnvVar4;
        abnv abnvVar5 = new abnv("VIDEO_REQUESTED", 4);
        e = abnvVar5;
        abnv abnvVar6 = new abnv("VIDEO_PLAYING", 5);
        f = abnvVar6;
        abnv abnvVar7 = new abnv("PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES", 6);
        g = abnvVar7;
        abnv abnvVar8 = new abnv("ENDED", 7);
        h = abnvVar8;
        i = new abnv[]{abnvVar, abnvVar2, abnvVar3, abnvVar4, abnvVar5, abnvVar6, abnvVar7, abnvVar8};
    }

    public static abnv[] values() {
        return (abnv[]) i.clone();
    }

    public final boolean a(abnv... abnvVarArr) {
        for (abnv abnvVar : abnvVarArr) {
            if (this == abnvVar) {
                return true;
            }
        }
        return false;
    }
}
