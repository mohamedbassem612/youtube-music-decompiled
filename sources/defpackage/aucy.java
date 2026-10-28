package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aucy implements aihr {
    MDE_COLOR_TRANSFER_UNSPECIFIED(0),
    MDE_COLOR_TRANSFER_LINEAR(1),
    MDE_COLOR_TRANSFER_SDR(2),
    MDE_COLOR_TRANSFER_ST2084(3),
    MDE_COLOR_TRANSFER_HLG(4),
    MDE_COLOR_TRANSFER_GAMMA22(5),
    MDE_COLOR_TRANSFER_SMPTE240M(6),
    MDE_COLOR_TRANSFER_SRGB(7);

    private final int j;

    aucy(int i2) {
        this.j = i2;
    }

    public static aucy a(int i2) {
        switch (i2) {
            case 0:
                return MDE_COLOR_TRANSFER_UNSPECIFIED;
            case 1:
                return MDE_COLOR_TRANSFER_LINEAR;
            case 2:
                return MDE_COLOR_TRANSFER_SDR;
            case 3:
                return MDE_COLOR_TRANSFER_ST2084;
            case 4:
                return MDE_COLOR_TRANSFER_HLG;
            case 5:
                return MDE_COLOR_TRANSFER_GAMMA22;
            case 6:
                return MDE_COLOR_TRANSFER_SMPTE240M;
            case 7:
                return MDE_COLOR_TRANSFER_SRGB;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
