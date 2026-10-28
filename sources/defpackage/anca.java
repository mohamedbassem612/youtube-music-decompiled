package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum anca implements aihr {
    MDE_COLOR_PRIMARIES_UNSPECIFIED(0),
    MDE_COLOR_PRIMARIES_BT709(1),
    MDE_COLOR_PRIMARIES_BT601_PAL(2),
    MDE_COLOR_PRIMARIES_BT601_NTSC(3),
    MDE_COLOR_PRIMARIES_DISPLAY_P3(4),
    MDE_COLOR_PRIMARIES_BT2020(5),
    MDE_COLOR_PRIMARIES_DCI_P3(6);

    public final int h;

    anca(int i2) {
        this.h = i2;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
