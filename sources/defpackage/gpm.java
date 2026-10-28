package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gpm {
    public static final gpm a;
    public static final gpm b;
    public static final gpm c;
    public static final gpm d;
    private static final /* synthetic */ gpm[] e;

    static {
        gpm gpmVar = new gpm("UNKNOWN", 0);
        a = gpmVar;
        gpm gpmVar2 = new gpm("ONLINE", 1);
        b = gpmVar2;
        gpm gpmVar3 = new gpm("DOWNLOADS", 2);
        c = gpmVar3;
        gpm gpmVar4 = new gpm("DEVICE_FILES", 3);
        d = gpmVar4;
        e = new gpm[]{gpmVar, gpmVar2, gpmVar3, gpmVar4};
    }

    public static gpm[] values() {
        return (gpm[]) e.clone();
    }
}
