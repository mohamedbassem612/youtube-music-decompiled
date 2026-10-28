package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum arct implements aihr {
    FONT_SLANT_UNSPECIFIED(0),
    FONT_SLANT_UPRIGHT(1),
    FONT_SLANT_ITALIC(2),
    UNRECOGNIZED(-1);

    private final int f;

    arct(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
