package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum arcu implements aihr {
    FONT_WEIGHT_UNSPECIFIED(0),
    FONT_WEIGHT_THIN(1),
    FONT_WEIGHT_NORMAL(2),
    FONT_WEIGHT_BOLD(3),
    UNRECOGNIZED(-1);

    private final int g;

    arcu(int i) {
        this.g = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
