package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aqkq implements aihr {
    TEXT_FONT_WIDTH_UNSPECIFIED(0),
    TEXT_FONT_WIDTH_ULTRA_CONDENSED(1),
    TEXT_FONT_WIDTH_EXTRA_CONDENSED(2),
    TEXT_FONT_WIDTH_CONDENSED(3),
    TEXT_FONT_WIDTH_SEMI_CONDENSED(4),
    TEXT_FONT_WIDTH_NORMAL(5),
    TEXT_FONT_WIDTH_SEMI_EXPANDED(6),
    TEXT_FONT_WIDTH_EXPANDED(7),
    TEXT_FONT_WIDTH_EXTRA_EXPANDED(8),
    TEXT_FONT_WIDTH_ULTRA_EXPANDED(9);

    private final int l;

    aqkq(int i) {
        this.l = i;
    }

    public static aqkq a(int i) {
        switch (i) {
            case 0:
                return TEXT_FONT_WIDTH_UNSPECIFIED;
            case 1:
                return TEXT_FONT_WIDTH_ULTRA_CONDENSED;
            case 2:
                return TEXT_FONT_WIDTH_EXTRA_CONDENSED;
            case 3:
                return TEXT_FONT_WIDTH_CONDENSED;
            case 4:
                return TEXT_FONT_WIDTH_SEMI_CONDENSED;
            case 5:
                return TEXT_FONT_WIDTH_NORMAL;
            case 6:
                return TEXT_FONT_WIDTH_SEMI_EXPANDED;
            case 7:
                return TEXT_FONT_WIDTH_EXPANDED;
            case 8:
                return TEXT_FONT_WIDTH_EXTRA_EXPANDED;
            case 9:
                return TEXT_FONT_WIDTH_ULTRA_EXPANDED;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
