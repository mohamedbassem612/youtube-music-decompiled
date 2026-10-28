package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aucw implements aihr {
    MDE_COLOR_PRIMARIES_UNSPECIFIED(0),
    MDE_COLOR_PRIMARIES_BT709(1),
    MDE_COLOR_PRIMARIES_BT601_PAL(2),
    MDE_COLOR_PRIMARIES_BT601_NTSC(3),
    MDE_COLOR_PRIMARIES_DISPLAY_P3(4),
    MDE_COLOR_PRIMARIES_BT2020(5),
    MDE_COLOR_PRIMARIES_DCI_P3(6);

    private final int i;

    aucw(int i) {
        this.i = i;
    }

    public static aucw a(int i) {
        switch (i) {
            case 0:
                return MDE_COLOR_PRIMARIES_UNSPECIFIED;
            case 1:
                return MDE_COLOR_PRIMARIES_BT709;
            case 2:
                return MDE_COLOR_PRIMARIES_BT601_PAL;
            case 3:
                return MDE_COLOR_PRIMARIES_BT601_NTSC;
            case 4:
                return MDE_COLOR_PRIMARIES_DISPLAY_P3;
            case 5:
                return MDE_COLOR_PRIMARIES_BT2020;
            case 6:
                return MDE_COLOR_PRIMARIES_DCI_P3;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
