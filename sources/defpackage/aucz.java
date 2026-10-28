package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aucz implements aihr {
    MDE_Y_CB_CR_MATRIX_UNSPECIFIED(0),
    MDE_Y_CB_CR_MATRIX_BT709(1),
    MDE_Y_CB_CR_MATRIX_BT601(2),
    MDE_Y_CB_CR_MATRIX_BT2020(3),
    MDE_Y_CB_CR_MATRIX_SMPTE240M(4);

    private final int g;

    aucz(int i) {
        this.g = i;
    }

    public static aucz a(int i) {
        if (i == 0) {
            return MDE_Y_CB_CR_MATRIX_UNSPECIFIED;
        }
        if (i == 1) {
            return MDE_Y_CB_CR_MATRIX_BT709;
        }
        if (i == 2) {
            return MDE_Y_CB_CR_MATRIX_BT601;
        }
        if (i == 3) {
            return MDE_Y_CB_CR_MATRIX_BT2020;
        }
        if (i != 4) {
            return null;
        }
        return MDE_Y_CB_CR_MATRIX_SMPTE240M;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
