package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aqko implements aihr {
    TEXT_FONT_WEIGHT_UNSPECIFIED(0),
    TEXT_FONT_WEIGHT_THIN(1),
    TEXT_FONT_WEIGHT_EXTRA_LIGHT(2),
    TEXT_FONT_WEIGHT_LIGHT(3),
    TEXT_FONT_WEIGHT_NORMAL(4),
    TEXT_FONT_WEIGHT_MEDIUM(5),
    TEXT_FONT_WEIGHT_SEMI_BOLD(6),
    TEXT_FONT_WEIGHT_BOLD(7),
    TEXT_FONT_WEIGHT_EXTRA_BOLD(8),
    TEXT_FONT_WEIGHT_BLACK(9),
    TEXT_FONT_WEIGHT_EXTRA_BLACK(10);

    private final int m;

    aqko(int i) {
        this.m = i;
    }

    public static aqko a(int i) {
        switch (i) {
            case 0:
                return TEXT_FONT_WEIGHT_UNSPECIFIED;
            case 1:
                return TEXT_FONT_WEIGHT_THIN;
            case 2:
                return TEXT_FONT_WEIGHT_EXTRA_LIGHT;
            case 3:
                return TEXT_FONT_WEIGHT_LIGHT;
            case 4:
                return TEXT_FONT_WEIGHT_NORMAL;
            case 5:
                return TEXT_FONT_WEIGHT_MEDIUM;
            case 6:
                return TEXT_FONT_WEIGHT_SEMI_BOLD;
            case 7:
                return TEXT_FONT_WEIGHT_BOLD;
            case 8:
                return TEXT_FONT_WEIGHT_EXTRA_BOLD;
            case 9:
                return TEXT_FONT_WEIGHT_BLACK;
            case 10:
                return TEXT_FONT_WEIGHT_EXTRA_BLACK;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
