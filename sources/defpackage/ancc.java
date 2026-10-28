package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ancc implements aihr {
    MDE_COLOR_TRANSFER_UNSPECIFIED(0),
    MDE_COLOR_TRANSFER_LINEAR(1),
    MDE_COLOR_TRANSFER_SDR(2),
    MDE_COLOR_TRANSFER_ST2084(3),
    MDE_COLOR_TRANSFER_HLG(4),
    MDE_COLOR_TRANSFER_GAMMA22(5),
    MDE_COLOR_TRANSFER_SMPTE240M(6),
    MDE_COLOR_TRANSFER_SRGB(7);

    public final int i;

    ancc(int i) {
        this.i = i;
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
