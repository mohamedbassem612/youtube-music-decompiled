package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ancd implements aihr {
    MDE_Y_CB_CR_MATRIX_UNSPECIFIED(0),
    MDE_Y_CB_CR_MATRIX_BT709(1),
    MDE_Y_CB_CR_MATRIX_BT601(2),
    MDE_Y_CB_CR_MATRIX_BT2020(3),
    MDE_Y_CB_CR_MATRIX_SMPTE240M(4);

    public final int f;

    ancd(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
