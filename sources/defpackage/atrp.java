package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atrp implements aihr {
    BACKGROUND_CORNER_TYPE_UNSPECIFIED(0),
    BACKGROUND_CORNER_TYPE_ALL_CORNERS_ROUNDED(1),
    BACKGROUND_CORNER_TYPE_SHARP_INNER_CORNERS(2);

    public final int d;

    atrp(int i) {
        this.d = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
